package step7_01.objectArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentEx1 {
	String id;
	String pw;
	
	void printData() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
	}
}

class Controller1 {
	
	StudentEx1[] list = null;
	int stdCnt = 0;
	
	void addStudentEx(StudentEx1 st) {
		
		if (stdCnt == 0) {
			list = new StudentEx1[1];
		}
		else if (stdCnt > 0) {
			StudentEx1[] temp = list;
			list = new StudentEx1[stdCnt + 1];
			for (int i = 0; i < stdCnt; i++) {
				list[i] = temp[i];
			}
			temp = null;
		}
		list[stdCnt] = st;
		stdCnt++;
	}
	
	StudentEx1 removeStudentEx (int index) {
		
		StudentEx1 deleteObj = list[index];
		if (stdCnt == 1) {
			list = null;
		}
		else if (stdCnt > 1) {
			StudentEx1[] temp = list;
			list = new StudentEx1[stdCnt - 1];
			for (int i = 0; i < index; i++) {
				list[i] = temp[i];
			}
			for (int i = index; i < stdCnt - 1; i++) {
				list[i] = temp[i + 1];
			}
			temp = null;
		}
		stdCnt--;
		
		return deleteObj;
	}
	
	int checkId(StudentEx1 st) {
		
		int check = -1;
		for (int i = 0; i < stdCnt; i++) {
			if (list[i].id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
	}
	
	void printStudentEx() {
		for (int i = 0; i < stdCnt; i++) {
			list[i].printData();
		}
	}
	
	String outData() {
		
		String data = "";
		if (stdCnt == 0) {
			return data;
		}
		data += stdCnt;
		data += "\n";
		for (int i = 0; i < stdCnt; i++) {
			data +=list[i].id;
			data += ",";
			data += list[i].id;
			data += ",";
			data += list[i].pw;
			if (stdCnt - 1 != i) {
				data += "\n";
			}
		}
		return data;
	}
	
	void sortData() {
		for (int i =0; i < stdCnt; i++) {
			for (int j = i; j < stdCnt; j++) {
				if (list[i].id.compareTo(list[j].id) > 0) {
					StudentEx1 temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
	void loadStudentEx (StudentEx1[] temp, int count) {
		
		this.stdCnt = count;
		this.list = temp;
	}
}

public class ObjectArrayEx09_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller1 controller = new Controller1();
		
		String fileName = "student_db.txt";
		
		while (true) {
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				StudentEx1 temp = new StudentEx1();
				System.out.println("[가입] id를 입력하세요 >>>");
				
				temp.id = scan.next();
				int check = controller.checkId(temp);
				
				if (check == -1) {
					System.out.println("[가입] id를 입력하세요 >>>");
					temp.pw = scan.next();
					controller.addStudentEx(temp);
					System.out.println(temp.id + "님 가입을 환영합니다.");
				}
				else {
					System.out.println("중복아이디입니다.");
				}
				
			}
			else if (sel == 2) {
				
				controller.printStudentEx();
				
				StudentEx1 temp = new StudentEx1();
				System.out.println("[탈퇴] id를 입력하세요 >>>");
				temp.id = scan.next();
				int check = controller.checkId(temp);
			}
		}
	
	}

}
