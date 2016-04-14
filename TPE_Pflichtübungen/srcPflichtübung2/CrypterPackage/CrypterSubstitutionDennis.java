package CrypterPackage;



public class CrypterSubstitutionDennis implements Crypter {
	char[] substitution ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	String rueckgabeString="";
	public final int ALPHABETLEANGE=26;
	
	char[] keyCharArray;
	char[] messageCharArray;
	
	
	//TODO Alle Exceptions
	CrypterSubstitution(String uebergabeKey){
		try{
			Key keySub = new Key(uebergabeKey);
			keyCharArray=keySub.key.toUpperCase().toCharArray();
			if(keyCharArray.length==ALPHABETLEANGE){
				try{
					for(int i= 0; i<ALPHABETLEANGE;i++){
						int j = (int)keyCharArray[i];
						if(j>= 65 && j<=90){
							
						}
					}
				}
				finally{
					
				}
			}
		}
		finally{
			
		}
		
		
		
		
	}
	/**
	 * @author Dennis Szczerbinski
	 * @param message Ist die zu verschluesselnde Nachricht.
	 * @return Gibt die verschluesselte Nachricht zurueck.
	 */
	public String encrypt(String message)throws CrypterException{
		try{
			messageCharArray=message.toCharArray(); 		//Umwandlung der messag in ein Char-Array
			for(int i = 0; i < messageCharArray.length;i++){	//Jeder einzelne Char wird der Methode
				char z = verschluesseln(messageCharArray[i]);	//uebergeben und der Rueckgabewert auf
				rueckgabeString+=z;								//den leeren String geschrieben.							
			}
			return rueckgabeString;		
		}finally{											//Nach Beendigung der verschluesselung
			reset();										//wird der rueckgabeString resetet.
		}	
	}
	
	
	/**
	 * @author Dennis Szczerbinski
	 * @param message Ist die zu entschluesselnde Nachricht
	 * @return Gibt die entschluesselte Nachricht zurueck.
	 */
	public String decrypt(String message) throws CrypterException{
		try{
			messageCharArray=message.toCharArray();
			for(int i = 0; i<messageCharArray.length;i++){
				char z = entschluesseln(messageCharArray[i]);
				rueckgabeString+=z;
			}
				
			return rueckgabeString;
		}
		finally{
			reset();
		}
	}
	
	/**
	 * @author Dennis Szczerbinski
	 * 
	 * @Funktion Setzt den RueckgabeString zurueck. Dies ist noetig, da sonst bei neuer
	 * ver-/entschluesselung das neue Wort an das alte gehaengt wird.
	 */
	
	@Override
	public void reset() {
		rueckgabeString="";
		
	}
	
	/**
	 * @author Dennis Szczerbinski
	 * @return Liefert das verschluesselte Zeichen zurueck
	 */
	@Override
	public char verschluesseln(char klarTextZeichen) throws CrypterException {
		for(int i=0;i<ALPHABETLEANGE;i++){
				if(klarTextZeichen==substitution[i]){
					char rueckgabe;
					rueckgabe =keyCharArray[i];
					return rueckgabe;
			}
		}
		return ' ';
	}
	
	
	/**
	 * @author Dennis Szczerbinski
	 * @return Gibt das entschluesselte Zeichen zurueck.
	 */
	@Override
	public char entschluesseln(char crypterTextZeichen) throws CrypterException{
		for(int i=0;i<ALPHABETLEANGE;i++){
				if(crypterTextZeichen==keyCharArray[i]){
					char rueckgabe;
					rueckgabe =substitution[i];
					return rueckgabe;
				}
			
			}
		
		return ' ';
	}


}
