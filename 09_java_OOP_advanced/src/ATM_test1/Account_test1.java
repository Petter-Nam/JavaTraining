package ATM_test1;

public class Account_test1 {
	String number; // 계좌번호 ATM 시스템 코드에서 난수로 생성 후 User 코드의 Acc 클래스 배열에 저장후 불러와서 출력하는 용도
	int money; // 금액 확인 용도
	
	void PrintOwnAccount() {
		System.out.println(this.number + " : " + this.money);
	}
}