class Payment extends Thread {
    public void run() {
        System.out.println("Processing payment...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class OrderProcessing extends Thread {
    public void run() {
        System.out.println("Order confirmed...");
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Payment p = new Payment();
        OrderProcessing o = new OrderProcessing();

        p.start();
        try {
            p.join(); // wait for payment
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        o.start();
    }
}