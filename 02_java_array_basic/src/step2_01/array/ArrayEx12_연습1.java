package step2_01.array;
/*
 * 1월 25일 
 * 문제를 푸는데 참 어려웠다. 시간이 더 필요할 듯 싶다.
 * 
 * 
 */
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1
		// 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}

		for (int i = 0; i < arr.length; i++) {

			System.out.println("바꾸고 싶은 인덱스를 입력하세요");
			System.out.print("1) 바꾸겠다. 2) 변경안함");
			int choiceIndex = scan.nextInt();
			System.out.println();

			if (choiceIndex == 1) {
				System.out.print("바꾸고 싶은 인덱스 넘버를 입력하시오");
				int indexNum = scan.nextInt();

				System.out.print(indexNum + "번 인덱스 값을 무엇으로 변경하시겠습니까?");
				arr[indexNum] = scan.nextInt();
				System.out.println();
				System.out.print("변경하신	arr" + "[" + indexNum + "] 는 " + arr[indexNum] + "로 변경되었습니다.");
				System.out.println(arr[indexNum]);
			} else {
				System.out.println("변경을 취소하셨습니다.");
				break;
			}

		}

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 10
		// 값2 입력 : 50
		// {50, 20, 30, 40, 10}

		System.out.print("값 1 입력");
		int getValue1 = scan.nextInt();

		System.out.print("값 2 입력");
		int getValue2 = scan.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == getValue1)
				arr[i] = getValue2;
			else if (arr[i] == getValue2)
				arr[i] = getValue1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002
		// 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		System.out.print("학번1 입력 : ");
		int hakbunsNum1 = scan.nextInt();

		System.out.print("학번2 입력 : ");
		int hakbunsNum2 = scan.nextInt();

		int idx1 = 0;
		int idx2 = 0;

		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbuns[i] == hakbunsNum1)
				idx1 = i;
			if (hakbuns[i] == hakbunsNum2)
				idx2 = i;

		}
		int tmp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = tmp;

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + " ");
		}
		scan.close();
	}
}
