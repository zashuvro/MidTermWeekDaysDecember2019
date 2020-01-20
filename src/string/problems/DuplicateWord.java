package string.problems;


import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language.";
    duplicateWord(st);
    }

    public static String duplicateWord(String s){
        List<String > list=Arrays.asList(s.toLowerCase().split(" "));
        Set<String> duplicate=new HashSet<>(list);
        System.out.println(s);

        for(String word:duplicate)
        System.out.println("<"+word+">"+" :word in String "+ Collections.frequency(list, word)+" times");


        char [] ch=s.toCharArray();
        String [] word=s.split(" ");
        double space=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                space++;
            }
        }

        System.out.println("The Total Character of The String st is: "+(double)(ch.length-space));
        System.out.println("Average length of the words:: "+ (double)((ch.length-space)/word.length));

        return word[0];
    }

}
