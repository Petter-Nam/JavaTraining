package step9_04.test4;

public class StudentSelect2 {
	
	private StudentDAO2 studentDAO;
	
	public StudentSelect2 (StudentDAO2 stDAO) {
		studentDAO = stDAO;
	}
	
	public StudentVO2 select(String id) {
		
		if (checkId(id)) {
			return studentDAO.select(id);
		}
		else {
			System.out.println("정보가 없습니다.");
		}
		return null;
	}
	
	public boolean checkId(String id) {
		
		StudentVO2 studentVO = studentDAO.select(id);
		
		return studentVO != null ? true:false;
	}
}