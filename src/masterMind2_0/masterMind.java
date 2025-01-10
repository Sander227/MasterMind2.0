
package masterMind2_0;

import java.util.*;

public class masterMind {

	public static void main(String[] args) {
		MastermindFunctions mm = new MastermindFunctions();

		Scanner sc = new Scanner(System.in);
		System.out.println("Welkom bij MasterMind");
		System.out.println("Je hebt 10 kansen om de code te kraken");
		System.out.println("Er zijn 6 kleuren waar je uit kan kiezen: rood, oranje, geel, groen, blauw en paars");
		System.out.println("Na elke keer dat je geraden hebt krijg je een hint: Zwart = goed, Wit = Wel in de code maar verkeerde plek, - = niet erin \n");

		boolean optie = false;
		while (!optie) {
			System.out.println("1 = willekeurige code");
			System.out.println("2 = zelf een code aanmaken");

			try {
				int keuze = sc.nextInt();
				if (keuze == 1 || keuze == 2) {
					switch (keuze) {
					case 1:
						mm.kleurenGeneratie();
						System.out.println("De willekeurige code is aangemaakt, u kunt nu het spel spelen");
						optie = true;
						break;

					case 2:
						System.out.println("Typ hier 4 kleuren in zodat de code aangemaakt kan worden");
						mm.kleurenAanmaken();
						optie = true;
						break;
					}
				}
				else {
					System.out.println("\nOngeldige keuze. Kies uit 1 of 2");
				}
			} 
			catch (Exception ex) {
				System.out.println("\nFout, voer een getal in:");
				sc.nextLine();
			}	

		}

		System.out.println("\nTyp je code van 4 kleuren in:");

		int teller = 1;
		int ronde = 0;
		while (ronde < 10) {

			String[] pogingen = mm.input(teller);

			mm.feedback(pogingen);

			ronde++;
			teller++;

			ronde = mm.eindResultaat(pogingen, ronde);
		}
		sc.close();
	}
}