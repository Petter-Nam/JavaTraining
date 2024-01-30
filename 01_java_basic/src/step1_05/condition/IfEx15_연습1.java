package step1_05.condition;

import java.util.Random;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_연습1 {

	public static void main(String[] args) {
	
		Random ran = new Random();
	
		int happy = ran.nextInt(10);
		
		if (happy <= 3) {
			System.out.println("축하합니다.");
		if (happy > 3) {
			System.out.println("다음 기회를 노리세요.");
		}
		}
	}

}
