package ch07extends.lecture;

public class C27final {
    public static void main(String[] args) {
        // final 변수 : 값을 한 번만 할당 할 수 있음

        final int a = 3;

    }
}

class MyClass27 {

    // 필드에 final 변수가 선언되어있으면 생성자에서 변수값을 초기화 해주는걸 권장
    final int age = 3;
    final String name;

    public MyClass27() {
        this.name = "java";
    }

    public MyClass27(String name) {
        this.name = name;
    }
}

