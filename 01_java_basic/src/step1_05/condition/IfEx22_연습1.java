package step1_05.condition;
/*
 * 1월 22일 AM 2:50 ~ 3 : 18 
 */
import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)  ! 여기서부터는 직접 값을 지정하는 것이 아닌 계산식으로 요금 계산
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class IfEx22_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이용할 정거장 수를 입력해주세요 : ");
		int busStop = scan.nextInt();
		
		int baseFare = 500;
		
		if (busStop >= 1 && busStop <= 5) {
			
			System.out.println("금액은 " + baseFare + "원입니다.");
	
		}
		else if (busStop >=6 && busStop <= 10) {
			baseFare +=100;
			System.out.println("금액은 " + baseFare + " 원입니다.");
		}
		else if (busStop  >= 11) {
			
			int additionalBusStop = busStop - 10;
			int additionalFare = ((additionalBusStop / 2) * 50) + baseFare;
			System.out.println("추가비용은 " + additionalFare + "입니다.");
			
		}
	}

}
