package ch07extends.book.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smart = new SmartPhone("아이폰", "골드");

        System.out.println("모델 : " + smart.model);
        System.out.println("색상 : " + smart.color);

    }
}
