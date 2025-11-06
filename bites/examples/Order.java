package bites.examples;

public class Order {

    Integer total = 0;


    public void addAmount(Integer x) {
        this.total += x;
    }

    public void addDiscount(Integer x) {
        this.total -= x;
    }

    public void getTotal() {
        System.out.println(this.total);
    }

    public static void main(String[] args) {
        Order order1 = new Order();
        order1.addAmount(100);
        order1.addDiscount(20);
        order1.getTotal();
    }

}
