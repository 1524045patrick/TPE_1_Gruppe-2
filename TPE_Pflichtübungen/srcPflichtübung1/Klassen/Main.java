package Klassen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Betrag m = new Betrag(0.0, "Bla");
		System.out.println(m.getVorzeichen());
		m.addiere(235, 15);
		Betrag n = new Betrag(1000, "Euro");
		System.out.println(n.prozent(18.5));
		System.out.println(n.promille(18.5));
	}

}
