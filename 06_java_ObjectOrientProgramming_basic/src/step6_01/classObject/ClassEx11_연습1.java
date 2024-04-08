package step6_01.classObject;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.util.Scanner;


class Ex11_연습 {

	String[] arAcc = new String[5];
	String[] arPw = new String[5];
	int[] arMoney = new int[5];
	
	int accCnt = 0;
	int identifier = -1;
	
}


public class ClassEx11_연습1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex11_연습 E = new Ex11_연습();
		
		for (int i = 0; i < E.arAcc.length; i++) {
			E.arAcc[i] = "";
			E.arPw[i] = "";
		}
		
		while (true) {
			
			System.out.println("-------------------------");
			System.out.println("계좌번호\t비밀번호\t계좌잔액");
			System.out.println("-------------------------");
			
			for (int i = 0; i < E.accCnt; i++) {
				System.out.println(E.arAcc[i] + "\t" + E.arPw[i] + "\t" + E.arMoney[i]);
			}
			System.out.println("-------------------------");
			System.out.println("상태 : ");
			if (E.identifier == -1) System.out.println("로그아웃");
			else 					System.out.println(E.arAcc[E.identifier] + "로그인");
			System.out.println("============================");
			
			System.out.println("[Mega Bank]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("[가입]계좌번호를 입력하세요 : ");
				String acc = scan.next();
				int check = 1;
				for (int i = 0; i < E.arAcc.length; i++) {
					if (E.arAcc[i].equals(acc)) {
						check = -1;
					}
				}
				
				if (check == -1) {
					System.out.println("[메세지]중복되는 계좌번호입니다.");
				}
				else {
					System.out.println("[가입]비밀번호를 입력하세요 : ");
					String pw = scan.next();
					
					System.out.println("[가입]금액을 입력하세요 :");
					int money = scan.nextInt();
					
					E.arAcc[E.accCnt] = acc;
					E.arPw[E.accCnt] = pw;
					E.arMoney[E.accCnt] = money;
					E.accCnt++;
					System.out.println("[메세지]가입을 축하드립니다.");
				}
			}
			else if (sel == 2) {
				
				if (E.identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
					continue;
				}
				for (int i = E.identifier; i < E.accCnt - 1; i++) {
					E.arAcc[i] = E.arAcc[i + 1];
					E.arPw[i] = E.arPw[i + 1];
					E.arMoney[i] = E.arMoney[i + 1];
				}
				
				E.accCnt -= 1;
				E.identifier = -1;
				System.out.println("[메세지] 탈퇴되었습니다. 안녕히가십시오");
			}
			else if (sel == 3) {
				
				if (E.identifier != -1) {
					System.out.println("[메세지]현재 " + E.arAcc[E.identifier] + "님, 로그인 중....");
					continue;
				}
				System.out.print("[로그인]계좌번호를 입력하세요 : ");
				String acc = scan.next();
				
				System.out.print("[로그인]비밀번호를 입력하세요");
				String pw = scan.next();
				
				for (int i = 0; i < E.accCnt; i++) {
					if (E.arAcc[i].equals(acc) && E.arPw[i].equals(pw)) {
						E.identifier = i;
					}
				}
				
				if (E.identifier == -1) {
					System.out.println("[메세지]계좌번호와 비밀번호를 확인해주세요.");
				}
				else {
					System.out.println("[메세지]" + E.arAcc[E.identifier] + "님,환영합니다.");
				}
				
			}
			else if (sel == 4) {
				
				if (E.identifier == -1) {
					System.out.println("[메세지] 로그인 후 이용가능합니다.");
					continue;
				}
				E.identifier = -1;
				System.out.println("[메세지]로그아웃 되었습니다.");
			}
			else if (sel == 5) {
				if (E.identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
					continue;
				}
				System.out.print("[입금]입금할 금액을 입력하세요 : ");
				int money = scan.nextInt();
				
				E.arMoney[E.identifier] += money;
				System.out.println("[메세지]입금을 완료하였습니다.");
			}
			else if (sel == 6) {
				
				
				if (E.identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
					continue;
				}
				System.out.print("[이체]계좌번호를 입력하세요 : ");
				String acc = scan.next();
				
				int check = -1;
				for (int i = 0; i < E.accCnt; i++) {
					if (E.arAcc[i].equals(acc)) {
						check = i;
					}
				}
				
				if (check == -1) {
					System.out.println("[메세지]계좌번호를 확인해주세요.");
				}
				else {
					System.out.println("[이체]금액을 입력하세요 : ");
					int money = scan.nextInt();
					
					if (E.arMoney[E.identifier] >= money) {
						E.arMoney[E.identifier] -= money;
						E.arMoney[check] += money;
						System.out.println("[메세지]이체를 완료하였습니다.");
					}
					else {
						System.out.println("[메세지]계좌잔액이 부족합니다.");
					}
				}
			
			}
			else if (sel == 7) {
				
				if (E.identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
					continue;
				}
				System.out.println(E.arAcc[E.identifier] + "님의 계좌 잔액은 " + E.arMoney[E.identifier] + "원 입니다."); 
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
