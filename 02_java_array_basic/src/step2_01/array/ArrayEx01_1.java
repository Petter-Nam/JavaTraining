package step2_01.array;

/*
 * # 배열 (Array)
 * 
 * [형식]
 * 
 * 1) 자료형[] 배열명 = new 자료형[방의 개수]
 * 2) 자료형 배열명[] = new 자료형[방의 개수]
 * 
 * - '같은 자료형'의 데이터를 '여러개' 저장하기 위한 자료구조
 * 
 * - 인덱스(index) : 0부터 시작하는 방 번호가 부여된다.
 * 
 * - 엘리먼트(element) : 배열의 요소를 지칭한다.
 * 
 * - 배열은 생성시에 초깃값이 부여되어 있다.
 * 		String배열의 초깃값 : null
 * 		int 배열의 초기값 : 0
 * 		double 배열의 초기값 : 0.0
 * 		char 배열의 초기값 : '0'
 * 		boolean 배열의 초기값 : false
 * 
 * - 배열은 주소변수이다.
 * 
 * - 배열은 크기가 변하지 않는다. 배열의 요소를 삭제하여도 배열의 크기는 고정되어있다.
 * 
 * - 배열의 요소를 지우는 것은 배열의 초기값으로 다시 저장하는 것을 의미한다.
 * 
 * - null을 대입함으로써 배열의 전체를 삭제할 수 있다.
 */
public class ArrayEx01_1 {

	public static void main(String[] args) {
		
		
		// 1.일반 변수 (데이터 저장)
		
		int testVar = 0;
		testVar = 3;
		System.out.println(testVar);
		System.out.println();
		
		// 2. 주소 변수 (주소 저장)
		int[] arr = null; // 주소 변수의 초깃값은 null로 저장한다.
		arr = new int[5];// 다섯개의 데이터를 저장할 수 있음
		
		System.out.println(arr); // 배열의 이름은 주소
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// 배열의 요소(element)를 삭제할 수 없고
		// 초기값으로 다시 지정하여 데이터를 삭제한다.
		
		// arr[3] = 지움; 이런것은 존재하지 않는다. 리스트라는 자료를 배우면사용
		arr[3] = 0;
		arr[4] = 0; //이런식으로 지웠다고 약속한다. 처음 상태로 돌려놓는 방법
		
		//null을 대입하여 배열자체를 삭제 할 수 있다.
		
		arr = null;
	}

}
