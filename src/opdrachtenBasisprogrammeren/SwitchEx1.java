package opdrachtenBasisprogrammeren;

import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Input a number between 1-12: ");
    	int input = sc.nextInt();
    	switch  (input) {
    	case 1: 
    		System.out.println("January");
    		break;
    	case 2: 
    		System.out.println("February");
    		break;
    	case 3: 
    		System.out.println("March");
    		break;
    	case 4: 
    		System.out.println("April");
    		break;
    	case 5: 
    		System.out.println("May");
    		break;
    	case 6: 
    		System.out.println("June");
    		break;
    	case 7: 
    		System.out.println("Juli");
    		break;
    	case 8: 
    		System.out.println("August");
    		break;
    	case 9: 
    		System.out.println("September");
    		break;
    	case 10: 
    		System.out.println("October");
    		break;
    	case 11: 
    		System.out.println("November");
    		break;
    	case 12: 
    		System.out.println("December");
    		break;
    		default:
    			System.out.println("Invalid input, Input a valid number");
    		
    	}
    	
    	// dit kan eventueel ook (is korter)
//    	String [] maanden = {"January", "February", "March", "April", "May", "June", "Juli", "August", "September", "October", "November", "December"};
//    	if (input >= 1 && input <= 12) {
//    	    System.out.println(maanden[input - 1]);
//    	} else {
//    	    System.out.println("Invalid input, Input a valid number");
//    	}
    	
    	
    	
    }
}
