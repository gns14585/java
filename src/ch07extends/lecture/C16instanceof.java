package ch07extends.lecture;

public class C16instanceof {
    public static void main(String[] args) {
        Animal16 ani1 = new Dog16();
        Animal16 ani2 = new Cat16();
        Animal16 ani3 = new Animal16();

        // instanceof 연산자
        // 연산결과 : true, false (boolean)
        // 좌변 : 참조변수
        // 우변 : 타입

        boolean res1 = ani1 instanceof Animal16;
        boolean res2 = ani1 instanceof Dog16;
        boolean res3 = ani1 instanceof Cat16;

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);

        System.out.println("- - - - - - - -");

        boolean res4 = ani2 instanceof Animal16;
        boolean res5 = ani2 instanceof Dog16;
        boolean res6 = ani2 instanceof Cat16;

        System.out.println("res4 = " + res4);
        System.out.println("res5 = " + res5);
        System.out.println("res6 = " + res6);
    }
}

class Animal16 {

}

class Dog16 extends Animal16 {

}

class Cat16 extends  Animal16 {

}