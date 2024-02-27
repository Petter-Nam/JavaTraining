package step8_06.solid;

/*
  
	# AsIs Model
	
	LSP_BadCase 클래스에서 eat()메서드와 , sleep() 메서드는 모든 사람에게 적용 될 수 있지만 
	excercise() 메서드는 모든 사람에게 적용이 될 수 없을 수도 있음에도 불구하고 항상 운동을 하도록 설정되어있다.
	해당 클래스를 상속받는 자식클래스에서는 예상치 못한 결과가 발생할 수 있으며 이는 LSP 원칙을 위반한다. 

*/

class LSP_BadCase {
	
	void eat() {
		System.out.println("먹는다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void exercise() { // 모든 사람이 운동을 하지는 않는다.
		System.out.println("운동을 한다.");
	}
	
}

class Lee extends LSP_BadCase {} // 운동을 하는 사람
class Kim extends LSP_BadCase {} // 운동을 하지 않는 사람


/*

	# ToBe Model
	
	Person 클래스에서는eat()메서드와 , sleep() 메서드만 구현을 하고 있고
	ExercisePerson 클래스에는 excercise() 운동을 하는 고유한 방법을 가지고 있다. 
	이로써 LSP를 준수할수 있게 되어 운동을 하지 않는 자녀클래스도 부모클래스로 대체할수 있게 만든다.
	
*/

class Person {
	
	void eat() {
		System.out.println("먹는다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	
}

class ExcercisePerson extends Person {
	void exercise() {
		System.out.println("운동을 한다.");
	}
}

class Choi extends ExcercisePerson {} // 운동을 하는 사람
class Park extends Person {} 		  // 운동을 하지 않는 사람

public class LSP {

	public static void main(String[] args) {
		
		/*
	  
			- LSP(Liskov Substitution Principle, 리스코프 치환 원칙)는 객체지향 설계의 원칙 중 하나로 
			  하위 타입은 언제나 상위 타입으로 대체될 수 있어야 한다는 원칙이다. 
			
			- 즉 프로그램에서 부모 클래스의 인스턴스 대신에 자식 클래스의 인스턴스를 사용해도 프로그램의 정확성이 변하지 않아야 합니다.
	 
		 */
		
		LSP_BadCase lee = new Lee();
		lee.exercise(); // 운동을 한다.
		
		LSP_BadCase kim = new Kim();
		kim.exercise(); // 운동을 하지 않음에도 운동을 하는 메서드가 적용 (LSP위반)
		
		System.out.println("\n===================\n");
		
		ExcercisePerson choi = new Choi();
		choi.exercise(); // 운동을 하는 메서드가 존재하며 객체의 타입이 부모,자녀가 동일하게 수행됨
		
		Person park = new Park();
		//park.   		 // 운동을 하는 메서드가 없음
		
		
	}
	
}
