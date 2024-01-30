package step1_02.variable;
/*
 *#변수에 생명주기(life cycle), 범위(scope)
 *
 */
public class VariableEx04 {

	public static void main(String[] args) {

		int x = 12;
		
		if (true) {
			int y = 7;
			//System.out.println(x);
			System.out.println(y);
			//System.out.println(z); // error
		}

			if (true) {
				
				int z = 3;
			//System.out.println(x);
			//System.out.println(y); // error
				System.out.println(z);
				
			}
	System.out.println(x);
	//System.out.println(y);//error
	//System.out.println(z);//error
	
}
}