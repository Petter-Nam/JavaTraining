package step5_01.exception;

/*

 	# 예외(Exception) 처리
  
	- 자바에서 예외(Exception)는 프로그램 실행 중에 발생할 수 있는 비정상적인 상황 또는 오류를 나타낸다. 
	
	- 예외 처리는 이러한 문제들을 관리하고 프로그램의 정상적인 흐름을 유지하도록 돕는 중요한 메커니즘이다.
	
	- 자바의 예외 처리는 프로그램의 안정성과 견고함을 높이는 데 중요한 역할을 한다. 
	
	- 적절한 예외 처리를 통해 예상치 못한 오류로부터 프로그램을 보호하고, 오류 상황을 적절히 관리할 수 있다.

	
	 [ 예외의 종류 ]
	
	자바에서는 크게 두 가지 유형의 예외를 다룬다.
	
	1) 체크 예외(Checked Exception): 컴파일 시점에 처리를 강제하는 예외이다. 
	    이 예외들은 Exception 클래스를 상속받지만, RuntimeException을 상속받지 않는다. 
	    예를 들어, IOException이나 SQLException이 있으며 체크 예외는 반드시 try-catch 블록으로 처리하거나 
	    throws 키워드를 사용하여 상위 메소드에 예외 처리 책임을 위임해야 한다.
	
	2) 언체크 예외(Unchecked Exception): 런타임 시에 발생하며, 컴파일 시점에 처리를 강제하지 않는다. 
	   이 예외들은 RuntimeException을 상속받는다. 
	   예를 들어, NullPointerException, ArrayIndexOutOfBoundsException 등이 있으며 명시적인 처리를 강제하지 않는다.


	 [ 예외 처리 방법 ] 
	
	자바에서는 주로 다음 두 가지 방법으로 예외를 처리한다.
	
	1) try-catch 블록: 예외가 발생할 수 있는 코드를 try 블록 안에 작성하고 catch 블록에서 해당 예외를 처리한다. 
	  				   필요에 따라 finally 블록을 사용하여 예외 발생 여부와 관계없이 실행해야 하는 코드를 작성할 수 있다.
	
	2) throws 키워드: 메소드 선언부에 throws 키워드를 사용하여 해당 메소드에서 처리하지 않고 호출한 메소드로 예외 처리 책임을 넘길 수 있다.


*/

public class ExceptionEx01 {

	public static void main(String[] args) {

		// try   : 예외가 발생하지 않을 경우 정상적으로 실행 될 명령어
		try {
			int[] testArr = new int[5];
			System.out.println(testArr[0]);
			//System.out.println(testArr[999]);
			System.out.println(0/0);
		}
		// catch : try{} 안의 명령어가 실행되는 중 예외가 발생할 경우 분기되는 명령어
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위초과 에러 캐치");
		}
		catch (ArithmeticException e) {
			System.out.println("연산에러 캐치");
		}
		catch (Exception e) {
			System.out.println("모든 에러");
		}
		
	}

}
