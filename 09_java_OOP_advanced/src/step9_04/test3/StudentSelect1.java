package step9_04.test3;


public class StudentSelect1 {
	
	private StudentDAO1 studentDAO;
	
	public StudentSelect1(StudentDAO1 stDAO) {
		studentDAO = stDAO;
	}
	
	public StudentVO1 select(String id) {
		
		if (checkId(id)) {
			return studentDAO.select(id);
		}
		else {
			System.out.println("정보가 없습니다.");
		}
		return null;
	}
	
	public boolean checkId(String id) {
		StudentVO1 studentVO = studentDAO.select(id);
		
		return studentVO != null ? true:false;
	}
}