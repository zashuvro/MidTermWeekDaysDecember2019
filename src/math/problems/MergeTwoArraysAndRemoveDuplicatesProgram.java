package math.problems;

import java.util.Arrays;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}


    public static void main(String[] args)
    {


        System.out.println(Arrays.toString(mergeArray()));

        System.out.println(Arrays.toString(removeDuplicates(mergeArray())));
    }
    public static int[] mergeArray(){
        int [] arrayA={1,3,4,};
        int [] arrayB={4,5,6,7,8};
        //merging two array
        int []result=new int[arrayA.length+arrayB.length];
        for(int i=0;i<arrayA.length;i++){
            result[i]=arrayA[i];
        }
        for(int i=0;i<arrayB.length;i++){
            result[i+arrayA.length]=arrayB[i];
        }
        return result;
    }
    public static int[] removeDuplicates(int[] arr) {

        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for(int i = 0; i < end; i++){
            whitelist[i] = arr[i];
        }
        return whitelist;
    }





}
