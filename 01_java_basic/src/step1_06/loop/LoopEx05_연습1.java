package step1_06.loop;
/*
 * 1월 22일
 * 내 생각대로 코드를 짜보고 막혀 정답예시를 보고 작성함
 */
import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		int bulgogiBurgerOrderCnt = 0;
		int shrimpBurgerOrderCnt = 0;
		int colaOrderCnt = 0;
		int i = 1;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		while (i <= 5) {
			System.out.println("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if (choice == 1) bulgogiBurgerOrderCnt++;
			if (choice == 2) shrimpBurgerOrderCnt++;
			if (choice == 3) colaOrderCnt++;
			i++;
		}
		
		int totalPrice = bulgogiBurgerPrice * bulgogiBurgerOrderCnt + shrimpBurgerPrice * shrimpBurgerOrderCnt + colaPrice * colaOrderCnt;
		System.out.println("총 금액 = " + totalPrice + "");
		
		int money = scan.nextInt();
		
		int charge = money - totalPrice;
		
		if (charge >= 0) {
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1. 불고기 버거 : " + bulgogiBurgerOrderCnt + "개");
			System.out.println("2. 새우    버거 : " + shrimpBurgerOrderCnt + "개");
			System.out.println("3. 콜         라 : " + colaOrderCnt + "개");
			System.out.println("4. 총   금   액 : " + totalPrice + "원");
			System.out.println("5. 잔         돈 : " + charge + "원");
		}
		else {
			System.out.println("현금 부족");
		}
	}

}
