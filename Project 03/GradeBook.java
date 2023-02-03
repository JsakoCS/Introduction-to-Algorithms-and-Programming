// Programmer : Jsako

import java.util.Scanner;

public class GradeBook {

    public static void main(String[] args) {
        
        double score = 0.0, sum = 0.0, averageClassScore;
        char averageClassGrade = 0;
        int count = 0, countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        Scanner input = new Scanner(System.in);
        
        while (score >= 0) {
            sum += score;
            
            System.out.print("Enter a score (a negative score exits): ");
            score = input.nextDouble();
            
            if (score >= 90.0) {
                System.out.println("The score of " + score + " is a A");
                countA++;
                count++;
            } else if (score >= 80.0 && score < 90.0) {
                System.out.println("The score of " + score + " is a B");
                countB++;
                count++;
            } else if (score >= 70.0 && score < 80.0) {
                System.out.println("The score of " + score + " is a C");
                countC++;
                count++;
            } else if (score >= 60.0 && score < 70.0) {
                System.out.println("The score of " + score + " is a D");
                countD++;
                count++;
            } else if (score >= 0.0 && score < 60.0) {
                System.out.println("The score of " + score + " is a F");
                countF++;
                count++;
            }
        }
        
        averageClassScore = sum / count;
        
        if (averageClassScore >= 90.0) {
            averageClassGrade = 'A';
        } else if (averageClassScore >= 80.0 && averageClassScore < 90.0) {
            averageClassGrade = 'B';
        } else if (averageClassScore >= 70.0 && averageClassScore < 80.0) {
            averageClassGrade = 'C';
        } else if (averageClassScore >= 60.0 && averageClassScore < 70.0) {
            averageClassGrade = 'D';
        } else if (averageClassScore >= 0.0 && averageClassScore < 60.0) {
            averageClassGrade = 'F';
        }
        
        System.out.println("-------------------------");
        System.out.println("Grade Report");
        System.out.println("-------------------------");
        System.out.println("Total number of A's: " + countA);
        System.out.println("Total number of B's: " + countB);
        System.out.println("Total number of C's: " + countC);
        System.out.println("Total number of D's: " + countD);
        System.out.println("Total number of F's: " + countF);
        System.out.println("Total number of scores input: " + count);
        System.out.println("Average class grade: " + averageClassGrade);
        System.out.printf("Average class score: " + "%.2f", averageClassScore);
        
    }
    
}
