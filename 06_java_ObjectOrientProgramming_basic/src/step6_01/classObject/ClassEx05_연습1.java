package step6_01.classObject;
/*
 * 2월 8일 Easy~~~
 * 
 * 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */


class Ex05_연습1{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}



public class ClassEx05_연습1 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		Ex05_연습1 ex05 = new Ex05_연습1();
		
		
		
		//Ex05 mega = new Ex05();
		//mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			//System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if		(choice == 1) {
				System.out.println("전교생 성적확인");
				
				for (int i = 0; i < ex05.arHakbun.length; i++) {
					System.out.print("학번 : " + ex05.arHakbun[i] + "성적 : " + ex05.arScore[i] + " / ");
				}
				System.out.println();
			}
			else if (choice == 2) {
				System.out.println("1등학생 성적확인 ");
				int no1 = ex05.arScore[0];
				int cnt = 0;
				for (int i = 0; i < ex05.arHakbun.length; i++) {
					if (ex05.arScore[i] > no1) {
						no1 = ex05.arScore[i];
						cnt = i;
					}

				}
				System.out.println("1등의 성적은 : " + no1 + "    학번 : " + ex05.arHakbun[cnt]);
				System.out.println();
			}
			else if (choice == 3) {
				int minScore = ex05.arScore[0];
				int minNum = 0;
				for (int i = 0; i < ex05.arScore.length; i++) {
					if (ex05.arScore[i] < minScore) {
						minScore = ex05.arScore[i];
						minNum = i;
					}
				}
				System.out.println("꼴등학생 : " + ex05.arHakbun[minNum] + "    점수 " + minScore);
				
			}
			else if (choice == 4) {
				System.out.println("학번 : " + Arrays.toString(ex05.arHakbun) + "\n" + "성적 : " + Arrays.toString(ex05.arScore));
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
