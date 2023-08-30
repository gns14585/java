package ch07extends.book.sec09.exam02;

public class HankookTire implements Tire{
    @Override
    public void roll() {
        System.out.println("한국타이어가 회전합니다.");
    }
}
