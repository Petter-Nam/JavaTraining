package step2_01.array;
/*
 * 1월 30일 
 * 3시간 지나고
 * 문제를 다시 한 번 풀어보았다.
 * 약간 조건에서 멈칫하면서 보았지만
 * 많이 좋아진것 같다.
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if		(selectMenu == 1) {
				if (accs.length == accsCnt) {
					System.out.println("더 이상 계좌를 추가 할수 없습니다.");
					continue;
				}
				System.out.println("가입을 입력하셨습니다.");
				System.out.print("계좌 4자리를 설정해주세요.");
				int myAccount = scan.nextInt();
				
				System.out.println();
				int check = 1;
				
				for (int i = 0; i < accsCnt; i++) {
					if (myAccount == accs[i]) {
						check = -1;
					}
				}
				if (check == -1) {
					System.out.println("동일한 계좌가 이미 존재합니다.");
					continue;
				}
				
				else {
					System.out.print("Password를 설정해주세요");
					int myPwd = scan.nextInt();
					System.out.println();
					
					accs[accsCnt] = myAccount;
					pws[accsCnt] = myPwd;
					accsCnt++;
					
				}
				System.out.println(Arrays.toString(accs) + "\n" + Arrays.toString(pws));
				System.out.println();
			}
			else if (selectMenu == 2) {
				System.out.println("계좌 탈퇴를 선택하셨습니다.");
				System.out.print("탈퇴할 계좌를 입력하여주세요");
				int myAccount = scan.nextInt();
				System.out.println();
				
				int check = -1;
				for (int i = 0; i < accsCnt; i++) {
					if (accs[i] == myAccount) {
						check = i;
					}
				}
				if (check == -1) {
					System.out.println("해당계좌는 존재하지 않습니다.");
				}
				else {
					System.out.println("올바른 계좌입니다.");
					System.out.print("확인을 위해 비밀번호를 입력해주세요.");
					int myPwd = scan.nextInt();
					System.out.println();
					
					accs[check] = 0;
					pws[check] = 0;
					accsCnt--;
				}
				System.out.println(Arrays.toString(accs) + "\n" + Arrays.toString(pws) );
				System.out.println();
			}
			else if (selectMenu == 3) {
				System.out.println("종료하셨습니다.");
				scan.close();
				break;
			}
			
		}

	}
}
