package ch09nested.lecture;

public class C04access {
    // static member는 instance member에 접근 할 수 없다.

    int instanceField;
    static int staticField;

    static class StaticNestedClass {
        void method1() {
            System.out.println(staticField);
            // static 멤버에선 instance 멤버 사용 불가
//            System.out.println(instanceField);
        }
    }

    class InnerClass {
        void method1() {
            System.out.println(instanceField);
            System.out.println(staticField);
        }
    }
}
