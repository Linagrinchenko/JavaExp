package inheritance;

/**
 * Created by lhrynchenko on 16.04.2015.
 */
public class Figure {


    public double getSquare() {
        return 0.0;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
