package step8_03.inheritance;

/*
 * 
 *  # 상속 (Inheritance) 
 *  
 *  - 클래스 사이 부모 자식 관계를 설정해서 프로퍼티(필드) 및 메서드를 상속 및 확장하여 사용할 수 있다.
 *  
 *  - [ 호칭 ]  
 *  
 *  	부모 클래스, 상위 클래스, 슈퍼 클래스, 기반 클래스
 *     -----------------------------------------------------  
 *  	자녀 클래스, 하위 클래스, 서브 클래스, 파생 클래스
 *
 *  - [ 형식 ]
 * 
 *   	class 자녀클래스 extends 부모클래스 {
 *   
 *   	}
 *   
 *  - 모든 클래스는 Object클래스를 상속받는다.
 *  
 *  - 단일 상속만 가능하다. ( 다중상속 불가 )
 *    Ex) Class A extends B,C,D,E  (불가능)
 *
 *    
 * */

//class A{}
//class B extends A{}
//class C extends B{}
//class D extends C{} // 가능은 하지만 권장하지않는다.

class Beginner {
	
	int level = 1;
	int power = 10;
	int dex = 10;
	int life = 10;
	int mana = 10;
	
	void levelUp() {
		this.level++;
		this.power =+ 10;
		this.dex += 10;
		this.life += 10;
		this.mana += 10;
	}
	
	void printStatus() {
		System.out.println("level : " + this.level);
		System.out.println("power : " + this.power);
		System.out.println("dex : " + this.dex);
		System.out.println("life : " + this.life);
		System.out.println("mana : " + this.mana);
	}
}

class Warrior1 extends Beginner{
	
}

class Wizard1 extends Beginner{
	
}


public class InheritanceEx01 {

	public static void main(String[] args) {
		Warrior1 warrior = new Warrior1();
		warrior.printStatus();
		warrior.levelUp();
		warrior.levelUp();
		warrior.levelUp();
		warrior.printStatus();
		
		System.out.println("\n===========\n");
		Wizard1 wizard = new Wizard1();
		wizard.printStatus();
		wizard.levelUp();
		wizard.printStatus();
		
	}

}
