package step9_04.test4;

public class StudentSelect2 {
	
	private StudentDAO2 studentDAO;
	
	public StudentSelect2 (StudentDAO2 stDAO) {
		studentDAO = stDAO;
	}
	
	public StudentVO2 select(String id) {
		
		
	}
	
	public boolean checkId(String id) {
		
		StudentVO2 studentVO = studentDAO.select(id);
		
		
	}
}