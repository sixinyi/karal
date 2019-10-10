// 10.10.2019 Bruce this is a namegame
import java.util.Scanner;

public class TheNameGame {


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName=new String(in.next());
        System.out.print("What is your last name? ");
        String lastName=new String(in.next());
        ft(firstName);
        System.out.println(" ");
        lt(lastName);

    }
    private static void ft(String FN) {
        System.out.println(FN + " " + FN + ", bo-B" + FN.substring(1));
        System.out.println("Banana-fana fo-" + FN);
        System.out.println("Fee-fi-mo-M" + FN.substring(1));
        System.out.println(FN.toUpperCase() + "!");
    }
    private static void lt(String LN){
        System.out.println(LN+" "+LN+", bo-B"+LN.substring(1));
        System.out.println("Banana-fana fo-F"+LN);
        System.out.println("Fee-fi-mo-M"+LN.substring(1));
        System.out.println(LN.toUpperCase()+"!");
    }
}
