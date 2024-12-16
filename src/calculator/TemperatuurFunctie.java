package calculator;

import java.util.Scanner;

public class TemperatuurFunctie {

	public double temperatuur() {
		Scanner sc = new Scanner(System.in);
		
		double celsius = sc.nextDouble();
		
		double kelvin = celsius+273;
		
		sc.close();
		return kelvin;

		
	}

}
