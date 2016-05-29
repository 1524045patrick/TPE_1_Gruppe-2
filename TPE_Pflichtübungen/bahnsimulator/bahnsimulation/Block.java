package bahnsimulation;

public class Block {
	private boolean lock; // TODO wird benötigt für die Flags
	private int start;
	private int end;
	private int laenge;

	/**
	 * @param start
	 *            gibt den Startpunkt an
	 * @param laenge
	 *            gibt die Laenge des Blockes an das Ende des Blockes entspricht
	 *            dem start + laenge - 1
	 */
	public Block(int start, int laenge) {
		this.start = start;
		this.end = start + laenge - 1;
		this.laenge = laenge;
	}

	/**
	 * @return gibt den Zustand von dem boolean lock zurueck, notwendig fuer die
	 *         synchronisation
	 */
	public boolean isLock() {
		return lock;
	}

	public int getLaenge() {
		return laenge;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

}