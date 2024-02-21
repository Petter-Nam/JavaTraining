package step7_01.objectArray;

class Client {
	
	String id;
	String passwd;
	String name;
	String birth;
	int age;
	String contact;
	String address;
	
	
	
	void setData(String id, String passwd, String name, String birth, int age, String contact , String address) {
		
		this.id = id; // 파라미터로 전달된 데이터를 필드에 대입
		this.passwd = passwd;
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.contact = contact;
		this.address = address;
	}
	
	void printData() {
		System.out.println(this.id + " / " + this.passwd + " / " + this.name + " / " + this.birth + " / " + this.age + " / " + this.contact + " / " + this.address);
		
		
	}
}


public class ObjectArrayEx05_연습 {

	public static void main(String[] args) {
		Client[] clientList = new Client[3];
		for (int i = 0; i < clientList.length; i++) {
			clientList[i] = new Client();
		}
		clientList[0] = new Client();
		clientList[0].id = "user1";
		clientList[0].passwd = "1111";
		clientList[0].birth = "2000-01-01";
		clientList[0].age = 25;
		clientList[0].contact = "010-1234-5678";
		clientList[0].address = "서울";
		
		clientList[1].setData("user2", "2222", " 사용자2", "2010-01-01", 15, "010-9876-8041", "경기");
		clientList[2].setData("user3", "3333", " 사용자3", "1990-01-01", 35, "010-7777-8041", "인천");
		
		for (int i = 0; i < clientList.length; i++) {
			clientList[i].printData();
		}
		
	}
	
	

}
