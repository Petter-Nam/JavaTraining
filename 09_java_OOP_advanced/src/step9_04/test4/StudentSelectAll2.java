package step9_04.test4;

import java.util.Map;

public class StudentSelectAll2 {
	
	private StudentDAO2 studentDAO;
	
	public StudentSelectAll2 (StudentDAO2 studentDAO) {
		this.studentDAO = studentDAO;// StudentDAO2 객체의 getStudentDB() 메서드를 호출하여 학생 데이터를 반환
	}
	
	public Map<String, StudentVO2> allSelect() {
		return studentDAO.getStudentDB();// StudentDAO2 객체의 getStudentDB() 메서드를 호출하여 학생 데이터를 반환
		
	}
	
	public void printAll() {
		Map<String, StudentVO2> map = studentDAO.getStudentDB();
		
		for (String key : map.keySet()) {
			map.get(key).printOneInfo();
			// 각 학생의 정보를 출력하는 printOneInfo() 메서드 호출
		}
	}
}