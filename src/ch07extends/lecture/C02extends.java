package ch07extends.lecture;

public class C02extends {
    public static void main(String[] args) {
        MySubClass021 o1 = new MySubClass021();
        o1.name = "spring";
        o1.method3();
        System.out.println("o1.name = " + o1.name);
    }
}

class MyClass02 {
    String name;

    void method3() {
        System.out.println("MyClass02.method3");
    }
}

class MySubClass021 extends MyClass02 {

}
