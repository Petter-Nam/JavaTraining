package step7_01.objectArray;

//# 클래스 배열 응용

class Subject_1 {
	String name;
	int score;
}

class Student_1 {
	
	Subject[] subjects;
	String name;
	
}


public class ObjectArrayEx07_연습1 {

	public static void main(String[] args) {
	
		Student_1[] studentList = new Student_1[3];
		
		studentList[0] = new Student_1();
		studentList[0].name = "학생";
	
		
	}

}
