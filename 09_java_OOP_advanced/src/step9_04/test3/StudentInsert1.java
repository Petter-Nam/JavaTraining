package step9_04.test3;


public class StudentInsert1 {
	
	private StudentDAO1 studentDAO;
	
	public StudentInsert1(StudentDAO1 stDAO) {
		this.studentDAO = stDAO;
	}
	
	public void insert(StudentVO1 studentVO) {
		String id = studentVO.getId();
		if (checkId(id)) {
			studentDAO.insert(studentVO);
		}
		else {
			System.out.println("중복 아이디입니다.");
		}
	}
	
	public boolean checkId(String id) {
		StudentVO1 studentVO = studentDAO.select(id);
		return studentVO == null?true:false;
	}
}