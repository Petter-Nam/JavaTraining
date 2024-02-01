package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 입력
 * 
 *  next() : 공백을 기준으로 한단어만 입력받는다.
 * 
 * */

public class StringEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("급여를 입력하세요 : ");
		int salary = scan.nextInt();
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.nextLine();              // nextLine을 사용하면 위에 다른 데이터 타입을 사용하면 문제가 발생하여 사용을 하지않아  next() 사용을 추천한다.
		
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);
		
		
		/*
		System.out.print("이름을 입력하세요 : ");
		//String name = scan.next();		// 띄어쓰기를 제외한 문자열을 입력받는다.
		String name = scan.nextLine();    // 띄어쓰기를 포함한 문자열을 입력받는다.
		
		System.out.println("name : " + name);
		*/
		scan.close();
		
		
	}

}
