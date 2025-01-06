package masterMind2_0;

import java.util.Random;
import java.util.Scanner;

public class MastermindFunctions {
	String[] kleuren = { "rood", "oranje", "geel", "groen", "blauw", "paars" };
	String[] codes = new String[4];
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	String feedback = "";

	public String[] kleurenGeneratie() {
		
		for (int x = 0; x < codes.length; x++) {
			codes[x] = kleuren[random.nextInt(kleuren.length)];
		}
		return codes;
	}
	
	public String[] input(int teller) {
		System.out.println("\nGok " + teller);
		String[] pogingen = new String[4];
		for (int x = 0; x < pogingen.length; x++) {
			pogingen[x] = sc.next();
		}
		return pogingen;
	}
	
	public void feedback(String [] pogingen ) {
		for (int y = 0; y < pogingen.length; y++) {
			feedback = "- ";
			if (pogingen[y].equals(codes[y])) {
				feedback = "zwart ";
			} else {
				for (int z = 0; z < pogingen.length; z++) {
					if (pogingen[y].equals(codes[z])) {

						feedback = "Wit ";
					}
				}
			}
			System.out.print(feedback + " ");
		}
	}
	
	public int eindResultaat(String [] pogingen, int ronde) {
		if (pogingen[0].equals(codes[0]) && pogingen[1].equals(codes[1]) && pogingen[2].equals(codes[2])
				&& pogingen[3].equals(codes[3])) {

			System.out.println("\nJe hebt gewonnen geluksbal, volgende keer verlies je");
			ronde = 11;
		}
		if (ronde == 10) {
			System.out.println("\nIk wist wel dat je ging verliezen, volgende keer beter.");

		}
		return ronde;
	}
	
}
