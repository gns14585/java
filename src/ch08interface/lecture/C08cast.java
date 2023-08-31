package ch08interface.lecture;

public class C08cast {
    public static void main(String[] args) {
        MyInterface08 i1 = new MyClass081();
        i1.method1();

        if (i1 instanceof MyClass081 c1) {
            c1.otherMethod();
        }
    }
}

interface MyInterface08 {
    void method1();
}

class MyClass081 implements MyInterface08 {
    @Override
    public void method1() {
        System.out.println("재정의한 메소드");
    }

    public void otherMethod() {
        System.out.println("추가된 메소드");
    }
}

