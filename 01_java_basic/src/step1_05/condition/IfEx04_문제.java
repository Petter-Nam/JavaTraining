package step1_05.condition;

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 
 * 1. id와 pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 *    (db > database > 저장되어있는 데이터) 
 * 예) 로그인 성공 or 로그인 실패
 * 
 */


public class IfEx04_문제 {

	public static void main(String[] args) {
		
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Id를 입력해주세요:");
		int id = scan.nextInt();
		
		System.out.println("pwd를 입력해주세요:");
		int pwd = scan.nextInt();
		
		if (dbId == id) System.out.println("id가 일치합니다.");
		if (dbId != id) System.out.println("id가 일치하지않습니다.");
		if (dbPw == pwd) System.out.println("pwd가 일치합니다.");
		if (dbPw != pwd) System.out.println("pwd가 일치하지않습니다.");
		

	}

}
