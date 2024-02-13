package step6_01.classObject;
/*
 * 2월 13일
 * 해당 코드는 정답예시와 비교했을 때 
 * 정답예시가 괜찮았다.
 * 더욱 간결하게 작성하고 
 * 조건을 자세히 보아야겠다.
 * 
 * 
 */
/*
 * # 영화관 좌석예매 : 클래스 + 변수
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

import java.util.Arrays;
import java.util.Scanner;

class Ex07_1 {

	int[] seat = new int[7];
	int money = 0;
	int bookCnt = 0;

}

public class ClassEx07_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Ex07_1 ex = new Ex07_1();

		while (true) {

			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			System.out.println();

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {

				for (int i = 0; i < ex.seat.length; i++) {
					System.out.print("좌석 지정 : " + Arrays.toString(ex.seat) + "\n좌석 선택 : ");
					int yrSeat = scan.nextInt();

					if (yrSeat > -1 && yrSeat < ex.seat.length) {
						ex.seat[yrSeat] = 1;
						ex.bookCnt++;

						System.out.print("자리를 추가하시겠습니까? \n[1] 예 [2] 아니요");
						int addSeat = scan.nextInt();

						if (addSeat == 1) {
							continue;
						} 
						else if (addSeat == 2) {
							ex.money = ex.bookCnt * 12000;
							System.out.println(ex.money);
							System.out.println();
							System.out.println(Arrays.toString(ex.seat));
							break;
						}
						else {
							System.out.println("[1] 예 [2] 아니요 선택 : ");
							System.out.println();
							continue;
						}
					}

				}

			}

			else if (sel == 2) {
				scan.close();
				break;
			}
		}

	}

}
