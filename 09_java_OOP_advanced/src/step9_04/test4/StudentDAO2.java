package step9_04.test4;

import java.util.Map;

public class StudentDAO2 {
	
	public void insert(StudentVO2 st) { // 데이터베이스에 studentVO2 id를 키로 id, num, name을 데이터로 저장하는 메서드 
		StudentRepository2.getStDB().put(st.getId(), st);
	}
	
	public StudentVO2 select(String id) { //데이터 베이스에 저장된 id를 중복검사용으로 사용하기 위한 메서드
		return StudentRepository2.getStDB().get(id);
	}
	
	public Map<String, StudentVO2> getStudentDB() { // 전체 데이터베이스 주소를 참조하는 메서드
		return StudentRepository2.getStDB();
	}
}