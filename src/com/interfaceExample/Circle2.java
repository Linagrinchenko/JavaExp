package interfaceExample;

/**
 * Created by lhrynchenko on 17.04.2015.
 */
public class Circle2 implements Figure {

    int r;

    public Circle2(int r) {
        this.r = r;
    }

    @Override
    public double getSquare() {
        return r * 3.14;
    }

    public void specialSquareMethod() {

        System.out.println("I am circle");
    }
}