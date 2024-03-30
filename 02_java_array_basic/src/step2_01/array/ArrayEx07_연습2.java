package step2_01.array;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */


public class ArrayEx07_연습2 {

	public static void main(String[] args) {
		
		int[] studentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		int score1th = 0;
		int StudentNum1th = 0;
		
		for (int i = 0; i < studentNums.length; i++) {
			if (scores[i] > score1th) {
				score1th = scores[i];
				StudentNum1th = studentNums[i];
			}
		}
		System.out.println("1등 학생 = " + StudentNum1th + " 번 " + score1th +  " 점 ");
	}
}
