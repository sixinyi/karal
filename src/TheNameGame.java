import java.util.Scanner;

public class TheNameGame {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName=new String(in.next());
        System.out.print("What is your last name? ");
        String lastName=new String(in.next());
        System.out.println(firstName+" "+firstName+", bo-B"+firstName.substring(1));
        System.out.println("Banana-fana fo-F"+firstName);
                lastName.substring(1));


    }
}
