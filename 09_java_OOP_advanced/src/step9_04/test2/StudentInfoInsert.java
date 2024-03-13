package step9_04.test2;

public class StudentInfoInsert {
	
	public StudentInfoDAO studentInfoDAO;
	
	public StudentInfoInsert(StudentInfoDAO stDAO) {
		this.studentInfoDAO = stDAO;
	}
	
	public void insert(StudentInfoVO studentInfoVO) {
		String id = studentInfoVO.getId();
		if (checkId(id)) {
			studentInfoDAO.insert(studentInfoVO);
		}
		else {
			System.out.println("중복아이디 입니다.");
		}
	}
	
	public boolean checkId(String id) {
		StudentInfoVO studentInfoVO = studentInfoDAO.Select(id);
		return studentInfoVO == null?true:false;
	}
}
