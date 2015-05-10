package declaration;

enum Cards {
	CLUB, SPADE, DIAMOND, HEARTS
};

public class DisplayEnumValuesTest {

	public static void main(String[] args) {
		for(Cards card: Cards.values()){
			System.out.println(card);
		}
	}
}
