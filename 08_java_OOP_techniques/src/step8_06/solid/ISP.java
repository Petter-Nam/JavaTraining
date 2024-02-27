package step8_06.solid;

/*

    # AsIs Model
    
	ISP_BadCase 인터페이스는 accelerate , deAccelerate , openSunroof ,  remoteStartUp 메서드를 정의한다. 
	특정 클래스는 위 4가지 메서드를 모두 구현할 수 있지만 
	특정 클래스는 openSunroof ,  remoteStartUp 메서드를 구현을 하지 않을 수도 있다.
	따라서 특정 클래스는 자신이 사용하지 않는 openSunroof ,  remoteStartUp 메서드에 의존하게 되며 이는 ISP를 위반한다.
		
 */

interface ISP_BadCase {
	
	void accelerate();
	void deAccelerate();
	void openSunroof();
	void remoteStartUp();
	
}

// openSunroof가 없는 경우에도 openSunroof를 구현해야 한다.
class Car1 implements ISP_BadCase {

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deAccelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openSunroof() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remoteStartUp() {
		// TODO Auto-generated method stub
		
	}
	
}

// remoteStartUp가 없는 경우에도 remoteStartUp를 구현해야 한다.
class Car2 implements ISP_BadCase {

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deAccelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openSunroof() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remoteStartUp() {
		// TODO Auto-generated method stub
		
	}
	
}


/*
  
   # ToBe Model
   
	Car 인터페이스는 accelerate , deAccelerate 메서드를 각각 정의한다.
	OpenRoofAble 인터페이스는 Car 인터페이스를 모두 구현하고 openSunroof 메서드를 정의한다. 
	RemoteStartUpAble 인터페이스는 Car 인터페이스를 모두 구현하고 remoteStartUp 메서드를 정의한다. 
	
	이렇게 하면 각 클라이언트는 자신이 필요로 하는 메서드에만 의존하게 되므로 ISP 원칙을 준수하게 된다.

	ISP를 준수함으로써 시스템의 유연성과 재사용성이 향상되며 변경에 대한 영향을 최소화할 수 있다.
	
 */

interface Car {
	void accelerate();
	void deAccelerate();
}

interface OpenRoofAble extends Car {
	void openSunroof();
}

interface RemoteStartUpAble extends Car {
	void remoteStartUp();
}
//옵션이 필요없는 경우
class Car3 implements Car{

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deAccelerate() {
		// TODO Auto-generated method stub
		
	}
	
}
// sunroof 옵션이 필요한 경우
class Car4 implements OpenRoofAble {

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deAccelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openSunroof() {
		// TODO Auto-generated method stub
		
	}}
// remoteStarUp 옵션이 필요한 경우
class Car5 implements RemoteStartUpAble{

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deAccelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remoteStartUp() {
		// TODO Auto-generated method stub
		
	}}



public class ISP {

	public static void main(String[] args) {
		
		/*
	 
			- ISP(Interface Segregation Principle, 인터페이스 분리 원칙)는 클라이언트가 자신이 사용하지 않는 메서드에 의존하지 않아야 한다는 원칙이다. 
			  즉 한 개의 일반적인 인터페이스보다는 여러 개의 구체적인 인터페이스가 낫다는 것을 의미한다. 
			
			- 클래스가 서로 관계없는 기능들을 가지고 있다면 낭비가 되고 예상치못한 버그를 발생시킬 수 있다.
	
			- 클래스는 해당 역할에 대한 액션만 수행해야 하고 이를 제외한 다른 액션은 완전히 삭제하거나 다른 곳(다른 클래스 등)으로 이동시켜야 한다.
			
			- 이 원칙은 인터페이스를 작고 잘 정의된 단위로 분리하여 클라이언트가 필요로 하는 메서드만을 구현하도록 강제한다.
	
		 */
		
		Car1 car1 = new Car1();
		car1.accelerate();
		car1.deAccelerate();
		car1.openSunroof();
		car1.remoteStartUp();
		
		Car2 car2 = new Car2();
		car2.accelerate();
		car2.deAccelerate();
		car2.openSunroof();
		car2.remoteStartUp();
		
		Car3 car3 = new Car3();
		car3.accelerate();
		car3.deAccelerate();
		
		
		Car4 car4 = new Car4();
		car4.accelerate();
		car4.deAccelerate();
		car4.openSunroof();
		
		
		Car5 car5 = new Car5();
		car5.accelerate();
		car5.deAccelerate();
		car5.remoteStartUp();
	}
	
}
