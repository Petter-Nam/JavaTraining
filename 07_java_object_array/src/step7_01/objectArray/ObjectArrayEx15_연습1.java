package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Scanner;

// DTO (DataTransferObject) : 데이터 전송 모델 객체
class StudentDTO1 {
	String id;
	String pw;
}

class StudentController1 {
	
	ArrayList<StudentDTO1> studentList = new ArrayList<StudentDTO1>();
	
	void addStudent(StudentDTO1 studentDTO1) {
		studentList.add(studentDTO1);
	}
	
	StudentDTO1 removeStudent(int index) {
		StudentDTO1 deleteObj = studentList.get(index);
		studentList.remove(index);
		return deleteObj;
	}
	
	int checkId(StudentDTO1 studentDTO1) {
		int check = -1;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).id.equals(studentDTO1.id)) {
				check = i;
				break;
			}
		}
		return check;
	}
	void printStudent() {
		for (StudentDTO1 studentDTO1 : studentList) {
			System.out.println("이름 : " + studentDTO1.id + " / 비밀번호 : " + studentDTO1.pw);
		}
	}
	
	String outData() {
		String data = "";
		int lineCnt = studentList.size();
		if (lineCnt == 0) {
			return data;
		}
		
		data += lineCnt;
		data += "\n";
		for (int i = 0; i < lineCnt; i++) {
			data += studentList.get(i).id;
			data += ",";
			data += studentList.get(i).pw;
			if (lineCnt - 1 != i) {
				data += "\n";
			}
		}
		return data;
		
	}
	
	void sortData() {
		
	}
	
	void loadStudent(ArrayList<StudentDTO1> studentList) {
		this.studentList = studentList;
	}
	
	int getSize() {
		return studentList.size();
	}
}

public class ObjectArrayEx15_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentController1 controller = new StudentController1();
		
		String fileName = "student_arraylist_db.txt";
		
		while (true) {
			
		}
		

	}

}
