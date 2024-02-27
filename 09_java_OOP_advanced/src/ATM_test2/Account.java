package ATM_test2;
/*
 * 2월 27일 
 * 거의 만들었는데 계좌 생성에서 약간 문제가 있다. 
 * 조금만 수정하면 될것 같다. 
 * 찾기가 힘들뿐
 */
public class Account {
	
	String number;
	int money;
	
	void printOwnAccount() {
		System.out.println(this.number + " : " + this.money);
	}
	
}
