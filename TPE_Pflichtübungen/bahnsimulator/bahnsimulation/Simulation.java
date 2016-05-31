package bahnsimulation;



import java.util.Arrays;

public class Simulation {

	public static void main(String[] args) {
		
		Strecke a = new Strecke(10);
		Block z = new Block(3);
		Block x = new Block(7);
		
		a.addBlock(z);
		a.addBlock(x);
		
		a.streckeSetzen();
		
		
		System.out.println(a.toString());
		

		

		
	}

}
