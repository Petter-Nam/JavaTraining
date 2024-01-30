package step1_05.condition;
/*
 * 1월 17일 AM 2:30 ~ 2:50
 * 혼자 풀어보고 답보고 시간이 좀 걸렸다.
 * 
 */
import java.util.Scanner;

/*
 * # 로그인[3단계]
 * 
 * 1. id를 입력받아 dbId와 일치할 경우에만 pw를 입력할 수 있다.
 * 2. id가 틀린 경우, "id를 확인해주세요"라는 메세지를 출력한다.
 * 3. pw가 틀린 경우, "pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. id와 pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */



public class IfEx10_연습1 {

	public static void main(String[] args) {
		
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 ID를 입력하여주세요 :");
		int meinId = scan.nextInt();
		
		System.out.println("당신의 PW를 입력하여주세");
		int meinPw = scan.nextInt();
		
		if (dbId == meinId) {
			System.out.println("당신의 id가 일치합니다.");
		
		if (dbPw == meinPw) {
			System.out.println("당신의 Pw가 일치합니다.");
		}
		}
	}

}
