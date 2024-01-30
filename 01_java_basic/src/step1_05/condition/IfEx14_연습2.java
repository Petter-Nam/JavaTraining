package step1_05.condition;
/*
 * 1월 19일 AM 3:25 ~ 3:26
 * 
 * 나의 타자속도가 느리고 이전것과는 다르지만 그래도 문법적으로도 많이 배운상태가 아닌 상태에서
 * 예외처리도 안했지만 그래도 생각있게 잘 작성한것 같다.
 * 
 */
import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_연습2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.println("동전의 앞뒷면을 맞춰 보세요 앞(0) : 뒤(1)");
		int frontBack = scan.nextInt();
		
		Random ran = new Random();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int coin = ran.nextInt(2);
		
		if (coin == frontBack) {
			System.out.println("당신이 맞춘 내놓은 답은" + frontBack);
			System.out.println("정답은 " + coin);
			System.out.println("정답을 맞추었습니다.");
		}
		if (coin != frontBack) {
			System.out.println("당신이 맞춘 내놓은 답은" + frontBack);
			System.out.println("정답은 " + coin);
			System.out.println("틀렸습니다.");
		}
		scan.close();
	}

}
