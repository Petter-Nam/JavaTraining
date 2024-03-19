package step9_04.test4;

import java.util.HashMap;

public class StudentRepository2 {
	
	private static HashMap<String, StudentVO2> stDB = new HashMap<String, StudentVO2>();

	public static HashMap<String, StudentVO2> getStDB() {
		return stDB;
	}

	public static void setStDB(HashMap<String, StudentVO2> stDB) {
		StudentRepository2.stDB = stDB;
	}
	
}