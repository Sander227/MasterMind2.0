package calculator;

import java.util.ArrayList;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
    	Calculator calc = new Calculator();
    	calc.originalPrice = 10;
    	calc.FindTotal();
    	
    	calc.originalPrice = 12;
    	calc.FindTotal();
    	
    	
    	
    	double tax = 0.05;
    	double tip = 0.15;
    	
    	int person1 = 10;
    	double total1 = person1 * (1 + tax + tip);
    	System.out.println(total1);
    	
      	int person2 = 12;
    	double total2 = person2 * (1 + tax + tip);
    	System.out.println(total2);
    	
      	int person3 = 9;
    	double total3 = person3 * (1 + tax + tip);
    	System.out.println(total3);
    	
      	int person4 = 8;
    	double total4 = person4 * (1 + tax + tip);
    	System.out.println(total4);
       
    	int person5 = 7;
    	double total5 = person5 * (1 + tax + tip);
    	System.out.println(total5);
    	
      	int person6 = 15;
    	double total6 = person6 * (1 + tax + tip);
    	System.out.println(total6);
    	
    	int person7 = 11;
    	double total7 = person7 * (1 + tax + tip);
    	System.out.println(total7);
    	
      	int person8 = 30;
    	double total8 = person8 * (1 + tax + tip);
    	System.out.println(total8);
    	
    }    
}
