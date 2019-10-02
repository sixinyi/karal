//10/2/2019
import java.awt.*;

public class FourRectanglePrinter {
    public static void main(String[] args){
        Rectangle box=new Rectangle(0,0,3,3);
        System.out.println(box);
        box.translate(3,0);
        System.out.println(box);
        box.translate(0,-3);
        System.out.println(box);
        box.translate(-3,0);
        System.out.println(box);

    }
}
