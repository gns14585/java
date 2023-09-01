package ch08interface.lecture;

public class C04staticMethod {
    public static void main(String[] args) {
        MyInterface14.method(); // public static 메소드 실행
    }
}

interface MyInterface14 {
    // 필드 : public static final

    // 인스턴스 메소드 : 추상 , default , private
    // static 메소드 : public static , private static

    static void method() {
        // public static 메소드
        System.out.println("MyInterface14.method");
        common();
    }

    static void method2() {
        System.out.println("MyInterface14.method2");
        common();
    }

    private static void common() {
        System.out.println("어떤 기능1");

    }
}
