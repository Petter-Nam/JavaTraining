package ATM_test2;
/*
 * 2월 27일 
 * 거의 만들었는데 계좌 생성에서 약간 문제가 있다. 
 * 조금만 수정하면 될것 같다. 
 * 찾기가 힘들뿐
 */
public class User {
	String name;// 회원가입시 로그인 ID
	int accCount;// 계좌 조회 카운트
	Account[] acc;//User 클래스 배열
	
	void printOwnAccount() { //계좌 조회시 확인하는 클래스
		for (int i = 0; i < accCount; i++) {
			acc[i].printOwnAccount();
		}
	}
}
