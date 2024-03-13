package step1_05.condition;
/*
 * 3월 14일 목요일
 * 조금씩 풀어나가는 중 
 * 쉬운문제를 풀다보면서 객체지향 9번을 분석하는 스트레스를 조금씩 풀어나가는 중
 * 뭔가 하다보니 희망이 느껴진다.....
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



public class IfEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		System.out.print("아이디를 입력하세요 : ");
		int yourId = scan.nextInt();
		System.out.print("패스워드를 입력하세요 : ");
		int yourPw = scan.nextInt();
		
		if (yourId == dbId && yourPw == dbPw) {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("틀렸습니다.");
		}

	}

}
