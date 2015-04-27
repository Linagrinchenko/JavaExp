package inheritance;

/**
 * Created by lhrynchenko on 17.04.2015.
 */
public class Trapeze extends Figure {

    int h;
    int p;
    int m;

    public Trapeze(int h, int p, int m) {
        this.h = h;
        this.p = p;
        this.m = m;
    }

        @Override
        public double getSquare () {
            return  (p+m)/2;


        }


    }

