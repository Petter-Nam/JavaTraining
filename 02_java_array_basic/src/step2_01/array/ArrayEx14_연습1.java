package step2_01.array;
/*
 * 1월 25일 
 * 캐릭터의 동작성 알아가는 원리가 참 어렵다.
 * 문법적으로 코딩되어있는것을 시간들여서 파악해보니 겨우 알아냈다.
 * 해당 문제를 여러번 시간을 텀을 두어 풀었을 때 풀 수있게될지 모르겠다.
 * 
 * 
 */
import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] game = { 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int temp = 0;
		int player = 0;

		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}

		while (true) {

			for (int i = 0; i < game.length; i++) {
				if (game[i] == 2) {
					System.out.print("옷");
				} else
					System.out.print("_");
			}
			System.out.println();
			System.out.print("왼쪽[1] 오른쪽[2] 종료 [3]입력 :");
			int move = scan.nextInt();

			if (move == 1) {
				if (player != 0) {
					game[player] = 0;
					game[player - 1] = 2;
					player--;
				}
			} else if (move == 2) {
				if (player != game.length - 1) {
					game[player] = 0;
					game[player + 1] = 2;
					player++;
				}
			}
			if (move == 3) {
				scan.close();
				break;
			}

		}
	}

}
