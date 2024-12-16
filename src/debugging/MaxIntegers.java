package debugging;

public class MaxIntegers {

    public static void main(String[] args) {
        int num1 = -2, num2 = -2, num3 = -2;
        int max = num1;
       
       
        if (num2 > num1) {
            max = num2; 
        }
       
        if (num3 > num2) {
               max = num3;
        }
     

        System.out.println(" The max of 3 numbers is " + max);
    }

}

