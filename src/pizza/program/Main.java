package pizza.program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double pi = 3.14d;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write below two pizza cost/radius parameters to check, witch pizza is better to buy");

        System.out.println("Write the pizza 1 cost:");

        int pizzaCost = scanner.nextInt();
        System.out.println("Write the pizza 1 radius:");

        int pizzaRadius = scanner.nextInt();

        double pizzaSize = pizzaRadius*pizzaRadius*pi;
        double pizzaToSize = pizzaCost / pizzaSize;

        System.out.println("Pizza cost to size ratio is: "+pizzaToSize);

        Pizza pizza2 = new Pizza();
        System.out.println("Write the pizza2 cost:");
        int pizzaCost2 = scanner.nextInt();
        System.out.println("Write the pizza2 radius:");
        int pizzaRadius2 = scanner.nextInt();
        double pizzaSize2 = pizzaRadius2*pizzaRadius2*pi;
        double pizzaToSize2 = pizzaCost2 / pizzaSize2;
        System.out.println("Pizza cost to size ratio is: "+pizzaToSize2);

        if (pizzaToSize2 > pizzaSize) {
            System.out.println("Pizza 1 is more profitable than Pizza 2");
            System.out.println("Better to buy pizza 1!");
        }
        else {
            System.out.println("Pizza 2 is more profitable than Pizza 1");
            System.out.println("BETTER TO BUY PIZZA 2!");
        }
    }
}