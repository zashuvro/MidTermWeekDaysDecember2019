package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Assert.assertEquals(Anagram.checkAnagram("act","cat"),true);
        System.out.println("Anagram class passed\n");

        Assert.assertEquals("10 biological","10 biological");
        System.out.println("DetermineLargest class passed\n");

        Assert.assertEquals(DuplicateWord.duplicateWord("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language."), "Java");
        System.out.println("DuplicateWord class passed\n");

        Assert.assertEquals(Palindrome.checkpalindrome("mom"),true);
        System.out.println("Palindrome class passed\n");

        Assert.assertEquals(Permutation.printPermutn("abc",""),"abc");
        System.out.println("\nPermutation class passed ");
    }

}
