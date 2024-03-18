package step9_04.test3;

import java.util.Map;

public class StudentSelectAll1{
	
	
	private StudentDAO1 studentDAO;
	
	public StudentSelectAll1 (StudentDAO1 studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Map<String, StudentVO1> allSelect() {
		return studentDAO.getStudentDB();
	}
	
	public void printAll() {
		Map<String, StudentVO1> map = studentDAO.getStudentDB();
		
		for (String key : map.keySet()) {
			map.get(key).printOneInfo();
		}
	}
}