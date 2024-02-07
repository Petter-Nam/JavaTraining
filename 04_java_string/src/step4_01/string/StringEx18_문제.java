package step4_01.string;

import java.util.Scanner;

/*

	# 영어단어 맞추기  
	
	1) 영어단어가 전부 * 로 표시된다. 
	2) 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 100점 만점이며 한번 틀릴때마다 5점씩 감점)
	3) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	4) 전부 벗겨지거나 맞추면 종료하고 점수를 화면에 출력한다.

*/
public class StringEx18_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		
		while (true) {
			
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < word.length(); i++) {
				System.out.print("*");
				
			}
			System.out.println();
			System.out.print("영어단어를 입력하세요 >>> ");
			String answer = scan.next();
			
		}

	}

}
