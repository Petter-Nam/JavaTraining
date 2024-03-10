package step9_04.test;
/*
 * 3월 10일 
 * 똑같이 따라하면서 분석중이다.
 * 분석을 끝내고 만드는가 아니면 따라하면서 분석하고 하는가에 따지면 후자가 맞는것 같다.
 * 현재 실력으로는 문법부터 혼란스럽고 누군가가 작성해놓은게 어디서 데이터를불러오고어떤 메서드를 사용하는지 
 * 복잡하다....
 */
import java.util.Scanner;

import step9_04.StudentInsert;
import step9_04.StudentVO;

public class StudentListMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StudentListController controller = new StudentListController();
		
		while(true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();
				
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				
				StudentListInsert stInsert = controller.getInsert();
				stInsert.insert(new StudentListVO(id, num, name));
			}
			
			else if (selectMenu == 2) {
				
			}
			
			else if (selectMenu == 3) {
				
			}
			else if (selectMenu == 4) {
				StudentListSelectAll stall = controller.getSelectAll();
				stall.printAll();
			}
			else if (selectMenu == 6) {
				System.out.println("종료");
				scan.close();
				break;
			}
		}

	}

}
