package step7_01.objectArray;
/*
 * 2월 15일 
 *	코드를 작성해보았다.
 *	클
 */
import java.util.Scanner;


class User_1 {
	
	String id;
	int money;
	
}

public class ObjectArrayEx04_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		User_1[] userList = new User_1[100];
		
		for (int i = 0; i < userList.length; i++) {
			userList[i] = new User_1();
		}
		
		int usrCnt = 0;
		
		while (true) {
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.종료");
			
			int sel = scan.nextInt();
			
			if (sel == 1) {
				User_1 temp = new User_1();
				
				System.out.println("이름을 입력하세요");
				temp.id = scan.next();
				System.out.println("금액을 입력하세요");
				temp.money = scan.nextInt();
				
				userList[usrCnt] = temp;
				usrCnt++;
				
			}
			else if (sel == 2) {
				System.out.println("인덱스를 입력하세요 ");
				int index = scan.nextInt();
				for (int i = 0; i < usrCnt - 1; i++) {
					userList[i] = userList[i + 1];
				}
				usrCnt--;
			}
			else if (sel == 3) {
				
				for (int i = 0; i < usrCnt; i++) {
					System.out.println(userList[i].id + userList[i].money);
				}
			}
			else if (sel == 4) {
				break;
			}
		}
		
	}

}
