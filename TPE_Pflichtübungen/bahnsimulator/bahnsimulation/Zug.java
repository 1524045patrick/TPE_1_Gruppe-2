package bahnsimulation;


public class Zug implements Runnable {

	int anfangsPosition;
	int aktuellePosition;
	int geschwindigkeit;
	char name;
	Strecke strecke;

	public Zug(int anfangsPosition, int geschwindigkeit, char name, Strecke strecke) {
		this.anfangsPosition = anfangsPosition;
		this.geschwindigkeit = geschwindigkeit;
		this.name = name;
		this.strecke = strecke;

	}
	
	public void setzeZug(){
		
	}

	@Override
	public void run() {

	}

}
