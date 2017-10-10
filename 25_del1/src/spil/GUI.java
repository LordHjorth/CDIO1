package spil;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI {

	JPanel p = new JPanel(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	Terning terning = new Terning(1, 1);
	

	private JFrame f; // opretter vinduet for spillet
	private JButton kast, reset, exit; // opretter knappen for at spille
	private ImageIcon imageIcon1, imageIcon2;
	private JLabel l, l1, spiller1, spiller2, udskrivPoint1, udskrivPoint2;
	private JLabel imageLabel1, imageLabel2;
	// l viser værdien for af hver af de to terninger.
	// li viser summen af de to terninger.
	// spiller1 viser navnet på spiller 1.
	// spiller2 viser navnet på spiller 2.
	// udskrivPoint1 udskriver point for spiller1.
	// udskrivPoint2 udskriver point for spiller2.

	private String navn1, navn2; // Holder på navnene for de to spillere

	private int runde = 1; // viser hvis tur det er.

	public void frame() {
		
		f = new JFrame("Terningespil");
		f.setVisible(true);
		f.setSize(900, 500);
		f.getBackground();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

		p.setBackground(new Color(1,50,32));
		kast = new JButton("KAST MED MIG");
		kast.setBackground(Color.white);
		kast.setOpaque(true);
		reset = new JButton("Reset");
		reset.setBackground(new Color(99,183,108));
		reset.setOpaque(true);
		exit = new JButton("Luk programmet");
		exit.setBackground(new Color(196,30,58));
		exit.setVisible(false);
		exit.setOpaque(true);
		reset.setVisible(false);
		l = new JLabel("Kom så - tryk på knappen :-)");
		l1 = new JLabel("Eller tør du ikke?");
		spiller1 = new JLabel(navn1);
		spiller2 = new JLabel(navn2);
		udskrivPoint1 = new JLabel("0");
		udskrivPoint2 = new JLabel("0");
		imageIcon1 = new ImageIcon("");
		imageIcon2 = new ImageIcon("");
		imageLabel1 = new JLabel(imageIcon1, JLabel.CENTER);
		imageLabel2 = new JLabel(imageIcon2, JLabel.CENTER);
		
		
		
		//Sætter placering af objekterne
		c.gridx = 2;
		c.gridy = 1;
		p.add(kast, c);// placering af knappen
		c.gridx = -1;
		c.gridy = 1;
		p.add(reset, c);// placering af knappen
		c.gridx = 1;
		c.gridy = 1;
		p.add(exit, c);// placering af knappen
		c.gridx = 2;
		c.gridy = 10;
		p.add(imageLabel1, c); // placering af værdien af de to terninger
		c.gridx = 2;
		c.gridy = 12;
		p.add(imageLabel2, c); // placeringen af summen
		c.gridx = 1;
		c.gridy = 1;
		p.add(spiller1, c); // placering af spiller1's navn
		c.gridx = 3;
		c.gridy = 1;
		p.add(spiller2, c); // placering af spiller2's navn
		c.gridx = 1;
		c.gridy = 5;
		p.add(udskrivPoint1, c); // placering af spiller1's navn
		c.gridx = 3;
		c.gridy = 5;
		p.add(udskrivPoint2, c); // placering af spiller2's navn

		f.add(p);
		

		JButton exit = new JButton("Afslut");

		exit.setBounds(50, 375, 260, 50);

	}


	public void exit() {
		exit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				exit.setVisible(false);
				exit.setVisible(false);
				System.exit(0);
			}
		});
	}

	public void reset() {
		reset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				l.setText("Kom så - tryk på knappen :-)");
				l1.setText("Eller tør du ikke?");
				udskrivPoint1.setText("0");
				udskrivPoint2.setText("0");
				runde = 1;
				terning.nulstilPoint1();
				terning.nulstilPoint2();
				kast.setVisible(true);
				l.setVisible(true);
				l1.setVisible(true);
				spiller1.setVisible(true);
				spiller2.setVisible(true);
				udskrivPoint1.setVisible(true);
				udskrivPoint2.setVisible(true);
				reset.setVisible(false);
				exit.setVisible(false);
			}

		});
	}

	public void kastTerninger() {

		kast.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				terning.random();
				
				imageIcon1 = new ImageIcon("die" + terning.getTerning2()+ ".png");
				imageIcon2 = new ImageIcon("die" + terning.getTerning1()+ ".png");
				imageLabel1 = new JLabel(imageIcon1);
				imageLabel2 = new JLabel(imageIcon2);
				p.add(imageLabel1);
				p.add(imageLabel2);
				f.add(p);
				imageLabel1.setVisible(false);
				imageLabel2.setVisible(false);
				
				if (runde % 2 == 0) {
					terning.setPoint2(terning.getSum());
					Point2();
				} else if (runde % 2 != 0) {
					terning.setPoint1(terning.getSum());
					Point1();
				}
				l.setText(terning.getTerning2() + " og " + terning.getTerning1());
				l1.setText("Summen er " + terning.getSum());

				if (terning.getPoint1() > terning.getPoint2() && terning.getPoint1() >= 40) {
					JOptionPane.showMessageDialog(null, "TIllykke til " + navn1);
					kast.setVisible(false);
					l.setVisible(false);
					l1.setVisible(false);
					spiller1.setVisible(false);
					spiller2.setVisible(false);
					udskrivPoint1.setVisible(false);
					udskrivPoint2.setVisible(false);
					reset.setVisible(true);
					exit.setVisible(true);

					imageLabel1.setVisible(false);
					imageLabel2.setVisible(false);

				}
				if (terning.getPoint2() > terning.getPoint1() && terning.getPoint2() >= 40) {
					JOptionPane.showMessageDialog(null, "TIllykke til " + navn2);
					kast.setVisible(false);
					l.setVisible(false);
					l1.setVisible(false);
					spiller1.setVisible(false);
					spiller2.setVisible(false);
					udskrivPoint1.setVisible(false);
					udskrivPoint2.setVisible(false);
					reset.setVisible(true);
					exit.setVisible(true);

					imageLabel1.setVisible(false);
					imageLabel2.setVisible(false);
				}
				runde++;
			}

		});
	}

	public String Navn1() { // sætter navnet på spiller 1

		navn1 = JOptionPane.showInputDialog(null, "Indtast dit navn", "Terningespil", JOptionPane.PLAIN_MESSAGE);
		return navn1;

	}

	public String Navn2() { // sætter navnet på spiller 2
		
		navn2 = JOptionPane.showInputDialog(null, "Indtast dit navn", "Terningespil", JOptionPane.PLAIN_MESSAGE);
		return navn2;
	}

	public void Point1() { // udskriver point for spiller 1 i label udskrivPoint1
		udskrivPoint1.setText(Integer.toString(terning.getPoint1()));
	}

	public void Point2() { // udskriver point for spiller 2 i label udskrivPoint2
		udskrivPoint2.setText(Integer.toString(terning.getPoint2()));
	}

	public void exit(Object exit) {
		System.exit(0);
	}
	
}
