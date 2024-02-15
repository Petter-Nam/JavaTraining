package step7_01.objectArray;

class Subject_1 {
	String name;
	int score; // # 클래스 배열 응용
}

class Student_1 {
	Subject_1[] subject;
	String name;
}

public class ObjectArrayEx07_연습1 {

	public static void main(String[] args) {

		Student_1[] studentInfo = new Student_1[3];

		studentInfo[0] = new Student_1();
		studentInfo[0].name = "학생";
		studentInfo[0].subject = new Subject_1[3];

		for (int i = 0; i < 3; i++) {
			studentInfo[0].subject[i] = new Subject_1();
			studentInfo[0].subject[i].name = "학생0 과목" + i;
			studentInfo[0].subject[i].score = 100;
		}

		studentInfo[1] = new Student_1();
		studentInfo[1].name = "학생1";
		studentInfo[1].subject = new Subject_1[2];
		studentInfo[1].subject[0] = new Subject_1();
		studentInfo[1].subject[1] = new Subject_1();
		studentInfo[1].subject[0].name = "학생 과목0";
		studentInfo[1].subject[0].score = 100;
		studentInfo[1].subject[1].name = "학생 과목0";
		studentInfo[1].subject[1].score = 100;

		studentInfo[2] = new Student_1();
		studentInfo[2].name = "학생2";
		studentInfo[2].subject = new Subject_1[1];
		studentInfo[2].subject[0] = new Subject_1();
		studentInfo[2].subject[0].name = "학생2 과목1";
		studentInfo[2].subject[0].score = 100;
		
		
		for (int i = 0; i < studentInfo.length; i++) {
			System.out.println("--- " + studentInfo[i].name + " ---");
			for (int j = 0; j < studentInfo[i].subject.length; j++) {
				System.out.println(studentInfo[i].subject[j].name + " / " + studentInfo[i].subject[j].score);
			}
			System.out.println();

		}
	}

}
