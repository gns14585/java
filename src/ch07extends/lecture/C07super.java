package ch07extends.lecture;

public class C07super {
    public static void main(String[] args) {
        MySubClass071 o1 = new MySubClass071();
        o1.method1();
    }
}

class MyClass07 {
    void method1() {
        System.out.println("부모 클래스 메소드 기능");
    }
}

class MySubClass071 extends MyClass07 {
    @Override
    void method1() {
        // 부모클래스에 있는 메소드 호출 ( 기능을 변경이 아니라 추가하고 싶은경우)
        super.method1();
        System.out.println("자식 클래스의 재정의한 메소드");
    }
}
