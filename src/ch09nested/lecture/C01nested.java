package ch09nested.lecture;

public class C01nested {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        MyClass01.NestedClass01 o2 = o1.new NestedClass01();
    }
}

class MyClass01 {           // 외부클래스
    // 중첩 클래스 : 외부 클래스 내에서만 사용 할 목적으로 만들어짐
    class NestedClass1 {   // 내부클래스
        // 필드

        // 생성자

        // 메소드

    }

    class NestedClass01 { }
    void metnod1() {
        NestedClass01 o1 = new NestedClass01();
    }
}
