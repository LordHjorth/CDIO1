package spil;

import java.util.Random;

import javax.swing.JOptionPane;

import desktop_resources.GUI;


public class Terning {

	Random random = new Random(); 

	private int terning1, terning2;
	private int sum;
	private int point1, point2;
	String navn1, navn2;

	public Terning(int terning1, int terning2) {//Konstruktøren
		this.terning1 = terning1;
		this.terning2 = terning2;
	}
	
	public void random() { //sætter tilfældige værdier af terningerne fra 1-6.
		terning1 = random.nextInt(6) + 1;
		terning2 = random.nextInt(6) + 1;
	}
	
	public int getSum() { //sætter og returnerer summen af de to terninger
		sum = terning1 + terning2;
		return sum;
	}

	public int getTerning1() { //returnerer værdien af første terning
		return terning1;
	}

	public int getTerning2() { //returnerer værdien af anden terning
		return terning2;
	}

	public int setPoint1(int nyePoint) { //Bruges til at sætte pointene for spiller 1. Deraf Point1. Returnerer de nye point
		return point1 = point1 + nyePoint;
	}

	public int getPoint1() { //returnerer værdien værdien for spiller1's point
		return point1;
	}

	public void nulstilPoint1() { //nulstiller pointene for spiller 1.
		point1 = 0;
	}
	
	public int setPoint2(int nyePoint) { //Bruges til at sætte pointene for spiller 2. Deraf Point2. Returnerer de nye point
		return point2 = point2 + nyePoint;
	}

	public int getPoint2() { //returnerer værdien værdien for spiller2's point
		return point2;
	}

	public void nulstilPoint2() { //nulstiller pointene for spiller 2.
		point2 = 0;
	}
	
	public String getSpiller1() { //Finder og returnerer navnet for spiller1 vha. JOptionPane.showInputDialog.
		navn1 = JOptionPane.showInputDialog("Indtast navn, Spiller 1");
		return navn1;
	}
	
	public String getSpiller2() { //Finder og returnerer navnet for spiller2 vha. JOptionPane.showInputDialog.
		navn2 = JOptionPane.showInputDialog("Indtast navn, Spiller 2");
		return navn2;
	}
	public void Vinder() { //Kårer vinderen
		if (getPoint1() > getPoint2()) {
			GUI.getUserButtonPressed("TILLYKKE TIL " + navn1.toUpperCase() + " MED SEJEREN", "TAK");

		}
		if (getPoint2() > getPoint1()) {
			GUI.getUserButtonPressed("TILLYKKE TIL " + navn2.toUpperCase() + " MED SEJEREN", "TAK");

		}
	}

	
}
