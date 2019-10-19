// 10.15 Bruce this is about calulkate and print.
import java.util.Scanner;

public class FindThePower {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base= input.nextInt();
        System.out.print("Enter the exponent:");
        int exponent= input.nextInt();
        double result=Math.pow(base,exponent);
        System.out.print(base+"^"+exponent+" = "+result);
    }
}
