package ch08interface.book.sec02;

class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }
}
