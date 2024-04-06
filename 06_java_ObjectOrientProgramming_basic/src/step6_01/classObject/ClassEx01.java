package step6_01.classObject;


/*
 * 
 *   # 객체 지향 프로그래밍 ( Object Oriented Programming [OOP] )
 *	  
 *
 *    - 객체지향 프로그래밍(Object-Oriented Programming, OOP)은 프로그래밍의 한 패러다임으로 
 *      프로그램을 객체들의 집합으로 모델링하여 개발하는 방식
 *      		  
 *	  - 코드의 재사용성이 높다.
 *	  - 코드의 확장성이 높다.
 *	  - 코드의 관리가 용이하다.
 *	  - 개발자간에 프로그램 방법에 통일과 일치성을 준다.
 *	  - 신뢰성이 높은 프로그래밍을 가능하게 한다.
 *		
 *
 * 
 *   # 클래스(class)
 *   
 *     - 클래스(class)는 객체 지향 프로그래밍(OOP)에서 특정 객체를 생성하기 위해 변수와 메소드를 정의하는 일종의 템플릿 또는 설계도이다. 
 *     
 *     - 객체의 속성과 행동을 정의한다.
 *     
 *      [ 형태 ]
 * 		1) class   : 키워드
 * 		2) Product : 클래스명 ( 첫글자를 대문자로 작성한다. ) 
 * 		3) {}      : 클래스의 영역 
 * 
 * 
 * 
 *   # 객체 (object)
 * 
 * 	  - 컴퓨터 과학에서 객체 또는 오브젝트(object)는 클래스에서 정의한 것을 토대로 메모리(실제 저장공간)에 할당된 것으로 
 *      프로그램에서 사용되는 데이터 또는 식별자에 의해 참조되는 공간을 의미하며, 변수, 자료 구조, 함수 또는 메소드가 될 수 있다. 
 *      프로그래밍 언어는 변수를 이용해 객체에 접근하므로 객체와 변수라는 용어는 종종 함께 사용된다. 
 *      그러나 메모리가 할당되기 전까지 객체는 존재하지 않는다.(위키백과 참조)
 * 
 * 	 - 객체는 속성(데이터)과 행동(메서드)을 가지는 프로그래밍의 기본 단위
 * 
 * 		[형태]
 * 
 * 	    클래스명 변수명 = new 클래스명();
 *   Ex)  Ex01     e    =  new Ex01();
 *    	  Random ran    =  new Random();
 * 
 * */


class Member {//클래스의 이름은 대문자로 시작한다.
	
	String id; //필드 (field), 속성(properties), 멤버(변수)
	String password;
	String name;
	String hp;
	String email;
	String address;
}

public class ClassEx01 {

	public static void main(String[] args) {
		Member member1 = new Member(); // 객체 : Object --> new 클래스명(); 형태로 객체를 생성한다. // 객체는 new Member();이다.
		member1.id = "qwer1234";
		member1.password = "1111";
		member1.name = "익명1";
		member1.hp = "010-9224-8041";
		member1.email = "qwer1234@naver.com";
		member1.address = "서울";
		
		Member member2 = new Member();
		member2.id = "adfqwer1234";
		member2.password = "ggggqwer1234";
		member2.name = "qhhhwer1234";
		member2.hp = "qwer12few34";
		member2.email = "qwer12ewfew34";
		member2.address = "qwer12341efdde";
		
		System.out.println("member1 객체");
		System.out.println(member1);
		System.out.println("id : " + member1.id);
		System.out.println("password : " + member1.password);
		System.out.println("name : " + member1.name);
		System.out.println("hp : " + member1.hp);
		System.out.println("email : " + member1.email);
		System.out.println("address : " + member1.address);
		
		
		System.out.println("================================================");
		
		
		System.out.println("member2 객체");
		System.out.println(member2);
		System.out.println("id : " + member2.id);
		System.out.println("password : " + member2.password);
		System.out.println("name : " + member2.name);
		System.out.println("hp : " + member2.hp);
		System.out.println("email : " + member2.email);
		System.out.println("address : " + member2.address);
		
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.(접근제어자는 후에 자세히 공부)
		new Product();
		new Product();
		new Product();
		new Product();
	}

}
