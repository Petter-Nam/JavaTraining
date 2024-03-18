package step9_04.test3;


public class StudentVO1 {
	private String id;
	private int num;
	private String name;
	
	public StudentVO1(String id, int num, String name) {
		this.id = id;
		this.num = num;
		this.name = name;
	}
	
	public void printOneInfo() {
		System.out.println("id : " + this.id + " / num : " + this.num + " / name : " + this.name);
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