package math.problems;


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:: ");
        num=sc.nextInt();
        System.out.println("Factroial using Recursion");
        System.out.println("Factroial of "+num+ " is "+factRc(num));
        fact(num);


    }
    public static int fact(int num){
        int i,fac=1;
        System.out.println("Factroial Using Iteration");
        for(i=1;i<=num;i++){
            fac=fac*i;
        }
        System.out.println("Factroial of "+num+ " is "+fac);
    return fac;
    }


    public static int factRc(int n){
    int fac;
        if(n==1){
            return 1;
        }
        fac=factRc(n-1)*n;
        return fac;
    }
}
