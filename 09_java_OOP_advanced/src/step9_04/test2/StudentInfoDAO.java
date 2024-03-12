package step9_04.test2;

import java.util.Map;

import step9_04.StudentRepository;

public class StudentInfoDAO {
	
	public void insert(StudentInfoVO st) {//해당 insert 메서드가 사용된 데이터를 저장
		StudentInfoRepository.getStDB().put(st.getId(), st); 
	}
	
	public StudentInfoVO Select(String id) {
		return StudentInfoRepository.getStDB().get(id); //get메서드를 통해서 해당 ID를 키로 찾는 메서드
	}
	
	public Map<String, StudentInfoVO> getStudentDB() { //데이터베이스의 모든 데이터를 반환하는 메서드
		return StudentInfoRepository.getStDB();
	}
	
}
