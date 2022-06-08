import java.util.Arrays;

public class RestPrint {
	public void print(String[][] rest) {
		for (int i = 0; i < rest.length; i++) {
			if (rest[i][0] != null && !rest[i][0].equals("")) {
				System.out.println(Arrays.toString(rest[i]));
			}
		}
	}
}
