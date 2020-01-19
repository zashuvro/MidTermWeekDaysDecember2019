package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        //Testing Factroial
        Assert.assertEquals(Factorial.fact(5),120);
        System.out.println("Factorial class fact method passed");
        Assert.assertEquals(Factorial.factRc(5),120);
        System.out.println("Factorial class factRc method passed\n");

        //Testing Fibonacci class

        Assert.assertEquals(Fibonacci.fibonacci(),102334155);
        System.out.println("\nFibonacci class is passsed\n");

        //Tesing LowestNumber class

        int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
        Assert.assertEquals(LowestNumber.findLowest(array),5);
        System.out.println("LowestNumber class is Passed");

        //Testing for Find_owest_Differnence

        Assert.assertEquals(FindLowestDifference.findLoDiff(),1);
        System.out.println("\nFindLowestDifference class passed");
        //Testing MergeTwoArrays

        int [] arrayT={1,3,4,5,6,7,8};
        Assert.assertEquals(MergeTwoArraysAndRemoveDuplicatesProgram.removeDuplicates(MergeTwoArraysAndRemoveDuplicatesProgram.mergeArray()),arrayT);
        System.out.println("\nMergeTwoArraysAndRemoveDuplicatesProgram class is passed");



     }
}
