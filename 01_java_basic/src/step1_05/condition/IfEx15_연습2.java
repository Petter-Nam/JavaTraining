package step1_05.condition;
/*
 * 1월 19일 AM 4:35 ~ 4:42
 * 문법적으로 많이 배우고 난 후 제대로 된 복권 당첨 프로그램을 만들어봐야겠다.
 * 
 * 
 */
import java.util.Random;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_연습2 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int lotteryNum = ran.nextInt(10);
		
		if (lotteryNum > 3) {
			System.out.println("꽝입니다.");}
		if (lotteryNum < 3) {
			System.out.println("축하해요.");
			System.out.println("당첨입니다.");
		}
		}

}
