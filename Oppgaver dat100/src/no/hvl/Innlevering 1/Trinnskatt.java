package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {
		
		
		String bruttoLonn = showInputDialog("Din bruttolønn:");
		int lonn = Integer.parseInt(bruttoLonn);
		
		double trinn0 = 0;
		double trinn1 = 0.093;
		double trinn2 = 0.241;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;
		
		
		if (lonn > 0 && lonn <164100) {
			showMessageDialog(null, "Ditt skattetrinn er " + lonn * trinn0);
		} 
		else if (lonn > 164101 && lonn < 230950) {
			showMessageDialog(null, "Ditt skattetrinn er " + lonn * trinn1);
		}
		
		else if (lonn > 230951 && lonn > 580650) {
		    showMessageDialog(null, "Ditt skattetrinn er " + lonn * trinn2);
		}
		
		else if (lonn > 580651 && lonn < 934050) {
		    showMessageDialog(null, "Ditt skattetrinn er " + lonn * trinn3);
		} 
		
		else {
		    showMessageDialog(null, "Ditt skattetrinn er " + lonn * trinn4);
		}
	 }

}
