package step6_01.classObject;

// this : 객체(오브젝트, 인스턴스) 자신
class Unit {
	
	int shield = 60;
	int hp = 100;
	
	void printData() {
		
		System.out.println("this : " + this);
		
		// this는 생략이 가능하고 기본적으로 생략되어있다.
		System.out.println("hp : " + this.hp); // this를 없애도 각 unit 1, 2, 3각 체력 실드 값이 다르게 나온다
		System.out.println("shield : " + this.shield);
		System.out.println();
	}
}

public class ClassEx14 {

	public static void main(String[] args) {
		
		Unit unit1 = new Unit();
		unit1.shield = 0;
		unit1.hp = 0;
		System.out.println("unit1 : " + unit1);
		unit1.printData();
		
		Unit unit2 = new Unit();
		unit2.shield = 1;
		System.out.println("unit2 : " + unit2);
		unit2.printData();
		
		Unit unit3 = new Unit();
		unit3.printData();
		
		
	}

}
