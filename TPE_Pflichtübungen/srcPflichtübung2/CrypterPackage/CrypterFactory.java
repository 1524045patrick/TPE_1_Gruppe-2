package CrypterPackage;

public class CrypterFactory {
	
	public static CrypterSubstitution creatSUB(String key){
		return new CrypterSubstitution(key);
	}
	
	public static CrypterXOR creatXOR(){
		return new CrypterXOR();
	}
	
	public static CrypterCeasar creatCEA(String key){
		return new CrypterCeasar(key);
	}


}
