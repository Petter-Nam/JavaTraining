package step9_04.test;
// 캡슐화를 이용한 
//학생 정보를 효과적으로 저장하고 관리하는 클래스

public class StudentListVO {
	
	private String id; //학생의 id
	private int num; // 학생의 숫자
	private String name; // 학생의 이름
	
	public StudentListVO(String id, int num, String name) {
		this.id = id;
		this.num = num;
		this.name = name;
	}
	
	public void printOneInfo() {
		System.out.println("id: " + this.id + " / num: " + this.num + " / name: " + this.name);
	}                                                                                                                  

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
