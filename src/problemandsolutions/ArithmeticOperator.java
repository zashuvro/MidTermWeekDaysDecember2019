package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
    double num1;
    double num2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number::");
        num1=sc.nextDouble();
        System.out.print("Enter the Sceond Number::");
        num2=sc.nextDouble();
        System.out.println("The Summation of the Two Number is:: "+(num1+num2));
        System.out.println("The Subtraction of the Two Number is:: "+(num1-num2));
        System.out.println("The Multification of the Two Number is:: "+(num1*num2));
        System.out.printf("The Divition of the Two Number is:: %.3f  ",(num1/num2));

    }



}
