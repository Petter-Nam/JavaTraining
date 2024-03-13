package step1_05.condition;

/*
 * 3월 12일
 * 예전 코드연습량이 많지 않은것 같아서 조금씩 풀어보는중이다.
 */
import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */

public class IfEx09_연습2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("키 : ");
		int height = scan.nextInt();
		
		if (height >= 120) {
			System.out.println("놀이기구 이용가능");
		}
		else if (height < 120) {
			System.out.print("부모님과 함께 이용하시나요? [1]네 [2]아니요");
			int parent = scan.nextInt();
			
			if (parent == 1) {
				System.out.println("놀이기구 이용가능");
			}
			else if(parent == 2) {
				System.out.println("놀이기구 이용불가");
			}
		}
	}
}
