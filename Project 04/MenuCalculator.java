// Programmer : Jsako

import java.util.Scanner;

public class MenuCalculator {

    public static void main(String[] args) {
        showMenu();
    }
    
    public static void showMenu() {
        int userChoice = 1;
        int n = 0, n1 = 0, n2 = 0;
        double num1 = 0.0, num2 = 0.0;
        Scanner userInput = new Scanner(System.in);
        
        while (userChoice > 0 && userChoice < 10) {
            System.out.println("Calculator Menu");
            System.out.println("-----------------------------------");
            System.out.println("1. Add two integers");
            System.out.println("2. Add two doubles");
            System.out.println("3. Subtract two integers");
            System.out.println("4. Subtract two doubles");
            System.out.println("5. Multiply two integers");
            System.out.println("6. Multiply two doubles");
            System.out.println("7. Divide two integers");
            System.out.println("8. Divide two doubles");
            System.out.println("9. Compute a factorial product (n!)");
            System.out.println("10. Exit");
            System.out.println("");
            System.out.println("Your choice? > ");
            userChoice = userInput.nextInt();
            
            switch (userChoice) {
                case 1:
                    System.out.println("Enter the first integer number: ");
                    n1 = userInput.nextInt();
                    System.out.println("Enter the second integer number: ");
                    n2 = userInput.nextInt();
                    add(n1, n2);
                    break;
                case 2:
                    System.out.println("Enter the first double number: ");
                    num1 = userInput.nextDouble();
                    System.out.println("Enter the second double number: ");
                    num2 = userInput.nextDouble();
                    add(num1, num2);
                    break;
                case 3:
                    System.out.println("Enter the first integer number: ");
                    n1 = userInput.nextInt();
                    System.out.println("Enter the second integer number: ");
                    n2 = userInput.nextInt();
                    subtract(n1, n2);
                    break;
                case 4:
                    System.out.println("Enter the first double number: ");
                    num1 = userInput.nextDouble();
                    System.out.println("Enter the second double number: ");
                    num2 = userInput.nextDouble();
                    subtract(num1, num2);
                    break;
                case 5:
                    System.out.println("Enter the first integer number: ");
                    n1 = userInput.nextInt();
                    System.out.println("Enter the second integer number: ");
                    n2 = userInput.nextInt();
                    multiply(n1, n2);
                    break;
                case 6:
                    System.out.println("Enter the first double number: ");
                    num1 = userInput.nextDouble();
                    System.out.println("Enter the second double number: ");
                    num2 = userInput.nextDouble();
                    multiply(num1, num2);
                    break;
                case 7:
                    System.out.println("Enter the first integer number: ");
                    n1 = userInput.nextInt();
                    System.out.println("Enter the second integer number: ");
                    n2 = userInput.nextInt();
                    divide(n1, n2);
                    break;
                case 8:
                    System.out.println("Enter the first double number: ");
                    num1 = userInput.nextDouble();
                    System.out.println("Enter the second double number: ");
                    num2 = userInput.nextDouble();
                    divide(num1, num2);
                    break;
                case 9:
                    System.out.println("Enter the integer number: ");
                    n = userInput.nextInt();
                    factorialProduct(n);
                    break;
            }
        }
        userInput.close();
    }
    
    public static int add(int n1, int n2) {
        int result;
        result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        return result;
    }
    
    public static double add(double num1, double num2) {
        double result;
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        return result;
    }
    
    public static int subtract(int n1, int n2) {
        int result;
        result = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + result);
        return result;
    }
    
    public static double subtract(double num1, double num2) {
        double result;
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        return result;
    }
    
    public static int multiply(int n1, int n2) {
        int result;
        result = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + result);
        return result;
    }
    
    public static double multiply(double num1, double num2) {
        double result;
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        return result;
    }
    
    public static int divide(int n1, int n2) {
        int result;
        result = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + result);
        return result;
    }
    
    public static double divide(double num1, double num2) {
        double result;
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        return result;
    }
    
    public static int factorialProduct(int n) {
        int result = 1;
        for(int i = 1; i <= n; ++i)
            result *= i;
        System.out.println(n + "!" + " = " + result);
        return result;
    }

}
