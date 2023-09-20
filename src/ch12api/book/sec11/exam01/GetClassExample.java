package ch12api.book.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) {
        //how1
        Class clazz = Car.class;

        System.out.println("패키지 : " + clazz.getPackage().getName()); // 패키지 : ch12api.book.sec11.exam01
        System.out.println("클래스 간단 이름 : " + clazz.getSimpleName()); // 클래스 간단 이름 : Car
        System.out.println("클래스 전체 이름 : " + clazz.getName()); // 클래스 전체 이름 : ch12api.book.sec11.exam01.Car

    }
}
