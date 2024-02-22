package step6_02.method;

/*
 *  # 생성자 ( Constructor ) 
 * 
 * 	1. 생성자는 반드시 클래스의 이름과 같아야 한다.
 * 
 *  2. 생성자는 리턴타입을 가지지 않고 return도 사용하지 않는다.
 *     ( 생성자도 하나의 메서드이지만 기존 메서드와의 차이점이 있다. )
 *     
 *  3. 생성자는 인스턴스를 생성할때 ( new 클래스명(); ) 호출된다.
 *  	3-1) 반드시 실행된다.
 *  	3-2) 가장 먼저 실행된다.
 *  
 *  4. 생성자를 정의하지 않으면 컴파일러가 자동으로 기본 생성자를 만든다.
 *  
 *  5. 기본 생성자란 클래스이름과 같으며 매개변수에 아무것도 없는 생성자를 의미한다.
 *  
 *  6. 생성자를 새로 정의하면 기본 생성자는 자동으로 만들어지지 않는다.
 * 
 * */


class ConstructorTest{
	
	ConstructorTest() { // <---생성자
		System.out.println("생성자 호출");
	}
	void method1() {
		System.out.println("method1 호출");
	}
	void method2() {
		System.out.println("method2 호출");
	}
	void method3() {
		System.out.println("method3 호출");
	}
}


public class MethodEx19_01 {

	public static void main(String[] args) {
		
		new ConstructorTest();
		new ConstructorTest();
		new ConstructorTest();
		new ConstructorTest();
		System.out.println("==========");
		//객체 생설할 때 기본생성자가 호출된다.
		ConstructorTest object = new ConstructorTest();
		//메서드 호출때 메서드가 실행된다.
		object.method3();
		object.method1();
		
		
	}

}
