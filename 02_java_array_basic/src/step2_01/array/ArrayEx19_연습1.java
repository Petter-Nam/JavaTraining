package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 * 
 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx19_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0, 0, 0, 0, 0, 0 };
		int elementCnt = 2;
		int selectMenu = 0;

		System.out.println(Arrays.toString(arr));
		System.out.println("추가 할 데이터를 입력하여 주세요.");
		System.out.println("0) 종료 1) 추가");
		selectMenu = scan.nextInt();
		System.out.println();

		int data = 0; // 초기 변수를 if문 밖에 지정해서 사용한다.
		while (true) {
			if (selectMenu == 1) {
				System.out.print("추가할 데이터를 입력하여주세요");
				data = scan.nextInt();

				if (elementCnt == arr.length) {
					System.out.print("더 이상 추가할수가 없습니다.");
					continue;

				}

				elementCnt++;

				arr[elementCnt] = data;
				System.out.println(Arrays.toString(arr));
			}
			else if (selectMenu == 0) {
				System.out.println("데이터 추가를 취소하셨습니다.");
				break;
			}

		}
		scan.close();
	}
}