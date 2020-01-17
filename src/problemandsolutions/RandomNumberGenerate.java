package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.

    public static  void main(String []args){
    Random rand = new Random(); //instance of random class
    int highestNumber = 8;
    int randomNumber = rand.nextInt(highestNumber);
    System.out.println("Random Integer Value From 1 to 8: "+(randomNumber+1));
    }
}
