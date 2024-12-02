
package masterMind2_0;

import java.util.*;

public class masterMind {

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
		System.out.println(
				"Na elke keer dat je geraden hebt krijg je een hint: Zwart = goed, Wit = Wel in de code maar verkeerde plek, - = niet erin");
		System.out.println("Typ je code van 4 kleuren in in:");
		int teller = 1;
		int ronde = 0;
		while (ronde < 10) {

			System.out.println("Gok " + teller);
			String[] inputs = new String[4];
			for (int x = 0; x < inputs.length; x++) {
				inputs[x] = sc.next();
			}
		

			String goed = "zwart";
			String fout = "- ";
			String verkeerdePlek = "Wit";
			String feedback = fout;
			for (int y = 0; y < inputs.length; y++) {
				if (inputs[y].equals(codes[y])) {
					feedback = goed;
				} else {
					for (int z = 0; z < inputs.length; z++) {
						if (inputs[y].equals(codes[z])) {

							feedback = verkeerdePlek;
						}
					}
				}
				System.out.println(feedback);
			}
			ronde++;
			teller++;

			if (inputs[0].equals(codes[0]) && inputs[1].equals(codes[1]) && inputs[2].equals(codes[2])
					&& inputs[3].equals(codes[3])) {

				System.out.println("Je hebt gewonnen geluksbal, volgende keer verlies je");
				break;
			}

			if (ronde == 10) {
				System.out.println("Ik wist wel dat je ging verliezen, volgende keer beter.");
			}
		}
		sc.close();
	}
}