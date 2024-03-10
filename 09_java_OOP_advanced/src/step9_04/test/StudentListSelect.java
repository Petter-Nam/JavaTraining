package step9_04.test;

public class StudentListSelect {
	
	private StudentListDAO studentDAO;
	
	public StudentListSelect(StudentListDAO stDAO) {
		studentDAO = stDAO;
	}
	
	public StudentListVO select(String id) {
		
		if (checkId(id)) {
			return studentDAO.select(id);
		}
		else {
			System.out.println("정보가 없습니다.");
		}
		return null;
		
	}
	
	public boolean checkId(String id) {
		StudentListVO studentVO= studentDAO.select(id);
		return studentVO != null ? true:false;
		
	}
}
