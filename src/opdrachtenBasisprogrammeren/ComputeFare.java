/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdrachtenBasisprogrammeren;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare = 3;

        if (age <= 11) {
        	System.out.println("fare = " + fare);
        }
        else if (age >= 11 && age <= 65) {
        	System.out.println("fare = " + (fare + 2));
        }
        else {
        	System.out.println("fare = " + (fare + 1));
        }
        
    	
//    	for (int i = 0; i < 4; i++) {
//    		for (int o = 0; o < 4; o++) {
//    			if (codes[i].equals(inputs[i])) {
//    				System.out.print("Zwart ");
//    			} else if (codes[i].equals(inputs[o])) {
//    				System.out.println("Wit ");
//    			} else {
//    				System.out.println("- ");
//    			}
//    		}
//		}
    }
}
