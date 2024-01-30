package step1_05.condition;

/*
 * 
 * 처음 배우는것이니 많이 버벅거린다 나 자신을 이해해준다.
 * 그래야 마음이 편하다.
 * 
 */
import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

public class IfEx16_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int numRan = ran.nextInt(100) + 1;
	
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		if (numRan % 2 == 1 && choice == 1) {
			System.out.println("홀수 입니다.");
			System.out.println("랜덤 넘버는 :" + numRan);
		}
		
		if (numRan % 2 == 0 && choice == 2) {
			System.out.println("짝수입니다.");
			System.out.println("랜덤 넘버는 :" + numRan);
		}
	}

}
