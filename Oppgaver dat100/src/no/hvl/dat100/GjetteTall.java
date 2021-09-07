package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class GjetteTall {

	public static void main(String[] args) {
		
		final int NEDRE = 0;
		final int OVRE = 100;
		boolean rettGjetta = false;
		
		String melding = "Tenk på et tall i området " + NEDRE + "-" + OVRE + ".";
		showMessageDialog(null, melding);
		
		int lav = NEDRE;
		int hoy = OVRE;
		int tall = NEDRE-1;
		
		do {
			tall = (lav + hoy) / 2;
			melding = "Tenkte du på " + tall + "? Skriv 0 for ja, -1 hvis for høyt, 1 hvis for lavt.";
			int svar = Integer.parseInt(showInputDialog(melding));
			rettGjetta = (svar == 0);
			
			if (!rettGjetta) {
				if (svar == -1) {
					hoy = tall - 1;
				} else {
					lav = tall + 1;
				}
			}
			
		} while (!rettGjetta);
		showMessageDialog(null, "Nice!");
	}

}
