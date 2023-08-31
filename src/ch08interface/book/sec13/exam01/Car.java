package ch08interface.book.sec13.exam01;

public class Car {
    Tire tire1 = new Tire();
    Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명자식 객체 1이 굴러갑니다.");
        }
    };

    void run1() {
        tire1.roll();
        tire2.roll();
    }

    void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명자식 객체 2가 굴러갑니다.");
            }
        };
        tire.roll();
    }

    void run3(Tire tire) {
        tire.roll();
    }
}
