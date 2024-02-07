package step5_02.file;
/*
 * 2월 8일
 * 처음부터 끝까지 내 머리속으로 코드를 작성해보았다.
 * 
 * 파일을 저장하고 불러오는데에서 에러가 발생해서
 * 천천히 다시 연습해서 수정해봐야할 것 같다.
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM

public class FileEx08_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int atmSize = 5;
		int accsCnt = 0;
		int identifier = -1;

		String[] accs = new String[atmSize];
		String[] pws = new String[atmSize];
		int[] moneys = new int[atmSize];

		String fileName = "atm.txt";

		while (true) {

			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {

				if (identifier == -1) {
					System.out.println("로그아웃 상태입니다.");
				}

				int i = 0;

				System.out.println("회원가입을 진행합니다.");
				System.out.print("아이디를 생성해주세요 : ");
				accs[i] = scan.next();

				System.out.print("비밀번호를 생성해주세요 : ");
				pws[i] = scan.next();
				i++;

				if (i == atmSize) {
					System.out.println("더 이상 회원가입을 진행할 수 없습니다.");
					continue;
				}

			} 
			else if (sel == 2) {
				System.out.println("회원탈퇴를 진행하십니다.");
				System.out.print("어떤 계정을 탈퇴하시겠습니까?");
				String getOut = scan.next();
				for (int i = 0; i < atmSize; i++) {
					if (getOut == accs[i]) {
						accs[i] = null;
						pws[i] = null;
					}
					System.out.println("현재 계정 : " + Arrays.toString(accs));
					System.out.println("해당 패스워드 : " + Arrays.toString(pws));
				}
			} 
			else if (sel == 3) {
				System.out.print("로그인을 진행하여주세요 : ");
				String hLogin = scan.next();
				System.out.println();

				System.out.println("패스워드를 입력해주세요");
				String hPws = scan.next();

				for (int i = 0; i < atmSize; i++) {
					if (hLogin.equals(accs[i]) && hPws.equals(pws[i])) {
						identifier = i;
						if (i != -1) {
							System.out.println(accs[i] + "로그인상태입니다.");
						}
					} else if (hLogin.equals(accs[i]) && hPws.equals(pws[i]) == false) {
						System.out.println("ID혹은 PWS가 틀렸습니다.");
						continue;
					}
				}
			} 
			else if (sel == 4) {
				System.out.println("로그아웃되었습니다.");
				identifier = -1;
			} 
			else if (sel == 5) {
				System.out.print("입금을 선택하셨습니다.");
				for (int i = 0; i < atmSize; i++) {
					if (identifier == i) {
						System.out.print("얼마를 입금하시겠습니까;");
						int moneyIn = scan.nextInt();

						moneys[i] = moneyIn;
					}
				}
				System.out.println(Arrays.toString(moneys));
				continue;
			} 
			else if (sel == 6) {
				System.out.print("얼마를 출금하시겠습니까?");
				int moneyOut = scan.nextInt();
				
				for (int i = 0; i < accs.length; i++) {
					if (identifier == i) {
						moneys[i] -= moneyOut;
					}
					System.out.println(moneys[i]);
				}
			} 
			else if (sel == 7) {
				System.out.println("계좌 이체를 진행합니다.");
				System.out.print("상대방의 계좌번호를 입력하세요");
				String accsSomeOne = scan.next();
				
				System.out.print("보낼 금액을 지정해주세요");
				int moneysOut = scan.nextInt();
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == accsSomeOne) {
						moneys[identifier] -= moneysOut;
						moneys[i] += moneysOut;
					}
					else if (accs[i] != accsSomeOne) {
						System.out.println("해당 계좌는 존재하지않습니다.");
						continue;
					}
				}
				
			} else if (sel == 8) {
				System.out.println("해당 계좌의 잔액을 조회하시겠습니까?");
				System.out.print("[1]예 [2]아니요");
				int check = scan.nextInt();
				for (int i = 0; i < accs.length; i++) {
					if (check == 1 && identifier > -1) {
						System.out.println("현재 " + accs[identifier] + " 고객님의 잔액은 " + moneys[identifier] + "원입니다.");
					}
				}
			} 
			else if (sel == 9) {
				FileWriter fw = null;
				
				try {
					fw = new FileWriter(fileName);
				} catch (IOException e) {
				
					e.printStackTrace();
				}
				finally {
				if (fw != null)	try {fw.close();} catch (IOException e) {e.printStackTrace();}
				}
			} else if (sel == 10) {
				File file = new File(fileName);
				
				if (file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					try {
						fr = new FileReader(fileName);
						br = new BufferedReader(fr);
						String data = "";
						while (true) {
							String line = br.readLine();
							if (line == null) {
								break;
							}
							data += line;
							data += "\n";
					} 
						data = data.substring(0, data.length() - 1);
						String[] temp = data.split("\n");
						accsCnt = temp.length;
						
						for (int i = 0; i < accsCnt; i++) {
							String[] info = temp[i].split("/");
							accs[i] = info[0];
							pws[i] = info[0];
							moneys[i] = Integer.parseInt(info[2]);
						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if (br != null) try {br.close();} catch (IOException e) {e.printStackTrace();}
						if (fr != null) try {br.close();} catch (IOException e) {e.printStackTrace();}
					}
				}
			} else if (sel == 0) {
				break;
			}

		}

	}
}
