package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 비교
 * 
 *  equals메서드를 사용하지 않고 두 문자열이 같은지 판별하는 코드를 작성해보시오.
 *  
 */

public class StringEx14_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");
		String myName = scan.next();
		
		boolean isCorrect = false;
		
		if (name.length() == myName.length()) {
			isCorrect = true;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) != myName.charAt(i)) {
					isCorrect = false;
				}
			}
		}
		
		if (isCorrect) {
			System.out.println("일치");
		}
		else {
			System.out.println("불일치");
		}
		
		scan.close();

	}

}
