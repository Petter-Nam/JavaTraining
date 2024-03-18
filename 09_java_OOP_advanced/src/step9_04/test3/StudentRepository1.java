package step9_04.test3;

import java.util.HashMap;

public class StudentRepository1 {
	
	private static HashMap<String, StudentVO1> stDB = new HashMap<String, StudentVO1> ();
	
	public static HashMap<String, StudentVO1> getStDB() {
		return stDB;
	}
	
	public static void setStDB(HashMap<String, StudentVO1> stDB) {
		StudentRepository1.stDB = stDB;
	}
}