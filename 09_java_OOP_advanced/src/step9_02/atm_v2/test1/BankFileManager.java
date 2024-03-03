package step9_02.atm_v2.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BankFileManager {

	private BankFileManager() {
	}

	static private BankFileManager instance = new BankFileManager();

	static public BankFileManager getInstance() {
		return instance;
	}

	String fileName = "BankATM.txt";
	String data = "";
	BankUserManager bum = BankUserManager.getInstance();

	void setData() {
		data = "";
		int userCount = bum.userCnt;
		data += userCount;
		data += "\n";

		for (int i = 0; i < userCount; i++) {
			data += bum.userList[i].id;
			data += "\n";
			data += bum.userList[i].pw;
			data += "\n";
			data += bum.userList[i].accCnt;
			data += "\n";

			if (bum.userList[i].accCnt == 0) {
				data += "0\n";
			} else {
				for (int j = 0; j < bum.userList[i].accCnt; j++) {
					data += bum.userList[i].acc[j].accNumber;
					data += "/";
					data += bum.userList[i].acc[j].money;
					if (j != bum.userList[i].accCnt - 1) {
						data += ",";
					}
				}
				data += "\n";
			}
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
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
				}
			}
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
				bum.userCnt = Integer.parseInt(tmp[0]);
				bum.userList = new BankUser[bum.userCnt];
				for (int i = 0; i < bum.userCnt; i++) {
					bum.userList[i] = new BankUser();
				}

				int j = 0;
				for (int i = 1; i < tmp.length; i += 4) {
					String id = tmp[i];
					String pw = tmp[i + 1];
					int accCnt = Integer.parseInt(tmp[i + 2]);
					String accInfo = tmp[i + 3];
					if (accCnt == 1) {
						String[] temp = accInfo.split("/");

						String acc = temp[0];
						int money = Integer.parseInt(temp[1]);

						bum.userList[j].acc[0] = new BankAccount();
						bum.userList[j].acc[0].accNumber = acc;
						bum.userList[j].acc[0].money = money;
					}
					if (accCnt > 1) {
						String[] temp = accInfo.split(",");

						for (int k = 0; k < temp.length; k++) {
							String[] parse = temp[k].split("/");
							String acc = parse[0];
							int money = Integer.parseInt(parse[1]);

							bum.userList[j].acc[k] = new BankAccount();
							bum.userList[j].acc[k].accNumber = acc;
							bum.userList[j].acc[k].money = money;
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