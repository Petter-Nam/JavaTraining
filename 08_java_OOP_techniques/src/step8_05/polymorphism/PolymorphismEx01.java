package step8_05.polymorphism;

/*

	# 클래스의 형변환 (업다운 캐스팅)
 
	 	- 자바에서 업캐스팅(Upcasting)과 다운캐스팅(Downcasting)은 객체의 형변환을 다룬다. 
	 	 
	 	- 이러한 형변환은 상속 관계에 있는 클래스 사이에서 발생하며
	 	  업캐스팅과 다운캐스팅을 이해하기 위해서는 먼저 상속 관계에 있는 클래스가 있다고 전제해야 한다.
	 
	 	- 부모클래스는 객체를 생성 할때 부모클래스에 있는 자원만 생성된다. 
	 	
	    - 자녀클래스는 객체를 생성 할때 부모클래스와 자녀클래스의 자원이 모두 생성된다. 
	    
		- 그러므로 자녀클래스는 부모클래스의 타입으로 객체를 생성 할 수 있고 부모클래스는 자녀클래스의 타입으로 객체를 생성 할 수 없다.	

*/	

class Base {
	void baseMethod() {
		
	}
}

class Sub extends Base {
	void subMethod() {
		
	}
}


public class PolymorphismEx01 {

	public static void main(String[] args) {
		Base base1 = new Base();// 부모클래스 객체 생성
		base1.baseMethod(); // 자신의 메서드 사용
		
		Sub sub1 = new Sub(); //자녀클래스 객체 생성
		sub1.baseMethod(); // 상속받은 메서드
		sub1.subMethod(); // 자신의 메서드
		
		System.out.println("\n==============\n");
		
		//Sub base2 = new Base(); // 자녀타입으로 자녀객체를 생성할 수 없다.
		/*
		  
			# 업캐스팅 (Upcasting)
			
			- 자녀 클래스의 객체를 부모 클래스 타입으로 형변환하는 것을 의미한다. 
			- 명시적으로 형변환 타입을 적지 않아도 된다.
			- 객체의 타입이 부모형태이기 때문에 부모 클래스가 가지고 있는 메서드만 사용가능하다.
		 
		 */
		Base sub2 = new Sub();
		sub2.baseMethod(); // 부모타입이기 때문에 부모의 메서드만 사용가능~
		
		
		/*
		  
			# 다운캐스팅 (Downcasting)
			
			- 업캐스팅된 객체를 다시 원래의 자녀 클래스 타입으로 형변환하는 것을 의미한다.
			
			- 명시적으로 형변환을 타입을 적어야 한다.
			
			- 부모타입으로 만들어진 자녀클래스의 타입을 다시 자녀클래스로 형변환 할 경우 다시 자녀클래스로 사용 가능하므로 
			  업캐스팅을 통해 숨겨진 서브 클래스의 속성이나 메소드에 다시 접근할 수 있다.
	 		   
	 		- 다운캐스팅은 타입 체크를 통해 안전하게 수행되어야 하며 잘못된 다운캐스팅은 ClassCastException을 발생시킬 수 있다.
		
		 */
		
		Sub sub3 = (Sub)sub2;
		sub3.subMethod();// 자신의 메서드 사용
		sub3.baseMethod();//부모의 메서드 사용
		
		
		
		// [참고] instanceof : 형변환이 가능한지 확인하는 메서드
		if (sub1 instanceof Base) {
			System.out.println("형변환 가능1");
		}
		else {
			System.out.println("형변환 불가능1");
		}
		System.out.println();
		
		if (base1 instanceof Sub) {
			System.out.println("형변환 가능2");
		}
		else {
			System.out.println("형변환 불가능2");
		}
		
	}

}
