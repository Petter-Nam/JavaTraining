package ATM_test1;

public class UserManager_test1 {
	
	User_test1[] user = null; // User 클래스 배열을 초기값 설정
	int userCount = 0;//usercount 초기값 설정
	
	void printAlluser () {
		for (int i = 0; i < userCount; i++) {
			user[i].printAccount();
		}
	}
	
	void addUser() { // 회원가입을 입력을 담당하는 메서드
		
		if (userCount == 0) { // 회원가입을 처음하는 경우 
			user = new User_test1[1];  //클래스배열 1개 생성
			System.out.print("[가입] 아이디를 입력하세요 : ");
			String id = ATM_test1.scan.next(); //ATM 클래스를 불러옴
			
			user[userCount] = new User_test1();// 처음생성하는 배열에 객체생성
			user[userCount].id = id; // 해당 클래스 배열에 id값을 입력받음
			System.out.println("[메시지] ID : " +  id + "가입되었습니다.");
			
			userCount++;
		}
		
		else {
			System.out.println("[가입] 아이디를 입력하세요 : ");
			String id = ATM_test1.scan.next();
			
			boolean isDuple = false;
			for (int i = 0; i < userCount; i++) {
				if (user[i].id.equals(id)) {
					isDuple = true;
				}	
			}
			if (!isDuple) {
				User_test1[] temp = user;
				user = new User_test1[userCount + 1];
				
			}
		}
		
	}
}