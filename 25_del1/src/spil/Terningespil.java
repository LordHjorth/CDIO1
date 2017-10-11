
package spil;

import spil.Terning;

import java.awt.Color;

import javax.swing.*;

import desktop_board.*;

import desktop_codebehind.Car;
import desktop_fields.*;
import desktop_resources.GUI;

//import java.util.*;
//import java.lang.*;

public class Terningespil {

    public static void main(String[] args) {
    	
    	
    	
    	Field[] fields=new Field[1];
    	fields[0]=new Empty.Builder().build();	
    	GUI.create(fields);
    	
    	Terning terning = new Terning(0, 0);
        String spiller1,spiller2;
        spiller1=JOptionPane.showInputDialog("Indtast navn, Spiller 1");
        spiller2=JOptionPane.showInputDialog("Indtast navn, Spiller 2");
        Car car1=new Car.Builder().primaryColor(Color.GREEN).secondaryColor(Color.GREEN).typeTractor().patternCheckered().build();
        Car car2=new Car.Builder().primaryColor(Color.GREEN).secondaryColor(Color.GREEN).typeUfo().patternCheckered().build();
        GUI.addPlayer(spiller1, 0,car1);
        GUI.addPlayer(spiller2, 0,car2);
        
        GUI.removeCar(1,spiller1);
        GUI.removeCar(1,spiller2);
        
       
        
        int runde = 1;

        do {
        	
        	 
        	 
            if (runde % 2 == 0) { //Hvis runde modulus 2 er lig 0, så er det spiller 2s tur, 
            	GUI.getUserButtonPressed("Din tur "+ spiller2+ " - tryk på knappen for at kaste terningerne", "Kast terningerne");
                terning.random(); // kaster terningerne
                GUI.setDice(terning.getTerning1(), terning.getTerning2());
                
                GUI.setBalance(spiller2, terning.setPoint2(terning.getSum()));
                
                

            }

            if (runde % 2 != 0) {

                GUI.getUserButtonPressed("Din tur " + spiller1+ " - tryk på knappen for at kaste terningerne", "Kast terningerne");
                terning.random(); // kaster terningerne
                GUI.setDice(terning.getTerning1(), terning.getTerning2());

                
                GUI.setBalance(spiller1, terning.setPoint1(terning.getSum()));
                
                
            } else {
            	
            }
            runde++;
            
        } while ((terning.getPoint1() < 40) && (terning.getPoint2() < 40));

        if (terning.getPoint1() > terning.getPoint2()) {
            GUI.showMessage("TILLYKKE TIL "+spiller1.toUpperCase());
          
            Board.destroy();

        
        if (terning.getPoint2() > terning.getPoint1()) {
        	GUI.showMessage("TILLYKKE TIL "+spiller2.toUpperCase());
        	Board.destroy();

        }
        
    }

}}
