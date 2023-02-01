// Programmer : Jsako

import java.util.Scanner;

public class RunwayLength {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed (meters/second): ");
        double v = input.nextDouble();
        System.out.print("Enter rate of acceleration (meters/second^2): ");
        double a = input.nextDouble();
        input.close();
        double length = (v * v) / (2 * a);
        System.out.printf("The minimum runway length in meters is " + "%.3f", length);
    }
    
}