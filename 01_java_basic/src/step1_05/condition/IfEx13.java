package step1_05.condition;

import java.util.Random;

/*
 * 
 * 랜덤 라이브러리 ( if와 관련 x )
 *  
 *  
 *   [ 사용법 ] 
 *   
 *   Random 변수명  = new Random();
 *  
 *  1) Random객체를 생성한다. (import포함)
 *  
 *  2) ran.nextInt(범위) 메서드를 사용하여 랜덤값을 구한다. 
 *  
 *     > nextInt(범위) '0'부터 ~ '범위-1' 사이의 난수가 생성 된다.
 *     > 범위의 시작은 0부터이기 때문에 시작범위가 0이 아닌 경우는 추가 작업이 필요하다. 
 *       
 *       예시) ran.nextInt(10) + 1;   > 1 ~ 10까지 범위의 난수 생성
 *             ran.nextInt(51) + 50;  > 50 ~ 100까지 범위의 난수 생성
 *             ran.nextInt(21) - 10;  > -10 ~ 10까지 범위의 난수 생성
 *                
 *  - random객체는 close()메서드를 사용하지 않는다.
 *  
 * */

public class IfEx13 {

	
	public static void main(String[] args) {
		
		Random ran = new Random(); //new : generate의 의미이다.
		
		// 0 ~ 9 사이의 랜덤값
		int rNum = ran.nextInt(10);
		System.out.println(rNum);
		
		// 100 ~ 200 사이의 랜덤값
		int rnum1 = ran.nextInt(101) + 100; // [0 ~ 100] + 100
		System.out.println(rnum1);
		
		// -3 ~ 3 사이의 랜덤값
		int rNum2 = ran.nextInt(7) - 3;// [0 ~ 6] - 3
		System.out.println(rNum2);
	}

}
