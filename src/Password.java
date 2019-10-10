//10/10/2019 Bruce password program
import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("First name: ");
        String first= input.next();
        System.out.println("Middle name: ");
        String middle= input.nextLine();
        System.out.println("Last name: ");
        String last= input.next();
        System.out.println("Age: ");
        int age=input.nextInt();
        System.out.println(" ");

    }
    private static void capsmiddle(String name){
        int mid=(name.length()/2);

    }
}
