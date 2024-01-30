package step1_06.loop;
/*
 * 1월 26일
 * 규칙과 코딩은 확실히 다르다...
 * 규칙에 맞게 내생각을 코딩하는 것은 참 어려운 일이다.
 * 
 */
/*
 * # 2차원 반복문
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_연습 {

	public static void main(String[] args) {
		int start = 5;
		int end = 1;
		
		for (int i = 0; i < 5; i++) {
			
			if (i % 2 == 0) {
				for (int j = start; j <= end; j++) {
					System.out.print(j + " ");
				}
			}
			else {
				for (int j = end; j >= start; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
			
			start = end + 1;
			end = end + 5;
		}
		
		}
	}


