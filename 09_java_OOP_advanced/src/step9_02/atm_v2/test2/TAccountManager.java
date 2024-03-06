package step9_02.atm_v2.test2;

import java.util.Random;
import java.util.Scanner;

public class TAccountManager{
	
	private TAccountManager() {}
	static private TAccountManager instance = new TAccountManager();
	static public TAccountManager getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	TUserManager userManager = TUserManager.getInstance();
	
	
}