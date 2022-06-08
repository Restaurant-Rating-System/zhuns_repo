import java.util.Calendar;
import java.util.Scanner;

public class RestInsert {
	public int insert(String[][] rest, int restCount) {
		Scanner sc = new Scanner(System.in);

		System.out.print("상호명 = ");
		String name = sc.next();

		System.out.print("대표메뉴의 이름 = ");
		int age = sc.nextInt();

		System.out.print("대표메뉴의 가격 = ");
		String phone = sc.next();

		System.out.print("평점 = ");
		String address = sc.next();

		Calendar cal = Calendar.getInstance();

		// 오늘날짜 취득
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11
		int day = cal.get(Calendar.DATE);
		rest[restCount][0] = name;
		rest[restCount][1] = age + "";
		rest[restCount][2] = phone;
		rest[restCount][3] = address;
		rest[restCount][4] = year + "/" + month + "/" + day + "";
		rest[restCount][5] = year + "/" + month + "/" + day + "";

		restCount++;
		return restCount;
	}

}
