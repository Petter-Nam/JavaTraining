package ATM_test;
/*
 * 사용자 관리클래스
 */
public class User_test {
	String id; //사용자 ID
	int accCount;//사용자가 가지고 있는 계좌 개수
	Account_test[] acc; //사용자가 가지고 있는 계좌정보 배열
	
	void printAccount () {
		
		for (int i = 0; i < accCount; i++) {
			acc[i].printOwnAccount();
		} //모든 사용자의 계좌 정보를 출력하는 메소드
	}
}