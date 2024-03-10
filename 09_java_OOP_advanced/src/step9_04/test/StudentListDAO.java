package step9_04.test;

import java.util.HashMap;
import java.util.Map;

import step9_04.StudentRepository;
import step9_04.StudentVO;
// 입력받은 데이터를 VO에 저장시켜 repository 데이터베이스에 저장시키고 반환하는 코드
public class StudentListDAO {
	
	public void insert(StudentListVO st) {
		StudentListRepository.getStDB().put(st.getId(), st);
	}
	
	public StudentListVO select(String id) {
		return StudentListRepository.getStDB().get(id);
	}
	
	public HashMap<String, StudentListVO> getStudentDB() {
		return StudentListRepository.getStDB();
	}
}
