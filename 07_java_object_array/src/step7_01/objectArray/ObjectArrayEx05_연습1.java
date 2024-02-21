package step7_01.objectArray;
/*
 * 2월 15일
 * 개념은 현재 말로는 설명을 못하겠지만 이해는간다
 *	하지만 막상 혼자 코드를 작성해보라고하면 머리가 새하얗다.
 *	정답예시가 사랑스러우면서도 독인것같다.
 * 
 */
class Client_1 {
	String id;
	String passwd;
	String name;
	String birth;
	int age;
	String contact;
	String address;
	
	void setData(String id, String passwd, String name, String birth, int age, String contact, String address) {
		
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.contact = contact;
		this.address = address;
		
	}
	
	void printData() {
		System.out.println(this.id + " / " + this.passwd + " / " + this.name + " / " + this.birth + " / " + this.contact + " / " + this.address);
	}
}


public class ObjectArrayEx05_연습1 {

	public static void main(String[] args) {
		Client_1[] clientList = new Client_1[3];
		
		for (int i = 0; i < clientList.length; i++) {
			clientList[i] = new Client_1();
		}
		
		clientList[0].setData("user2", "2222", " 사용자2", "2010-01-01", 15, "010-9876-8041", "경기");
		clientList[1].setData("user2", "2222", " 사용자2", "2010-01-01", 15, "010-9876-8041", "경기");
		clientList[2].setData("user3", "3333", " 사용자3", "1990-01-01", 35, "010-7777-8041", "인천");
		
		for(int i = 0; i < clientList.length; i++) {
			clientList[i].printData();
		}
	}
}