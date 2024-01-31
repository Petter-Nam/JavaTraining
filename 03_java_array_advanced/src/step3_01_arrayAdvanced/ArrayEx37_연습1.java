package step3_01_arrayAdvanced;
/*
 * 1월 31일
 * 문제 2번의 문제를 조금 다른 변수에 담아보겠다고 풀어보았는데 
 * 2번 째 행에 40과 60을 담으려니 같은 행의 i 값이여서 대체되어 문제를 겪었다.
 * 그래서 그냥 출력해서 내놓게 되었는데 다음번에 해결을 한 번 해보아야겠다.
 * 
 */
import java.util.Arrays;

/*
 *	# 2차원배열 기본문제[1단계]
*/

public class ArrayEx37_연습1 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k++;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.print("각 행렬의 값을 합한 결과 : " + sum);
		System.out.println();
		
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80 
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + " ");
				}
				
			}
			
		}
	
		
		int tot = 0;
		int fourCnt = 0;
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					tot += arr[i][j];
					fourCnt++;
				}
			}
		}
		System.out.println();
		System.out.println(tot);
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		System.out.println(fourCnt);


	}

}
