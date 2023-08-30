package ch07extends.book.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.tire = new Tire();
        c.run();

        c.tire = new HankookTire();
        c.run();

        if(c.tire instanceof HankookTire han) {
            han.stop();
        } else {
            System.out.println("형변환 안됨");
        }


        c.tire = new KumhoTire();
        c.run();



    }
}
