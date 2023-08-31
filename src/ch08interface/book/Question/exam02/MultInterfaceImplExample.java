package ch08interface.book.Question.exam02;

public class MultInterfaceImplExample {
    public static void main(String[] args) {
        RemotControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable sc = new SmartTelevision();
        sc.search("naver.com");
    }

}
