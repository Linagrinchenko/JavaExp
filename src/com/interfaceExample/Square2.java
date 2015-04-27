package interfaceExample;

/**
 * Created by lhrynchenko on 16.04.2015.
 */
public class Square2 implements Figure {

    int l;


    public Square2(int l) {
        this.l = l;

    }

    @Override
    public double getSquare() {
        return l * l;
    }

    public void specialSquareMethod() {

        System.out.println("I am square");
    }

}
