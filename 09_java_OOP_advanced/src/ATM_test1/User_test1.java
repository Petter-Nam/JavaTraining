package ATM_test1;
//UserManager의 회원가입시 이용하는 클래스
public class User_test1 {
	String id; // UserManager에서 입력받은 아이디가 해당 아이디와 일치하는지 이용하는 용도
	int accCount;// ATM코드에서 계좌 생성시 해당 유저 id의 계좌 개수를 카운트하는 용도
	Account_test1[] acc;// Account 클래의 각 계좌번호와 금액의 배열 
	
	void printAccount() { //Account 코드에서 각 계좌의 금액을 출력하는 메서드
		for (int i = 0; i < accCount; i++) {
			acc[i].PrintOwnAccount();
		}
	}
}