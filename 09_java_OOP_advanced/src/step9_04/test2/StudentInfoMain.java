package step9_04.test2;
/*
 * 3월 14일
 * 백번쳐서 기억날때까지 작성을 해봐야겠다.
 * 보면서 여러번 코드를 작성하다보면 객체지향의 설계 원리를 이해할 수 있을것 같다.
 * 아마도
 */
import java.util.Scanner;

public class StudentInfoMain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StudentInfoController controller = new StudentInfoController();
		
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
				
				StudentInfoInsert stInsert = controller.getInsert();
				stInsert.insert(new StudentInfoVO(id, num, name));
			}
			
			else if (selectMenu == 2) {
				
				System.out.println("아이디를 입력하세요.");
				String id = scan.next();
				StudentInfoSelect stSelect = controller.getSelect();
				StudentInfoVO st = stSelect.select(id);
				
				if (st != null) {
					System.out.print("새로운 번호를 입력하세요 : ");
					int newNum = scan.nextInt();
					System.out.println("새로운 이름을 입력하세요 : ");
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
				StudentInfoSelect stSelect = controller.getSelect();
				StudentInfoVO st = stSelect.select(id);
				if (st != null) {
					StudentInfoRepository.getStDB().remove(id);
					System.out.println("삭제가 되었습니다.");
				}
				else {
					System.out.println("해당 아이디가 없습니다.");
				}
			}
			else if (selectMenu == 4) {
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentInfoSelect stSelect = controller.getSelect();
				StudentInfoVO st = stSelect.select(id);
				
				if (st != null) st.printOneInfo();
			}
			else if (selectMenu == 5) {
				StudentInfoSelectAll stAll = controller.getSelectAll();
			}
			else if (selectMenu == 6) {
				System.out.println("종료");
				scan.close();
				break;
			}
		}
	}
}
