package step9_04.test3;

import java.util.Map;

import step9_04.StudentRepository;

public class StudentDAO1 {
	
	public void insert(StudentVO1 st) {
		StudentRepository1.getStDB().put(st.getId(), st);
	}
	
	public StudentVO1 select(String id) {
		return StudentRepository1.getStDB().get(id);
	}
	
	public Map<String, StudentVO1> getStudentDB() {
		return StudentRepository1.getStDB();
	}
}