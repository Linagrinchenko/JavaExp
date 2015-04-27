/**
 * Created by lhrynchenko on 20.04.2015.
 * test comment
 */
public class Polimorfizm {

    public static int summ(int a, int b) {
        System.out.println("Integer");
        return a + b;
    }

    public static double summ(double a, double b) {
        System.out.println("Double");
        return a + b;
    }

    public static double summ(double... array) {
        double summ = 0;
        for (double elem : array) {
            summ += elem;
        }
        return summ;
    }

    public static double summ2(double... array) {
        double summ = 0;
        for (int i = 0; i != array.length-1; i++) {

            summ += array[i];

        }
        return summ;
    }

    public static void main(String[] args) {
        //System.out.println(summ(1, 2));

        //summ(1.5 , 2.5);
        System.out.println(summ2(2.5, 35, 5.5, 3.5));

    }
}