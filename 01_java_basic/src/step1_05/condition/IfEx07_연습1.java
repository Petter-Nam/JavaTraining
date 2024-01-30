package step1_05.condition;

/*
 *조건문도 복잡하고 에러로그를 호출해보고 싶지만 다음 기회에...
 * 
 */
import java.util.Scanner;

/*
 * # 성적 유효성 검사
 * 
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다.
 */

public class IfEx07_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("합불 판정기입니다. 당신의 시험점수를 입력해주세요 :");
		int yourScore = scan.nextInt();
		
		if (0 > yourScore || yourScore > 100) {
			System.out.println("입력값은 0에서 100 사이의 값이어야 합니다.");
		} else {
		
			if (yourScore >= 60) {
			System.out.println("합");
		} else {
			System.out.println("불합");
		}
		}
		
	}

}
