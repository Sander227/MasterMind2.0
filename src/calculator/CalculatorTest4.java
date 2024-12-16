package calculator;

import java.util.ArrayList;

public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        double [] total = new double[8];
        double sum = 0;
        
        //Name your friends
        total[0] = calc.findTotal(10, "Bryan");
        total[1] = calc.findTotal(12, "Niek");
        total[2] = calc.findTotal(9,  "Cas");
        total[3] = calc.findTotal(8,  "Senna");
        total[4] = calc.findTotal(7,  "Mezelf");
        total[5] = calc.findTotal(15, "Alex");
        total[6] = calc.findTotal(11, "Noah");
        total[7] = calc.findTotal(30, "Forgetful");
        
        for (int i = 0; i < total.length; i++) {
			sum = sum + total[i];
		}
        System.out.println("Totaal te betalen: " + sum);
        System.out.println("Totaal per persoon: " + sum/total.length);
        System.out.println("Totaal per persoon zonder Alex en Forgetful: " + sum/(total.length-2));
        //Find and print the entire table's total, including tax and tip
       
    } 
}
