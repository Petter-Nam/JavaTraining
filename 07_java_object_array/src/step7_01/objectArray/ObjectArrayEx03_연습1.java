package step7_01.objectArray;

class Accoun_1 {
	 
	String id; 
	int money;
	
}

public class ObjectArrayEx03_연습1 {

	public static void main(String[] args) {
		
		Accoun_1[] accountList = new Accoun_1[2];
		
		
		for (int i = 0; i < accountList.length; i++) {
			accountList[i] = new Accoun_1();
		}
		
		
		
		accountList[0].id = "qwer1234";
		accountList[0].money = 1000;
		
		accountList[1].id = "asdf1234";
		accountList[1].money = 2000;
		
		for (int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i].id + "  " + accountList[i].money);
		}
		System.out.println("===============================");
		
		accountList[1].id = "zxcv1234";
		
		for(int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i].id + "  " + accountList[i].money);
		}
	}

}
