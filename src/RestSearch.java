
public class RestSearch {
	public int search(String[][] rest, String name) {
		int index = -1;

		for (int i = 0; i < rest.length; i++) {
			if (rest[i][0] != null && rest[i][0].equals(name)) {
				index = i;
				break;
			}
		}

		return index;
	}

	public String[][] searchAll(String[][] rest, String name) {

		int count = 0;
		// 카운터
		for (int i = 0; i < rest.length; i++) {
			if (rest[i][0] != null && rest[i][0].equals(name)) {
				count++;
			}
		}

		if (count == 0) {
			return null;
		}

		// 할당
		String findMember[][] = new String[count][5];
		int cou = 0;

		// 데이터저장
		for (int i = 0; i < rest.length; i++) {
			if (rest[i][0] != null && rest[i][0].equals(name)) {
				findMember[cou] = rest[i];
				cou++;
			}
		}

		return findMember;
	}
}
