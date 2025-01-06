
package masterMind2_0;

import java.util.*;

public class masterMind {

	public static void main(String[] args) {
		MastermindFunctions mm = new MastermindFunctions();
		
		mm.kleurenGeneratie();

		Scanner sc = new Scanner(System.in);
		System.out.println("Welkom bij MasterMind");
		System.out.println("Je hebt 10 kansen om de code te kraken");
		System.out.println("Er zijn 6 kleuren waar je uit kan kiezen: rood, oranje, geel, groen, blauw en paars");
		System.out.println("Na elke keer dat je geraden hebt krijg je een hint: Zwart = goed, Wit = Wel in de code maar verkeerde plek, - = niet erin");
		System.out.println("Typ je code van 4 kleuren in:");
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