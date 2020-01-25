package pizza.program;

import org.w3c.dom.ls.LSOutput;

public class Pizza {

    public int radius;
    public int cost;


    public static double method(double pizzaRadius, double pizzaCost) {
        double pi = 3.14d;
        return (double) pizzaCost*(pi*pizzaRadius*pizzaRadius);
    }
}
