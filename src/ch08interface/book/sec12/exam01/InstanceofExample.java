package ch08interface.book.sec12.exam01;

public class InstanceofExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle v) {
        if (v instanceof Bus bus) {
            bus.checkFare();
        }
        v.run();
    }
}
