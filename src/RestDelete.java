import java.util.Scanner;

public class RestDelete {
	public void delete(String[][] rest) {
		Scanner sc = new Scanner(System.in);

		System.out.print("삭제하고 싶은 식당이름 = ");
		String name = sc.next();

		int index = (new RestSearch()).search(rest, name);
		if (index == -1) {
			System.out.println("식당정보를 찾을 수 없습니다");
			return;
		}

		rest[index][0] = "";
		rest[index][1] = "";
		rest[index][2] = "";
		rest[index][3] = "";
		rest[index][4] = "";
		rest[index][5] = "";

		System.out.println("정보를 삭제하였습니다");

	}
}
