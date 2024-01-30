package step1_06.loop;
/*
 * 
 * 1월 25일 쉬운문제면 기분이 좋다.
 * 뿌듯해진다.
 * 가끔 쉬운문제가 나온것 같은데 못풀면 자괴감이 든다.
 */

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx26_연습1 {

	public static void main(String[] args) {
		
		int[] oneTwoClap = new int[51];
		int num = 1;
		
		for (int i = 0; i < oneTwoClap.length; i++) {
			oneTwoClap[i] = num++;
			
			if((oneTwoClap[i] % 3) != 0) {
				System.out.print(oneTwoClap[i] + " ");
			}
			else if ((oneTwoClap[i] % 3) == 0) {
				System.out.print(" 짝");
			}
		}

	}

}
