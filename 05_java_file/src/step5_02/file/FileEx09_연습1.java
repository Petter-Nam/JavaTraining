package step5_02.file;


import java.util.Scanner;

//# 파일 컨트롤러[3단계] : 장바구니

public class FileEx09_연습1 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",   "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		
		final int MAX_SIZE = 100;
		int[][] cart = new int[MAX_SIZE][2];

		String fileName = "jang.txt";
		
		int count = 0;
		int log = -1;
		
		while (true) {
			
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("로그인 ID를 입력해주세요 : ");
				String yourIds = scan.next();
				System.out.println();
				
				System.out.print("ID에 맞는 Password를 입력해주세요 : ");
				String yourPwd = scan.next();
				
				for (int i = 0; i < ids.length; i++) {
					if (yourIds == ids[i] && yourPwd == pws[i]) {
						log = i;
					}
					else if (yourIds != ids[i]) {
						System.out.println("ID, Password 중 하나가 틀립니다.");
					}
				}
			}
			else if (selectMenu == 2) {}
			else if (selectMenu == 3) {}
			else if (selectMenu == 4) {}
			else if (selectMenu == 5) {}
			else if (selectMenu == 6) {}
			else if (selectMenu == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
