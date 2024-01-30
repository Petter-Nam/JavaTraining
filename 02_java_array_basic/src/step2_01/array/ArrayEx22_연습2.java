package step2_01.array;
/*
 * 1월 30일 
 * 아직 연습이 더 필요하다...
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

public class ArrayEx22_연습2 {

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

			if (selectMenu == 1) {
				System.out.println("추가를 입력하셨습니다.");
				System.out.println();

				if (elementCnt == arr.length) {
					System.out.println("더이상 추가하실수 없습니다.");
					continue;
				}
				System.out.println("추가하실 데이터를 입력하여주세요");
				int appendData = scan.nextInt();

				arr[elementCnt] = appendData;
				elementCnt++;
				System.out.println(Arrays.toString(arr));
			}

			if (selectMenu == 2) {

				System.out.println("데이터 삽입을 선택하셨습니다.");
				System.out.print("어느 인덱스에 삽입하시겠습니까?");
				int insertIdx = scan.nextInt();

				if (insertIdx < 0 || insertIdx > elementCnt) {
					System.out.println("해당 인덱스에는 삽입이 불가능합니다.");
				}

				System.out.println("데이터를 입력하세요");
				int insertData = scan.nextInt();
				System.out.println();

				for (int i = elementCnt; i > insertIdx; i--) {
					arr[i] = arr[i - 1];
				}
				arr[insertIdx] = insertData;
				elementCnt++;
				System.out.print(Arrays.toString(arr));

			} else if (selectMenu == 3) {
				System.out.println("삭제를 선택하셨습니다.");
				System.out.println("어떤 데이터를 삭제하시겠습니까?");
				int delData = scan.nextInt();
				System.out.println();

				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (delData == arr[i]) {
						arr[i] = arr[i + 1];
						delIdx = i;
					}
					if (delIdx == -1) {
						System.out.println("삭제하시려는 데이터는 배열에 존재하지 않습니다.");
						continue;
					}
					elementCnt--;
					arr[elementCnt] = 0;
					System.out.println(Arrays.toString(arr));
				}

			}else if (selectMenu == 4){
				System.out.println("종료를 누르셨습니다.");
				scan.close();
				break;
			}
		}

	}

}
