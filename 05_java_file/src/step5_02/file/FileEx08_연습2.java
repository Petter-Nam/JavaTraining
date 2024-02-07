package step5_02.file;


import java.util.Arrays;
import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM

public class FileEx08_연습2 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int atmSize = 5;
		int accsCnt = 0;
		int identifier = -1;
		
		String[] accs = new String[atmSize];
		String[]  pws = new String[atmSize];
		int[]  moneys = new int[atmSize];
		
		String fileName = "atm.txt";
		
		while(true) {
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				
				if (identifier == -1) {
					System.out.println("로그아웃 상태입니다.");
				}
				
				int i = 0;
				
				System.out.println("회원가입을 진행합니다.");
				System.out.print("아이디를 생성해주세요 : ");
				accs[i] = scan.next();
				
				System.out.print("비밀번호를 생성해주세요 : ");
				pws[i] = scan.next();
				i++;
				
				if (i == atmSize) {
					System.out.println("더 이상 회원가입을 진행할 수 없습니다.");
					continue;
				}
				
			}
			else if (sel == 2) {
				System.out.println("회원탈퇴를 진행하십니다.");
				System.out.print("어떤 계정을 탈퇴하시겠습니까?");
				String getOut = scan.next();
				for (int i = 0; i < atmSize; i++) {
					if (getOut == accs[i]) {
						accs[i] = null;
						pws[i] = null;
					}
					System.out.println("현재 계정 : "+ Arrays.toString(accs));
					System.out.println("해당 패스워드 : " + Arrays.toString(pws));
				}
			}
			else if (sel == 3) {
				System.out.print("로그인을 진행하여주세요 : ");
				String hLogin = scan.next();
				System.out.println();
				
				System.out.println("패스워드를 입력해주세요");
				String hPws = scan.next();
				
				for (int i = 0; i < atmSize; i++) {
					if (hLogin.equals(accs[i]) && hPws.equals(pws[i])) {
						identifier = i;
						if (i != -1) {
							System.out.println(accs[i] + "로그인상태입니다.");
						}
					}
					else if (hLogin.equals(accs[i]) && hPws.equals(pws[i]) == false) {
						System.out.println("ID혹은 PWS가 틀렸습니다.");
						continue;
					}
				}
			}
			else if (sel == 4) {
				System.out.println("입금을 선택하셨습니다.");
				for (int i = 0; i < atmSize; i++) {
					if (identifier == i) {
						System.out.print("얼마를 입금하시겠습니까;");
						int moneyIn = scan.nextInt();
						
						moneys[i] = moneyIn;
					}
					
					
			}
			}
			else if (sel == 5) {}
			else if (sel == 6) {}
			else if (sel == 7) {}
			else if (sel == 8) {}
			else if (sel == 9) {}
			else if (sel == 10) {}
			else if (sel == 0) {
				break;
			}
			
		}
		
	}
}
