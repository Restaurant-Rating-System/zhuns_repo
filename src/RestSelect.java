import java.util.Arrays;
import java.util.Scanner;

public class RestSelect {
	public void select(String[][] rest) {
		Scanner sc = new Scanner(System.in);

		System.out.print("검색하고 싶은 식당이름 = ");
		String name = sc.next();

		String findMember[][] = (new RestSearch()).searchAll(rest, name);

		if (findMember == null) {
			System.out.println("정보를 찾을 수 없습니다");
			return;
		}

		for (int i = 0; i < findMember.length; i++) {
			System.out.println(Arrays.toString(findMember[i]));
		}

	}
}
