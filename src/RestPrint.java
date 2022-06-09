import java.util.Scanner;

public class RestPrint {
	public void print(String[][] rest) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정렬 방식선택(1.평점 2.가격 3.이름 : default(저장순)");
		int sortWay = sc.nextInt();
		System.out.print("오름/내림(1/2) default(오름차순) ");
		int updown = sc.nextInt();

		System.out.printf("%-5s %-10s %-10s %-5s %-10s %-10s\n", "상호명", "대표메뉴의 이름", "대표메뉴의 가격", "평점", "저장한 날짜",
				"수정한 날짜");

		printSortResult(resSort(rest, sortWay, updown));
	}

	public String[][] resSort(String[][] rest, int sortWay, int updown) {
		String[][] afterSort = new String[rest.length][6];

		switch (sortWay) {
		case 1: {
			afterSort = selectSort(rest, updown);
			break;
		}
		case 2: {
			break;
		}
		case 3: {
			break;
		}
		default:
			afterSort = rest;
		}

		return afterSort;
	}

	public String[][] selectSort(String[][] rest, int updown) {

		int resRow = 0;

		for (int i = 0; i < rest.length; i++) {
			if (rest[i][0] != null && !rest[i][0].equals("")) {
				resRow++;
			}

		}

		String[][] temp = new String[resRow][6];
		int[] number = new int[temp.length];

		for (int i = 0; i < resRow; i++) {
			temp[i] = rest[i].clone();
		}

		for (int i = 0; i < temp.length; i++) {
			number[i] = Integer.parseInt(temp[i][3]);
		}

		for (int i = 0; i < resRow - 1; i++) {
			for (int j = i + 1; j < resRow; j++) {
				if (updown == 1) {
					if (number[i] > number[j]) { // swap
						swap(i, j, temp);
					}
				} else {
					if (number[i] < number[j]) { // swap
						swap(i, j, temp);
					}
				}

			}
		}

		return temp;
	}

	public void swap(int i, int j, String[][] rest) {
		String[] temp = rest[i];
		rest[i] = rest[j];
		rest[j] = temp;
	}

	public void printSortResult(String[][] rest) {
		for (int i = 0; i < rest.length; i++) {
			if (rest[i][0] != null && !rest[i][0].equals("")) {
				System.out.printf("%-7s", rest[i][0]);
				System.out.printf("%-13s", rest[i][1]);
				System.out.printf("%-14s", rest[i][2]);
				System.out.printf("%-6s", rest[i][3]);
				System.out.printf("%-13s", rest[i][4]);
				System.out.printf("%-10s\n", rest[i][5]);
			}
		}
	}
}
