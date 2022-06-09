import java.util.Scanner;

public class RestPrint {
	public void print(String[][] rest) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정렬 방식선택(1.평점 2.가격 3.이름 : default(저장순)");
		int sortWay = sc.nextInt();
		System.out.print("오름/내림(1/2) default(오름차순) ");
		int updown = sc.nextInt();

		// 식당 리스트 프린트
		System.out.printf("%-13s %-12s %-12s %-6s %-13s %-10s\n", "상호명", "대표메뉴의 이름", "대표메뉴의 가격", "평점",
				"저장한 날짜",
				"수정한 날짜");

		printSortResult(resSort(rest, sortWay, updown));
	}

	// 정렬 방식 선정
	public String[][] resSort(String[][] rest, int sortWay, int updown) {
		String[][] afterSort = new String[rest.length][6];

		switch (sortWay) {
		case 1: {

			// 선택정렬
			afterSort = selectSort(rest, updown);
			break;
		}
		case 2: {
			break;
		}
		case 3: {
			break;
		}

		// 저장된 순서로 출력
		default:
			afterSort = rest;
		}

		return afterSort;
	}

	// 선택 정렬
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
						swapn(i, j, number);

					}
				} else {
					if (number[i] < number[j]) { // swap
						swap(i, j, temp);
						swapn(i, j, number);
					}
				}

			}
		}

		return temp;
	}

	public void swap(int i, int j, String[][] temp) {
		String[] t = temp[i];
		temp[i] = temp[j];
		temp[j] = t;
	}

	public void swapn(int i, int j, int[] number) {
		int t = number[i];
		number[i] = number[j];
		number[j] = t;
	}

	public void printSortResult(String[][] rest) {
		for (int i = 0; i < rest.length; i++) {
			if (rest[i][0] != null && !rest[i][0].equals("")) {
				System.out.printf("%-7s\t", rest[i][0]);
				System.out.printf("%-10s\t", rest[i][1]);
				System.out.printf("%-10s\t", rest[i][2]);
				System.out.printf("%-5s\t", rest[i][3]);
				System.out.printf("%-10s\t", rest[i][4]);
				System.out.printf("%-10s\n", rest[i][5]);
			}
		}
	}
}
