package org.homework.command;

public class BakeryShop {
    public static void main(String[] args) {
        // Create a bakery (receiver)
        Bakery bakery = new Bakery();
        // Create the order system (invoker)
        OrderSystem orderSystem = new OrderSystem();

        // Create concrete commands
        OrderCommand bakeCake = new BakeCakeCommand(bakery);
        OrderCommand makeBiscuits = new MakeBiscuitsCommand(bakery);

        // Customer places orders
        orderSystem.takeOrder(bakeCake);
        orderSystem.takeOrder(makeBiscuits);

        // Process orders
        System.out.println("Processing all bakery orders...");
        orderSystem.processOrders();
    }
}
