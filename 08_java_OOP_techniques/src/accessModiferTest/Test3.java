package accessModiferTest;

import step8_02.encapsulation.EncapsulationEx03;

public class Test3 {

	EncapsulationEx03 object = new EncapsulationEx03();
	
	void test() {
		
		System.out.println(object.publicV);      // 같은 프로젝트이므로 접근 가능
		//System.out.println(object.defaultV);     // (불가) 같은 패키지가 아니므로 접근 불가능
		//System.out.println(object.protectedV);   // (불가)상속관계가 아니므로 접근 불가능
		//System.out.println(object.privateV);     // (불가)같은클래스 내부가 아니므로 접근 불가능
	
		object.publicM();		// 같은 프로젝트이므로 접근 가능
		//object.defaultM();	    // (불가) 같은 패키지가 아니므로 접근 불가능
		//object.protectedM();	// 상속관계이므로 접근 가능
		//object.privateM();     // (불가)같은클래스 내부가 아니므로 접근 불가능
		
	}
	
	
}
