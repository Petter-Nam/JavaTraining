package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx24_연습1 {

	public static void main(String[] args) {
		
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		int scoreAvg = 0;
		int totalScore = 0;
		int passStudentCnt = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			int numOfScore = ran.nextInt(100) + 1;
			
			if (numOfScore >= 60) {
				passStudentCnt++;
				totalScore += numOfScore;
			}
			else if (numOfScore <= 60) {
				totalScore += numOfScore;
			}
			scoreAvg = totalScore / 10;
			System.out.println("10명의 학생의 총합은 : " + totalScore + " 입니다.");
			System.out.println("전체 학생의 평균은 : " + scoreAvg);
			
		}
	}

}
