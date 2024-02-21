package step7_01.objectArray;
/*
 * 2월 16일 
 * 클래스의 객체에 배열 객체생성 반복문 이용 배열 생성 안보고 만드는데 엄청 복잡하고 
 * 에러 여러번 보니 유튜브보면서 하다가 시간을 허비했지만 그래도 해냈다.
 * 진짜 복잡한 것같다. 당연이 이렇게 작성해야지라는 생각도 있지만 막상만들려고하면 엄청 헤맨다.....
 * 
 */
//# 클래스 배열 응용
class Subject_2 {
	String name;
	int score;
}

class Student_2 {
	Subject_2[] subject;
	String name;
}

public class ObjectArrayEx07_연습2 {

	public static void main(String[] args) {
		
		Student_2[] student = new Student_2[3];
		student[0] = new Student_2();
		student[0].subject = new Subject_2[3];
		student[0].name = "학생0";
		
		for (int i = 0; i < 3; i++) {
			student[0].subject[i] = new Subject_2();
			student[0].subject[i].name = "과목" + i;
			student[0].subject[i].score = 100;
		}
		
		student[1] = new Student_2();
		student[1].subject = new Subject_2[2];
		student[1].name = "학생1";
		student[1].subject[0] = new Subject_2();
		student[1].subject[0].name = "과목1";
		student[1].subject[0].score = 100;
		student[1].subject[1] = new Subject_2();
		student[1].subject[1].name = "과목2";
		student[1].subject[1].score= 90;

		
		student[2] = new Student_2();
		student[2].subject = new Subject_2[1];		
		student[2].name = "학생3";
		student[2].subject[0] = new Subject_2();
		student[2].subject[0].name = "과목3";
		student[2].subject[0].score = 20;
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("-----" + "학생" + i + "------");
			for(int j = 0; j < student[i].subject.length; j++) {
				System.out.println(student[i].name + " " + student[i].subject[j].name + " / " + student[i].subject[j].score);
			}
		}
		
	}

}
