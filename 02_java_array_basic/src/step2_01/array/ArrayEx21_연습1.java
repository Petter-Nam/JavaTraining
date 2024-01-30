package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제
 * 
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx21_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };
		int elementCnt = 5;
		int selectMenu = 0;
		System.out.println(Arrays.toString(arr));

		while (true) {
			System.out.println("[1] 삭제");
			System.out.println("[2] 종료");
			System.out.print("삭제하시겠습니까?");
			selectMenu = scan.nextInt();

			if (selectMenu == 1) {
				System.out.print("삭제할 데이터를 입력하세요");
				int data = scan.nextInt();

				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (arr[i] == data) {
						delIdx = i;
					}

				}
				if (delIdx == -1) {
					System.out.println("삭제할 데이터가 배열에 존재하지 않습니다.");
					continue;
				}
				else {
						for (int i = delIdx; i < elementCnt - 1; i++) {
							arr[i] = arr[i+1];
					}
						arr[elementCnt] = 0;
						elementCnt--;
						System.out.println(Arrays.toString(arr));
				}
			}
			else if(selectMenu == 0) {
				System.out.println("종료하셨습니다.");
				scan.close();
				break;
			}

		}
	}

}
