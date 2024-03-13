package step9_04.test2;

public class StudentInfoSelect {
	private StudentInfoDAO studentInfoDAO;
	
	public StudentInfoSelect(StudentInfoDAO stDAO) {
		studentInfoDAO = stDAO;
	}
	
	public StudentInfoVO select(String id) {
		
		if(checkId(id)) {
			return studentInfoDAO.Select(id);
		}
		else {
			System.out.println("정보가 없습니다.");
		}
		return null;
	}
	
	public boolean checkId(String id) {
		StudentInfoVO studentInfoVO =studentInfoDAO.Select(id);
		return studentInfoVO != null ? true:false;
	}
}
