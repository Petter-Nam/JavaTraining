package step9_02.atm_v2.test2;

import java.util.Scanner;

public class TATM {
	Scanner scan = new Scanner(System.in);
	int identifier = -1;
	TUserManager tuserManager = TUserManager.getInstance();
	void play() {
		
		while (true) {
			System.out.println("[ATM]");
			System.out.println("[1.회원가입]\n[2.로그인]\n[0.종료]");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if 		(sel == 1) join();
			else if (sel == 2) login();
			else if (sel == 0) break;
		}
	}
	
	void join() {
		
		identifier = tuserManager.userCnt;
		if (identifier != -1) {
			loginMenu();
		}
		else {
			System.out.println("[메세지] 아이디가 틀렸습니다.");
		}
	}
	
	void login() {
		TUserManager.getInstance().joinMember();
	}
	
	void loginMenu() {
		System.out.println("[" + tuserManager.tuserClass[identifier].id + " 님 로그인되었습니다.");
		System.out.println("[1.계좌생성]\n[2.계좌삭제]\n[3.조    회]\n[4.회원탈퇴]\n[0.로그아웃]");
		System.out.println("메뉴 선택 : ");
		int selectMenu = scan.nextInt();
		
		if (selectMenu == 1) {
			TAccountManager.getInstance().
		}

	}
}