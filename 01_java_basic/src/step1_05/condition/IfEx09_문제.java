package step1_05.condition;

/*
 * 1월 18일 문제를 풀면서 조건문이 조금 어려움
 * 문제를 변형해서 내면 엄청 어렵다.
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


public class IfEx09_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키를 입력하여주세요 : ");
		int height = scan.nextInt();
		
		
		
		
		if (height >= 120) {
			System.out.print("당신은 놀이기구를 이용할 수 있습니다.");
	
		}
		
		if (height < 120) {
			System.out.println("부모님과 함께 오셨나요?(yes : 1, no : 0)");
			int parent = scan.nextInt();
			if (parent == 1) System.out.println("놀이기구 이용가능합니다.");
			if (parent == 0) System.out.println("놀이기구 이용불가합니다.");
			
		}
		
	
	}

}
