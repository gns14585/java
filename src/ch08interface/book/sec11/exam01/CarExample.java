package ch08interface.book.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.run();

        c.tire1 = new KumhoTire();
        c.tire2 = new KumhoTire();
        c.run();
    }
}
