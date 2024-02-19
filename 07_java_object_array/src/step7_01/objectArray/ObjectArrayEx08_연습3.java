package step7_01.objectArray;
/*
 * 2월 20일 
 * 배열의 크기를 자동적으로 늘리는데에 3일이 걸렸다..... temp에 기존의 클래스 주소를 참조시켜서 배열을 유동적으로 늘리는게 이해가 안되서 계속 해보았다.
 * 이해는 가지만 굳이 사용안하겠다는 느낌만 받고 시간만 허비했다고 생각한다....
 * 어렵고 시간만 잡으면서 얻은건 있지만
 * 괜히했다.
 * 기억에도 오래 안남을거 같고 더 손대고싶진않다.
 * 
 */
import java.util.Scanner;
import java.util.StringTokenizer;

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
		int studentCnt = 0;
		int subjectCnt = 0;
		Student83[] student = new Student83[studentCnt + 1];
		while (true) {
			System.out.print("[1]학생 추가\n[2]과제 추가\n[3]점수추가\n[4]성적표 출력\n[5]종료\n입력 : ");
			int choice = scan.nextInt();
			System.out.println();

			if (choice == 1) {
				System.out.print("이름 입력 : ");
				String studentName = scan.next();

				if (studentCnt == 0) {
					student[studentCnt] = new Student83();
					student[studentCnt].name = studentName;
					studentCnt++;
				} 
				else {
					Student83[] temp1 = new Student83[studentCnt + 1];

					for (int i = 0; i < studentCnt; i++) {
						temp1[i] = student[i];
					}
					temp1[studentCnt] = new Student83();
					temp1[studentCnt].name = studentName;
					student = temp1;
					studentCnt++;
					temp1 = null;
				}
				System.out.println();
			}
			else if (choice == 2) {
				for (int i = 0; i < student.length; i++) {
					System.out.print("[" + (i + 1) + "] " + student[i].name + " ");
				}
				
				System.out.print("\n입력 : ");
				int choiceStudent = scan.nextInt();
				choiceStudent--;
				
				System.out.print("\n과목 입력 : ");
				String subjectName = scan.next();
				
				student[choiceStudent].subject = new Subject83[subjectCnt + 1];
				
				if (subjectCnt == 0) {
					student[choiceStudent].subject[subjectCnt] = new Subject83();
					student[choiceStudent].subject[subjectCnt].name = subjectName;
					subjectCnt++;
				}
				else {
					Subject83[] temp = new Subject83[subjectCnt + 1];
					
					for (int i = 0; i < subjectCnt; i++) {
						temp[i] = student[choiceStudent].subject[i];
					}
					temp[subjectCnt] = new Subject83();
					temp[subjectCnt].name = subjectName;
					student[choiceStudent].subject = temp;					
					subjectCnt++;
					temp = null;
				}
			}
			else if (choice == 3) {
				for (int i = 0; i < student.length; i++) {
					System.out.print("[" + (i + 1) + "] " +student[i].name + " ");
					for (int j = 0; j < student[i].subject.length; j++) {
						System.out.print("[" + (j + 1) + "] " + student[i].subject[j].name + " ");
					}
					System.out.print("\n학생 넘버 입력");
					int choiceStuNum = scan.nextInt();
					choiceStuNum--;
					
					System.out.print("\n과목 넘버 입력 : ");
					int subNum = scan.nextInt();
					subNum--;
					
					System.out.print("\n점수 입력 : ");
					int scoreInput = scan.nextInt();
					
					student[choiceStuNum].subject[subNum].score =scoreInput;
				}
			}
			else if (choice == 4) {
				for (int i = 0; i < student.length; i++) {
					System.out.print("[" + (i + 1) + "] " +student[i].name + " ");
					for (int j = 0; j < student[i].subject.length; j++) {
						System.out.print("[" + (j + 1) + "] " + student[i].subject[j].name + " " + student[i].subject[j].score);
					}
			}
				
		}
			else if (choice == 5) {
				scan.close();
			}

	}
}
}
