package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// 파일 출력(file output) , 로드(load) , 불러오기

public class FileEx02 {

	public static void main(String[] args) {

		String fileName = "ex01.txt";
		
		File file = new File(fileName); 			// 파일 객체 생성
		FileReader fr = null;
		BufferedReader br = null;
		//exists() : 파일이 존재하면 true를 반환하고 존재하지 않으면 false를 반환한다.
		
		if (file.exists()) {
			
			try {
				
				fr = new FileReader(file);   // 파일을 읽어오는 객체 생성
				br = new BufferedReader(fr); // 텍스트를 읽어오는 객체 생성
				
				String data = br.readLine(); // 한줄의 데이터를 읽어온다.
				System.out.println(data);
				
				System.out.println(br.readLine());
				
				//전체 텍스트를 읽어오는 예
				
				while (true) {
					data = br.readLine();
					if (data == null) { // 반환할 데이터가 없음 null을 반환한다.
						break;
					}
					
					System.out.println(data);
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			} finally {
				//나중에 생성한 객체를 먼저 close한다.
				if (br != null) try {br.close();} catch (IOException e) {e.printStackTrace();}
				if (fr != null) try {fr.close();} catch (IOException e) {e.printStackTrace();}
			}
		}	
	}

}
