
package masterMind2_0;

import java.util.*;

public class masterMind {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		String[] kleuren = {"rood", "oranje", "geel", "groen", "blauw", "paars"};

		String [] codes = new String[4];
		codes[0] = kleuren[random.nextInt(kleuren.length)];
		codes[1] = kleuren[random.nextInt(kleuren.length)];
		codes[2] = kleuren[random.nextInt(kleuren.length)];
		codes[3] = kleuren[random.nextInt(kleuren.length)];

		Scanner sc = new Scanner(System.in);
		System.out.println("Welkom bij MasterMind");
		System.out.println("Je hebt 10 kansen om de code te kraken");
		System.out.println("Er zijn 6 kleuren waar je uit kan kiezen: rood, oranje, geel, groen, blauw en paars");
		System.out.println("Na elke keer dat je geraden hebt krijg je een hint: Zwart = goed, Wit = Wel in de code maar verkeerde plek, - = niet erin");
		System.out.println("Typ je code van 4 kleuren in in:");
		int teller = 1;
		int ronde = 0;
		while (ronde < 10) {

			System.out.println("Gok " + teller);
			String [] inputs = new String[4];
			inputs[0] = sc.next();
			inputs[1] = sc.next();
			inputs[2] = sc.next();
			inputs[3] = sc.next();

			if (inputs[0].equals(codes[0])) {
				System.out.print("Zwart ");
			} else if (inputs[0].equals(codes[1])) {
				System.out.print("Wit ");
			} else if (inputs[0].equals(codes[2])) {
				System.out.print("Wit ");
			} else if (inputs[0].equals(codes[3])) {
				System.out.print("Wit ");
			} else {
				System.out.print("- ");
			}

			if (inputs[1].equals(codes[1])) {
				System.out.print("Zwart ");
			} else if (inputs[1].equals(codes[0])) {
				System.out.print("Wit ");
			} else if (inputs[1].equals(codes[2])) {
				System.out.print("Wit ");
			} else if (inputs[1].equals(codes[3])) {
				System.out.print("Wit ");
			} else {
				System.out.print("- ");
			}

			if (inputs[2].equals(codes[2])) {
				System.out.print("Zwart ");
			} else if (inputs[2].equals(codes[0])) {
				System.out.print("Wit ");
			} else if (inputs[2].equals(codes[1])) {
				System.out.print("Wit ");
			} else if (inputs[2].equals(codes[3])) {
				System.out.print("Wit ");
			} else {
				System.out.print("- ");
			}

			if (inputs[3].equals(codes[3])) {
				System.out.println("Zwart ");
			} else if (inputs[3].equals(codes[0])) {
				System.out.println("Wit ");
			} else if (inputs[3].equals(codes[1])) {
				System.out.println("Wit ");
			} else if (inputs[3].equals(codes[2])) {
				System.out.println("Wit ");
			} else {
				System.out.println("- ");
			}
			ronde++;
			teller++;

			if (inputs[0].equals(codes[0])) {

				if (inputs[1].equals(codes[1])) {

					if (inputs[2].equals(codes[2])) {

						if (inputs[3].equals(codes[3])) {

							System.out.println("Je hebt gewonnen geluksbal, volgende keer verlies je");
							break;
						}
					}
				}

			}
			
			if (ronde==10){
				System.out.println("Ik wist wel dat je ging verliezen, volgende keer beter");
			}

			

		}
		sc.close();
	}
}
