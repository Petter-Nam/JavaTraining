package step1_06.loop;

//# 반복문 기본문제[2단계]
/*
 * 1월 22일 연습이 매우 필요
 *  
 */
public class LoopEx03_연습3 {

	public static void main(String[] args) {

		// 문제1) 1~10까지 반복해 3미만 7이상만 출력
		// 정답1) 1 2 7 8 9 10

		// 문제2) 문제1의 조건에 맞는 수들의 합 출력
		// 정답2) 37

		// 문제3) 문제1의 조건에 맞는 수들의 개수 출력
		// 정답3) 6

		// 문제4) 1~5까지의 합 출력
		// 정답4) 15
		int i = 1;
		while (i <= 10) {
			if (i >= 7 || i < 3) {
				System.out.println(i);
			}
 			i++;
		}
		System.out.println();

		int tot = 0;
		i = 1;

		while (i <= 10) {

			if (i >= 7 || i < 3) {
				tot = tot + i;
			}
			i++;
		}
		System.out.println(tot);
		System.out.println();

		i = 1;
		int cnt = 0;

		while (i <= 10) {

			if (i >= 7 || i < 3) {
				cnt++;
			}
			i++;
			}
		i = 1;
		int sum = 0;
		
		while (i <= 10)
			
			if (i <= 5) {
				sum++;
			}
		System.out.println(sum);
		}
	}

