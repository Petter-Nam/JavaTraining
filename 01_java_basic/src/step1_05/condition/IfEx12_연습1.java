package step1_05.condition;
/*
 * 1월 19일 AM 3:06 ~ 3 : 25
 * 문제를 혼자 풀어보고 생각해보다가 이상해서 결국 답을 보았다.
 * 초기값을 생각못해보고 무작정 if문을 작성하였다. 정말 미숙하다.
 * 역시 연습이 더 필요하다.
 */
import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x의 값을 입력하여주세요:");
		int x = scan.nextInt();
		
		System.out.print("y의 값을 입력하여주세요:");
		int y = scan.nextInt();
		
		System.out.print("z의 값을 입력하여주세요:");
		int z = scan.nextInt();
		
		int maxNum = x;
		
		if (maxNum < y) {
			maxNum = y;
		}
		
		if (maxNum < z) {
			maxNum = z;
		}
		System.out.println("최대값은" + maxNum);
		scan.close();
	}

}
