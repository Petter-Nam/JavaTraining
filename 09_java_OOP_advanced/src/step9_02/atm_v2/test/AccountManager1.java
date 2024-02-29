package step9_02.atm_v2.test;

import java.util.Scanner;

public class AccountManager1 {
	
	private AccountManager1 () {}
	private static AccountManager1 instance = new AccountManager1(); 
	public static AccountManager1 getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
}


