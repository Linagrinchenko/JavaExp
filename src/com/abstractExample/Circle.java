package abstractExample;

/**
 * Created by lhrynchenko on 16.04.2015.
 */
public class Circle extends Figure {
    int r;

    public Circle(int r) {
        this.r = r;
    }


    @Override
    public double getSquare() {
        return r * (3.14);
    }
}

