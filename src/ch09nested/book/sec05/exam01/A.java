package ch09nested.book.sec05.exam01;

public class A {
    int field1;
    void method1() {

    }

    static int field2;
    static void method2() {

    }

    class B {
        void method() {
            // 인스턴스에선 스태틱 접근 가능
            field1 = 10; // instance 필드
            method1();   // instance 메소드
            field2 = 10; // static 필드
            method2();   // static 메소드
        }
    }

    static class C {
        void method() {
            // 스태틱에선 인스턴스 접근 불가
            // field1 = 10; 불가
            // method1();   불가
            field2 = 10; // 해당 필드는 static이니까 사용 가능
            method2();   // 해당 메소드도 동일

        }
    }
}
