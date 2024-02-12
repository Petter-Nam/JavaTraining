package step1_03.operator;
/*
 * 
 * 2월 12일
 * 연습량을 채우기 위해서 예전것을 다시보는중이다.
 */

public class OperatorEx07_연습2 {
	
	public static void main(String[] args) {
		
		// 예) 3의 배수이면서 짝수이면
		int num = 12;
		System.out.println(num % 3 == 0 && num % 2 == 0);
		
		
		
		// 문제 1) 3과목의 평균이 60점 이상이면 (단 어느 한 과목이라도 50점 미만이 아니어야한다.)
		int kor = 100;
		int eng = 87;
		int math = 41;
		
		double avg = (kor + eng + math) / 3;
		System.out.println(avg >= 60 && kor >= 60 && eng >= 60 && math >= 60);
		
		
		// 문제 2) 키가 150cm이상이고 몸무게가 30kg 이상이면
		int height = 149;
		int weight = 30;
		
		System.out.println(height >= 150 && weight >= 30);
	}
}
