package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_연습3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("동전의 앞 뒷면을 맞춰보세요. 앞(0) : 뒤(1)");
		int frontBack = scan.nextInt();
		
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		
		if (coin == 1) {
			System.out.println("뒷면입니다.");
		}
		else if (coin == 0) {
			System.out.println("뒷면입니다.");
		}
		
		if (coin == frontBack) {
			System.out.println("정답입니다.");
		}
		else if (coin != frontBack) {
			System.out.println("틀렸습니다.");
		}
		
	}

}
