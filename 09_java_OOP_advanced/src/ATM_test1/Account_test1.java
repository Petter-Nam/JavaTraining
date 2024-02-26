package ATM_test1;
/*
 * 2월 26일 
 * 주말을 거쳐 좀 쉬었더니 
 * 어떻게 만들었는지 기억도 안나고 이것저것 추가하다가 
 * ATM_test1 에서 많은 실수가 보인 후 UserManager_test1에서도 실패
 * 많이 보인다.... 대규모 수술이 아니라 처음부터 다시 시작할려고한다...
 */
// ATM 시스템에서 사용자의 계좌 정보를 담는 클래스
// 계좌번호 잔액을 저장 계좌 정보 출력 메서드 제공
public class Account_test1{
	
	String number;
	int money;
	
	void printOwnAccount() {
		System.out.println(this.number + " : " + this.money);
	}
}