package bahnsimulation;

public class Zug {
	private String name;
	private double geschwindigkeit;
	private String regEx = "[A-Za-z������]{1}";
	private int counter = 0;

	public Zug(String name, double geschwindigkeit) throws InvalidSignException {
		if (name.matches(regEx)) {
			this.name = name;
		} else
			throw new InvalidSignException("Zugnamen d�rfen nur aus einem Buchstaben bestehen.");
		if (geschwindigkeit < 0)
			geschwindigkeit = geschwindigkeit * (-1);
		if (geschwindigkeit == 0)
			throw new InvalidSignException("Z�ge brauchen Motoren");
		this.geschwindigkeit = geschwindigkeit;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public String getName() {
		return name;
	}

	public class InvalidSignException extends Throwable {
		public InvalidSignException(String s) {
		}
	}

}