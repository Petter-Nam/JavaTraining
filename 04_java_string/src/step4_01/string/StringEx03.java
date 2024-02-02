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
		
		//String ch = str.charAt(3); char는 문자 하나이기 때문에 String 타입에 담을 수 없다.
		char ch = str.charAt(3);
		System.out.println(ch);
		
		System.out.println(str.charAt(str.length() - 1));
		
		System.out.println();
		System.out.println("\n==========================\n");
		
		for (int i = 0; i < str.length(); i++) { // 문자열에서 length는 메서드이기 때문에 ()가 존재함
			System.out.println(str.charAt(i));
		}
		
		System.out.println("\n==========================\n");
		// [4] substring() : 문자 여러개 추출 (슬라이싱)
		// 4-1) substring(index1이상, index2미만)
		// System.out.println(str.substring(시작, 끝 - 1)));
		System.out.println(str.substring(0, 4));
		System.out.println(str.substring(4, 6));
		String subStr = str.substring(2, 4);
		System.out.println(subStr);
		System.out.println();
		
		// 4-2) substring(index1부터 끝까지)
		System.out.println(str.substring(2));
		System.out.println(str.substring(4));
		System.out.println("\n==========================\n");
		
		// [5] split("구분자") : 구분자로 잘라내기
		String str1 = "a/b/c/d/e/f/g";
		String str2 = "aa&bb&cc";
		String str3 = "aaa.bbb.ccc.ddd.eee"; // 예외케이스  . 은 \\. (이스케이프 문자로 구현)
		
		String[] temp = str1.split("/");
		System.out.println(temp.length);
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");	
		}
		System.out.println();
		System.out.println("\n==========================\n");
		
		temp = str2.split("&");
		System.out.println(temp.length);
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");	
		}
		System.out.println();
		System.out.println("\n==========================\n");
		
		
		temp = str3.split("\\.");
		System.out.println(temp.length);
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");	
		}
		System.out.println();
		System.out.println("\n==========================\n");
		
		// 참고) 문자열 비교 : compareTo()
		String str4 = "씨";
		String str5 = "자바";
		String str6 = "파이썬";
		String str7 = "씨";
		//왼쪽 데이터(기준)가 작을 경우 음수가 반환된다.
		System.out.println(str4.compareTo(str5));
		System.out.println(str4.compareTo(str6));
		System.out.println(str4.compareTo(str7));
		System.out.println("\n==========================\n");
		//왼쪽 데이터(기준)가 클 경우 음수가 반환된다.
		System.out.println(str6.compareTo(str5));
		System.out.println(str6.compareTo(str6));
		System.out.println(str6.compareTo(str7));
		
	}

}
