package step1_03.operator;

/*
 * 
 *  # 증감 연산자 
 *  
 *  1) 좌변에 우변의 값을 더한 후 저장			+=
 *  2) 좌변에 우변의 값을 뺀 후 저장 	   		-=
 *  3) 좌변에 우변의 값을 곱한 후 저장 	   		*=
 *  4) 좌변에 우변의 값을 나눈 후 저장 	   		/=
 *  5) 좌변에 우변의 값을 나눈 나머지를 저장   	%=
 *  6) 변수의 값에 1을 더한 후 저장	       	 	++
 *  7) 변수의 값에 1을 뺀 후 저장	        	--
 *  
 * */

public class OperatorEx08 {

	public static void main(String[] args) {

		int orderCnt = 3;
		orderCnt += 2; // orderCnt = orderCnt + 2;
		System.out.println(orderCnt);
		
		int balance = 10000;
		balance -= 3200; //balance = balance - 3200;
		System.out.println(balance);
	
		
		int totalPrice = 1000;
		totalPrice *= 7; // totalPrice = totalPrice * 7;
		System.out.println(totalPrice);
		
		System.out.println();
		
		/*
		 * ( 참고 )
		 * 
		 * 변수++ , ++변수
		 * 변수-- , --변수
		 * 
		 * - 명령어 실행순서의 차이
		 * 
		 * */
		
		int x = 0;
		x++; //x += 1; x = x + 1;   // 순서의 영향이 없다.
		System.out.println(x);
		++x; //x += 1; x = x + 1;   // 순서의 영향이 없다.
		System.out.println(x);
		System.out.println();
		
		int y = 0;
		System.out.println(y++); // sysout명령어를 실행후 y를 증가
		System.out.println(y);
		System.out.println();
		
		int z = 0;
		System.out.println(++z);  // z를 증가후 sysout명령어를 실행
		System.out.println(z);
		
	}

}




