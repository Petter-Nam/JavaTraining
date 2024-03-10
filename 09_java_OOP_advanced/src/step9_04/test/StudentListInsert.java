package step9_04.test;
//학생정보 삽입 클래스
public class StudentListInsert {
	
	private StudentListDAO studentListDAO;
	// 생성자 : studentlistdao 객체를 초기화
	public StudentListInsert(StudentListDAO stDAO) {
		this.studentListDAO = stDAO;
	}
	
	public void insert(StudentListVO studentVO) {
		String id = studentVO.getId();
		if (checkId(id)) {
			studentListDAO.insert(studentVO);
		}
		else System.out.println("중복 아이디.");
	}
	
	public boolean checkId(String id) {
		StudentListVO studentVO = studentListDAO.select(id);
		return studentVO == null ? true:false;
	}

}
