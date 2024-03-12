package step9_04.test2;

import java.util.HashMap;

public class StudentInfoRepository {
	
	private static HashMap<String, StudentInfoVO> stDB = new HashMap<String, StudentInfoVO>();

	public static HashMap<String, StudentInfoVO> getStDB() {
		return stDB;
	}

	public static void setStDB(HashMap<String, StudentInfoVO> stDB) {
		StudentInfoRepository.stDB = stDB;
	}
	
}
