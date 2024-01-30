package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int com = ran.nextInt(100) + 1;
		System.out.println("치트키 = " + com);

		int score = 100;
		int wrongAnswerCnt = 0;
		boolean isRun = true;

		while (isRun) {

			if (wrongAnswerCnt == 19)
				isRun = false;

			System.out.print("숫자 입력[1~100] : ");
			int me = scan.nextInt();

			if (com > me) {
				System.out.println("Up!");
				wrongAnswerCnt++;
			} else if (com < me) {
				System.out.println("Down!");
				wrongAnswerCnt++;
			} else if (com == me) {
				System.out.println("Bingo!");
				isRun = false;
			}

		}

		score = score - (5 * wrongAnswerCnt);
		System.out.println("성적 = " + score + "점");

		scan.close();
	}
}
