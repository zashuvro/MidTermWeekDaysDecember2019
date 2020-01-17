package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {
    double quiz, mid_term, final_term,score;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Score of Quiz:: ");
        quiz=sc.nextDouble();
        System.out.print("Enter the Score of Mid-Term:: ");
        mid_term=sc.nextDouble();
        System.out.print("Enter the Score of Final-Term:: ");
        final_term=sc.nextDouble();
        score=(quiz+mid_term+final_term)/3;
        if(score>=90){
            System.out.println("Your Grade is A");
        }
        else if(score>=70){
            System.out.println("Your Grade is B");
        }
        else if(score>=50){
            System.out.println("Your Grade is C");
        }
        else{
            System.out.println("Your Grade is F");
        }
    }

}
