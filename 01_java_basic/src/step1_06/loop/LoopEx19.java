
package step1_06.loop;

/*
 *  # 반복문 for
 * 
 * 1. 반복문의 조건 3가지 
 * 		1) 초기식 2) 조건식 3) 증감식
 * 
 * 2. [ 형식 ]
 * 
 * for (초기식;조건식;증감식) {
 * 		조건식이 참일때 반복할 명령어;
 * }
 * 
 * 3. for문의 실행순서
 *  1) 초기식
 *  2) 조건식  3) 명령어  4) 증감식 
 *  조건이 false가 될때까지 2)3)4) 반복 
 * 
 * 4. for문 안의 생성 변수는 for문 안에서만 접근 가능하다.
 * 
 * 5. for문도 break와 continue를 같이 사용할 수 있다.
 * 
 * */

public class LoopEx19 {

	public static void main(String[] args) {

		int x = 1; // 초기식
		while (x <= 5) { // 조건식
			System.out.println(x);
			x++; // 증감식

		}

		System.out.println();

		for (int i = 1; x <= 5; i++) { // (초기식;조건식;증감식)
			System.out.println(i); // 명령어
		}

		System.out.println();
		// i는 for문의 지역변수이다.
		for (int i = 0; i < 10; i++) {

			System.out.println(i);

			if (i == 5) {

				break; // for문도 보조제어문과 함께 사용 가능하다.
			}
		}
		// for +[ctrl + spacebar] > for문 생성 단축키
		for (int i = 0; i < 10; i++) {
			
		}
	}

}
