
package step8_06.solid;

interface CreditCard {
	void purchasing(); 	     	 // 구매결제
	void automaticPayments();    // 자동결제설정
}

class HyundaiCard implements CreditCard{

	@Override
	public void purchasing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void automaticPayments() {
		// TODO Auto-generated method stub
		
	}
}

class ShinhanCard implements CreditCard{

	@Override
	public void purchasing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void automaticPayments() {
		// TODO Auto-generated method stub
		
	}

}


/*	
	  
	  # AsIs Model
	  
	   아래 예시에서는 HyundaiCard , ShinhanCard 클래스(저수준 모듈)와 DIP_BadCase 클래스(고수준 모듈)가 있다.
	   DIP_BadCase는 HyundaiCard에 직접 의존하고 있어 DIP를 위반한다. 
	   이 경우, 전원 스위치는 오직 HyundaiCard만 제어할 수 있으며 다른 장치(예: ShinhanCard, WooriCard)를 제어하려면 추가적인 변경이 필요하다.
	   
 */

class DIP_BadCase {
	HyundaiCard hyundaiCard = new HyundaiCard();
	//ShinhanCard shinhanCard = new ShinhanCard();
	
	
	void payment() {
		hyundaiCard.purchasing();
		//shinhanCard.purchasing();
	}
}

/*
 
 	 # ToBe Model
 
	DIP_ToBe 클래스는 HyundaiCard, ShinhanCard 또는 어떤 CreditCard 구현체와도 동작할 수 있으며 
	새로운 장치를 추가하더라도 DIP_ToBe 클래스를 변경할 필요가 없다. 
	이렇게 DIP를 적용하면 시스템의 결합도가 낮아지고 유연성 및 확장성이 향상된다.
	
	
 */

class DIP_GoodCase {
	CreditCard creditCard = new HyundaiCard();
	//						new ShinhanCard();
	void payment () {
		creditCard.purchasing();
	}
}

public class DIP {
	
	/*
	  
		- DIP(Dependency Inversion Principle, 의존성 역전 원칙)은 객체지향 설계 원칙 중 하나로 
		  고수준 모듈이 저수준 모듈에 의존해서는 안 되며 둘 다 추상화에 의존해야 한다는 원칙이다.
		
		- 즉 세부 사항이 추상화에 의존해야 하며 추상화는 세부 사항에 의존해서는 안 된다. 
		
		- 이 원칙은 시스템의 결합도를 낮추고 유연성과 확장성을 높이기 위해 사용된다.
	
	*/
	
}
