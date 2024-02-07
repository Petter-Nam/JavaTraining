package step5_02.file;


import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM

public class FileEx08_연습1 {
	
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
			
			System.out.println("__________");
			for (int i = 0; i< accsCnt; i++) {
				System.out.println(accs[i] + ":" + pws[i] + ":" + moneys[i]);
			}
			System.out.println("__________");
			
			if (identifier == -1) 	System.out.println("상태 : 로그아웃");
			else					System.out.println("상태 : " + accs[identifier] + "님, 로그인");
			
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
				System.out.println("[가입]계좌번호 입력 : ");
				String acc = scan.next();
				
				int check = 1;
				for (int i = 0; i < accsCnt; i++) {
					if (accs[i].equals(acc)) {
						check = -1;
					}
				}
				if (check == 1) {
					if (accsCnt == 5) {
						System.out.println("[메세지] 더 이상 가입할 수 없습니다.");
						continue;
					}
					
					System.out.print("[가입] 비밀번호 입력 : ");
					String pw = scan.next();
					
					accs[accsCnt] = acc;
					pws[accsCnt] = pw;
					moneys[accsCnt] = 1000;
				}
			}
			else if (sel == 2) {}
			else if (sel == 3) {}
			else if (sel == 4) {}
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
