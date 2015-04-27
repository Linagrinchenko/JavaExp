package abstractExample;


/**
 * Created by lhrynchenko on 16.04.2015.
 */
public class Square extends Figure {

    int l;

    public Square(int l) {
        this.l = l;
    }

    @Override
    public double getSquare() {
        return l * l;
    }
}
