package calculator;

public class Calculator {
	
	public double tax = 0.05;
	public double tip = 0.15;
	public double originalPrice = 10.0;

	public void FindTotal()
	{
	double total = originalPrice * (1 + tax + tip);
	System.out.println(total);
	}
}