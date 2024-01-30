package step1_06.loop;
/*
 * 
 * 1월 23일 이것은 안보고 작성해보았다. 
 * 나름 된거 같다.
 */
import java.util.Random;
import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random Ran = new Random();

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int identifier = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		boolean isRun = true;
		while (isRun) {

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.이체");
			System.out.println("4.출금");
			System.out.println("5.입금");
			System.out.println("6.조회");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {

				System.out.print("로그인하시겠습니까? 1) 예, 2) 아니요");
				int login = scan.nextInt();
				System.out.println();

				if (login == 1) {
					System.out.println("계좌번호를 입력하여주세요");
					int myDbAcc1 = scan.nextInt();

					System.out.println();

					System.out.println("계좌의 비밀번호를 입력해주세요");
					int myDbPw1 = scan.nextInt();

					if (myDbAcc1 == dbAcc1 && myDbPw1 == dbPw1) {
						identifier = 1;
						System.out.println("로그인이 되었습니다.");
					} else if (myDbAcc1 == dbAcc2 && myDbPw1 == dbPw2) {
						identifier = 2;
						System.out.println("로그인이 되었습니다.");
					} else {
						System.out.println("로그인 실패");
					}
				} else {
					System.out.println("취소하셨습니다.");
				}
			} else if (sel == 2) {
				System.out.println("로그아웃을 진행하시겠습니까? 1) 로그아웃, 2) 취소");
				int logout = scan.nextInt();

				if (logout == 1 && identifier == 1) {
					System.out.println("dbAcc1로그인 중");
					identifier = -1;
					System.out.println("로그아웃하셨습니다.");
				} else if (logout == 1 && identifier == 2) {
					System.out.println("dbAcc2로그인 ");
					identifier = -1;
					System.out.println("로그아웃하셨습니다.");
				}

			} 
			else if (sel == 3) {
				
				System.out.print("누구에게 입금하시겠습니까?");
				int transForWho = scan.nextInt();
				System.out.println();
				
				if (identifier == 1 && transForWho == dbAcc1) {
					System.out.println("Acc2에게 송금하십니다.");
					System.out.print("얼마를 송금하시겠습니까?");
					int transMoney = scan.nextInt();
					dbMoney1 -= transMoney;	
					System.out.println("당신의 계좌에 " + dbMoney1 + "원 남았습니다.");
				}
				else if (identifier == 2 && transForWho == dbAcc2) {
					System.out.println("Acc1에게 송금하십니다.");
					System.out.print("얼마를 송금하시겠습니까?");
					int transMoney = scan.nextInt();
					dbMoney2 -= transMoney;	
					System.out.println("당신의 계좌에 " + dbMoney2 + "원 남았습니다.");
				}
				else {
					System.out.println("계좌가 틀립니다.");
				}
			} else if (sel == 4) {
				
				System.out.print("출금하시겠습니까? 1) 예, 2) 아니요");
				int myMoneyOutChoice = scan.nextInt();
				System.out.println();
				
				if (identifier == 1 && myMoneyOutChoice == 1) {
					System.out.println("출금을 선택하셨습니다.");
					System.out.print("얼마를 출금하시겠습니까?");
					int myMoneyOut = scan.nextInt();
					dbMoney1 -= myMoneyOut;	
					System.out.println("당신의 계좌에 " + dbMoney1 + "원 남았습니다.");
				}
				else if (identifier == 2 && myMoneyOutChoice == 1) {
					System.out.println("출금을 선택하셨습니다.");
					System.out.print("얼마를 출금하시겠습니까?");
					int myMoneyOut = scan.nextInt();
					dbMoney2 -= myMoneyOut;	
					System.out.println("당신의 계좌에 " + dbMoney2 + "원 남았습니다.");
				}
				else {
					System.out.println("취소되었습니다.");
				}
			} 
			else if (sel == 5) {
				
				System.out.print("당신의 계좌에 입금하시겠습니까? 1) 예, 2) 아니요");
				int moneyInChoice = scan.nextInt();
				System.out.println();
				
				if (identifier == 1 && moneyInChoice == 1) {
					System.out.println("입금할 금액을 적어주세요");
					int myMoneyIn = scan.nextInt();
					System.out.println();
					dbMoney1 += myMoneyIn;
					System.out.println(myMoneyIn+"원이 입금되었습니다. 총 금액은 : " + dbMoney1 +"원 입니다.");
				}
				else if (identifier == 2 && moneyInChoice == 1) {
					System.out.println("입금할 금액을 적어주세요");
					int myMoneyIn = scan.nextInt();
					System.out.println();
					dbMoney2 += myMoneyIn;
					System.out.println(myMoneyIn+"원이 입금되었습니다. 총 금액은 : " + dbMoney2 +"원 입니다.");
				}
				
			} else if (sel == 6) {
				System.out.println("해당 계좌의 금액을 조회하시겠습니까? 1) 예 2) 아니요");
				int check = scan.nextInt();
				
				if (identifier == 1 && check == 1) {
					System.out.println(dbMoney1 + "원");
				}
				else if (identifier == 2 && check == 1) {
					System.out.println(dbMoney2 + "원");
				}
				else {
					System.out.println("조회를 취소하셨습니다.");
				}
				
			} else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();

	}

}
