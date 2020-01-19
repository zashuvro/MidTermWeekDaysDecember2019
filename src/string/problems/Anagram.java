package string.problems;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first word:: ");
        String a=sc.nextLine();
        System.out.print("Enter the Sceond word:: a");
        String b=sc.nextLine();
        System.out.println("Two Words are Anagram ture or false?\nAnwser = "+checkAnagram(a,b));
    }
    public static boolean checkAnagram(String a,String b){
        char [] c=a.toLowerCase().toCharArray();
        char [] d=b.toLowerCase().toCharArray();
       // System.out.println(b);
        boolean status=true;
        Arrays.sort(c);
        Arrays.sort(d);
        if(a.length()!=b.length()) {
            status= false;
        }
        else if(Arrays.equals(c,d)){
            status=true;
        }else status=false;
        return status;
        }


    }

