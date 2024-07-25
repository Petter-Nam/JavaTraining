package step1_03.operator;

public class OperatorEx05_연습4 {

	public static void main(String[] args) {

		// 예) 점수가 60점 이상이면
		int score = 65;
		if (score >= 60) {
			System.out.println("60점 이상입니다.");
		}
		else {
			System.out.println("60점 이하입니다.");
		}
		
		// 문제1) 배송비가 3000원이면
		int deliveryPrice = 2800;
		
		if (deliveryPrice <= 3000) {
			System.out.println("배송비가" + (3000 - deliveryPrice) +"부족합니다.");
		}
		else if(deliveryPrice == 3000){
			System.out.println("배송비가 충분합니다.");
		}
		else {
			System.out.println("거스름 " + (deliveryPrice - 30000) + "원 받았습니다.");
		}

		// 문제2) 15가 3의 배수이면
		// 힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
		int fifteen = 15;
		
		if (fifteen % 3 == 0) {
			System.out.println("3의 배수");
		}
		else {
			System.out.println("x");
		}

		// 문제3) 100이 짝수이면
		// 힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
		// 숫자를 2로 나눈 나머지가 1이면 홀수

		int oneHundred = 100;
		if (oneHundred % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}

	}

}
