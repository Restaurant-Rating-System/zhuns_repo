import java.util.Calendar;
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

		System.out.print("대표메뉴의 가격 = ");
		String price = sc.next();

		Calendar cal = Calendar.getInstance();

		// 수정한 날짜 취득
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11
		int day = cal.get(Calendar.DATE);

		rest[index][2] = price;
		rest[index][5] = year + "/" + month + "/" + day + "";

		System.out.println("정상적으로 수정하였습니다");

	}
}
