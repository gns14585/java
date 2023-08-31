package ch08interface.book.Question.exam01;

public class Tv implements Remocon{
    @Override
    public void powerOn() {
        System.out.println("Tv를 켭니다.");
    }

    public static void main(String[] args) {
        Remocon r = new Tv();
        r.powerOn();
    }
}
