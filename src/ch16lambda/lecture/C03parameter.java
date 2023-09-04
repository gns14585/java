package ch16lambda.lecture;

public class C03parameter {
    public static void main(String[] args) {
        MyInterface03 o1 = (int x, int y) -> System.out.println(x * y);
        MyInterface03 o2 = (x, y) -> System.out.println(x + y);

    }
}

@FunctionalInterface
interface MyInterface03 {
    void method(int x, int y);
}
