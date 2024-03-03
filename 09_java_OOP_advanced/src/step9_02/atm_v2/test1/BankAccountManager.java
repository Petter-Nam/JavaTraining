package step9_02.atm_v2.test1;

import java.util.Random;
import java.util.Scanner;

public class BankAccountManager {
	
	private BankAccountManager() {};
	static private BankAccountManager instance = new BankAccountManager();
	static public BankAccountManager getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	BankUserManager bum = BankUserManager.getInstance();
	
	void createAcc(int identifier) { // 계좌 개설
		int accCntByUser = bum.userList[identifier].accCnt;
		
		if (accCntByUser == bum.ACC_MAX_CNT) {
			System.out.println("[메세지] 계좌개설은 3개까지만 가능합니다.");
			return;
		}
		
		bum.userList[identifier].acc[accCntByUser] = new BankAccount();
		
		String makeAccount = "";
		while (true) {
			makeAccount = ran.nextInt(9000000) + 1000001 + "";
			if (!bum.getCheckAcc(makeAccount)) { // 중복검사
				break;
			}
		}
		bum.userList[identifier].acc[accCntByUser].accNumber = makeAccount;
		bum.userList[identifier].accCnt++;
		System.out.println("[메세지]'" + makeAccount + "'계좌가 생성되었습니다.\n");
	}
	void printAcc(int identifier) {// user의 계좌 정보 id 계좌내 현금 출력
		
		BankUser temp = bum.userList[identifier];
		System.out.println("====================");
		System.out.println("ID : " + temp.id);
		System.out.println("====================");
		for (int i = 0; i < temp.accCnt; i++) {
			System.out.println("accNumber:" +temp.acc[i].accNumber + " / money: " + temp.acc[i].money);
		}
		System.out.println("=============================\n");
		
	}
	
	void deleteAcc (int identifier) {
		
		BankUser temp = bum.userList[identifier];
		
		System.out.println("삭제할 계좌 번호를 입력하세요: ");
	    String deleteAccNumber = scan.next();
	    for (int i = 0; i < temp.accCnt; i++) {
	    	if (temp.acc[i].accNumber.equals(deleteAccNumber)) {
	    		System.out.println("계좌 삭제");
	    		temp.acc[i] = null;
	    		for (int j = i; j < temp.accCnt - 1; j++) {
	    			temp.acc[j] = temp.acc[j + 1];
	    		}
	    		temp.accCnt--;
	    		return;
	    	}
	    }
	    System.out.println("존재하지않는 계좌");
	}
	
}

