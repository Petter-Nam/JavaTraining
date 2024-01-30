package step1_06.loop;

import java.util.Scanner;

/*
 *  # 보조 제어문
 * 
 * 	- 반복문 안에서 동작한다.
 *  - 반복문 안에서 반복문의 역할을 보조한다.
 *  
 * 		break	 : 반복문을 종료한다.
 * 		continue : 반복문의 조건시점으로 점프한다.
 * 
 * */

public class LoopEx17 {

	public static void main(String[] args) {
		 
		int i = 0;
		
		while (true) {
			 
			 if (i == 3) {// 이벤트가 발생하면
				 break; // 반복문 멈춰!
			 }
			 System.out.println(i);
			 i++;
		 }
	
		System.out.println();
		
		i = 0;
		while (i < 8) {
			
			i++;
			
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("========================");
		System.out.println();
		
		
		// continue 사용예제
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("1. 햄버거");
			System.out.println("2. 콜라");
			System.out.println("3. 감자");
			
			System.out.print("#메뉴입력 : ");
			int getMenu = scan.nextInt();
			
			if (getMenu < 1 || getMenu > 3) {
				System.out.println("1~3번 중에 선택하세요.\n");
				continue;
			}
			
			if      (getMenu == 1) System.out.println("입력하신 메뉴는 '햄버거' 입니다.");
			else if (getMenu == 2) System.out.println("입력하신 메뉴는 '콜라' 입니다.");
			else if (getMenu == 3) System.out.println("입력하신 메뉴는 '감자' 입니다.");
			
			System.out.print("#현금 투입 :");
			int getMoney = scan.nextInt();
			
			System.out.println(getMoney + " 원이 투입 되었습니다.");
			System.out.println(" - 구매 작업 - \n\n");
			}
	}
}
