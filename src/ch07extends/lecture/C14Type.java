package ch07extends.lecture;

public class C14Type {
    public static void main(String[] args) {
        // 기본타입
        int a = 3;
        double f = 3.0;
        double g = 32;

        String b = "java";
        Object o = "java";
        Child c = new Child();
        Parent d = new Child();


    }
}

class Parent {}
class Child extends Parent {}
