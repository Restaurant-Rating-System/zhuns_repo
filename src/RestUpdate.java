import java.util.Scanner;

public class RestUpdate {
	public void update(String[][] rest) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수정하고 싶은 이름 = ");
		String name = sc.next();

		int index = (new RestSearch()).search(rest, name);
		if (index == -1) {
			System.out.println("식당정보를 찾을 수 없습니다");
			return;
		}

		System.out.println("수정할 전화번호 = ");
		String phone = sc.next();

		rest[index][2] = phone;

		System.out.println("정상적으로 수정하였습니다");

	}
}
