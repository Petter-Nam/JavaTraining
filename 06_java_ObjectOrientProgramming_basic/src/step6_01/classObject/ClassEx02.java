package step6_01.classObject;

/*
 * 
 * # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 * 
 * */


class Product {
	
	// 클래스의 필드는 초깃값이 저장되어있다.
	String code;
	String name;
	String image;
	int price;
	int deliveryPrice = 2500; //필드에 초깃값을 설정하여 이용가능
}

public class ClassEx02 {

	public static void main(String[] args) {
		
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.(접근제어자는 후에 자세히 공부)
		Member member = new Member();
		
		member.id = "azsx1234";
		member.password = "1234";
		System.out.println("id : " + member.id);
		System.out.println("password : " + member.password);
		
		Product product = new Product();
		product.code = "0x.001";
		product.name = "스마트TV";
		product.image = "스마트.PNG";
		product.price = 1500000;
		product.deliveryPrice = 0;
		System.out.println("code : " + product.code);
		System.out.println("name : " + product.name);
		System.out.println("image : " + product.image);
		System.out.println("price : " + product.price);
		System.out.println("deliverPrice : " + product.deliveryPrice);
	}

}
