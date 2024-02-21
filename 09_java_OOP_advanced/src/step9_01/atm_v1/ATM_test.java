package step9_01.atm_v1;

//ATM  시스템 메인 클래스
import java.util.Random;
import java.util.Scanner;

import javax.sql.rowset.Joinable;

public class ATM_test {

	static Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	UserManager_test userManager = new UserManager_test();
	int identifier = -1;

	void printMainMenu() {

		while (true) {
			System.out.print("\n[ MEGA ATM ]");
			System.out.println("[1.회원가입] [2.로그인] [3.로그아웃] [4.회원탈퇴] [0.종료] : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				join();
			} else if (sel == 2) {
				login();
			}
		}
	}

	void join() {
		userManager.addUser();
	}

	void login() {

		identifier = userManager.logUser();

		if (identifier != -1) {
			printAccountMenu();
		}
	}

	void printAccountMenu() {
		while (true) {
			System.out.println("[1.계좌생성] [2.계좌삭제] [3.조회] [0.로그아웃]");
			int sel = scan.nextInt();
			String makeAccount = Integer.toString(ran.nextInt(9001) + 10000);

			if (sel == 1) {
				if (userManager.user[identifier].accCount == 0) {
					userManager.user[identifier].acc = new Account_test[1];

					userManager.user[identifier].acc[0] = new Account_test();
					userManager.user[identifier].acc[0].number = makeAccount;

				}

				else {
					Account_test[] temp = userManager.getUser(identifier).acc;
					int tempAccCount = userManager.getUser(identifier).accCount;
					userManager.user[identifier].acc = new Account_test[tempAccCount + 1];
					for (int i = 0; i < tempAccCount; i++) {
						userManager.user[identifier].acc[i] = temp[i];
					}
					userManager.user[identifier].acc[tempAccCount] = new Account_test();
					userManager.user[identifier].acc[tempAccCount].number = makeAccount;
				}
				userManager.user[identifier].accCount++;
				System.out.println("[메시지]" + makeAccount + "계좌가 생성되었습니다.\n");
			}
			else if (sel == 2) {
				if (userManager.user[identifier].accCount == 0) {
					System.out.println("[메시지[ 더 이상 삭제할 수 없습니다.");
					continue;
				}
				if (userManager.user[identifier].accCount == 1) {
					System.out.println("[메시지] 더 이상 삭제할 수 없습니다.\n");
					userManager.user[identifier].acc = null;
				}
				else {
					System.out.print("삭제하고 싶은 계좌번호를 입력하세요 : ");
					String deleteAccount = scan.next();
					int tempAccCount = userManager.user[identifier].accCount;
					int delIdx = -1;
					for (int i = 0; i < tempAccCount; i++) {
						if (deleteAccount.equals(userManager.user[identifier].acc[i].number)) {
							delIdx = i;
						}
					}
					if (delIdx == -1) {
						System.out.println("[메시지] 계좌번호를 확인하세요 .\n");
						continue;
					}
					else {
						System.out.println("[메시지] 계좌번호 : " + userManager.user[identifier].acc[delIdx].number + "삭제되었습니다.\n");
						
						Account_test[] temp = userManager.user[identifier].acc;
						userManager.user[identifier].acc = new Account_test[tempAccCount - 1];
						
						for (int i = 0; i < delIdx; i++) {
							userManager.user[identifier].acc[i] = temp[i];
						}
						for (int i = delIdx; i <tempAccCount - 1; i++) {
							userManager.user[identifier].acc[i] = temp[i+1];
						}
					}
				}
			}
		}
	}
}
