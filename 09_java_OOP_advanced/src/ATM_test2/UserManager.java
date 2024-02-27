package ATM_test2;
/*
 * 2월 27일 
 * 거의 만들었는데 계좌 생성에서 약간 문제가 있다. 
 * 조금만 수정하면 될것 같다. 
 * 찾기가 힘들뿐
 */

/*
 * 2월 28일
 * 한창 집중하다가 자고 일어나면 누가 짠건지 모를정도로 새롭게 보인다.
 * 에러가 보이면 허둥대는 일이 다반사이다.
 * 에러 하나 잡아내고 수정하였다.... 힘들었다.
 */
public class UserManager {
	
	User[] user = null;
	int userCnt = 0;

	void makeId() {
		System.out.print("ID 생성 : ");
		String makeId = ATM.scan.next();
		
		if (userCnt == 0) {
			user = new User[1];
			user[0] = new User();
			user[0].name = makeId;
			userCnt++;
		}
		else if (userCnt != 0) {
			boolean isDuple = false;
			
			for (int i = 0; i < userCnt; i++) {
				if (user[i].name.equals(makeId)) {
					isDuple = true;
				}
			}
			if (!isDuple) {
				User[] temp = user;
				user = new User[userCnt + 1];
				user[userCnt] = new User();
				for (int i = 0; i < userCnt; i++) {
					user[i] = temp[i];
				}
				user[userCnt].name = makeId;
				temp = null;
				userCnt++;
			}
			else {
				System.out.println("이미 해당 ID는 존재합니다.");
			}
		}

	}
	
	int checkLogin() {
		int identifier = -1;
		System.out.print("로그인 ID : ");
		String checkId = ATM.scan.next();
		for (int i = 0; i < userCnt; i++) {
			if (user[i].name.equals(checkId)) {
				System.out.println("\n" + user[i].name +  "로그인이 되었습니다.");		
				identifier = i;
			}
		}
		return identifier;
	}
	void deleteId () {
		System.out.print("삭제하실 ID 입력 : ");
		String deleteId = ATM.scan.next();
		
		if (userCnt == 0) {
			System.out.println("계정이 존재하지 않습니다.");
		}
		else if (userCnt != 0){
			for (int i = 0; i < userCnt; i++) {
				if (user[i].name.equals(deleteId)) {
					
					User[] temp = user;
					user = new User[userCnt - 1];
					user[userCnt - 1] = new User();
					
					for (int j = 0; j < i; j++) {
						user[j] = temp[j];
					}
					for (int k = i + 1; k < userCnt; i++) {
						user[k] = user[k];
					}
					temp = null;
					userCnt--;
				}
				else {
					System.out.println("존재하지 않는 ID");
				}
			}
		} 
	}
}
