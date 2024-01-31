package step3_01_arrayAdvanced;
/*
 * 1월 31일 
 * 나름 괜찮게 풀린 문제 정답 안봤다.
 * 쉬운정도
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("원하는 데이터의 행넘버를 입력하세요 : ");
		int index = scan.nextInt();
		
		System.out.print("원하는 데이터의 열을 입력하세요 :");
		int columns = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (index == i && columns == j) {
					System.out.println("선택하신 index " + index + "선택하신 columns" + columns);
					System.out.print(arr[i][j]);
				}
			}
		}
		System.out.println();
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.println("행렬에 존재하는 데이터를 입력해주신다면 행, 열을 출력해줍니다. ");
		System.out.println("데이터를 입력하여 주세요");
		int data = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (data == arr[i][j]) {
					System.out.println(data + "행렬의 " + i + "행의 인덱스 " + j + "열의 인덱스 ");
				}
			}
		}
		System.out.println();
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int maxNum = 0;
		int idx1 = 0;
		int idx2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i > maxNum || j > maxNum) {
					idx1 = i;
					idx2 = j;
				}
				
			}
		} System.out.println(idx1 + " " + idx2);
		
		// 문제 4) 값 2개를 입력받아 값 교체

		System.out.println("데이터값을 교체합니다.");
		
		System.out.println("데이터를 입력해주세요");
		int data1 = scan.nextInt();
		
		System.out.println("데이터를 입력해주세요");
		int data2 = scan.nextInt();
		
		
		int data1Index = 0;
		int data1Columns = 0;
		
		int data2Index = 0;
		int data2Columns = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (data1 == arr[i][j] ) {
					data1Index = i;
					data1Columns = j;
				}
				
				if (data2 == arr[i][j]) {
					data2Index = i;
					data2Columns = j; 
				}
				
				arr[data1Index][data1Columns] = data2;
				arr[data2Index][data2Columns] = data1;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}
