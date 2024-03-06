package step9_02.atm_v2.test2;

import java.util.Scanner;

import step9_02.atm_v2.UserManager;
import step9_03.atm_v3.FileManager;

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
		
		TUserManager.getInstance().joinMember();
	}
	
	void login() {
		identifier = tuserManager.logUser();
		if (identifier != -1) {
			loginMenu();
		}
		else {
			System.out.println("[메세지] 아이디가 틀렸습니다.");
		}
	}
	
	void loginMenu() {
		
		while (true) {
		System.out.println("[" + tuserManager.tuserClass[identifier].id + " 님 로그인되었습니다.");
		System.out.println("[1.계좌생성]\n[2.계좌삭제]\n[3.조    회]\n[4.회원탈퇴]\n[0.로그아웃]");
		System.out.println("메뉴 선택 : ");
		int selectMenu = scan.nextInt();
		
		if (selectMenu == 1) {
			TAccountManager.getInstance().createAcc(identifier);
			TFileManager.getInstance().save();
		}
		else if (selectMenu == 3) {
			TAccountManager.getInstance().printAcc(identifier);
		}
		else if (selectMenu == 4) {
			identifier = tuserManager.deleteMember(identifier);
			break;
			
		}
		else if (selectMenu == 0) {
			identifier = -1;
			System.out.println("로그아웃되었습니다'");
			break;
		}
	}
		
	}
	
}