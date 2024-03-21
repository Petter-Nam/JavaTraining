package step9_04.test4;
/*
 * 3월 20일 
 * 분석이 어렵기도하고 이곳저곳에서 불러오는게 헷갈린다.
 * 이해는 가는데 혼자서 막상 작성해볼려고하면 결국 다시보게된다.
 * 문법정인것도 공부도 해야하고 다음 수업도 듣다보면 시간을 많이 잡다가 
 * 미루게되고 다시 까먹게된다.
 * 계속 꾸준히 해야할듯 싶다.
 */
import java.util.Scanner;

public class StudentMain2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StudentController2 controller = new StudentController2();
		
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
				
				StudentInsert2 stInsert = controller.getInsert();
				stInsert.insert(new StudentVO2(id, num, name));
			}
			else if (selectMenu == 2) {
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				StudentSelect2 stSelect = controller.getSelect();
				StudentVO2 st = stSelect.select(id);
				
				if ( st != null) {
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
				StudentSelect2 stSelect = controller.getSelect();
				StudentVO2 st = stSelect.select(id);
				
				if (st != null) {
					StudentRepository2.getStDB().remove(id);
					System.out.println("삭제가 되었습니다.");
				}
				else {
					System.out.println("해당 아이디가 없습니다.");
				}
			}
			else if (selectMenu == 4) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect2 stSelect = controller.getSelect();
				StudentVO2 st = stSelect.select(id);
				
				if (st != null) st.printOneInfo();
			}
			else if (selectMenu == 5) {
				StudentSelectAll2 stAll = controller.getSelectAll();
				stAll.printAll();
			}
			else if (selectMenu == 6) {
				System.out.println("종료");
				scan.close();
				break;
			}
			
		}
	}
}