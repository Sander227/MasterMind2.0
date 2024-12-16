package calculator;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		FahrenheitToCelsiusFunctie fahr = new FahrenheitToCelsiusFunctie();

		System.out.println("Geef de temperatuur in Fahrenheit: ");
		
		double celsius = fahr.FahrenheitToCelsius();
		
		System.out.println("De graden in celsius is: " + celsius);

	}

}
