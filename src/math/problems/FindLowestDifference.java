package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        System.out.println("The lowest difference between two array is:: "+findLoDiff());

    }
    public static int findLoDiff(){
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int [] arr=new int[array1.length+array2.length] ;
        for(int i=0;i<array1.length;i++){
            arr[i]=array1[i];
        }
        for(int i=0;i<array2.length;i++){
            arr[i+array1.length]=array2[i];
        }
        //System.out.println(Arrays.toString(arr));
        //implement here
        int i,j,k,temp;
        for (i=1;i<arr.length;i++){
            k=arr[i];
            j=i-1;
            while(j>=0 && k < arr[j]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }
        }
        //System.out.println(Arrays.toString(arr));
        //System.out.println(arr[0]);
    return arr[0];
    }


}
