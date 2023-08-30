package ch07extends.book.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver dr = new Driver();

        dr.driver(new Bus());
        dr.driver(new Taxi());

    }
}
