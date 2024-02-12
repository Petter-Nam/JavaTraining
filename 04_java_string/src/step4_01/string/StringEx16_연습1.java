package step4_01.string;
/*
 * 2월 13일
 * 어떻게 작성해야할지 몰라 답안지를 보고 작성해서 
 * 이해하려고했는데 for문에서 코드가 이해가 처음에는 의문에
 * 굳이 저렇게 작성해야하는가 갑자기 코드가 이해가 안가다가 
 * 일단은 잘짜여진 것이니 이해를하고 넘어갔다.
 * 
 * 간단하게 생각하면 그러려니 했을텐데 너무 시간을 낭비햇다.
 */
import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();

		char[] arr = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int textSize = word.length();
		boolean isSame = false;
		
		for (int i = 0; i < text.length() - textSize + 1; i++) {
			int correctCnt = 0;
			for (int j = 0; j < textSize; j++) {
				if (arr[i + j] == word.charAt(j)) {
					correctCnt++;
				}
			}
			if (correctCnt == textSize) {
				isSame = true;
			}
		}
		if (isSame)  System.out.println("일치");
		else		System.out.println("불일치");
		
		scan.close();
	}
}
