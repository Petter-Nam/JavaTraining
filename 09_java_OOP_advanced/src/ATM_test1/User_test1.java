package ATM_test1;
// 회원가입시 생성되는 데이터들을 담는 클래스
//사용자 ID, 계좌개수, 계좌 정보를 저장
public class User_test1 {
	String id;
	String pw;
	int accCount;
	Account_test1[] acc;
	
	void printAccount() {
		for (int i = 0; i < accCount; i++) {
			acc[i].printOwnAccount();
		}
	}
}