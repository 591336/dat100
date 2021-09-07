package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Heltall {

	private static int fakultet(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * fakultet(n - 1));
		}
	}

	public static void main(String[] args) {

		int fak = 1;

		String numbers = showInputDialog("Heltall:");
		int number = Integer.parseInt(numbers);

		fak = fakultet(number);
		showMessageDialog(null, "Fakultetet av " + number + " er: " + fak);
		System.out.println("Fakultetet av " + number + " er: " + fak);

	}
}
