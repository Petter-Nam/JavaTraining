package step2_01.array;

/*
 * 1월 24일
 * 
 * 가벼운 실수가 들어남...
 * if 조건을 계속	for문에 적용함
 */

/*
 * # 배열 기본문제
 */

public class ArrayEx03_연습1 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50

		int[] arr1 = new int[6];

		for (int i = 1; i < arr1.length; i++) {
			arr1[i] = 10 * i;
			System.out.print(arr1[i] + " ");

		}
		System.out.println();
		// 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
		// 정답2) 20 40

		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] % 4 == 0) {
				System.out.print(arr1[i] + " ");
			}
		}
		System.out.println();
		// 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
		// 정답3) 60
		int plusArrays = 0;

		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] % 4 == 0) {
				plusArrays += arr1[i];

			}
		}
		System.out.print(plusArrays);
		System.out.println();
		// 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
		// 정답4) 2
		int cnt = 0;
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] % 4 == 0) {
				cnt++;

			}

		}
		System.out.print(cnt);
		// 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
		// 정답5) 5
		int cntSecond = 0;
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				cntSecond++;

			}
		
		}
		System.out.println(cntSecond);
	}

}
