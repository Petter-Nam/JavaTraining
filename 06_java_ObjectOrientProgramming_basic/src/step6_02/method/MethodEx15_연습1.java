package step6_02.method;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NumberGamee {

	Scanner scan = new Scanner(System.in);

	int[] move = { 0, 0, 0, 0, 8, 0, 0, 0, 0, 0 };
	int playerLocation = 4;

	void showCharacter() {

		for (int i = 0; i < move.length; i++) {
			if (move[i] == 0) {
				System.out.print("[]");
			} else if (move[i] == 8) {
				System.out.print("옷");
			}
		}
		System.out.println();
	}

	void showInfo() {
		System.out.println("1. 좌로 이동");
		System.out.println("2. 우로 이동");
		System.out.println("3. 종료하기");
	}

	void moveLeft() {
		if (playerLocation > 0) {
			move[playerLocation] = 0;
			move[playerLocation] = move[playerLocation - 1];
			playerLocation--;
		} else {
			System.out.println("더 이상 이동하실수 없습니다.");
		}
	}

	void moveRight() {
		if (playerLocation < move.length) {
			move[playerLocation] = 0;
			move[playerLocation] = move[playerLocation + 1];
			playerLocation++;
		}
		else {
			System.out.println("더 이상 이동하실수 없습니다.");
		}
	}

	void showRun() {

		while (true) {
			showCharacter();
			showInfo();
			System.out.println("입력 : ");
			int moving = scan.nextInt();

			if (moving == 1) {
				moveLeft();
			} 
			else if (moving == 2) {
				moveRight();
			} 
			else if (moving == 0) {
				System.out.println("종료합니다.");
				scan.close();
				break;
			}
		}
	}
}

public class MethodEx15_연습1 {

	public static void main(String[] args) {

		NumberGamee g = new NumberGamee();
		g.showRun();
	}

}
