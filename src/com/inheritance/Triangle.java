package inheritance;

/**
 * Created by lhrynchenko on 16.04.2015.
 */
public class Triangle extends Figure{
    int a;
    int b;
    int c;

    public Triangle (int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getSquare () {
        return 0.5*a*b;
    }

}
