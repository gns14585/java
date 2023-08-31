package ch08interface.book.sec13.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.run1();

        c.run2();

        c.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명자식 객체 3이 굴러갑니다.");
            }
        });

    }
}
