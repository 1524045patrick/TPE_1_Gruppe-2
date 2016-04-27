package CrypterPackage;

public class CrypterException extends Throwable{
	
    /**
     * @author Patrick Hentschel, 1524045
     * verschiedene Konstruktoren fuer die jeweiligen Fehlermeldungen
     */

	public CrypterException() {
        super();
    }

    public CrypterException(final String arg0) {
        super(arg0);
    }

    public CrypterException(final Throwable arg0) {
        super(arg0);
    }

    public CrypterException(final String arg0, final Throwable arg1) {
       super(arg0, arg1);
    }

}
