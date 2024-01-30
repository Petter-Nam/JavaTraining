package step1_05.condition;

/*
 * 
 *  # 조건문 if 
 * 
 *  조건식이 true이면 실행되는 구문 ( false면 실행 x )
 *  
 *  [ 형식 ]
 *  
 *  if (조건식) {
 *  
 *  	조건식이 true일때 실행할 명령어;
 *  
 *  }
 * 
 * 
 * */

public class IfEx01 {

	public static void main(String[] args) {
		
		if (true) {
			// if문 안에 종속된 명령어는 tab으로 들여쓰기한다.
			System.out.println("가상의 명령어 1");
			System.out.println("가상의 명령어 2");
			System.out.println("가상의 명령어 3");
		}
		
		if (false) {
			System.out.println("가상의 명령어 4");
			System.out.println("가상의 명령어 5");
			System.out.println("가상의 명령어 6");
		}
		
		
		int number = 2;
		
		// if문안에 속한 명령어가 1줄이면 {}를 생략할 수 있다.
		if (number % 2 == 0) System.out.println("짝수");
		if (number % 2 == 1) System.out.println("홀수");
		
		
	}

}
