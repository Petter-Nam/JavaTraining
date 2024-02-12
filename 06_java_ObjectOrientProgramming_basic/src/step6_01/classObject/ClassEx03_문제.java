package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_연습1 {
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_문제 {

	public static void main(String[] args) {
		Ex03_연습1  object = new Ex03_연습1();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		int[] arr = object.arr;
		int init = 0;
		for (int i = 0; i < 5; i++) {
			init += arr[i];
		}
		System.out.println(init);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int fourSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				fourSum += arr[i];
				
			}
			
		}
		System.out.println(fourSum);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int Wkrtn = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				Wkrtn++;
			}
		}
		System.out.println(Wkrtn);

	}

}
