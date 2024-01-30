package step1_05.condition;

import java.util.Scanner;

/*
 * # 로그인[3단계]
 * 
 * 1. id를 입력받아 dbId와 일치할 경우에만 pw를 입력할 수 있다.
 * 2. id가 틀린 경우, "id를 확인해주세요"라는 메세지를 출력한다.
 * 3. pw가 틀린 경우, "pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. id와 pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */


public class IfEx10_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID 입력 : ");
		int myId = scan.nextInt();
		
		if (dbId == myId) {
			System.out.print("Pw 입력 : ");
			int myPw = scan.nextInt();
			
			if (dbPw == myPw) {
				System.out.println("로그인 성공!");
			}
			
			if (dbPw != myPw) {
				System.out.println("Pw를 확인해주세요.");
			}
		}
		
		if (dbId != myId) {
			System.out.println("Id를 확인해주세요.");
		}

		scan.close();

	}

}
