package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 데이터를 반환한다. return 데이터는 오직 1개이다. 
 *  2) 메서드를 종료한다.
 *  
 * */

class ReturnEx {
	
	void setScore1 (int score1) {
		score1 = 100;
		
	}

	int setScore2 (int score2) {
		score2 = 100;
		return score2;
	}
	
	int testReturnSyntax () {
		
		System.out.println("리턴 전 명령어 1");
		System.out.println("리턴 전 명령어 2");
		System.out.println("리턴 전 명령어 3");
		//return 1, 2, 3, 4, 5; 오류 : 	return 데이터는 오직 1개만 가능하다.
		return 0;
		
		
		//retrun 이 실행되는 순간 종료
		//System.out.println("리턴 후 명령어 1");
		//System.out.println("리턴 후 명령어 2");
		//System.out.println("리턴  명령어 3");
	}
	
	int[] abcdefg () {
		int[] test = new int[100];
		
//		if (true) {
//			return;
//		}
//		else if (true) {
//			return = null;
//		}
		
		return test;
	}
}

public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnEx object = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출전 score1 : " + score1); // 87
		
		
		object.setScore1(score1);
		System.out.println("메서드 호출후 score1 " + score1); // 87
		
		System.out.println("\n========\n");
		
		
		
		int score2 = 87;
		System.out.println("메서드 호출전 score2 : " + score2); // 87
		
		
		object.setScore2(score2);
		System.out.println("메서드 호출후 score2 : " + score2); // 87
		
		score2 = object.setScore2(score2);
		System.out.println("메서드 호출후 score2 : " + score2); // 100
		
		System.out.println("\n========\n");
		
		
	}

}
