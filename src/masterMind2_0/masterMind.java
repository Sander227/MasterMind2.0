
package masterMind2_0;

import java.util.*;

public class masterMind {
	
	// Set as constant
	private static final String GOED_ANTWOORD = "zwart ";
	private static final String FOUT_ANTWOORD = "- ";
	private static final String VERKEERDE_PLEK = "Wit ";

	public static void main(String[] args) {

		Random random = new Random();

		String[] kleuren = { "rood", "oranje", "geel", "groen", "blauw", "paars" };

		String[] codes = new String[4];
		for (int x = 0; x < codes.length; x++) {
			codes[x] = kleuren[random.nextInt(kleuren.length)];
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Welkom bij MasterMind");
		System.out.println("Je hebt 10 kansen om de code te kraken");
		System.out.println("Er zijn 6 kleuren waar je uit kan kiezen: rood, oranje, geel, groen, blauw en paars");
		System.out.println("Na elke keer dat je geraden hebt krijg je een hint: Zwart = goed, Wit = Wel in de code maar verkeerde plek, - = niet erin");
		System.out.println("Typ je code van 4 kleuren in in:");
		int teller = 1;
		int ronde = 0;
		while (ronde < 10) {

			System.out.println("\nGok " + teller);
			String[] pogingen = new String[4];
			for (int x = 0; x < pogingen.length; x++) {
				pogingen[x] = sc.next();
			}

			String feedback = "";
			
			for (int y = 0; y < pogingen.length; y++) {
				feedback = FOUT_ANTWOORD;
				if (pogingen[y].equals(codes[y])) {
					feedback = GOED_ANTWOORD;
				} else {
					for (int z = 0; z < pogingen.length; z++) {
						if (pogingen[y].equals(codes[z])) {

							feedback = VERKEERDE_PLEK;
						}
					}
				}
				System.out.print(feedback + " ");
			}
			
			ronde++;
			teller++;
			
			if (pogingen[0].equals(codes[0]) && pogingen[1].equals(codes[1]) && pogingen[2].equals(codes[2])
					&& pogingen[3].equals(codes[3])) {

				System.out.println("\nJe hebt gewonnen geluksbal, volgende keer verlies je");
				break;
			}
			if (ronde == 10) {
				System.out.println("\nIk wist wel dat je ging verliezen, volgende keer beter.");
			}
		}
		sc.close();
		//
	}
}