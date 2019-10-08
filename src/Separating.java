import java.util.Scanner;

// 10/7/2019 Bruce
public class Separating {
    private static int quotient(int a) {
        a /=10;
        return  a;
    }
    private static int remainder(int a) {
        a %=10;
        return  a;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 4 dight number: ");
        int a= input.nextInt();
        System.out.print( Separating.quotient( Separating.quotient( Separating.quotient(a)))+" ");
        System.out.print( Separating.remainder( Separating.quotient( Separating.quotient(a)))+" ");
        System.out.print( Separating.remainder( Separating.remainder( Separating.quotient(a)))+" ");
        System.out.print( Separating.remainder(a));
    }
}
