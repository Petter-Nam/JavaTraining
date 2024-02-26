package step7_01.objectArray;

/*

	# 제네릭(Generic) ---> <>
	ArrayList와 HashMap 에서의 <>를 의미함
	
	- 클래스 내부에서 사용하는 데이터의 타입(Type)을 
	  클래스의 인스턴스를 생성할 때 결정하는 것을 의미한다.
	  
	- 객체의 타입을 컴파일 시점에 체크하기 때문에 
	  타입 안정성을 높이고 형 변환의 번거로움을 줄일 수 있다.

*/

class Employee {}
class Manager{}
class Supervisor{}

class GenericEx<T>{
	
	//Employee[] employees = new Employee[3];
	//Manager[] managers = new Manager[3];
	//Supervisor[] supervisors = new Supervisor[3];
	Object[] arr = new Object[3];
	int idx = 0;
	
	void add(T data) {
		arr[idx++] = data;
		
	}
	
	T get(int index) {
		return (T)arr[index];
	}
}



public class ObjectArrayEx16 {

	public static void main(String[] args) {
		
		GenericEx<Employee> employees = new GenericEx<Employee>();
		GenericEx<Manager> managers = new GenericEx<Manager>();
		GenericEx<Supervisor> supervisors = new GenericEx<Supervisor>();
		
		employees.add(new Employee());
		//employees.add(new Manager);
		//employees.add(new Supervisor());
		
		//Manager.add(new Employee());
		managers.add(new Manager());
		//Manager(new Supervisor());
		
		//supervisors.add(new Employee());
		//supervisors.add(new Manager());
		supervisors.add(new Supervisor());
		
		System.out.println(employees.get(0));
		System.out.println(managers.get(0));
		System.out.println(supervisors.get(0));
	}

}
