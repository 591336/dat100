package no.hvl.dat100;


public class Tallgjetter {

	public static void main(String[] args) {
		final int NEDRE = 0;
		final int OVRE = 1000;
		
		int hemmelig = 43;
		int nedre = NEDRE;
		int ovre = OVRE;
		
		int gjetta = 0;
				
		do {
			gjetta = (nedre + ovre) / 2;
			System.out.println("Gjetter: " + gjetta);
			if(gjetta > hemmelig) {
				ovre = gjetta;
			}
				else if (gjetta < hemmelig) {
					nedre = gjetta;
				}
			}
		 while (gjetta != hemmelig); 
					
	}

}
