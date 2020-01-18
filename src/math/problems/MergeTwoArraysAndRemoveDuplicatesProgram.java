package math.problems;

import java.util.Arrays;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}


    public static void main(String[] args)
    {
mergeArray();
    }
    public static int[] mergeArray(){
        int [] arrayA={1,3,4};
        int [] arrayB={4,5,6,7,8};
        //merging two array
        int []result=new int[arrayA.length+arrayB.length];
        for(int i=0;i<arrayA.length;i++){
            result[i]=arrayA[i];
        }
        for(int i=0;i<arrayB.length;i++){
            result[i+arrayA.length]=arrayB[i];
        }
        //removing duplicates
        int j=0;
        for(int i=0;j<result.length-2;i++){
            if(result[i]!=result[i+1]){
                result[j++]=result[i];
            }
        }
        result[j++]=result[result.length-1];
        for(int i=0;i<result.length-1;i++){
            System.out.print(result[i]+" ");}
        return result;
    }





}
