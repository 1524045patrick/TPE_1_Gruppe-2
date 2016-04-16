package CrypterPackage;

public class CrypterFactory {
	
	public static CrypterSubstitution creatSUB(String key){
		return new CrypterSubstitution(key);
	}
	
	public static CrypterXOR creatXOR(){
		return new CrypterXOR();
	}
	
	public static CrypterCaesar creatCEA(String key){
		return new CrypterCaesar(key);
	}


}
