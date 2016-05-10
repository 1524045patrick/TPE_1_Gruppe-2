package mitgliederVerwaltung;

@SuppressWarnings("serial")
public class InvalidSignException extends Throwable {
	
	public InvalidSignException() {
        super();
    }

    public InvalidSignException(final String arg0) {
        super(arg0);
    }

    public InvalidSignException(final Throwable arg0) {
        super(arg0);
    }
}
