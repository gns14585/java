package ch08interface.book.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle v1 = new Bus();
        v1.run();

        if (v1 instanceof Bus b) {
            b.run();
            b.checkFare();
        }
    }
}
