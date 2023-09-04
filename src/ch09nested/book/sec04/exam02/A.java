package ch09nested.book.sec04.exam02;

public class A {
    void useB() {
        class B {
            int field1 = 10;
            static int field2 = 2;

            B() {
                System.out.println("B-생성자 실행");
            }

            void method1() {
                System.out.println("B.method1 실행");
            }
        }

        B b = new B();

        System.out.println(b.field1);
        b.method1();
    }
}
