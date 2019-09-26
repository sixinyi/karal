// Bruce 9/26/2019
import becker.robots.*;


public class robotthree {

    public static void main(String[] args) {
        City ssfs = new City();

        Robot karel = new Robot(ssfs,0, 0, Direction.SOUTH, 1);
        Robot carl = new Robot(ssfs,0, 3, Direction.EAST,0);

        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();

        carl.pickThing();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();

        carl.move();
        carl.move();
        carl.putThing();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();

    }
}