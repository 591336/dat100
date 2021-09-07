package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakterskala {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {

		String karTxt = showInputDialog("Poengsum: ");

		int tallKarakter = Integer.parseInt(karTxt);
		
		if (tallKarakter <0 || tallKarakter > 100) {
			showMessageDialog(null, "Error");
			showInputDialog("Prøv igjen");
			Integer.parseInt(karTxt);
		} else if (tallKarakter >= 0 && tallKarakter < 39) {
			showMessageDialog(null, "F");
		} else if (tallKarakter < 49) {
			showMessageDialog(null, "E");
		} else if (tallKarakter < 59) {
			showMessageDialog(null, "D");
		} else if (tallKarakter < 79) {
			showMessageDialog(null, "C");
		} else if (tallKarakter < 89) {
			showMessageDialog(null, "B");
		} else {
			showMessageDialog(null, "A");
		} 
		

	}
	}	

}
