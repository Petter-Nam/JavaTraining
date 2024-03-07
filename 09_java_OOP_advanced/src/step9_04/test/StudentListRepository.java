package step9_04.test;

import java.util.HashMap;

public class StudentListRepository {
	
	private static HashMap<String, StudentListVO> stDB = new HashMap<String, StudentListVO>();

	public static HashMap<String, StudentListVO> getStDB() {
		return stDB;
	}

	public static void setStDB(HashMap<String, StudentListVO> stDB) {
		StudentListRepository.stDB = stDB;
	}
	
}
