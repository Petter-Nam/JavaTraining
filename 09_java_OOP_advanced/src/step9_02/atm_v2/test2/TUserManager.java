package step9_02.atm_v2.test2;

import java.util.Scanner;

import step9_02.atm_v2.UserManager;
import step9_03.atm_v3.FileManager;

public class TUserManager {
	
	private TUserManager() {}
	static private TUserManager instance = new TUserManager();
	static public TUserManager getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	
	final int MAX_ACC_CNT = 3;
	int userCnt = 0;
	TUser[] tuserClass = null;
	
	void printAllUser() {
		
		for (int i = 0; i < userCnt; i++) {
			System.out.print((i+1) + ".ID(" + tuserClass[i].id + ")\tPW(" + tuserClass[i].pw + ")\t");
			if (tuserClass[i].accCnt != 0) {
				for (int j = 0; j < tuserClass[i].accCnt; j++) {
					System.out.print("(" + tuserClass[i].accNumberArray[j].accNumber + ":" + tuserClass[i].accNumberArray[j].money + ")");
				}
			}
			System.out.println();
		}
	}
	
	boolean getCheckAcc(String account) {
		boolean isDuple = false;
		for (int i = 0; i < userCnt; i++) {
			for (int j = 0; j < tuserClass[i].accCnt; j++) {
				if (account.equals(tuserClass[i].accNumberArray[j].accNumber)) {
					isDuple = true;
				}
			}
		}
		return isDuple;
	}
	
	int logUser() {
		int identifier = -1;
		
		System.out.print("[로그인]아이디를 입력하세요 : ");
		String id = scan.next();
		System.out.print("[로그인]패스워드를 입력하세요 : ");
		String pw = scan.next();
		
		for (int i = 0; i < TUserManager.instance.userCnt; i++) {
			if (tuserClass[i].id.equals(id) && tuserClass[i].pw.equals(pw)) {
				identifier = i;
			}
		}
		return identifier;
	}
	
	boolean checkId(String id) {
		boolean isDuple = false;
		for (int i = 0; i < userCnt; i++) {
			if (tuserClass[i].id.equals(id)) {
				isDuple = true;
			}
		}
		return isDuple;
	}
	
	void joinMember() {
		System.out.print("[회원가입] 아이디를 입력하세요 :");
		String id = scan.next();
		System.out.print("[회원가입]패스워드를 입력하세요 : ");
		String pw = scan.next();
		
		boolean isResult = checkId(id);
		
		if (isResult) {
			System.out.println("[메세지] 아이디가 중복됩니다.");
			return;
		}
		
		if (userCnt == 0) {
			tuserClass = new TUser[userCnt + 1];
			tuserClass[userCnt] = new TUser();
			}
		else {
			TUser[] tmp = tuserClass;
			tuserClass = new TUser[userCnt + 1];
			tuserClass[userCnt] = new TUser();
			
			for (int i = 0; i < userCnt; i++) {
				tuserClass[i] = tmp[i];
			}
			tmp = null;
		}
		tuserClass[userCnt].id = id;
		tuserClass[userCnt].pw = pw;
		
		userCnt++;
		System.out.println("[메세지]회원가입을 축하합니다.");
		
		TFileManager.getInstance().save();
	}
	
	int deleteMember(int identifier) {
		TUser[] tmp = tuserClass;
		tuserClass = new TUser[userCnt - 1];
		
		int j = 0;
		for(int i = 0; i < userCnt; i++) {
			if (i != identifier) {
				tuserClass[j++] = tmp[i];
			}
		}
		userCnt--;
		tmp = null;
		identifier = -1;
		System.out.println("[메세지]탈퇴되었습니다.");
		
		TFileManager.getInstance().save();

		return identifier;
	}
}