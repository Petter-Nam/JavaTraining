package step8_02.encapsulation;

//public class PublicC{} // (원래가능) 한 클래스에 public은 하나밖에 사용 못한다.
class Default{} // (가능)
//protected ProtectedC{} //(불가능) 클래스는 public, default 접근제어자만 사용가능하다.
//private PrivateC{} ////(불가능) 클래스는 public, default 접근제어자만 사용가능하다.


 class Test1 extends EncapsulationEx03 {
	 void test() {
		 System.out.println(publicV);// 같은 프로젝트이므로 접근 가능
		 System.out.println(defaultV);// 같은 패키지이므로 접근 가능
		 System.out.println(protectedV);// 상속관계이므로 접근가능
		// System.out.println(privateV);// (불가)같은 클래스 내부가 아니므로 접근 불가능
		 
		 publicM();
		 defaultM();
		 protectedM();
		 privateM();
	 }
 }
public class EncapsulationEx03 {
	public int publicV;// 프로젝트 전체에서 접근 가능
	int defaultV;// 같은 패키지에서 접근가능
	protected int protectedV;// 상속관계에서 접근 가능
	private int privateV;// 같은 클래스 내부에서만 접근 가능
	
	public void publicM() {}// 프로젝트 전체에서 접근 가능}
	void defaultM(){}// 같은 패키지에서 접근가능}
	protected  void protectedM(){}// 상속관계에서 접근 가능
	public void privateM(){}// 같은 클래스 내부에서만 접근 가능
}
