// Programmer : Jsako

import java.util.Scanner;

public class CostOfDriving {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter driving distance: ");
        double drivingDistance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double priceGallon = input.nextDouble();
        input.close();
        double answer = (drivingDistance / milesGallon) * priceGallon;
        System.out.printf("The cost of driving is $" + "%.2f", answer);
    }
    
}
