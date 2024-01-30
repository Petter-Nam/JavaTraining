package step1_02.variable;

/*
 * 
 *  # 상수 ( constant ) 
 * 
 *  - 값이 변하지 않는 데이터
 *  - final 키워드를 사용하여 만든다.
 * 	- 변경되면 안되는 데이터의 보호를 위해 사용한다.
 *  - 특정데이터를 의미있는 문자로 사용하여 인식하기 쉽게 한다. 
 * 
 * 
 * */

public class VariableEx05 {

	public static void main(String[] args) {

		// 변수
		int oderQty = 1;
		oderQty = 3; // 수정 가능
		System.out.println(oderQty);
		
		// 상수
		final String FILEREPOSITORYPATH = "/Users/nsj/Downloads"; // 상수에는 final 함수가 붙는다.
		//FILEREPOSITORYPATH = "/Users/nsj/eclipse-workspace"; // 수정 불가
		
		final int CHARACTER =1;
		final int BALL = 9;
		final int GOAL = 7;
		
		//수정불
		//CHARACTER  = 2;
		//BALL = 10;
		//GOAL = 8;
		System.out.println(FILEREPOSITORYPATH);
		System.out.println(CHARACTER);
		System.out.println(BALL);
		System.out.println(GOAL);
	}

}
