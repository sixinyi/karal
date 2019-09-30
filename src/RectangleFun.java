//9/30/2019 Bruce
import java.awt.*;
import java.util.Scanner;

public class RectangleFun {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        System.out.print("Width: ");
        int w=inp.nextInt();
        System.out.print("Height: ");
        int h=inp.nextInt();
        System.out.print("X: ");
        int x=inp.nextInt();
        System.out.print("Y: ");
        int y=inp.nextInt();

        Rectangle r=new Rectangle(x,y,w,h);
        double parameter= 2*r.getWidth()+2*r.getHeight();
        r.setLocation((int)(r.getX()-4),(int)(r.getY()+2));
        System.out.println("Perimeter = "+parameter);
        System.out.println("New location is ("+r.getX()+","+r.getY()+")");

    }
}
