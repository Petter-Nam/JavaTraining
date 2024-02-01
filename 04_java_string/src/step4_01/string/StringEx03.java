package step4_01.string;

/* 
 * # 문자열 관련 메서드
 * 
 * 1. 문자열.length() 							: 문자열의 길이를 반환한다. (반환타입은 int)
 * 2. 문자열.indexOf("문자열") 					: 특정문자열이 포함된 위치를 반환한다.  (반환타입은 int)
 * 												   같은 문자가 있을경우 맨 앞에 있는 가장 앞에 위치한 문자위치 1개만 반환
 * 												   (참고) lastIndexOf("문자열") : 같은문자가 있을 경우 가장 뒤에 위치한 문자위치 1개만 반환 
 * 3. 문자열.charAt(n번째)      				: 문자열의 n번째 위치에 포함된 문자를 반환한다. (반환 타입은 char)
 * 4. 문자열.substring(index1이상, index2미만)  : 특정문자열의 index1이상 index2미만의 문자열을 잘라서 반환한다. (반환타입은 String)
 *    문자열.substring(index1)  				: 특정문자열의 index1이상부터 끝까지의 문자열을 잘라서 반환한다. (반환타입은 String)
 * 5. 문자열.split("구분자")					: 구분자로 문자열을 잘라서 반환한다. (반환타입은 String 배열)
 * 
 */

public class StringEx03 {

	public static void main(String[] args) {
		String str = "megait";
		System.out.println(str);
		System.out.println("\n==========================\n");
		
		
		// [1] length() : 문자열의 길이
		System.out.println(str.length());
		
		int length = str.length();
		System.out.println(length);
		
		System.out.println("\n==========================\n");
		
		// [2] indexOf("글자") : 글자가 포함된 인덱스 확인
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("g"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("t"));
		System.out.println(str.indexOf("mega"));
		System.out.println(str.indexOf("it"));
		
		System.out.println("\n==========================\n");
		
		// [3] charAt(index) : 문자 한개 추출 (인덱싱)
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		
		// [4] substring() : 문자 여러개 추출 (슬라이싱)
		// 4-1) substring(index1이상, index2미만)
		
		// 4-2) substring(index1부터 끝까지)
		
		// [5] split("구분자") : 구분자로 잘라내기
		
	}

}
