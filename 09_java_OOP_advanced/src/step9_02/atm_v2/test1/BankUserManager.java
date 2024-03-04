package step9_02.atm_v2.test1;

import java.util.Scanner;

public class BankUserManager {
	BankUserManager(){};
	static private BankUserManager instance = new BankUserManager();
	static public BankUserManager getInstance() {
		return instance;
	}
	Scanner scan = new Scanner(System.in);
	
	final int ACC_MAX_CNT = 3;
	BankUser[] userList = null;
	int userCnt = 0;
	
	void printAllUser() {
		
		for (int i = 0; i < userCnt; i++) {
			System.out.print((i+1) + ".ID(" + userList[i].id + ")\tPW(" + userList[i].pw + ")\t");
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
		for (int i = 0; i < userCnt; i++) {
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
		
		System.out.print("[로그인]아이디를 입력하세요 : ");
		String id = scan.next();
		System.out.print("[로그인]패스워드를 입력하세요 : ");
		String pw = scan.next();
		
		for (int i = 0; i < BankUserManager.instance.userCnt; i++) {
			if (userList[i].id.equals(id) && userList[i].pw.equals(pw)) {
				identifier = i;
			}
		}
		
		return identifier;
	}
	
	boolean checkId(String id) {
	    boolean isDuple = false;
	    for (int i = 0; i < userCnt; i++) {
	        if (userList[i].id.equals(id)) {
	            isDuple = true;
	        }
	    }
	    return isDuple;
	}

	
	void joinMember() {
	    System.out.print("[회원가입]아이디를 입력하세요 : ");
	    String id = scan.next();
	    System.out.print("[회원가입]패스워드를 입력하세요 : ");
	    String pw = scan.next();

	    boolean isResult = checkId(id);

	    if (isResult) {
	        System.out.println("[메세지]아이디가 중복됩니다.");
	        return;
	    }

	    if (userCnt == 0) {
	        userList = new BankUser[userCnt + 1];
	        userList[userCnt] = new BankUser();
	    } else {
	        BankUser[] tmp = userList;
	        userList = new BankUser[userCnt + 1];
	        userList[userCnt] = new BankUser();

	        for (int i = 0; i < userCnt; i++) {
	            userList[i] = tmp[i];
	        }
	        tmp = null;
	    }
	    userList[userCnt].id = id; // id 초기화 추가
	    userList[userCnt].pw = pw; // pw 초기화 추가

	    userCnt++;
	    System.out.println("[메세지]회원가입을 축하합니다.");
	    BankFileManager.getInstance().save();
	}
	
	int deleteMember(int identifier) {
		BankUser[] tmp = userList;
		userList = new BankUser[userCnt - 1];
		
		int j = 0;
		for (int i = 0; i < userCnt; i++) {
			if (i != identifier) {
				userList[j++] = tmp[i];
			}
		}
		userCnt--;
		tmp = null;
		identifier = -1;
		
		System.out.println("[메세지] 탈퇴되었습니다.");
		BankFileManager.getInstance().save();
		
		return identifier;
	}
}