//Bruce 9.27.2019

import java.awt.*;
import java.util.Scanner;

public class PointsAndRectangles {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        int xv= input.nextInt();

        System.out.print("Enter the y coordinate: ");
        int yv= input.nextInt();

        System.out.print("Enter the length: ");
        int length= input.nextInt();

        System.out.print("Enter the width: ");
        int width= input.nextInt();

        Point point= new Point(xv,yv);
        Dimension thing= new Dimension(length,width);
        Rectangle r= new Rectangle(point,thing);
        System.out.println(point);
        System.out.println(thing);
        System.out.println(r);
    }
}
