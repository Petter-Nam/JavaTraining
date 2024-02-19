package step5_02.file;
/*
 * 2월 20일
 *파일을 다루는건 자주 이용을 안하다보니 기억이 나질 않는다. 
 * 많은양을 많이 소화하지 못하지만 그래도 계속 연습을 해두어야할것 같다.
 * 
 */
import java.io.FileWriter;
import java.io.IOException;

//# 파일 저장하기 : 연습문제1


public class FileEx03_문제 {

	public static void main(String[] args) {
		
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[] ages     = {	   20,     30,     40};
		
		String fileName = "fileTestTraining.txt";
		
		String data = "";
		
		for (int i = 0; i < names.length; i++) {
			data += names[i];
			data += "/";
			data += ages[i];
			if (i != names.length - 1) {
				data += ",";
			}
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
	}

}
