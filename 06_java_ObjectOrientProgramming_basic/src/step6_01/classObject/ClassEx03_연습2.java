package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_연습2 {
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_연습2 {

	public static void main(String[] args) {
			
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		Ex03_연습2 array = new Ex03_연습2();
		int tot = 0;
		
		for (int i = 0; i < array.arr.length; i++) {
			tot += array.arr[i];
		}
		System.out.println(tot);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int[] ac = array.arr;
		
		int fourth = 0;
		
		for (int i = 0; i < ac.length; i++) {
			if (ac[i] % 4 == 0) {
				fourth += ac[i];
			}
		}
		System.out.println(fourth);
		
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int cnt = 0;
		for (int i = 0; i < ac.length; i++) {
			if (ac[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int cnt3 = 0;
		for (int i = 0; i < ac.length; i++) {
			if (ac[i] % 2 == 0) {
				cnt3++;
			}
		}
		System.out.println(cnt3);
	}

}
