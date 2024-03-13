package step9_04.test2;

import java.util.Map;

public class StudentInfoSelectAll {
	
	private StudentInfoDAO studentInfoDAO;
	
	public StudentInfoSelectAll(StudentInfoDAO studentInfoDAO) {
		this.studentInfoDAO = studentInfoDAO;
	}
	
	public Map<String, StudentInfoVO> allSelect(){
		return studentInfoDAO.getStudentDB();
	}
}
