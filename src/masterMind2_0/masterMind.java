
package masterMind;

import java.util.Scanner;

public class masterMind {

	public static void main(String[] args) {

		String rood = "rood";
		String geel = "geel";
		String groen = "groen";
		String blauw = "blauw";
		String paars = "paars";
		String oranje = "oranje";

		String code1 = oranje;
		String code2 = groen;
		String code3 = blauw;
		String code4 = paars;

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
			String mastermind1_1 = sc.next();
			String mastermind1_2 = sc.next();
			String mastermind1_3 = sc.next();
			String mastermind1_4 = sc.next();

			if (mastermind1_1.equals(code1)) {
				System.out.print("Zwart ");
			} else if (mastermind1_1.equals(code2)) {
				System.out.print("Wit ");
			} else if (mastermind1_1.equals(code3)) {
				System.out.print("Wit ");
			} else if (mastermind1_1.equals(code4)) {
				System.out.print("Wit ");
			} else {
				System.out.print("- ");
			}

			if (mastermind1_2.equals(code2)) {
				System.out.print("Zwart ");
			} else if (mastermind1_2.equals(code1)) {
				System.out.print("Wit ");
			} else if (mastermind1_2.equals(code3)) {
				System.out.print("Wit ");
			} else if (mastermind1_2.equals(code4)) {
				System.out.print("Wit ");
			} else {
				System.out.print("- ");
			}

			if (mastermind1_3.equals(code3)) {
				System.out.print("Zwart ");
			} else if (mastermind1_3.equals(code1)) {
				System.out.print("Wit ");
			} else if (mastermind1_3.equals(code2)) {
				System.out.print("Wit ");
			} else if (mastermind1_3.equals(code4)) {
				System.out.print("Wit ");
			} else {
				System.out.print("- ");
			}

			if (mastermind1_4.equals(code4)) {
				System.out.println("Zwart ");
			} else if (mastermind1_4.equals(code1)) {
				System.out.println("Wit ");
			} else if (mastermind1_4.equals(code2)) {
				System.out.println("Wit ");
			} else if (mastermind1_4.equals(code3)) {
				System.out.println("Wit ");
			} else {
				System.out.println("- ");
			}
			ronde++;
			teller++;

			if (mastermind1_1.equals(code1)) {

				if (mastermind1_2.equals(code2)) {

					if (mastermind1_3.equals(code3)) {

						if (mastermind1_4.equals(code4)) {

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
