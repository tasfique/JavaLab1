
package Tutorial1;

import java.util.Scanner;

public class Task2 {
    public static void main (String args[])
    {
        //declaration of variables
        double total, percent, totaldisp, percentdisp;
        Scanner read = new Scanner (System.in);
        
        //inputing data
        System.out.println("Enter Subtotal: ");
        total = read.nextInt();
        System.out.println("Enter Gratuity Percent: ");
        percent = read.nextInt();
        
        //calculation
        percent = percent / 100;
        percentdisp = total * percent;
        totaldisp = percentdisp + total;
        
        //display the result
        System.out.println("The Subtotal is $" + totaldisp);
        System.out.println("The The Gratuity rate is $" + percentdisp);

        
        
        
        
       
        
    }
    
}
