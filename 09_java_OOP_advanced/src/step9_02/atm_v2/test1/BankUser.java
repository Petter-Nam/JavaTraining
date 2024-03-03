package step9_02.atm_v2.test1;


public class BankUser {	
	BankAccount[] acc = new BankAccount[BankUserManager.getInstance().ACC_MAX_CNT];
	int accCnt;
	String id;
	String pw;
}