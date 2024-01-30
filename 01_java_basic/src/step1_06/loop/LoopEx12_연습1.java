package step1_06.loop;
/*
 * 1월 24일
 * 해당 문제는 가볍게 풀렸다.
 * 
 */
/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_연습1 {

	public static void main(String[] args) {
		
		Boolean isTrue = true;
		int otClap = 1;
		
		while (isTrue) {
			
			if (otClap % 3 == 0) {
				System.out.println("짝");
				otClap++;
			}
			else {
				System.out.println(otClap);
				otClap++;
			}
			
			if (otClap >= 51) {
				System.out.println("그만");
				isTrue = false;
			}
		}
	}

}
