// Programmer : Jsako

import java.util.Scanner;

public class Magic8Ball {
    
    public static void main(String[] args) {
        
        Scanner eightBall = new Scanner(System.in);
        
        System.out.print("What is your question?: ");
        
        String question = eightBall.nextLine();
        eightBall.close();
        System.out.println("Your question was: " + question);
        
        System.out.print("My answer is: ");
        
        int randomValue = (int)(Math.random() * 19);
        
        if (randomValue == 0) {
            System.out.println("It is certain.");
        } else if (randomValue == 1) {
            System.out.println("It is decidedly so.");
        } else if (randomValue == 2) {
            System.out.println("Without a doubt.");
        } else if (randomValue == 3) {
            System.out.println("Yes definitely.");
        } else if (randomValue == 4) {
            System.out.println("You may rely on it.");
        } else if (randomValue == 5) {
            System.out.println("As I see it, yes.");
        } else if (randomValue == 6) {
            System.out.println("Most likely.");
        } else if (randomValue == 7) {
            System.out.println("Outlook good.");
        } else if (randomValue == 8) {
            System.out.println("Yes.");
        } else if (randomValue == 9) {
            System.out.println("Signs point to yes.");
        } else if (randomValue == 10) {
            System.out.println("Reply hazy try again.");
        } else if (randomValue == 11) {
            System.out.println("Ask again later.");
        } else if (randomValue == 12) {
            System.out.println("Better not tell you now.");
        } else if (randomValue == 13) {
            System.out.println("Cannot predict now.");
        } else if (randomValue == 14) {
            System.out.println("Concentrate and ask again.");
        } else if (randomValue == 15) {
            System.out.println("Don't count on it.");
        } else if (randomValue == 16) {
            System.out.println("My reply is no.");
        } else if (randomValue == 17) {
            System.out.println("My sources say no.");
        } else if (randomValue == 18) {
            System.out.println("Outlook not so good.");
        } else {
            System.out.println("Very doubtful.");
        }
        
    }
    
}
