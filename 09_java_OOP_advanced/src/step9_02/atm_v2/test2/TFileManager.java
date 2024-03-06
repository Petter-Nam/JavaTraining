package step9_02.atm_v2.test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TFileManager {

	private TFileManager() {
	}

	static private TFileManager instance = new TFileManager();

	static public TFileManager getInstance() {
		return instance;
	}

	String fileName = "TATM.txt";
	String data = "";
	TUserManager userManager = TUserManager.getInstance();

	void setData() {

		data = "";
		int userCount = userManager.userCnt;
		data += userCount; // 텍스트 첫번째 저장할 데이터는 유저들의 수이다.
		data += "\n";

		for (int i = 0; i < userCount; i++) {// 각 user의 계정과 id pw를 저장
			data += userManager.tuserClass[i].id;
			data += "\n";
			data += userManager.tuserClass[i].pw;
			data += "\n";
			data += userManager.tuserClass[i].accCnt;
			data += "\n";

			if (userManager.userCnt == 0) {
				data += "0\n";
			} else {
				for (int j = 0; j < userManager.tuserClass[i].accCnt; j++) {
					data += userManager.tuserClass[i].accNumberArray[j].accNumber;
					data += "/";
					data += data += userManager.tuserClass[i].accNumberArray[j].money;
					data += ",";
				}
			}
			data += "\n";
		}

	}

	void save() {
		setData();
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {try {fw.close();} catch (IOException e) {}}
		}
	}
	void load() {
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			if (file.exists()) {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				while (true) {
					String line = br.readLine();
					if (line == null) {
						break;
					}
					data += line;
					data += "\n";
					
				}
				String[] tmp = data.split("\n");
				userManager.userCnt = Integer.parseInt(tmp[0]);
				userManager.tuserClass = new TUser[userManager.userCnt];
				for (int i = 0; i < userManager.userCnt; i++) {
					userManager.tuserClass[i] = new TUser();
				}
				
				int j = 0;
				for (int i = 1; i < tmp.length; i += 4) {
					String id = tmp[i];
					String pw = tmp[i+1];
					int accCnt = Integer.parseInt(tmp[i + 2]);
					
					userManager.tuserClass[j].id = id;
					userManager.tuserClass[j].pw = pw;
					userManager.tuserClass[j].accCnt = accCnt;
					String accInfo = tmp[i + 3];
					
					if (accCnt == 1) {
						String[] temp = accInfo.split("/");
						
						String acc = temp[0];
						int money = Integer.parseInt("/");
						
						userManager.tuserClass[j].accNumberArray[0] = new TAccount();
						userManager.tuserClass[j].accNumberArray[0].accNumber = acc;
						userManager.tuserClass[j].accNumberArray[0].money = money;
					}
					if (accCnt > 1) {
						String[] temp = accInfo.split("/");
						for (int k = 0; k < temp.length; k++) {
							String[] parse = temp[k].split("/");
							String acc = parse[0];
							int money = Integer.parseInt(parse[1]);
							
							userManager.tuserClass[j].accNumberArray[k] = new TAccount();
							userManager.tuserClass[j].accNumberArray[k].accNumber = acc;
							userManager.tuserClass[j].accNumberArray[k].money = money;
							
						}
					}
					j++;
				}
			}
			else {
				setData();
				save();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {try {br.close();} catch (IOException e) {}}
			if (fr != null) {try {fr.close();} catch (IOException e) {}}
		}
		
	
	}
}