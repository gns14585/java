package ch07extends.book.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.method1();
        parent.method2();

        // 자식클래스에 오버라이딩 받지않은 추가적인 메소드를 정의했을때 호출하는법
        // 강제타입변환으로 다시 원상복구
        Child child = (Child)parent;
        child.method3();
    }
}
