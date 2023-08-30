package ch07extends.book.sec10.exam01;

public class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        super(owner);
    }

    @Override
    void turnOn() {
        System.out.println("스마트폰 전원을 켭니다.");
    }

    @Override
    void turnOff() {
        System.out.println("스마트폰 전원을 끕니다.");
    }

    void internetSerch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
