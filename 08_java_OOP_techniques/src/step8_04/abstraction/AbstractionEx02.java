package step8_04.abstraction;

/*
 * 
 *  # 인터페이스 (interface)
 *  
 *  - 인터페이스는 추상클래스보다 더 추상화된 구문
 *  - 실제 구현된 것이 전혀 없는 기본 설계도 (자바 8이후 부터 default 메서드  static 메서드추가)
 *  - 미리 정해진 규칙에 맞게 구현하도록 '표준'을 제시하는데 사용한다.
 *  - 클래스는 인터페이스를 상속받을 수 없고 인터페이스는 클래스를 상속받을 수 없다.
 *  - 클래스는 클래스끼리 인터페이스는 인터페이스끼리 상속시킬 수 있다.
 *  - 클래스는 다중 상속을 허용하지않지만 인터페이스는 다중구현을 허용한다.
 *  
 *  - [ 인터페이스의 요소 ]
 *  
 *    1) 상수               : 인터페이스에서 제공하는 지정된 데이터
 *    2) 추상메소드         : 추상메서드는 추상클래스 안에서 선언만 하고 실질적인 메소드의 추상클래스를 상속받은 일반 자녀클래스에서 진행한다. 					 
 *    3) 디폴트(일반)메소드 : 인터페이스에서도 메서드 구현이 가능하지만 구현한 클래스에서는 강제성이 없다.
 *    4) 정적(static)메소드 : 객체가 없어도 인터페이스 만으로도 사용이 가능한 메서드 						     
 *  
 * */

// 추상클래스
abstract class AAA {
	int testVar; // 필드

	abstract void test1();// 추상메서드

	void test2() {
	} // 일반메서드
}

// 인터페이스
interface BBB {
	
	// 정적상수
	static final int A = 100;
	static final int B = 200;
	static final int C = 300;
	
	//추상메서드
	abstract void test3();

	abstract void test4();

	// void test5() {}
	// 일반메서드 (메서드 앞에 default 키워드를 작성한다.)
	default void test5() {
		System.out.println("default 메서드");
	}

	// 정적 메서드 (메서드앞에 static 키워드를 작성한다.)
	static void test6() {
		System.out.println("static 메서드");
	}

}

//인터페이스에서는 abstract키워드를 생략할 수 있다.
interface CCC {
	void test7(); // (abstract) test7();

	void test8();

	void test9();
}

// implements 키워드를 사용하여 인터페이스를 '구현'한다. (상속x)
class DDD implements BBB, CCC { // 인터페이스는 다중구현 가능하다.

	@Override
	public void test3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test7() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test8() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test9() {
		// TODO Auto-generated method stub

	}

}

// 상속과 동시에 인터페이스 구현이 가능하다.
class EEE extends NormalClass implements BBB, CCC {

	@Override
	public void test7() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test8() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test9() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub

	}

}

public class AbstractionEx02 {

	public static void main(String[] args) {
		EEE object = new EEE();
		// object.
	}

}
