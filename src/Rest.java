
public class Rest {

	public Rest(String rest[][], int restCount, int number) {
		switch (number) {
		case 1: {
			(new RestInsert()).insert(rest, restCount);
			break;
		}
		case 2: {
			(new RestDelete()).delete(rest);
			break;
		}
		case 3: {
			(new RestSelect()).select(rest);
			break;
		}
		case 4: {
			(new RestUpdate()).update(rest);
			break;
		}
		case 5: {
			(new RestPrint()).print(rest);
			break;
		}
		case 6: {
			(new RestSave()).save(rest, "restaurant");
			break;
		}
		case 7: {
			System.exit(0);
			break;
		}
		}
	}
}
