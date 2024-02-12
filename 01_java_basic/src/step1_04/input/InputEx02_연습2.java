package step1_04.input;
/*
 * 2월 12일
 * 초반부분이 쉬운 문제를 풀다보니 대충만들거나 열심히 만들거나 짬뽕이되었다.
 */
import java.util.Scanner;

public class InputEx02_연습2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 문제1) 숫자 2개를 입력받아서 합 출력
		int[] nArr = new int[2];
		int arrCnt = 0;
		
		for (int i = 0; i < nArr.length; i++) {
			System.out.print("숫자를 입력 : ");
			int num = scan.nextInt();
			
			if (num >= 0) {
				nArr[i] = num;
			}
			else if (num < 0) {
				nArr[i] = num;
			}
			else if (arrCnt == nArr.length) {
				System.out.println("두개의 수만 입력이 가능합니다.");
				break;
			}
			else {
				System.out.println("숫자만 입력하여주세요");
				continue;
			}
			
		}
		System.out.println(nArr[0] + " + " + nArr[1] + " = " + (nArr[0] + nArr[1]));
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.print("정수 입력 :");
		int num1 = scan.nextInt();
		
		if (num1 % 2 == 1) {
			System.out.println("홀수 입니다.");
		}
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		int cnt = 0;
        int[] arr = new int[100];

        while (true) {
            System.out.println("\n[1] 추가 \n[2] 취소");
            int choice = scan.nextInt();

            if (choice == 1) {
                System.out.print("성적을 입력하세요 : ");
                int score = scan.nextInt();
                if (score >= 60 && score <= 100) {
                    arr[cnt] = score;
                    cnt++;
                } else {
                    System.out.println("성적은 60점 이상 100점 이하여야 합니다.");
                }
            } else if (choice == 2) {
                int total = 0;
                for (int i = 0; i < cnt; i++) {
                    total += arr[i];
                }
                if (cnt != 0) {
                    System.out.println("평균: " + (total / (double) cnt));
                } else {
                    System.out.println("추가된 성적이 없습니다.");
                }
                break;
            } else {
                System.out.println("올바른 선택지를 입력하세요.");
            }
		}
		scan.close();
		
	}
	
}
