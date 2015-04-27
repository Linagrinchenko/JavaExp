import PageObjects.LoginPage;
import PageObjects.Page;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.math.BigInteger;

/**
 * Created by lhrynchenko on 15.04.2015.
 */
public class SwitchCase {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        for (int elem : arr) {
            if (elem % 2 == 1) {
                System.out.println("ODD:" + elem);
            } else {
                System.out.println("EVEN" + elem);
            }
        }
    }
}
       /* Integer i = new Integer(1621651);
        int i2 = 1234234;

        String str = new String("gfhj");

        String str2 = "asdf";
        str2 = "asdf2";

        System.out.println("gee");

        System.out.println(
        LoginPage.stat);
        LoginPage.staticmethod();

     /*   nameofmethod(new LoginPage());

       /* int a=3;
        switch (a) {
           case 0:
                a++;
              a++;
            break;
            case 1:
              a++;
                a--;
                break;
            default:
                a = a + 5;
        }

    private static void nameofmethod (Page page) {

        page.type("sdf");

    }
       /* for (int i = 0; i > -10; i--) {

            System.out.println(a);*/