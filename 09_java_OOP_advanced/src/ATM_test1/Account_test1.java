package ATM_test1;
// ATM 시스템에서 사용자의 계좌 정보를 담는 클래스
// 계좌번호 잔액을 저장 계좌 정보 출력 메서드 제공
public class Account_test1{
	
	String number;
	int money;
	
	void printOwnAccount() {
		System.out.println(this.number + " : " + this.money);
	}
}