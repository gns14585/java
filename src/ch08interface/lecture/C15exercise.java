package ch08interface.lecture;

public class C15exercise {
    MyClass15 field;

    public static void main(String[] args) {
        // 확인문제 3 - 보기1
        C15exercise o1 = new C15exercise();
        o1.field = new MyClass151();
        o1.field = new MyClass152();

        // 확인문제 3 - 보기2
        method(new MyClass151());
        method(new MyClass152());

        // 확인문제 3 - 보기3
        MyClass15[] arr = new MyClass15[3];
        arr[0] = new MyClass151();
        arr[1] = new MyClass152();


    }
    public static void method(MyClass15 param) {

    }
}

interface MyClass15 {}
class MyClass151 implements MyClass15 {}
class MyClass152 implements MyClass15 {}
