package step9_02.atm_v2.test1;

import java.util.Scanner;

import step9_03.atm_v3.AccountManager;

public class BankATM {
	
	Scanner scan = new Scanner(System.in);
	int identifier = -1;
	BankUserManager bum = BankUserManager.getInstance();
	
	void play() {
		BankFileManager.getInstance().load(); // 파일의 데이터를 불러오는 용도
		BankUserManager.getInstance().printAllUser(); // 유저 정보 id pw 계좌번호 등등 출력
		
		while (true) {
			
			System.out.println("[ATM]");
			System.out.println("[1.회원가입]\n[2.로그인]\n[0.종료]");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1)  join();
			else if (sel == 2)  login();  
			else if (sel == 0)  break;
		}
	}
	
	void login() {
		identifier = bum.logUser();
		if (identifier != -1) loginMenu();
		else				  System.out.println("[메세지]아이디와 패스워드를 확인해주세요.");
	}
	
	void loginMenu() {
		
		while (true) {
			System.out.println("[" + bum.userList[identifier].id + "님, 환영합니다.]");
			System.out.println("[1.계좌생성]\n[2.계좌삭제]\n[3.조    회]\n[4.회원탈퇴]\n[0.로그아웃]");
			System.out.println("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				BankAccountManager.getInstance().createAcc(identifier);
				BankFileManager.getInstance().save();
				
			}
			else if (selectMenu == 2) {
				BankAccountManager.getInstance().deleteAcc(selectMenu);
			}
			else if (selectMenu == 3) {
				BankAccountManager.getInstance().printAcc(identifier);
			}
			else if (selectMenu == 4) {
				identifier = bum.deleteMember(identifier);
				break;
			}
			else if (selectMenu == 0) {
				identifier = -1;
				System.out.println("로그아웃 되었습니다.");
				break;
			}
		}
		
	}
	
	void join() {
		BankUserManager.getInstance().joinMember();
	}
}