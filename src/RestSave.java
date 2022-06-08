import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RestSave {
	public void save(String[][] rest, String filename) {
		int count = 0;
		for (int i = 0; i < rest.length; i++) {
			if (rest[i][0] != null && !rest[i][0].equals("")) {
				count++;
			}
		}

		// 할당
		String findMember[] = new String[count];
		int cou = 0;

		// 데이터저장
		for (int i = 0; i < rest.length; i++) {
			if (rest[i][0] != null && !rest[i][0].equals("")) {
				findMember[cou] = rest[i][0] + "-" + rest[i][1] + "-" + rest[i][2] + "-" + rest[i][3] + "-" + rest[i][4]
						+ "-" + rest[i][5];
				cou++;
			}
		}

		File file = new File("c:\\Temp\\" + filename + ".txt");

		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

			for (int i = 0; i < findMember.length; i++) {
				pw.println(findMember[i]);
			}

			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
