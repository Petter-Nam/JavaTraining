package _08_file;

import java.io.IOException;
import java.util.Enumeration;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@WebServlet("/upload2")
public class Upload2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String saveDirectory = "/Users/nsj/git/JavaTraining/12_JSP_BASIC_T/src/main/webapp/chapter08_file/fileRepository";
		
		MultipartRequest multipartRequest = new MultipartRequest(request, saveDirectory , 1024 * 1024 * 300 , "utf-8");
		
		Enumeration<?> files = multipartRequest.getFileNames();
		
		while (files.hasMoreElements()) {
			
			String element = (String)files.nextElement();
			
			String originalFileName = multipartRequest.getOriginalFileName(element);
			
			System.out.println("originalFileName : " + originalFileName);
			
			UUID uuid = UUID.randomUUID(); // UUID.randomUUID() : 해쉬 생성 메서드
			System.out.println("uuid : " + uuid);
			
			String extension = originalFileName.substring(originalFileName.lastIndexOf("."));
			System.out.println("extension : " + extension);
			
			String fileUUID = uuid + extension;
			System.out.println("fileUUID : " + fileUUID);
			
		}
	}

}
