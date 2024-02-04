package step2_01.array;
/*
 * 2월 3일 
 * 헷갈린 문제도 있지만 나름 기억을 상기시키는 문제와 같았다.
 * 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장
		int[] d = { 10, 20, 30, 40, 50 };
		int[] e = { 0, 0, 0, 0, 0 };

		// 예) 30 ==> e = {10 , 20 , 40 , 50 , 0};
//		
//		int inputCnt = 0;
//		boolean isTrue = true;
//		while (isTrue) {
//			System.out.print("값을 입력하세요");
//			int myChoice = scan.nextInt();
//			
//			for (int i = 0; i < d.length; i++) {
//				if (myChoice == d[i])
//					e[i] = myChoice;
//			}
//			System.out.println(Arrays.toString(e));
//			inputCnt++;
//			if (inputCnt == 5) isTrue = false;
//			
//		}

		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장
		int[] f = { 1001, 40, 1002, 65, 1003, 70 };
		int[] g = { 0, 0, 0, 0, 0, 0 };
		// 예) 1002 ==> {1001 , 40 , 1003 , 70 , 0 , 0};

//		int routin = 0;
//		while (true) {
//			System.out.println("값을 입력하세요");
//			int fNumInput = scan.nextInt();
//			
//			for (int i = 0; i < f.length; i++) {
//				if (fNumInput == f[i]) continue;
//				
//				if (i <= f.length) g[i - 1] = f[i];
//			}
//			System.out.println(Arrays.toString(g));
//			break;
//		}

		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10, 20, 30, 40, 50 };
		// 예) 60 ==> {20 , 30 , 40 , 50 , 60};

//		 System.out.print("숫자를 입력하세요: ");
//	        int newNumber = scan.nextInt();
//
//	       
//	        for (int i = 0; i < h.length - 1; i++) {
//	            h[i] = h[i + 1];
//	        }
//	      
//	        h[h.length - 1] = newNumber;
//
//	     
//	        System.out.print("{");
//	        for (int i = 0; i < h.length - 1; i++) {
//	            System.out.print(h[i] + ", ");
//	        }
//	        System.out.println(h[h.length - 1] + "}");
//		

		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장
//		int[] i = { 10, 20, 30, 40, 50 };
//		// 예) 60 ==> {60 , 10 , 20 , 30 , 40};
//		System.out.println("데이터를 입력하세요");
//		int input = scan.nextInt();
//
//		for (int j = i.length - 1; j > 0; j--) {
//			i[j] = i[j - 1];
//		}
//
//		i[0] = input;
//		System.out.println(Arrays.toString(i));

		// 문제 12) 아래배열을 거꾸로 저장
		int[] j = { 1, 2, 3, 4, 5 };
		int[] k = { 0, 0, 0, 0, 0 };
		// 예) k => {5 , 4 , 3 , 2 , 1};
		int kcount = 0;
		for (int m = j.length - 1; m >= 0; m--) {
			
			k[kcount] = j[m];
			kcount++;
		}
		System.out.println(Arrays.toString(k));
		
		scan.close();
	}

}
