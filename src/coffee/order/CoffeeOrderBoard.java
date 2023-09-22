package coffee.order;

import java.util.PriorityQueue;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> orders;
    private int orderNumber;
    public CoffeeOrderBoard() {
        this.orders = new PriorityQueue<>();
        this.orderNumber = 0;
    }
    public void add(String clientName, String wish) {
        orders.add(new Order(orderNumber++, clientName, wish));
    }

    public void deliver() {
        Order order = orders.poll();
        if (order != null) System.out.println(order.getNumber() + " | " + order.getClientName() + " | " + order.getWish());
    }

    public void deliver(int number) {
        boolean isThere = false;
        for (Order order : orders) {
            if (number == order.getNumber()) {
                orders.remove(order);
                System.out.println(order.getNumber() + " | " + order.getClientName() + " | " + order.getWish());
                isThere = true;
                break;
            }
        }
        if (!isThere) System.out.println("There is no order number " + number);
    }

    public void draw() {
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getClientName() + " | " + order.getWish());
        }
    }
}
