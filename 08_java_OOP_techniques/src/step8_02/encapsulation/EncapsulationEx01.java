package step8_02.encapsulation;

/*

	# 캡슐화 (Encapsulation)

	 - 객체지향 프로그래밍에서 캡슐화는 클래스의 내부 구현을 숨기고 
	   외부에서는 오직 정의된 인터페이스를 통해서만 객체와 상호작용할 수 있도록 하는 문법이다.
	   
	 - 이를 통해 객체의 상세 구현을 변경해도 다른 코드에 영향을 주지 않게 하여 코드의 유지보수성과 확장성을 높인다.

	 - 캡슐화를 구현하는 문법 접근제어자(Access Modifier)의 종류 

	  	public  		 : 프로젝트 전체에서 접근 가능
  	  	protected        : 상속관계에서 접근 가능
  	  	default(package) : 패키지 내에서만 접근가능
  	  	private 		 : 같은 클래스 내부에서만 접근 가능
  
*/

class BankAccount1 {
	int balance = 1000000; // 캡슐화 적용x;
}

class BankAccount2 {
	private int balance = 1000000; // 캡슐화 적용 O

	/*
	 * 
	 * 캡슐화를 적용한 경우 balance 필드는 private으로 선언되어 클래스 외부에서 직접 접근할 수 없게 된다. 대신 deposit와
	 * withdraw 같은 공개 메서드를 통해 잔액을 변경할 수 있으며 이 메서드들은 잘못된 금액이 계좌에 설정되지 않도록 검증 로직을 포함할
	 * 수 있다.
	 * 
	 */

	void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	void withdraw(int amount) {

		if (amount > 0 && balance >= amount) {
			balance -= amount;
		}
	}

	int getBalance() {

		return balance;
	}
}

public class EncapsulationEx01 {

	public static void main(String[] args) {

		/*
		 * 
		 * - 캡슐화를 적용하지 않음
		 * 
		 * 잔액은 공개적으로 접근 가능하며 외부 코드에서 임의로 잔액을 변경할 수 있다. 실수 혹은 악의적인 의도로 잘못된 금액을 설정할 위험을
		 * 내포한다.
		 * 
		 */

		BankAccount1 bankAccount1 = new BankAccount1();
		bankAccount1.balance = -300000;
		System.out.println(bankAccount1.balance);
		bankAccount1.balance = -1;
		System.out.println(bankAccount1.balance);
		System.out.println();

		/*
		 * 
		 * - 캡슐화 적용
		 * 
		 * 캡슐화는 계좌의 잔액을 보호하고 유효하지 않은 금액이 계좌에 추가되거나 제거되는 것을 방지한다. BankAccount 클래스의 내부 구현을
		 * 나중에 변경하더라도 이 클래스를 사용하는 코드에는 영향을 주지 않는다. 예를 들어 잔액 로깅 메커니즘을 추가하거나 특정 조건에서만 금액을
		 * 추가/제거할 수 있도록 변경할 수 있다. 이는 유지보수성과 확장성을 크게 향상시킨다.
		 * 
		 */
		BankAccount2 bankAccount2 = new BankAccount2();
		// BankAccount2.balance = - 300000;
		// BankAccount2.balance = - 3; private 이용 불가
		bankAccount2.deposit(-1);
		System.out.println(bankAccount2.getBalance());
		bankAccount2.withdraw(-300000);
		System.out.println(bankAccount2.getBalance());

	}

}
