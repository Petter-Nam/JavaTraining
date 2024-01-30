package step1_05.condition;
/*
 * 1월 23일 
 * 정말 미친듯이 어려운것 같다.
 * 연습문제 내생각으로 풀고 결국 답을보지만
 * 실력이 올라간다기보다는 이문제는 이렇게 풀고 저문제는 저렇게 푸는게 느껴지는 정도이다.
 * 현재 한 문제 푸는데 시간이 오래걸리는데 2, 3 개월 안에 모든 문제를 다풀고 다시풀면 
 * 안보고 다 풀어볼수 있을지 다풀고 다시 한 번 풀어볼 시간은 있을지 모르겠다.
 * 왜 개발자들 6개월 했다고 하면 무시받는지 알 것 같다.
 *  
 */
import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class IfEx28_테스트문제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.");

		System.out.print("meLeft 입력 :");
		int meLeft = scan.nextInt();

		System.out.println();

		System.out.print("meRight 입력 :");
		int meRight = scan.nextInt();

		System.out.println();

		int comLeft = ran.nextInt(3) + 1;
		int comRight = ran.nextInt(3) + 1;

		System.out.println("meLeft(1), meRight(2) 중 하나를 선택");
		System.out.println();

		int meFinal = scan.nextInt();

		int comFinal = ran.nextBoolean() ? comLeft : comRight;

		

		while (meFinal == comFinal) {
			System.out.println("비겼습니다.");
			System.out.println();
			System.out.println("당신은 " + meFinal + "com은 " + comFinal);
			System.out.println();
			System.out.println("다시 선택하세요 ");
			System.out.println();
			System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.\n");
			System.out.print("meLeft 입력 :");
			meLeft = scan.nextInt();

			System.out.println();

			System.out.print("meRight 입력 :");
			meRight = scan.nextInt();
			System.out.println("meLeft(1), meRight(2) 중 하나를 선택");
			System.out.println();

			meFinal = scan.nextInt();
			comFinal = ran.nextBoolean() ? comLeft : comRight;
		
			}

			if (meFinal == 1 && comFinal == 2) {
				System.out.println("졌습니다.");
				
				
			} else if (meFinal == 2 && comFinal == 3) {
				System.out.println("졌습니다.");
				
			} else if (meFinal == 3 && comFinal == 1) {
				System.out.println("졌습니다.");
			
			} else {
				System.out.println("이겼습니다.");
			}
			System.out.println();
			System.out.println("당신은 " + meFinal + "com은 " + comFinal);
			scan.close();
		}
		
	}
