package step6_02.method;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 		- 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있다.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 )
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	
	// 입력값도 없고 결과값도 없는 경우
	void type00 () {
		
		System.out.println("==============");
		System.out.println("1.로그인");
		System.out.println("2.로그아웃");
		System.out.println("3. 개인정보조회");
		System.out.println("4. 개인정보 수정");
		System.out.println("5. 회원탈퇴");
		System.out.println("==============\n");
		
		//return; 결과값이 없는 경우 return키워드를 생략할 수 있다.
	}
	
	
	// 입력값은 있고 결과값은 없는 경우
	void type10(String fileName) { // 매개변수, parameter, argument, 인수, 인자
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 입력값은 없고 결과값은 있는 경우
	double type01() {
		return 2.71828;
	}
	
	// 입력값과 결과값이 모두 있는 경우
	int type11 (String birth) {
		
		String temp = birth.substring(0, 4);
		int age = 2024 - Integer.parseInt(temp) +1;
		return age;
	}
	
	
}


public class MethodEx02 {

	public static void main(String[] args) {
		MethodType object = new MethodType();
		
		// 입력값도 없고 결과값도 없는 경우
		object.type00();
		// scan.close();
		// fw.close();
		// br.close();
		
		System.out.println();
		
		// 입력값은 있고 결과값은 없는 경우
		object.type10("제임스고슬링.txt");
		object.type10("팀버너스리.hwp");
		object.type10("데니스리치.pptx");
		
		//오류 : 파라메타의 타입이 일치해야한다.
		//object.type10('c');
		//object.type10(300);
		
		//오류 : 파라메타의 개수가 일치해야만한다.
		//object.type10("사람1.txt", "사람2.hwp");
		//object.type10("사람1.txt", "사람2.hwp", "사람3.pptx");
		
		
		// 입력값은 없고 결과값은 있는 경우
		double eu = object.type01();
		System.out.println("eu : " + eu);
		
		System.out.println("eu : " + object.type01());
		System.out.println();
		// 입력값과 결과값이 모두 있는 경우
		int age = object.type11("20000101");
		System.out.println("나이 : " + age +  "살");
		
		System.out.println("나이 : " + object.type11("19900101")+ "살");
		
		if (object.type11("20240101") == 1) {
			System.out.println("1살입니다.");
		}
		//return 의 기능이 있는 예시 새로운 변수에 저장하거나 출력하는 메서드들은 return이 있다.
		
		//System.out.println("megait".indexOf("g"));
		//System.out.println("megait".charAt(2));
		//System.out.println("megait".substring(3));
		//System.out.println("megait".substring(2, 4));
	}

}


