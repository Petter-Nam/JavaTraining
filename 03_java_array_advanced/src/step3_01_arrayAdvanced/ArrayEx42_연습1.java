package step3_01_arrayAdvanced;
/*
 * 2월 1일
 * 정답을 분석 후 만들어봤을 때 
 * 보면서 지칠정도로 어렵지 않고
 * 나중에 시간이 지나도만들 수있을것같다.
 * 
 */
import java.util.Scanner;

/*
 * 
 * # 나만의 마블
 * 
 * 옷 □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 * 
 */

public class ArrayEx42_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		final int ROAD = 20;

		int[][] map = { 
				{ 0, 1, 2, 3, 4 }, 
				{ 15, 20, 20, 20, 5 }, 
				{ 14, 20, 20, 20, 6 }, 
				{ 13, 20, 20, 20, 7 },
				{ 12, 11, 10, 9, 8 } };

		int player = 0;
		
		while (true) {
			
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == ROAD) 			System.out.print("■ ");
					else if (map[i][j] == player) 	System.out.print("옷 ");
					else 							System.out.print("□ ");
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("1~3을 입력하여 주세요 :");
			int move = scan.nextInt();
			
			
			player += move;
			player %= 16;
			
			
		}
	
	}

}
