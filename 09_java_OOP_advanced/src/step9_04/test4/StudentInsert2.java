package step9_04.test4;

public class StudentInsert2 {
	
	private StudentDAO2 stDAO;
	
	public StudentInsert2(StudentDAO2 stDAO) {
		this.stDAO = stDAO;
	}
	
	public void insert (StudentVO2 studentVO) {
		String id = studentVO.getId();
		
		if (checkId(id)) {
			stDAO.insert(studentVO);
		}
		else {
			System.out.println("중복 아이디 입니다.");
		}
	}
	
	public boolean checkId(String id) {
		
		StudentVO2 studentVO = stDAO.select(id);
		return studentVO == null ? true : false;
	}
}