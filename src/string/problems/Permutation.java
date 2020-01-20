package string.problems;


public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        printPermutn("abc","");
    }

    public static String printPermutn(String str, String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + " ");
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
        return str;
    }
}
