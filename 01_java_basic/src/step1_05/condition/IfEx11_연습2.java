package step1_05.condition;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */

public class IfEx11_연습2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		System.out.print("현금을 투입구에 넣어주세요.");
		int cash = scan.nextInt();
		
		
		while (true) {

			System.out.print("메뉴를 선택해 주세요.");
			int menu = scan.nextInt();
			
			
			
			if (menu == 1) {
				System.out.println("불고기 버거" + price1 + " 원");

				if (cash - price1 >= 0) {
					System.out.println("결제 되었습니다. \n\n불고기 버거 \t" + price1 + "\n입력받은 금액\t" + cash + "\n잔액\t" + (cash - price1));
				}
			} 
			else if (menu == 2) {
				System.out.println("새우버거" + price2 + " 원");

				if (cash - price2 >= 0) {
					System.out.println(
							"결제 되었습니다. \n\n새우 버거 \t" + price2 + "\n입력받은 금액\t" + cash + "\n잔액\t" + (cash - price2));
				}
			}
			else if (menu == 3) {
				System.out.println("콜라" + price3 + " 원");

				if (cash - price3 >= 0) {
					System.out.println(
							"결제 되었습니다. \n\n콜라 \t" + price3 + "\n입력받은 금액\t" + cash + "\n잔액\t" + (cash - price3));
				}
			}
			else if (menu == 0) {
				System.out.println("종료하겠습니다.");
				break;
			}	
		}
		scan.close();
	}
}
