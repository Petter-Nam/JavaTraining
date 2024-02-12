package step6_02.method;

import java.util.Scanner;

class Ex05_연습1{

	int test1 (int sum) {
		sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;

		}
		return sum;
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int arr1 = arr[0];
		int no = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr1) {
				no = arr[i];
			}
		}
		scan.close();
	}
	
}


public class MethodEx05_연습1 {

	public static void main(String[] args) {

	
			Ex05_연습1 e = new Ex05_연습1();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			int sum = 1; 
					e.test1(sum);
			System.out.println(e.test1(sum));
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			
			for (int i = 0; i < 3; i++) {
 			System.out.println("정수 3개를 입력하세요 : ");
 			
			}
			
			
			e.test2();
	


	}

}
