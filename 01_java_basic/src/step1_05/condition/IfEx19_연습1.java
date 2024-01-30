package step1_05.condition;
/*
 * 1월 19일 6:00 ~ 7:00
 * 생각만 하면서 코딩짯는데 1시간 이상이 걸렸다.
 * 꽤나 힘든 싸움이였다. 
 * 문제에 맞게 잘 구현되었다.(아마도)
 * 실제 ATM기처럼 실제 돈이 이체되는 과정 각은행에 맞게 구현하려면 꽤나 복잡할것같다.
 * 
 * 
 */
import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_연습1 {

	public static void main(String[] args) {
		
		int myMoney = 8700;
		int yourAcc = 4321; // 계좌번호..
		int yourMoney = 12000;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("송금할 계좌번호를 입력해주세요");
		int transAcc = scan.nextInt();
		
		if (yourAcc == transAcc) {
			System.out.println("송금할 계좌는 4321입니다.");
			System.out.println();
			System.out.print("얼마를 송금하시겠습니까?");
			int transMoney = scan.nextInt();
			myMoney -= transMoney;
			System.out.println();
			System.out.println();
			if(myMoney >= 0) {
			System.out.println("송금이 완료되었습니다. 잔액은 " + myMoney + "원 입니다.");
			
			}
			else {
				System.out.println("통장의 금액이 송금할 금액보다 모자릅니다.");
			}
		}
		else {
			System.out.println("계좌가 틀립니다.");
		}
		scan.close();}
}