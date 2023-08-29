package ch06class;

public class C09static {
    public static void main(String[] args) {

    }
}

class MyClass09 {
    String name;            // 인스턴스 변수
    static String model;    // 스태틱(클래스) 변수


    // 인스턴스 메서드
    void printName() {
        System.out.println("name = " + name);

        // 인스턴스 멤버에서 스태틱 멤버 접근가능
        System.out.println("model = " + model);
    }

    static void printModel() {
        // 스태틱 멤버끼리 접근 가능
        System.out.println("model = " + model);

        // 스태틱 멤버에서 인스턴스멤버 접근 불가능
//         System.out.println("name = " + name);
    }
}
