package step1_05.condition;
/*
 * 
 * 2월 12일
 * 
 */
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


public class IfEx04_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		int loginCheck = 0;
		
		System.out.println("ID 입력 : ");
		int yrId = scan.nextInt();
		System.out.println();
		
		if (dbId == yrId) {
			System.out.print("Password 입력 : ");
			int pwd = scan.nextInt();
			System.out.println();
			
			if (pwd == dbPw) {
				System.out.println("로그인이 되었습니다.");
				loginCheck = 1;
			} 
			else if (pwd != dbPw) {
				System.out.println("Password가 일치하지 않습니다.");
			}
		}
		else if (dbId != yrId) {
			System.out.println("ID가 일치하지 않습니다.");
		}

	}

}
