package flowcontrol.exception.assertion;

public class SwitchExample {

	public static void main(String[] args) {
		String[] cards = { "Club", "spade", " diamond ", "hearts" };
		for (String card : cards) {
			switch (card) {
			case "Club":
				System.out.print(" club ");
				break;
			case "Spade":
				System.out.print(" spade ");
				break;
			case "diamond":
				System.out.print(" diamond ");
				break;
			case "heart":
				System.out.print(" heart ");
				break;
			default:
				System.out.print(" none ");
			}
		}
	}
}
