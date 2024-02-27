package step8_06.solid;

/*

# AsIs Model

해당 클래스는 사용자의 요청정보를 받아들여 페이지를 이동시키며 
암호화 , 인증 , 메일전송등 인증 서비스업무 등의 두 가지 책임을 가지고 있다.

*/

class SRP_Badcase {
	
	void forwardMain () {
		System.out.println("메인 화면으로 이동");
	}
	
	void forwardAuthentication () {
		System.out.println("인증화면으로 이동");
	}
	void forwardPayment () {
		System.out.println("결제화면으로 이동");
	}
	
	void cryptoPassword() {
		System.out.println("비밀번호 암호화 로직");
	}
	
	void findUserPasswordUnchanged() {
		System.out.println("비밀번호를 변경하지 않은지 90일이 경과한 회원을 검색하는 로직");
	}
	void sendMailForAuthentication() {
		System.out.println("인증을 위한 메일 전송 로직");
	}
}



/*
# ToBe Model

SRP_Controller 클래스는 사용자의 요청정보를 받아들여 페이지를 이동시키는 단일 책임을 가지고
SRP_Service 클래스는 암호화 , 인증 , 메일전송등 인증 서비스업무 등의 단일 책임을 가집니다. 
이렇게 각 클래스가 하나의 책임만을 가지므로 SRP를 준수하게 된다. 
코드의 재사용성과 유지보수성이 향상되며 미래의 변경 사항이 한 클래스에 국한되어 다른 클래스에 영향을 미치지 않게 된다.

*/

class SRP_Controller {
	void forwardMain () {
		System.out.println("메인 화면으로 이동");
	}
	
	void forwardAuthentication () {
		System.out.println("인증화면으로 이동");
	}
	void forwardPayment () {
		System.out.println("결제화면으로 이동");
	}
	
}

class SRP_Service {
	
	void cryptoPassword() {
		System.out.println("비밀번호 암호화 로직");
	}
	
	void findUserPasswordUnchanged() {
		System.out.println("비밀번호를 변경하지 않은지 90일이 경과한 회원을 검색하는 로직");
	}
	void sendMailForAuthentication() {
		System.out.println("인증을 위한 메일 전송 로직");
	}
}

public class SRP {
	public static void main(String[] args) {
		/*
		
		- 객체지향 설계 원칙 중 하나인 SRP(Single Responsibility Principle, 단일 책임 원칙)는 클래스가 변경되어야 하는 이유가 오직 하나여야 한다는 원칙이다. 
		  즉 클래스는 하나의 기능만을 가지고 그 기능을 완전히 캡슐화해야 한다는 것을 의미한다.
	
		- 만약 클래스가 여러가지 작업을 책임져야 한다면 이는 버그 발생 가능성을 높인다. 
	      많은 기능중 한가지를 변경할때 개발자가 모르는 사이에 다른 기능에 영향을 줄 수 있기 때문이다.
	
		- SRP의 목적은 기능들을 분리하는 것이고 이로 인해 개발자가 어떤 기능을 수정하더라도
		  연관없는 기능에는 영향이 가지 않게 되는 기대효과가 있다.
	
		- 이 원칙을 따르면 코드의 재사용성과 유지보수성이 향상된다.

	 */
		
		SRP_Badcase object = new SRP_Badcase();
		object.forwardMain();
		object.cryptoPassword();
		object.findUserPasswordUnchanged();
		object.forwardPayment();
		object.forwardAuthentication();
		
		
		SRP_Controller controller = new SRP_Controller();
		controller.forwardAuthentication();
		controller.forwardMain();
		controller.forwardPayment();
		
		SRP_Service service = new SRP_Service();
		service.cryptoPassword();
		service.findUserPasswordUnchanged();
		service.sendMailForAuthentication();
	}
}
