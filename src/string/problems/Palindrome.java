package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word to check if it is palindrome or not");
        String s=sc.nextLine();
        System.out.println(s+" is palindrome?");
        System.out.println("Anwser= "+checkpalindrome(s));
    }

    public static boolean checkpalindrome(String s1){
        boolean result=false;
        String reverse="";
        for(int i=s1.length()-1;i>=0;i--){
            reverse+=s1.charAt(i);
        }
        if(reverse.equalsIgnoreCase(s1))
        result=true;


        return result;
    }
}
