package step9_04.test;

import java.util.Map;

public class StudentListSelectAll {

	private StudentListDAO studentDAO;
	
	public StudentListSelectAll(StudentListDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Map<String, StudentListVO> allSelect() {
		return studentDAO.getStudentDB();
	}
	
	public void printAll() {
		Map <String, StudentListVO> map = studentDAO.getStudentDB();
		for(String key : map.keySet()) {
			map.get(key).printOneInfo();
		}
	}
	
	
}
