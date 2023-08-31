package ch08interface.book.Question.exam02;

public class SmartTelevision implements RemotControl, Searchable{
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
