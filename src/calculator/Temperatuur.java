package calculator;

import java.util.Scanner;

public class Temperatuur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TemperatuurFunctie temp = new TemperatuurFunctie();

		System.out.println("Geef de temperatuur in Celsius: ");
		
		double kelvin = temp.temperatuur();
		
		System.out.println("De graden in kelvin is: " + kelvin);
		
	}
}