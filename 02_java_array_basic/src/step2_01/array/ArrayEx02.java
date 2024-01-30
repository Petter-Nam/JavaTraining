package step2_01.array;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		// 배열 사용 예시 1
		
		// String test1[] = new String[3]; // 문자열 타입과 변수 타입 이런식으로 하는 것보단 타입끼리 묶어서 사용하는게 좋다.
		
		String[] test1 = new String[3];
		
		double[] test2 = new double[5];
		
		char[] test3 = new char[1];
		
		boolean[] test4 = new boolean[10];	
		
		int[] arr1 = new int[3];
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		// 배열 사용 예시 2 : 축약형 (배열을 처음 생성할 때 한번만 가능하다.)
		
		int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		String[] arr3 = {"한놈", "두시기", "석삼", "너구리", "오징어"};
		
		char[] arr4 = {'o', 'X', 'O', 'X'};
		// arr2 = {100, 200, 300}; // 불가능하다.
		// arr3 = {"일", "이", "심"};
		
		
		// 배열 사용 예시 3 : 다른 문법과의 조합
		
		int[] arr5 = new int[100];
		
		for (int i = 1; i < arr5.length; i++) {
			arr5[i] = i + 1;
			
		}
		// 배열의 전체요소 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		// (참고) 배열이 익숙해진 후에 사용
		// import java.util.Arrays;
		// Arrays.toString(배열명)
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		

	}

}
