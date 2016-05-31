package bahnsimulation;

public class Strecke {

	char[] strecke;
	String ausgabeString = "";
	Block[] blockStrecke;

	Strecke(int kilometer) {
		strecke = new char[kilometer];
		blockStrecke = new Block[kilometer];

	}

	public void addBlock(Block block) {
		blockStrecke[block.anfangBlock - 1] = block;
		strecke[block.anfangBlock - 1] = '|';
	}

	public String toString() {
		return ausgabeString;
	}

	public void streckeSetzen() {
		for (int i = 0; i < strecke.length; i++) {
			if (!strecke.equals('|')) {
				ausgabeString += "-";
			} else {
				ausgabeString += "|";
			}
		}

	}

}
