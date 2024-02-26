package ATM_test1;

/*
 * 2월 26일 
 * 주말을 거쳐 좀 쉬었더니 
 * 어떻게 만들었는지 기억도 안나고 이것저것 추가하다가 
 * ATM_test1 에서 많은 실수가 보인 후 UserManager_test1에서도 실패
 * 많이 보인다.... 대규모 수술이 아니라 처음부터 다시 시작할려고한다...
 */

//ATM 시스템에서 사용자의 계좌 정보를 담는 클래스
//계좌번호와 잔액을 저장하며, 계좌정보 출력 메서드를 제공
public class UserManager_test1 {

	User_test1[] user = null;
	int userCount = 0;
	int identifier = -1;
	
	void printAllUser() {
		for (int i = 0; i < userCount; i++) {
			user[i].printAccount();
		}
	}

	void addUser() {
		if (userCount == 0) {
			user = new User_test1[1];
			user[0] = new User_test1();
			System.out.print("회원가입 ID 입력 : ");
			String userId = ATM_test1.scan.next();
			System.out.print("\n회원가입 Password 입력 : ");
			String userPw = ATM_test1.scan.next();

			user[0].id = userId;
			user[0].pw = userPw;

			userCount++;
		} 
		else if (userCount != 0) {
			User_test1[] temp = user;
			user = new User_test1[userCount + 1];
			user[userCount] = new User_test1();
			for (int i = 0; i < userCount; i++) {
				user[i] = temp[i];
			}
			System.out.print("회원가입 ID 입력 : ");
			String userId= ATM_test1.scan.next();
			System.out.print("\n회원가입 Password 입력 : ");
			String userPw = ATM_test1.scan.next();

			user[userCount].id = userId;
			user[userCount].pw = userPw;

			userCount++;

		}
	}
	void checkIdPw() {
		System.out.print("ID 입력 : ");
		String checkId = ATM_test1.scan.next();
		
		System.out.print("\n Password 입력 : ");
		String checkPw = ATM_test1.scan.next();
		
		for (int i = 0;  i < userCount; i++) {
			if (checkId.equals(user[i].id) && checkPw.equals(user[i].pw)) {
				System.out.print("\n" + user[i].id +"로그인이 되었습니다."); 
				identifier = i;
			}
		}
		
		if (identifier == -1) {
			System.out.println("ID, Password를 다시 확인하세요 ");
		}
	}
	void logoutIdPw() {
		System.out.print("\n[1.로그아웃] [0.취소] : ");
		int checkLogout = ATM_test1.scan.nextInt();
		
		if (checkLogout == 1) {
			System.out.println("\n" + user[identifier].id +"님 로그아웃 되었습니다.");
			identifier = -1;
		}
		else if (checkLogout == 0) {
			System.out.println("\n" + user[identifier].id +"님 현재 로그인 유지");
		}
		else {
			System.out.println("다시 입력");
			return;
		}
	}
	void deleteIdPw() {
		System.out.print("[1.계정삭제] [0.취소]");
		int checkDelete = ATM_test1.scan.nextInt();
		
		if (checkDelete == 1) {
			System.out.println("삭제할 ID입력 : ");
			String deleteId = ATM_test1.scan.next();
			
			System.out.println("삭제할 PW입력 : ");
			String deletePw = ATM_test1.scan.next();
			
			
			for (int i = 0; i < userCount; i++) {
				if (user[i].id.equals(deleteId) && user[i].pw.equals(deletePw)) {
					identifier = i;
				}
			}
		}
		if (identifier == -1) {
			System.out.println("아이디 비번이 틀렸습니다.");
			return;
		}
		System.out.println(user[identifier].id  + " 탈퇴되었습니다.");
		
		User_test1[] temp = user;
		user = new User_test1[userCount - 1];
		for(int i = 0; i < identifier; i++) {
			temp[i] = user[i];
		}
		for (int i = identifier; i < userCount - 1; i++) {
			user[i] = temp[i+1];
		}
		userCount--;
	}

}