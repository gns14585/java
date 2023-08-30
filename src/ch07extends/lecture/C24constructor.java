package ch07extends.lecture;

public class C24constructor {
    public static void main(String[] args) {

    }
}

class MyClass24 {

    int age;

    public MyClass24(int age) {
        this.age = age;
    }
}

class MySubClass24 extends MyClass24 {
    // 명시적으로 상위 클래스의 생성자 호출 코드 작성
    public MySubClass24(int age) {
        super(30);
    }
}
