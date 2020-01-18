package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int i,num,f1=0,f2=1;
        System.out.println("First 40 Fibonacci numbers are::");
        for (i=0;i<40;i++){
            System.out.print(f1+" ");
            num=f1+f2;
            f1=f2;
            f2=num;


        }

    }
}
