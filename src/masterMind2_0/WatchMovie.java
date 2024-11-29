/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterMind2_0;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	int movieRating = 5;
    	int moviePrice = 12;
    	
        System.out.print("Enter the movie ticket price \n");
        moviePrice = sc.nextInt();
        
        System.out.print("Enter the movie rating \n");
        movieRating = sc.nextInt();
        
       if (moviePrice >= 12 && movieRating == 5) {
       System.out.println("I'm interested in watching the movie");
       } else {
           System.out.println("I'm not interested in watching the movie");

       }
       
       
        sc.close();
        

    }
}
