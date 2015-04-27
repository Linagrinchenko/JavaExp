import abstractExample.Circle;
import abstractExample.Square;
import inheritance.Figure;
import inheritance.Trapeze;
import inheritance.Triangle;
import interfaceExample.Circle2;
import interfaceExample.Square2;


/**
 * Created by lhrynchenko on 16.04.2015.
 */
public class FiguresRunner {
    public static void main1(String[] args) {

        Figure[] array = {new Triangle(5, 5, 8), new inheritance.Square(2), new inheritance.Circle(3), new Trapeze(2, 3, 5)};
        double summSquares = 0.0;
        double multiply = 1.0;


        for (Figure fig : array) {

            System.out.println(fig.toString() + " Square= " + fig.getSquare());
            summSquares = summSquares + fig.getSquare();
            multiply = multiply * fig.getSquare();

        }
        System.out.println(summSquares);
        System.out.println(multiply);


        Figure figure = new Figure();
        System.out.println(figure.getSquare());

    }

    public static void main(String[] args) {

        interfaceExample.Figure[] array = {
                new interfaceExample.Square2(2),
                new interfaceExample.Square2(6),
                new interfaceExample.Circle2(4),
                new interfaceExample.Circle2(8)
        };

        for (interfaceExample.Figure fig : array) {

            System.out.println(fig.getName() + " Square= " + fig.getSquare());
            if (fig.getClass() == Square2.class) {
                Square2 square = (Square2) fig;
                square.specialSquareMethod();
            } else {
                Circle2 circle2 = (Circle2) fig;
                circle2.specialSquareMethod();
            }


        }

    }

    public static void main3(String[] args) {


        abstractExample.Figure[] array = {
                new Square(2),
                new Square(6),
                new Circle(4),
                new Circle(8)
        };

        for (abstractExample.Figure fig : array) {
            System.out.println(fig.toString() + " Square= " + fig.getSquare());

        }

    }

}
