package ch09nested.book.sec04.exam01;

public class A {
    A() { // 생성자에서 B 클래스 , 객체 생성
        class B{}
        B b = new B();
    }

    void method() { // 메소드에서 B 클래스 , 객체 생성
        class B {}
        B b = new B();
    }
}
