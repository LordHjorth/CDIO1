
package spil;

import spil.Terning;

import java.awt.Color;

import desktop_fields.*;
import desktop_resources.GUI;

//import java.util.*;
//import java.lang.*;

public class Terningespil {

	public static void main(String[] args) {

		Terning terning = new Terning(0, 0);

		String spiller1, spiller2;
		spiller1 = terning.getSpiller1(); //henter spiller1 
		spiller2 = terning.getSpiller2(); //henter spiller2

		Field[] fields = new Field[7]; //Sætter felterne på spillepladen op.

		fields[0] = new Empty.Builder().build();
		fields[1] = new Empty.Builder().build();
		fields[2] = new Empty.Builder().build();
		fields[3] = new Empty.Builder().build();
		fields[4] = new Street.Builder().setBgColor(Color.blue).setDescription(spiller1 + "'s point").setTitle(spiller1).setSubText("0").build(); 
		// spiller 1's felt
		fields[5] = new Street.Builder().setBgColor(Color.green).setTitle("Summen").setSubText("0").build(); 
		fields[6] = new Street.Builder().setBgColor(Color.red).setDescription(spiller2 + "'s point").setTitle(spiller2).setSubText("0").build(); 
		// Spiller 2's felt

		GUI.create(fields); // Opretter ovenstående 7 felter for at spiller 1 og 2 kan blive centreret i hhv 4 og 6.
		
		

		while (true) {

			int runde = 1; //spiller starter ved runde = 1, derfor starter spiller 1.

			while ((terning.getPoint1() < 40) && (terning.getPoint2() < 40)) { // kører indtil ind af spillerne har 40 point

				if (runde % 2 != 0) { // Hvis det er en ulige runde, er det spiller 1's tur. 2 går derfor ikke op i antallet af runder
					GUI.getUserButtonPressed("Din tur " + spiller1, "Kast terningerne");
					terning.random(); // kaster terningerne
					GUI.setDice(terning.getTerning1(), terning.getTerning2());// Sætter GUI'ens terningerne til at vise værdierne
					terning.setPoint1(terning.getSum()); // Overfører pointene for nuværende runde til samlede point
					fields[4].setSubText(Integer.toString(terning.getPoint1())); // Indsætter pointene i feltet for spiller 2
					fields[4].displayOnCenter(); // Fremhæver spiller 1's field i midten af skærmen. I GUI's 'center'.
				}

				if (runde % 2 == 0) { // Hvis runde modulus 2 er lig 0, så er det spiller 2s tur,
					GUI.getUserButtonPressed("Din tur " + spiller2, "Kast terningerne");
					terning.random(); // kaster terningerne
					GUI.setDice(terning.getTerning1(), terning.getTerning2()); // Sætter GUI'ens terningerne til at vise værdierne
					terning.setPoint2(terning.getSum()); // Overfører pointene for nuværende runde til samlede point
					fields[6].setSubText(Integer.toString(terning.getPoint2())); // Indsætter pointene i feltet for spiller 2
					fields[6].displayOnCenter(); // Fremhæver spiller 1's field i midten af skærmen. I GUI's 'center'.
					
				}

				fields[5].setSubText(Integer.toString(terning.getSum())); //printer summen er det nyeste slag
				runde++; //inkrementerer intergeren 'runde' for at give turen videre til næste spiller

			}
			
			if (terning.getPoint1() > terning.getPoint2()) {
				GUI.getUserButtonPressed("TILLYKKE TIL " + spiller1.toUpperCase() + " MED SEJEREN", "Prøv igen?");
				terning.nulstilPoint1(); // nulstiller point for at starte forfra.
				terning.nulstilPoint2(); // nulstiller point for at starte forfra.
				fields[4].setSubText("0"); //sætter de samlede point (skrevet i subtext) til 0, da spillet startes forfra
				fields[6].setSubText("0"); //sætter de samlede point (skrevet i subtext) til 0, da spillet startes forfra
			}
			if (terning.getPoint2() > terning.getPoint1()) {
				GUI.getUserButtonPressed("TILLYKKE TIL " + spiller2.toUpperCase() + " MED SEJEREN", "Prøv igen?");
				terning.nulstilPoint1(); // nulstiller point for at starte forfra.
				terning.nulstilPoint2(); // nulstiller point for at starte forfra.
				fields[4].setSubText("0"); //sætter de samlede point (skrevet i subtext) til 0, da spillet startes forfra
				fields[6].setSubText("0"); //sætter de samlede point (skrevet i subtext) til 0, da spillet startes forfra
			}
 
		}
	}

}
