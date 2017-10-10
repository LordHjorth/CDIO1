package spil;

import desktop_resources.GUI;

public class Terningespil {

	public static void main(String[] args) {

		Terning terning = new Terning(0, 0);


		
		for (int i = 0; i < 40; i++) {
			terning.random();
			GUI.getUserButtonPressed("Tryk på 'KAST' for at kaste med terningerne", "KAST");
			GUI.setDice(terning.getTerning1(), terning.getTerning2());

		}

	}

}
