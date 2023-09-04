package ch09nested.lecture;

public class C08interface {
    public static void main(String[] args) {
        class ConcreateClass implements MyClass08.NestedInterface {

            @Override
            public void method2() {
                System.out.println("ConcreateClass.method2");
            }
        }

        ConcreateClass c = new ConcreateClass();
        c.method2();
    }
}

class MyClass081 implements MyClass08.NestedInterface {

    @Override
    public void method2() {
        System.out.println("MyClass081.method2");
    }
}

class MyClass08 {
    interface NestedInterface {
        // public final static field
        // public abstract instacne method ( 중요 )
        void method2();
        // private instance method
        // default instance method
        // public static method
        // private static method
    }

    void method1() {
        class ConcreateClass implements NestedInterface {

            @Override
            public void method2() {
                System.out.println("ConcreateClass.method2");
            }
        }

        ConcreateClass c = new ConcreateClass();
        c.method2();
    }
}
