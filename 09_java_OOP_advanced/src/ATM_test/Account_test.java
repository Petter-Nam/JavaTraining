package ATM_test;

public class Account_test {
	String number; // 계좌번호
	int money; // 계좌 잔액
	
	void printOwnAccount() {
		System.out.println(this.number + " : " + this.money);
	} // 계좌번호와 잔액을 출력하는 메서드
}