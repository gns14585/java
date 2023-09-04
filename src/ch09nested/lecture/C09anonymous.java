package ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        Myclass09 o1 = new MySubClass091();
        o1.method1();

        // anonymous class ( 익명클래스 )
        Myclass09 o2 = new Myclass09() {
            // 자식 클래스 몸통
            // field
            // method

            @Override
            void method1() {
                System.out.println("C09anonymous.method1");
            }
        };
        o2.method1();


    }
}

class Myclass09 {
    void method1() {
        System.out.println("Myclass09.method1");
    }
}

class MySubClass091 extends Myclass09 {
    @Override
    void method1() {
        System.out.println("MySubClass091.method1");
    }
}
