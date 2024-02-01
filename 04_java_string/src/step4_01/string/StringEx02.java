package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * 
 * */

public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name = "Tim";
		
		System.out.print("이름을 입력하세요 : ");
		String getName = scan.next();
		
		if (name == getName) 	System.out.println("(==연산자) 이름 일치");
		else 					System.out.println("(==연산자) 이름 불일치"); // 이름을 똑같이 작성하여도 불일치가 뜬다. 이유는 같은 이름을 찾는게 아닌 같은 주소인지를 비교하는 것
		
		//비교가능 //name과 getName을 비교하는것 위치를 바꾸어도 문제없음
		if (name.equals(getName))	System.out.println("(equals) 이름 일치");
		else 						System.out.println("(equals) 이름 불일치");
		
		
		
		scan.close();
	}
	
}
