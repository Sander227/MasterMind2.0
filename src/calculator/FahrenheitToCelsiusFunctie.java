package calculator;

import java.util.Scanner;

public class FahrenheitToCelsiusFunctie {

	public double FahrenheitToCelsius() {
	Scanner sc = new Scanner(System.in);
		
		double fahrenheit = sc.nextDouble();
		
		double celsius = (fahrenheit-32)*5/9;
		
		sc.close();
		return celsius;
	}

}
