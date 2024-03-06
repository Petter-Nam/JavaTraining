package step9_02.atm_v2.test2;

import java.util.Random;
import java.util.Scanner;

import step9_02.atm_v2.User;
import step9_03.atm_v3.Account;

public class TAccountManager{
	
	private TAccountManager() {}
	static private TAccountManager instance = new TAccountManager();
	static public TAccountManager getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	TUserManager userManager = TUserManager.getInstance();
	
	
	void createAcc(int identifier) {
		
		int accCntByUser = userManager.tuserClass[identifier].accCnt;
		
		if (accCntByUser == userManager.MAX_ACC_CNT) {
			System.out.println("[메세지]계좌개설은 3개까지만 가능합니다.");
			return;
		}
		
		userManager.tuserClass[identifier].accNumberArray[accCntByUser] = new TAccount();
		String makeAccount = "";
		while (true) {
			makeAccount = ran.nextInt(9000000) + 1000001 + "";
			if (!userManager.getCheckAcc(makeAccount)) {
				break;
			}
		}
			userManager.tuserClass[identifier].accNumberArray[accCntByUser].accNumber = makeAccount;
			userManager.tuserClass[identifier].accCnt++;
			System.out.println("[메세지]'" + makeAccount + "'계좌가 생성되었습니다.\n");
		
	}
	void printAcc(int identifier) {
		
		TUser temp = userManager.tuserClass[identifier];
		System.out.println("====================");
		System.out.println("ID : " + temp.id);
		System.out.println("====================");
		for (int i = 0; i < temp.accCnt; i++) {
			System.out.println("accNumber:" +temp.accNumberArray[i].accNumber + " / money: " + temp.accNumberArray[i].money);
		}
		System.out.println("=============================\n");
		
	}
	
	
}