package ATM_test1;
/*
 * 2월 26일 
 * 주말을 거쳐 좀 쉬었더니 
 * 어떻게 만들었는지 기억도 안나고 이것저것 추가하다가 
 * ATM_test1 에서 많은 실수가 보인 후 UserManager_test1에서도 실패
 * 많이 보인다.... 대규모 수술이 아니라 처음부터 다시 시작할려고한다...
 */
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