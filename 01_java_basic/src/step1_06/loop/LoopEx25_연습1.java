package step1_06.loop;
/*
 * 1월 25일 
 * 해당 문제는 if문에서 어떻게 가장 큰값을 정해야하는지 오래 헤맸다....
 * 
 */
import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx25_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int maxNum = 0;
		int[] num = new int[3];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("3개의 정수값을 입력하세요.");
			num[i] = scan.nextInt();
			
			if (num[i] > maxNum) {
				maxNum = num[i];
			}
			
		}
		System.out.println();
		System.out.print("가장 큰 정수값은 : " + maxNum + "입니다.");
		scan.close();

	}
		
}
