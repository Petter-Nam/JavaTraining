package ATM_test2;
/*
 * 2월 27일 
 * 거의 만들었는데 계좌 생성에서 약간 문제가 있다. 
 * 조금만 수정하면 될것 같다. 
 * 찾기가 힘들뿐
 */
import java.util.Random;
import java.util.Scanner;

public class ATM{

	static Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	int identifier = -1;
	UserManager userM = new UserManager();
	
	void mainPrintATM() {
		
		while (true) {
			System.out.print("[1.회원가입] [2.로그인] [3.로그아웃] [4.회원탈퇴] [0.종료]\n");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				createId();
			}
			else if (choice == 2) {
				login();
			}
			else if (choice == 3) {
				logout();
			}
			else if (choice == 4) {
				delId();
			}
			else if (choice == 5) {
				System.out.println("종료");
				break;
			}
		}
	}
	
	void createId() {
		userM.makeId();
	}
	void login() {
		identifier = userM.checkLogin();
		if (identifier != -1) {
			printAccountMenu();
		}
	}
	
	void logout() {
		if (identifier == -1) {
			System.out.println("로그인 이용후 가능");
		}
		else if (identifier == 1) {
			System.out.println("로그아웃 되었습니다.");
			identifier = -1;
		}
	}
	
	void delId() {
		userM.deleteId();
	}
	
	
	void printAccountMenu() {
		
		userM.user[identifier].accCount = 0;
		
		while (true) {
			System.out.print("[1.계좌생성] [2.계좌삭제] [3.조회] [0.로그아웃] : ");
			int sel = scan.nextInt();
			
			String accRan = Integer.toString(ran.nextInt(9001) + 10000);
			
			if (sel == 1) {
				
				if (userM.user[identifier].accCount == 0) {
					userM.user[identifier].acc = new Account[1];
					userM.user[identifier].acc[0] = new Account();
					userM.user[identifier].acc[0].number = accRan;
					System.out.println(userM.user[identifier].acc[0].number + "계좌번호 생성");
					userM.user[identifier].accCount++;
					
				}
				else if (userM.user[identifier].accCount != 0) {
					
					Account[] temp = userM.user[identifier].acc;
					userM.user[identifier].acc = new Account[userM.user[identifier].accCount + 1];
					userM.user[identifier].acc[userM.user[identifier].accCount] = new Account();
					 
					for (int i = 0; i < userM.user[identifier].accCount; i++) {
						userM.user[identifier].acc[i] = temp[i];
					}
					temp = null;
					userM.user[identifier].acc[userM.user[identifier].accCount].number = accRan;
					System.out.println(userM.user[identifier].acc[userM.user[identifier].accCount].number + "계좌번호 생성");
					userM.user[identifier].accCount++;
				}
		
			}
			else if (sel == 2) {
				
				System.out.println("삭제하고 싶은 계좌번호를 입력 : ");
				String deleteAcc = scan.next();
				int delIdx = -1;
				for (int i = 0; i < userM.user[identifier].accCount; i++) {
					if (userM.user[identifier].acc[i].number.equals(deleteAcc)) {
						delIdx = i;
					}
				}
				if (delIdx == -1) {
					System.out.println("존재하지 않는 계좌번호 : ");
					continue;
				}
				else {
					Account[] temp = userM.user[identifier].acc;
					userM.user[identifier].acc = new Account[userM.user[identifier].accCount];
				
					for (int i = 0; i < delIdx; i++) {
						userM.user[identifier].acc[i] = temp[i];
					}
					for (int i = delIdx; delIdx < userM.user[identifier].accCount; i++) {
						userM.user[identifier].acc[i] = temp[i];
					}
					
					temp = null;
				}
				
			}
			else if (sel == 3) {
				
				if (userM.user[identifier].accCount != 0) {
					userM.user[identifier].printOwnAccount();
				}
				else {
					System.out.println("계좌가 존재하지 않습니다.");
				}
			}
			else if (sel == 4) {
				logout();
			}
		}
	}
}
