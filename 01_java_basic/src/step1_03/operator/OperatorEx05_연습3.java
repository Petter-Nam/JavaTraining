package step1_03.operator;
/*
 * 1월 26일
 * 여기는 이제 안풀어도 될 것 같다.
 * 
 */
public class OperatorEx05_연습3 {

	public static void main(String[] args) {

		// 예) 점수가 60점 이상이면
		int score = 30;
		System.out.println(score >= 60);

		// 문제1) 배송비가 3000원이면

		int question1 = 3000;

		if (question1 == 3000)
			System.out.println("배송비는 3000원 입니다.");
		System.out.println();

		// 문제2) 15가 3의 배수이면
		// 힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
		int question2 = 15;

		if (question2 % 3 == 0)
			System.out.println("15는 3의 배수입니다.");
		System.out.println();

		// 문제3) 100이 짝수이면
		// 힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
		// 숫자를 2로 나눈 나머지가 1이면 홀수

		int question3 = 100;

		if (question3 % 2 == 0) {
			System.out.println("짝수");
		} 
		else if (question3 % 2 == 1) {
			System.out.println("홀수");
		}

	}

}
