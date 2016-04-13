package CrypterPackage;

import java.util.HashSet;
import java.util.Set;

public class CrypterSubstitution implements Crypter {
	
    /**
     * Konstruktor der Klasse
     */
    CrypterSubstitution() {
        super();
    }

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}
	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		// TODO Auto-generated method stub
		return 0;
	}

	//TODO sollte Override sein aber hat keinen sinn und char?
	public String verschluesseln(String key, String message) throws CrypterException {
		// TODO Auto-generated method stub
	       checkKey(key);
	        checkMessage(message);

	        char[] keyArray = key.toCharArray();
	        char[] messageArray = message.toCharArray();
	        char[] verschluesseltesArray = new char[message.length()];

	        for (int i = 0; i < verschluesseltesArray.length; i++) {
	            verschluesseltesArray[i] = keyArray[messageArray[i] - 'A'];
	        }

	        return new String(verschluesseltesArray);
	}

	
    /**
     * Methode, die eine Nachricht im Sinne des Substitutions-Schiffre entschl�sselt
     */
	//TODO sollte @Override sein 
    public String entschluesseln(String key, String cypherText) throws CrypterException {
        checkKey(key);
        checkMessage(cypherText);

        char[] cypherTextArray = cypherText.toCharArray();
        char[] entschluesseltesArray = new char[cypherText.length()];
        // indexOf --> String
        for (int i = 0; i < entschluesseltesArray.length; i++) {
            entschluesseltesArray[i] = (char) (key.indexOf(cypherTextArray[i]) + 'A');
        }

        return new String(entschluesseltesArray);
    }


    
    /**
     * Methode, die eine Nachricht auf ihre G�ltigkeit im Sinne des Substitutions-Schiffre pr�ft
     * 
     * @param message
     *            Nachricht, die gepr�ft werden soll
     * @throws IllegalMessageException
     *             wird geworfen, wenn die Nachricht die Bedingungen nicht erf�llt
     */
    private void checkMessage(String message) throws CrypterException {

        if (message != null) {
            if (message.matches("[A-Z]+") == false) {
                throw new CrypterException("Keine g�ltige Nachricht! Nachricht darf nur Gro�buchstaben enthalten!");
            }
        } else
            throw new CrypterException("Keine g�ltige Nachricht! Nachricht darf nicht null sein!");
    }
	
	
    /**
     * Methode, die einen key auf seine G�ltigkeit im Sinne des Substitutions-Schiffre pr�ft
     * 
     * @param key
     *            String, der gepr�ft werden soll
     * @throws IllegalKeyException
     *             wird geworfen, wenn der key die Bedingungen nicht erf�llt
     */
    private void checkKey(String key) throws CrypterException {
        if (key != null) {
            if (key.length() != 26) {
                throw new CrypterException("Kein g�ltiger Schl�ssel! Schl�ssel muss 26 Zeichen haben!");
            } else if (hasUniqueCharacters(key) == false) {
                throw new CrypterException("Kein g�ltiger Schl�ssel! Schl�ssel darf jeden Buchstaben nur einmal enthalten!");
            } else if (key.matches("[A-Z]+") == false) {
                throw new CrypterException("Kein g�ltiger Schl�ssel! Schl�ssel darf nur Gro�buchstaben enthalten!");
            }
        } else
            throw new CrypterException("Kein g�ltiger Schl�ssel! Schl�ssel darf nicht null sein!");
    }
    
    
    /**
     * Methode, die pr�ft, ob ein Buchstabe in einem Arary nur einmal vorkommt
     * 
     * @param string
     *            entspricht �bergebenem key von checkKey()
     * @return gibt false zur�ck, wenn der Buchstabe schoneinmal hinzugef�gt wurde, d.h. er doppelt vorhaben ist
     */
    public static boolean hasUniqueCharacters(final String string) {
        // Ein HashSet speicher jeden Character (Buchstabe) nur einmal
        Set<Character> set = new HashSet<>();

        for (char c : string.toCharArray()) {
            // F�gt den Character dem Set hinzu, wenn Buchstabe schon vorhanden ist, also schon einmal hinzugef�gt wurde, wird false von der add Methode geliefert.
            if (set.add(c) == false) {
                return false;
            }
        }
        return true;
    }
    
    /*
     * char[][] substitution = {{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},
							 {'U','F','L','P','W','D','R','A','S','J','M','C','O','N','Q','Y','B','V','T','E','X','H','Z','K','G','I'}};

	public char verschluesseln(char klarTextZeichen) {
		for(int i=0;i<substitution.length;i++){
			if(substitution[i][0]==klarTextZeichen){
				char rueckgabe;
				rueckgabe =substitution[1][i];
				return rueckgabe;
			}
		}
		return 'F';
	}

	public char entschluesseln(char crypterTextZeichen){
		for(int i=0;i<substitution[1].length;i++){
			if(substitution[1][i]==crypterTextZeichen){
				char rueckgabe;
				rueckgabe =substitution[0][i];
				return rueckgabe;
			}
		}
		return 'F';
	}

	*/
}
