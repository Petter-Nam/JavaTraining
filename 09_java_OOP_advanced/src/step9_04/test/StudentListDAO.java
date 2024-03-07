package step9_04.test;

import java.util.Map;

import step9_04.StudentRepository;
import step9_04.StudentVO;

public class StudentListDAO {
	
	public void insert(StudentListVO st) {
		StudentListRepository.getStDB().put(st.getId(), st);
	}
	
	public StudentListVO select(String id) {
		return StudentListRepository.getStDB().get(id);
	}
	
	public Map<String, StudentListVO> getStudentDB() {
		return StudentListRepository.getStDB();
	}

}
