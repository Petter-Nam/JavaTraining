package step7_01.objectArray;

import java.util.Scanner;


class User_1 {
	
	String id;
	int money;
	
}

public class ObjectArrayEx04_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		User[] userList = new User[100];
		
		for (int i = 0; i < userList.length; i++) {
			userList[i] = new User();
		}
		
		int usrCnt = 0;
		
		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 탈퇴");
			System.out.println("3. 출력");
			System.out.println("4. 종료");
			int sel = scan.nextInt();
		}
		
	}

}
