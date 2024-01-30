package step2_01.array;
/*
 * 1월 24일 쉽게 풀렸다. so Easy~~
 */
import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */


public class ArrayEx04_연습1 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 1; i < 5; i++) {
			int ranNum = ran.nextInt(100) + 1;
			
			if (ranNum >= 0) {
				arr[i] = ranNum; 
				System.out.print(arr[i] + " ");
			}
			
		}
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int totalScore = 0;
		int totalAvg = 0;
		
		for (int i = 1; i < arr.length; i++) {
			totalScore += arr[i];
		}
		totalAvg  = totalScore / 5;
		System.out.println("총 점수는 : " + totalScore );
		System.out.println("총 평균은 :" + totalAvg);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 60) {
				cnt++;
			}
			
		}
		System.out.println(cnt);

	}
	
}
