package step3_01_arrayAdvanced;
/*
 * 2월 12일
 * 
 * 
 */
import java.util.Arrays;

/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 -1로 변경한다.
 * 3. arr배열의 모든 값이 -1로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, -1, 24
 * 입력 : 87
 * 
 * 11, -1, 42, -1, 24
 * 
 */


public class ArrayEx25_연습2 {

	public static void main(String[] args) {
		
		int[] arr = {11, 87, 42, 100, 24};
		int highNum = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highNum) {
				highNum = arr[i];
				cnt++;
			}
		}
		arr[cnt] = -1;
		
		System.out.println(Arrays.toString(arr));
	}
}
