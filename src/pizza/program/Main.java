package pizza.program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double pi = 3.14d;

        Scanner scanner = new Scanner(System.in);


        //---comment for a user----
        System.out.println("Write below two pizza cost/radius parameters to check, witch pizza is better to buy");
        //---pizza 1 diameter & cost to input----
        System.out.println("Insert first pizza diameter:");
        int pizzaRadius = scanner.nextInt();
        System.out.println("Insert first pizza cost:");
        int pizzaCost = scanner.nextInt();


        double pizzaSize = 4*pizzaRadius*pizzaRadius*pi;
        double pizzaToSize = pizzaSize / pizzaCost;

        System.out.println("First pizza size to cost ratio is: "+pizzaToSize);

        Pizza pizza2 = new Pizza();

        //---pizza 2 diameter & cost to input----
        System.out.println("Insert second pizza diameter:");
        int pizzaRadius2 = scanner.nextInt();
        System.out.println("Insert second pizza cost:");
        int pizzaCost2 = scanner.nextInt();

        double pizzaSize2 = 4*pizzaRadius2*pizzaRadius2*pi;
        double pizzaToSize2 = pizzaSize2 / pizzaCost2 ;
        System.out.println("Second pizza size to cost ratio is: "+pizzaToSize2);

        //---check witch pizza is more profitable----
        if (pizzaToSize2 > pizzaSize) {
            System.out.println("Pizza 1 is more profitable than Pizza 2");
            System.out.println("BETTER TO BUY PIZZA 1!");
        }
        else {
            System.out.println("Pizza 2 is more profitable than Pizza 1");
            System.out.println("BETTER TO BUY PIZZA 2!");
        }
    }
}
