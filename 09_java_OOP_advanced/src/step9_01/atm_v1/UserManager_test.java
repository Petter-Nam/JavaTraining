package step9_01.atm_v1;

// 사용자 관리 클래스
public class UserManager_test {

	User_test[] user = null; // 사용자 정보 배열
	int userCount = 0;// 등록된 사용자 수

	void printAllUser() {
		for (int i = 0; i < userCount; i++) {
			user[i].printAccount();
		} // 모든 사용자의 계좌 정보 출력 메서드
	}

	void addUser() {

		if (userCount == 0) {

			user = new User_test[1];
			System.out.print("[가입] 아이디를 입력하세요 : ");
			String id = ATM_test.scan.next();// ATM_test 클래스의 scanner 클래스

			user[userCount] = new User_test();
			user[userCount].id = id;
			System.out.println("[메세지] ID : " + id + "가입되었습니다.\n");
			userCount++;
		} 
		else {
			System.out.print("[가입] 아이디를 입력하세요 : ");
			String id = ATM.scan.next();

			boolean isDuple = false;
			for (int i = 0; i < userCount; i++) {
				if (user[i].id.equals(id)) {
					isDuple = true;
				}
			}
			if (!isDuple) {

				User_test[] temp = user;
				user = new User_test[userCount + 1];
				for (int i = 0; i < userCount; i++) {
					user[i] = temp[i];
				}
				temp = null;
				
				user[userCount] = new User_test();
				user[userCount].id = id;
				System.out.println("[메시지] ID : " + id + " 은 가입되었습니다.");
				userCount++;
			}
			else {
				System.out.println("이미 가입되었습니다.");
			}
		}

	}
	User_test getUser(int idx) {
		return user[idx];
	}
	
	int logUser() {
		
		int identifier = -1;
		System.out.println("[입력] 아이디를 입력하세요 : ");
		String name = ATM.scan.next();
		
		for (int i = 0; i < userCount; i++) {
			if (name.equals(user[i].id)) {
				identifier = i;
				System.out.println("[" + user[identifier].id + "] 로그인");
			}
		}
		return identifier;
	}
	
	void leave() {
		System.out.print("[입력] 탈퇴할 아이디를 입력하세요.");
		String name = ATM.scan.next();
		int identifier = -1;
		for (int i = 0; i < userCount; i++) {
			if (name.equals(user[i].id)) {
				identifier = 1;
			}
		}
		if (identifier == -1) {
			System.out.println("[메시지] 탈퇴할 아이디를 입력하세요.");
			return;
		}
		System.out.println("ID : " + user[identifier].id + "가 탈퇴되었습니다.");
		
		User_test[] temp = user;
		user = new User_test[userCount - 1];
		
		for(int i = 0; i < userCount - 1; i++) {
			user[i] = temp[i + 1];
		}
		userCount--;
	}
}