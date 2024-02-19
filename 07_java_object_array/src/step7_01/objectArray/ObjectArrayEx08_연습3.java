package step7_01.objectArray;

import java.util.Scanner;

class Subject83 {
	String name;
	int score;
}

class Student83 {
	Subject83[] subject;
	String name;
}

public class ObjectArrayEx08_연습3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student83[] student = new Student83[1];
		int studentCnt = 0;

		while (true) {
			
			System.out.println("[1]학생 입력\n[2]과목 입력\n[3]점수입력\n[4]성적표 출력\n[5]종료");
			System.out.print("입력 : ");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				System.out.println("이름 입력 : ");
				String studentName = scan.next();	
				
				if (studentCnt >= student.length) {
					student[studentCnt] = new Student83();
					student[studentCnt].name = studentName;
					studentCnt++;
				}
				else {
					Student83[] temp = new Student83[student.length];
					temp[studentCnt] = new Student83();
					temp[studentCnt].name = studentName;
					studentCnt++;
					student = temp;
				}
				continue;
			}
		}
	}
}
