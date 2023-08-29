package ch07extends.lecture;

public class C13cast {
    public static void main(String[] args) {
        Animal13 ani1 = new Dog13();
        Animal13 ani2 = new Cat13();

        ani1.breath();
        ani2.breath();

        Dog13 dog13 = (Dog13)ani1;
        dog13.sniff();

        Cat13 cat13 = (Cat13)ani2;
        cat13.hunt();

    }
}

class Animal13 {
    public void breath() {
        System.out.println("숨쉬다");
    }
}

class Dog13 extends Animal13 {
    public void sniff() {
        System.out.println("냄새 맡다.");
    }
}

class Cat13 extends Animal13 {
    public void hunt() {
        System.out.println("쥐를 잡다.");
    }
}