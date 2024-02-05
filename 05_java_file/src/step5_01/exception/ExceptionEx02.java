package step5_01.exception;

/*
 *  # finally 
 * 
 *  - 예외발생과 상관없이 무조건 실행할 명령어를 작성한다.
 *  - 주로 외부모듈과의 컨넥션을 종료할때 사용한다.
 *  
 * */


public class ExceptionEx02 {

	public static void main(String[] args) {
		
	try {
		int[] testArr = new int[5];
		// System.out.println(testArr[0]);
		System.out.println(testArr[100]);
	}
	catch(Exception e) {
		System.out.println("에러캐치");
	} finally { // 왜 : 통신(양방향) > 서로 종료 언제:
		System.out.println("예외발생과 상관없이 무조건 실행할 명령어를 작성한다.");
	}

	}

}
