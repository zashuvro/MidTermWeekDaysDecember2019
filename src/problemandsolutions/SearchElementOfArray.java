package problemandsolutions;

import java.util.Scanner;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.

    public static int sequrntialSearch(){
        int i,j,temp;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Integer to store in the Array::");
        System.out.println("<<Please Enter Aleast 2 Integer Numbers>>");
        num=sc.nextInt();
        System.out.println("Enter the Integers Numbers::");
            int[] array = new int[num];
            for (i = 0; i < num; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("Enter the Number you want Search in the Array: ");
            temp = sc.nextInt();
            for (i = 0; i < num; i++) {
                if (array[i] == temp) {
                    return i;
                }

            }
            return -1;

    }
    public static void main(String[] args) {

        if(SearchElementOfArray.sequrntialSearch()== -1){
            System.out.println("Number not Found in the Array");
        }else{
            System.out.println("Number Found in the Array");
        }

    }
}
