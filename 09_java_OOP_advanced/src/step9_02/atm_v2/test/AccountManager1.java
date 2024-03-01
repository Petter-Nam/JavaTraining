package step9_02.atm_v2.test;

import java.util.Random;
import java.util.Scanner;

public class AccountManager1 {
	
	private AccountManager1 () {}
	private static AccountManager1 instance = new AccountManager1(); 
	public static AccountManager1 getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	UserManager1 um = UserManager1.getInstance();
	
	void createAcc(int identifier) {
		
		int accCntByUser = um.userList[identifier].accCnt;
		
		if (accCntByUser == um.ACC_MAX_CNT) {
			System.out.println("[메세지]계좌 개설은 3개까지만 가능합니다.");
			return;
		}
		
		um.userList[identifier].acc[accCntByUser] = new Account1();
		
		String makeAccount = "";
		while(true) {
			makeAccount = ran.nextInt(90000) + 1000001 + "";
			if(!um.getCheckAcc(makeAccount)) {
				break;
			}
		}
		um.userList[identifier].acc[accCntByUser].accNumber = makeAccount;
		um.userList[identifier].accCnt++;
		System.out.println("[메세지]" + makeAccount + "계좌가 생성되었습니다.\n");
		
	}
	void printAcc(int identifier) {
		User1 temp = um.userList[identifier];
		System.out.println("==============");
		System.out.println("ID : " + temp.id);
		System.out.println("==============");
		for(int i = 0; i < temp.accCnt; i++) {
			System.out.println("accNumber : " + temp.acc[i].accNumber  + " / money" + temp.acc[i].money);
		}
		System.out.println("=============================\n");
	}
}


