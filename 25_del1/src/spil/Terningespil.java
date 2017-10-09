package spil;

public class Terningespil {

	public static void main(String[] args) {

		GUI gui = new GUI();


		gui.Navn1(); // sætter navne ind
		gui.Navn2();
		
		gui.frame(); // Oprette GUI'en
		
		gui.kastTerninger();
		gui.reset();
		//gui.exit();


		
	}

}
