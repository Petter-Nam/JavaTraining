package step1_05.condition;

import java.util.Scanner;

/*
 * 처음엔 작성하는 것이 어려워 예시를 보면서 쳤다.
 * 예시를 한 번 보고 작성하니 코드를 짜기 쉬워졌다.
 * 
 */


/*
 * # 로그인[2단계]
 * 
 * 1. id와 pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 id와 pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		
		System.out.print("회원가입");
		System.out.println();
		
		System.out.print("DB에 당신의 ID를 입력하여주세요");
		dbId = scan.nextInt();
		System.out.println();
		
		System.out.print("DB에 당신의 PWD를 입력하여주세요");
		dbPw = scan.nextInt();
		System.out.println();
		
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println("다시 로그인하여 이용하여주세");
		System.out.println();
		
		System.out.print("로그인");
		System.out.println("ID 입력");
		int myId = scan.nextInt();
		System.out.println();
		
		System.out.println("PWD 입력");
		int myPwd = scan.nextInt();
		System.out.println();
		
		if (dbId == myId) System.out.println("ID가 일치합니다.");
		if (dbId != myId) System.out.println("ID가 일치하지않습니다.");
		System.out.println();
		
		if (dbPw == myPwd) System.out.println("PW가 일치합니다.");
		if (dbPw != myPwd) System.out.println("PW가 일치하지않습니다.");
		System.out.println();
		
		if ((dbId == myId) && (dbPw == myPwd)) System.out.println("로그인이 되었습니다.");
		if ((dbId != myId) || (dbPw != myPwd)) System.out.println("로그인이 불가합니다");
		
		scan.close();
	}

}
