package step9_01.atm_v1;
/*
 * 2월 22일 
 * 짧은 시간에 분석하면서 따라치면서 작성해보았다.
 * 시간이 걸려서 중도에 ATM 시스템 메인클래스에서 마지막 기능두개를 제외하였다.
 * 이거 혼자서 여러개 클래스를 작성한다면 자기생각으로 처음부터 끝까지 만들어야 기억에 남지 않을까 싶다.
 * 따라만 치면 내가 무슨클래스 작성해서 어떻게 불러오는지 생각이 잘 안난다....
 * 
 */
public class Main_test {
	public static void main(String[] args) {
		
		ATM_test atm = new ATM_test();
		atm.printMainMenu();
	}
}