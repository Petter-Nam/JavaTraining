package step9_02.atm_v2.test;

import java.util.Scanner;

import step9_02.atm_v2.UserManager;
import step9_03.atm_v3.FileManager;

public class UserManager1 {

	private UserManager1() {} // 새로운 객체를 생성하는 것을 막기 위해 private 사용

	static private UserManager1 instance = new UserManager1();// 해당 변수를 공유하며 외부에서 접근하지못하게 막음

	static public UserManager1 getInstance() {// 외부에서 해당 메서드로 instance 객체생성을 받아들이게함
		return instance;
	}

	Scanner scan = new Scanner(System.in);

	final int ACC_MAX_CNT = 3;
	User1[] userList = null;
	int userCnt = 0;

	void printAllUser() {
		for (int i = 0; i < userCnt; i++) {
			System.out.print((i + 1) + ".ID(" + userList[i].id + ")\tPW(" + userList[i].pw + ")\t");
			if (userList[i].accCnt != 0) {
				for (int j = 0; j < userList[i].accCnt; j++) {
					System.out.print("(" + userList[i].acc[j].accNumber + ":" + userList[i].acc[j].money + ")");
				}
			}
			System.out.println();
		}
	}
	
	boolean getCheckAcc(String account) {
		boolean isDuple = false;
		for(int i = 0; i < userCnt; i++) {
			for (int j = 0; j < userList[i].accCnt; j++) {
				if (account.equals(userList[i].acc[j].accNumber)) {
					isDuple = true;
				}
			}
		}
		return isDuple;
	}
	
	int logUser() {
		int identifier = -1;
		System.out.print("[로그인] 아이디를 입력하세요 : ");
		String id = scan.next();
		System.out.print("[로그인] 패스워드를 입력하세요 : ");
		String pw = scan.next();
		
		for (int i = 0; i < UserManager1.getInstance().userCnt; i++) {
			if (userList[i].id.equals(id) && userList[i].pw.equals(pw)) {
				identifier = i;
			}
		}
		return identifier;
	}
	
	boolean checkId(String id) {
		boolean isDuple = false;
		for(int i = 0; i < userCnt; i++) {
			if (userList[i].id.equals(id)) {
				isDuple = true;
			}
		}
		return isDuple;
	}
	
	void joinMember() {
		System.out.print("[회원가입] 아이디를 입력하세요 : ");
		String id = scan.next();
		System.out.print("[회원가입] 패스워드를 입력하세요 : ");
		String pw = scan.next();
		
		boolean isResult = checkId(id);
		
		if (isResult) {
			System.out.println("[메시지] 아이디가 중복됩니다.");
			return;
		}
		else {
			User1[] tmp = userList;
			userList = new User1[userCnt + 1];
			userList[userCnt] = new User1();
			
			for (int i = 0; i < userCnt; i++) {
				userList[i] = tmp[i];
			}
			tmp = null;
		}
		userList[userCnt].id = id;
		userList[userCnt].pw = pw;
		
		userCnt++;
		System.out.println("[메세지] 회원가입을 축하합니다.");
		
		FileManager1.getInstance().save();
	}
}