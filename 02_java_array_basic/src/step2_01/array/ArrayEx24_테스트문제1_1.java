package step2_01.array;
/*
 * 	1월 31일
 * 안보고 작성해보았다.
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] a = { 10, 4, 5, 3, 1 };
		int aCnt = 5;
		int sum = 0;
		System.out.println(Arrays.toString(a));
		// 문제 1) 전체 요소의 합출력
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			
		}
		System.out.println(sum + "\n");
		

		// 문제 2) 데이터를 입력하면 배열의 인덱스 출력
		// 예) 5 => 2 , 1 => 4

		System.out.println("데이터를 입력하시면 해당 인덱스의 값이 나옵니다.");
		System.out.print("데이터 값을 입력하여주세요");
		int printIndex = scan.nextInt();
		System.out.println();

		for (int i = 0; i < aCnt; i++) {
			if (printIndex == a[i]) {
				System.out.println("인덱스 넘버는 " + i + " 입니다.");
				System.out.println();
			} else if (printIndex < 0 && printIndex != a[i]) {
				System.out.println("해당 배열에 존재하지 않는 데이터입니다.");
				System.out.println();
			}

		}

		// 문제 3) 배열의 인덱스를 입력하면 데이터 출력
		// 예) 2 => 5 , 4 => 1
		System.out.println("인덱스 넘버는 0 ~ 4 까지 존재합니다. ");
		System.out.print("넘버를 선택하시면 해당 인덱스의 데이터가 보입니다.");
		int printData = scan.nextInt();
		
		int result = 0;
		if (printData >= 0) {
			result = a[printData];
		}
		System.out.println(result);

		// 문제 4) 배열중 가장 큰 데이터 출력
		// 예) 10
		int maxNum = 0;
		for (int i = 0; i < aCnt; i++) {
			if (maxNum > a[i]) {
				maxNum = a[i];
			}
		}
		System.out.println(maxNum);
		// 문제 5) 배열중 홀수의 개수 출력
		// 예) 홀수의 개수 : 3
		int oddCount = 0;
		for (int i = 0; i < aCnt; i++) {
			if (a[i] % 2 == 1) {
				oddCount++;
			}
		}
		System.out.println("홀수의 개수는 " + oddCount + "입니다.");

		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0 , 0 , 5 , 3 , 1}
		int[] b = {0 , 0 , 0 , 0 , 0};
		for (int i = 0; i < aCnt; i++) {
			if (a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		// 문제 7) a의 값중 홀수만 c에 저장(저장위치는 앞에서부터 저장)
		// 예) c => {5, 3, 1, 0, 0}
		int[] c = { 0 , 0 , 0 , 0 , 0 };
		
		for (int i = 0; i < aCnt; i++) {
			if (a[i] % 2 == 1) {
				c[4 - i] = a[i];
				
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
