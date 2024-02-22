package step8_03.inheritance;

/*
 * 
 *  # this , super
 * 
 * 	- this : 자신의 객체
 *    super : 부모클래스의 객체
 *  
 *  - this() : 자신의 생성자
 *    super() : 부모클래스의 생성자
 *  
 *  - this.testMethod() : 자신의 메서드 호출
 *    testMethod()		: 자신의 메서드 호출
 *    super.testMethod() : 부모의 메서드 호출
 * 
 * */

class Parent {

	String name = "p";
	int age = 70;

	Parent() {// 생성자
		this("무명", -1);
		System.out.println("(P-기본) 부모클래스 기본생성자 실행");
	}

	Parent(String name, int age) {// 생성자 오버로딩

		System.out.println("(P-추가) 부모클래스 추가된 생성자 실행");
	}
}

class Child extends Parent {// 상속

	String name = "c";
	int age = 40;

	Child() {
		//super(); // 부모클래스의 기본생성자를 실행 (기본적으로 생략되어있다.) super를 주석처리해도 super는 기본적으로 생성되어져있어서 실행됨
		super("앨런튜링", 70); // 부모클래스의 추가된 생성자를 실행

		System.out.println("(P-기본) 자녀클래스 기본생성자 실행");
	}

	Child(String name, int age) {
		//this();
		super();
		//super("앨런튜링", 70);
		System.out.println("(C-추가) 자녀클래스 추가된 생성자 실행");
	}
	
	void testMethod() {
		System.out.println("자녀클래스의 테스트 메서드");
	}
	
	void callMethod() {
		
		System.out.println(this.name);// 자신의 변수
		System.out.println(this.age);//자신의 변수
		
		System.out.println(super.name);//부모의 변수
		System.out.println(super.age);//부모의 변수
		
		testMethod(); // 자신 testMethod호출
		this.testMethod();//자신의 testMethod호출
	}

}

public class InheritanceEx03 {

	public static void main(String[] args) {

		new Parent();
		System.out.println();

		new Parent("제임스 고슬링", 70);
		System.out.println();

		new Child();// 출력결과 부모가 따라옴
		System.out.println();

		new Child("제임스고슬링주니어", 40); // 출력결과 부모가 따라옴
		System.out.println();
		
		Child object = new Child();
		
		
	}

}
