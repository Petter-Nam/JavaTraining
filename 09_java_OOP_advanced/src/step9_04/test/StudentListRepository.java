package step9_04.test;

// HashMap을 이용하여 키 데이터 식으로 저장하는  HashMap 패키지의 클래스를 생성함
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
