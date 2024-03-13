package step9_04.test2;

public class StudentInfoVO {
	//학생 정보에 대한 필드 선언
	private String id;
	private int num;
	private String name;
	
	public StudentInfoVO(String id, int num, String name) { //클래스의 객체 생성할 때 사용되는생성자
		
		this.id = id; //매개변수로 받은 id값을 클래스의 id 변수에 할당.
		this.num = num;
		this.name = name;
		
	}
	public void printOneInfo() {
		System.out.println("id: " + this.id + " / num: " + this.num + " / name: " + this.name);
	}
	// Getter 및 Setter 메서드 선언 
	public String getId() { 
		return id;// 필드의 값을 반환
	}

	public void setId(String id) {
		this.id = id;// 필드의 값에 할당
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
