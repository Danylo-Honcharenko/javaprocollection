package coffee.order;

public class Order implements Comparable<Order>{
    private int number;
    private String clientName;
    private String wish;

    public Order(int number, String clientName, String wish) {
        this.number = number;
        this.clientName = clientName;
        this.wish = wish;
    }

    public int getNumber() {
        return number;
    }

    public String getClientName() {
        return clientName;
    }

    public String getWish() {
        return wish;
    }

    @Override
    public int compareTo(Order o) {
        return this.number - o.number;
    }
}
