package interfaceExample;

/**
 * Created by lhrynchenko on 17.04.2015.
 */
public interface Figure {

    public double getSquare();

    default String getName() {
        return getClass().getSimpleName();
    }
}
