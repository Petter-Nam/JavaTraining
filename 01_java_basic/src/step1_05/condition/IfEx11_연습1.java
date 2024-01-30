/*
 *1월 19일 AM 2:36 ~ 3:03
 * 원래 가지고 있는 정답지를 보지않고 풀다가 도저히 생각안나서 chatgpt의 도움을 받아버렸다.
 * 코드의 내용도 이해하고 풀었지만 나중에 다시 풀라고 하면 지금은 알고 있어서 가능할 것 같은데
 * 나중에 다시 봐야 확실할 것 같다....
 * */
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


public class IfEx11_연습1 {

	public static void main(String[] args) {
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("메뉴를 골라주세요 :");
		int menu = scan.nextInt();
		
		int selectedPrice = 0;
		
		if (menu == 1) {
			selectedPrice = price1;
		}
		else if (menu == 2) {
			selectedPrice = price2;
		}
		else if (menu == 3) {
			selectedPrice = price3;
		}
		else {
			System.out.println("잘못된 메뉴 번호입니다.");
			scan.close();
			return;
		}
		
		System.out.print("내가 가지고 있는 현금 :");
		int myCash = scan.nextInt();
		
		if (myCash >= selectedPrice) {
			System.out.println("=== 영수증 ===");
			System.out.println("선택한 메뉴 : " + menu);
			System.out.println("가격 :" + selectedPrice + "원");
			System.out.println("남은 현금 : " + (myCash - selectedPrice) + "원");
		}
		else {
			System.out.println("현금이 부족합니다.");
		}
		scan.close();
	}

}
