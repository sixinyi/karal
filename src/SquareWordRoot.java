// 10.15 Bruce about detect the length of a input word. Then it will C the Square of length, to find integer.
// print out .....
import java.util.Scanner;

public class SquareWordRoot {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word=input.nextLine();
        double sqrtOfWord= Math.sqrt(word.length());
        int nearestInt= (int)(Math.round(sqrtOfWord));
        System.out.print("The \"square root\" of "+word+" is "+word.substring(nearestInt,nearestInt+1));

    }
}
