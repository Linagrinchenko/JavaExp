package abstractExample;

/**
 * Created by lhrynchenko on 16.04.2015.
 */
public abstract class Figure {


    public abstract double getSquare();

    @Override
    public String toString() {
        return getClass().getName();
    }
}
