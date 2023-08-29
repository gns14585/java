package ch07extends.lecture;

public class C04extends {
    public static void main(String[] args) {
        MySubclass041 o1 = new MySubclass041();
        o1.method1();
        o1.method2();

        MySubclass042 o2 = new MySubclass042();
        o2.method1();
        o2.method3();
    }
}

class MyClass04 {
    void method1() {
        System.out.println("MyClass04.method1");
    }
}

class MySubclass041 extends MyClass04 {
    void method2() {
        System.out.println("MySubclass041.method2");
    }
}

class MySubclass042 extends MyClass04 {

    private String model;
    void method3() {
        System.out.println("MySubclass042.method3");
    }
}