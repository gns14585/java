package ch07extends.lecture;

public class C10polymorphism {
    public static void main(String[] args) {
        Malamute10 dog1 = new Malamute10();
        Chihuahua10 dog2 = new Chihuahua10();

        Canidae10 ca1 = dog1;
        Canidae10 ca2 = dog2;

        Animal10 ani1 = dog1;
        Animal10 ani2 = dog2;

        dog1.breath();
        dog2.breath();

        dog1.cry();
        ca1.cry();
        ani1.cry();

        dog2.cry();
        ca2.cry();
        ani2.cry();
    }
}

class Animal10 {
    public void breath() {
        System.out.println("숨쉬다");
    }

    public void cry() {
        System.out.println("동물이 울다");
    }
}

class Canidae10 extends Animal10 {

}

class Malamute10 extends Canidae10 {
    @Override
    public void cry() {
        System.out.println("왈왈와와라왈");
    }
}

class Chihuahua10 extends Canidae10 {
    @Override
    public void cry() {
        System.out.println("멍머어머엄ㅇ멍");
    }
}
