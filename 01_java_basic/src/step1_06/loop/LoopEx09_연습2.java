package step1_06.loop;

 
import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */

public class LoopEx09_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;
		
		boolean isRun = true;
		
		while (isRun) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.println("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("당신의 계좌번호를 입력하세요.");
				int myAccId = scan.nextInt();
				
				if (myAccId == myAcc) {
					System.out.println("얼마를 입금하시겠습니까?");
					int myMoneyIn = scan.nextInt();
					
					myMoney += myMoneyIn;
					
					System.out.println();
					
					System.out.println("입금이 확인되었습니다.");
					System.out.println("현재 당신의 계좌에" + myMoney + "원 있습니다.");
					
				}
				else if (myAccId != myAcc) {
					System.out.println("존재하지 않는 계좌입니다.");
				}
			}
			else if (selectMenu == 2) {
				System.out.println("출금을 입력하셨습니다.");
				System.out.print("당신의 계좌를 입력하세요");
				int myAccId = scan.nextInt();
				System.out.println();
				
				if (myAcc == myAccId) {
					System.out.println("얼마를 출금하시겠습니까?");
					int myMoneyOut = scan.nextInt();
					System.out.println();
					
					if (myMoney >= myMoneyOut) {
						myMoney -= myMoneyOut;
						System.out.println("출금이 완료되었습니다." + myMoney + "원 남았습니다.");
						System.out.println();
					}
					else {
						System.out.println("잔액이 부족합니다.");
						System.out.println();
					}
				}
			}
			else if (selectMenu == 3) {
				System.out.print("상대방의 계좌를 입력하세요.");
				int yourAccId = scan.nextInt();
				System.out.println();
				
				if (yourAcc == yourAccId) {
					System.out.print("얼마를 입금하시겠습니까?");
					int myMoneyOut = scan.nextInt();
					System.out.println();
					
					if (myMoney >= myMoneyOut) {
						myMoney -= myMoneyOut;
						yourMoney += myMoneyOut;
						System.out.println("상대방에게 입금이 완료되었습니다.");
						System.out.println("당신의 계좌는 " + myMoney + "원 남았습니다.");
						System.out.println("상대계좌에 얼마있는지 알면 안되지만" + yourMoney + "원 있습니다.");
					}
					else {
						System.out.println("당신이 가지고 있는 돈보다 높아 취소되었습니다.");
						System.out.println();
					}
				}
			}
			else if (selectMenu == 4) {
				System.out.println("나의 계좌와 상대의 계좌의 잔액을 확인하시겠습니까?");
				int check = scan.nextInt();
				
				if (check == 1) {
					System.out.println("나의 잔액은" + myMoney);
					System.out.println("상대의 잔액은 " + yourMoney);
				}
				else {
					System.out.println("취소되었습니다.");
				}
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
		scan.close();
	}

}
