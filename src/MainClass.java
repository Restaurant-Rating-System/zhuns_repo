import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {

		String rest[][] = load("restaurant");
		int restCount = 0;
		for (int i = 0; i < rest.length; i++) {
			if (rest[i][0] != null && !rest[i][0].equals("")) {
				restCount++;
			}
		}

		while (true) {
			int number = printMenu();
			Rest rs = new Rest(rest, restCount, number);
		}

	}


	static String[][] load(String filename) {
		File file = new File("c:\\Temp\\" + filename + ".txt");
		String rest[][] = new String[100][6];

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String str = "";
			int count = 0;

			while ((str = br.readLine()) != null) {

				String data[] = str.split("-");

				rest[count][0] = data[0];
				rest[count][1] = data[1];
				rest[count][2] = data[2];
				rest[count][3] = data[3];
				rest[count][4] = data[4];
				rest[count][5] = data[5];

				count++;
			}

			br.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return rest;
	}

	static int printMenu() {
		System.out.println("<< menu >>");
		System.out.println("1.식당 추가하기");
		System.out.println("2.식당 삭제하기");
		System.out.println("3.식당 검색하기");
		System.out.println("4.식당 수정하기");
		System.out.println("5.식당 목록 불러오기");
		System.out.println("6.저장하기");
		System.out.println("7.종료하기");

		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 선택 : ");
		int number = sc.nextInt();

		return number;
	}
}
