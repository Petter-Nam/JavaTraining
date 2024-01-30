package step2_01.array;
/*
 *  1월 29일 
 * 안보고 만들었다.
 * 내용이 기억이난다..... 잊혀질쯤 다시 만들어봐야겠다. 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 * 
 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */


public class ArrayEx19_연습4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0, 0, 0, 0, 0, 0};
		int elementCnt = 2;
		int selectMenu = 0;
		System.out.println(Arrays.toString(arr));
		
		
		while (true) {
			System.out.println("[1] 추가");
			System.out.println("[2] 종료");
			System.out.print("추가하시겠습니까?");
			selectMenu = scan.nextInt();
			
			
			if (selectMenu == 1) {
				System.out.println("데이터를 입력하세요");
				int data = scan.nextInt();
				
				if (elementCnt == arr.length) {
					System.out.println("데이터가 다 찼습니다.");
					continue;
				}
				
				arr[elementCnt] = data;
				elementCnt++;
				System.out.println(Arrays.toString(arr));
			}
			else if (selectMenu == 0) {
				System.out.println("종료하셨습니다.");
				scan.close();
				break;
			}
		}
	}
	
}
