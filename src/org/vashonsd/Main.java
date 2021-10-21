package org.vashonsd;
import java.util.Scanner;
public class Main{

     public static void main(String[] args) {
	// Convert a number of hours provided as a decimal amount into hours and minutes. For example, 2.5 hours is 2 hours and 30 minutes.
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a number of hours.");
        double numHours = input.nextDouble();

        int hoursPlace = (int) numHours;
        int minPlace = (int) ((numHours - hoursPlace)* 60.0);

        //how do you split 1 from .2
        System.out.println("You have input " + numHours + " hours. Well done you!");
        System.out.println("It is " + hoursPlace + " hours and " + minPlace + " minutes");

   }
}
