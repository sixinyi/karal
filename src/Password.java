//10/10/2019 Bruce password program this is a program can help people use their name to create a password.
import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("First name: ");
        String first= input.nextLine();
        System.out.println("Middle name: ");
        String middle= input.nextLine();
        System.out.print("Last name: ");
        String last= input.nextLine();
        System.out.println("Age: ");
        int age=input.nextInt();
        System.out.println(" ");
        System.out.print("Password: ");
        cMD(first);
        cMD(middle);
        cMD(last);
        last(first);
        last(middle);
        last(last);
        age(age);

    }
    private static void cMD(String name){
        //the cmd is the middle letter of the name
        int mid=name.length()/2;
        System.out.print(name.toUpperCase().substring(mid,mid+1));
    }
    private static void last(String name) {
        //the cmd is the middle letter of the name
        int last = name.length();
        System.out.print(name.toLowerCase().substring(last-1));
    }
    private static void age(int age){
        System.out.print(age*75);
    }
}
