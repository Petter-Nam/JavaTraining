package ATM_test1;

import java.util.Random;
import java.util.Scanner;

import step9_01.atm_v1.UserManager;
/*
 * 2월 26일 
 * 주말을 거쳐 좀 쉬었더니 
 * 어떻게 만들었는지 기억도 안나고 이것저것 추가하다가 
 * ATM_test1 에서 많은 실수가 보인 후 UserManager_test1에서도 실패
 * 많이 보인다.... 대규모 수술이 아니라 처음부터 다시 시작할려고한다...
 */
/*
 * ATM 시스템의 메인 클래스
사용자 메뉴 출력, 로그인 처리, 계좌 메뉴 처리 등을 담당
 */

public class ATM_test1 {
	UserManager_test1 userManager = new UserManager_test1();
	static Scanner scan = new Scanner(System.in);
	int identifier = -1;
	Random ran = new Random();
	
	void printMainMenu() {

		while (true) {
			System.out.println("ATM");
			System.out.println("[1.회원가입] [2.로그인] [3.로그아웃] [4.회원탈퇴] [0.종료]");
			int choice = scan.nextInt();

			if (choice == 1) {
				createUser();
			} 
			else if (choice == 2) {
				loginUser();
			} 
			else if (choice == 3) {
				logoutUser();
			}
			else if (choice ==4) {
				deleteUser();
			}
			else if (choice == 0) {
				break;
			}

		}
	}

	void createUser() {
		userManager.addUser();
	}

	void loginUser() {
		userManager.checkIdPw();
		if (identifier != -1) {
			printAccountMenu();
		}
		else {
			System.out.println("로그인 실패");
		}
	}

	void logoutUser() {
		userManager.logoutIdPw();
	}
	void deleteUser() {
		userManager.deleteIdPw();
	}

	void printAccountMenu( ) {
		System.out.print("[1.계좌생성] [2.계좌삭제] [3.조회] [0.로그아웃] : ");
		int sel = scan.nextInt();
		String makeAccount;
		
            
    }
}