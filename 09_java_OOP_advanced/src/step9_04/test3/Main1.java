package step9_04.test3;
/*
 * 다외울때까지 친다. 
 * 이해는 그다음에...
 */
import java.util.Scanner;

import step9_04.StudentRepository;

public class Main1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Controller1 controller = new Controller1();

		while (true) {

			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();

			if (selectMenu == 1) {
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();

				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();

				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();

				StudentInsert1 stInsert = controller.getInsert();
				stInsert.insert(new StudentVO1(id, num, name));
			}

			else if (selectMenu == 2) {

				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				StudentSelect1 stSelect = controller.getSelect();
				StudentVO1 st = stSelect.select(id);
				
				if (st != null) {
					
					System.out.print("새로운 번호를 입력하세요 : ");
					int newNum = scan.nextInt();
					System.out.print("새로운 이름을 입력하세요 : ");
					String newName = scan.next();
					st.setNum(newNum);
					st.setName(newName);
					System.out.println("수정되었습니다.");
				}
				else {
					System.out.println("해당 아이디가 없습니다.");
				}
			}
			else if (selectMenu == 3) {
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				StudentSelect1 stSelect = controller.getSelect();
				StudentVO1 st = stSelect.select(id);
				if (st != null) {
					StudentRepository.getStDB().remove(id);
					System.out.println("삭제가 되었습니다.");
				}
				else {
					System.out.println("해당 아이디가 없습니다.");
				}
			}
			else if (selectMenu == 4) {
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect1 stSelect = controller.getSelect();
				StudentVO1 st = stSelect.select(id);
				
				if (st != null) st.printOneInfo();
			}
			
			else if (selectMenu == 5) {
				StudentSelectAll1 stall = controller.getSelectAll();
			}
			else if (selectMenu == 6) {
				System.out.println("종료");
				scan.close();
				break;
			}
		}
	}
}