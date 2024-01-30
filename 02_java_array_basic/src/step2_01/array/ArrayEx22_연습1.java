package step2_01.array;
/*
 * 1월 29일 
 * 앞의 추가 삽입 삭제 각 항목을 더 연습해서 작성해보는게 좋을 것 같다.
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  19번 20번 21번의 문제를 한 코드로 병합하여 보세요.
 * 
 * 1) 추가
 * 2) 삽입
 * 3) 삭제
 * 
 *  정답 없음
 */

public class ArrayEx22_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0, 0, 0, 0, 0, 0 };
		int elementCnt = 2;
		int selectMenu = 0;
		System.out.println(Arrays.toString(arr));
		while (true) {

			System.out.println("\n1추가");
			System.out.println("2삽입");
			System.out.println("3삭제");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();
			System.out.println();
			
			if (selectMenu < 0 || selectMenu > 5) {
				System.out.println("선택항목에 있는 숫자를 입력해주세요");
				continue;
			}

			if (selectMenu == 1) {
				System.out.println("데이터 추가를 입력하셨습니다.");
				System.out.print("데이터를 입력하여주세요");
				int appendData = scan.nextInt();

				if (arr.length == elementCnt) {
					System.out.println("더이상 데이터를 추가할 수 없습니다.");
					System.out.println();
					continue;
				}
				arr[elementCnt] = appendData;
				elementCnt++;
				System.out.println(Arrays.toString(arr));

			} else if (selectMenu == 2) {
				System.out.println("데이터 삽입을 선택하셨습니다.");
				System.out.print("어느 인덱스에 삽입하시겠습니까");
				int insertIdx = scan.nextInt();
				System.out.println();

				if (insertIdx > elementCnt || insertIdx < 0) {
					System.out.println("해당위치에는 삽입하실 수 없습니다.");
				}

				System.out.println("데이터를 입력하여주세요");
				int insertData = scan.nextInt();
				System.out.println();
				
				for (int i = elementCnt; i > insertIdx; i--) {
					arr[i] = arr[i - 1];
				}

				arr[insertIdx] = insertData;
				elementCnt++;
				System.out.println(Arrays.toString(arr));

			} else if (selectMenu == 3) {
				System.out.println("데이터 삭제를 입력하셨습니다.");
				System.out.print("삭제할 데이터를 입력하여주세요");
				int delData = scan.nextInt();
				System.out.println();
				
				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (arr[i] == delData) {
						delIdx = i;
					}
				}
				if (delIdx == -1) {
					System.out.println("해당 데이터는 존재하지않습니다.");
					System.out.println();
				} else {
					for (int i = delIdx; i < elementCnt - 1; i++) {
						arr[i] = arr[i + 1];
					}
					elementCnt--;
					arr[elementCnt] = 0;
					System.out.println(Arrays.toString(arr));
					System.out.println();
				}

			}
			else if (selectMenu == 4) {
				System.out.println("종료하셨습니다.");
				scan.next();
				break;
			}

		}

	}
}
