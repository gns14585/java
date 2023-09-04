package ch16lambda.lecture;

public class C02lambda {
    public static void main(String[] args) {
        // lambda
        // (매개변수 목록) -> { 메소드 몸통 }
        MyInterface02 o1 = () -> {
            System.out.println("C02lambda.method");
        };
        o1.method();

        // 메소드 몸통의 코드가 한 줄이면 중괄호 생략 가능
        MyInterface02 o2 = () -> System.out.println("메소드 내 코드가 한줄");
    }
}

@FunctionalInterface
interface MyInterface02 {
    // 매개변수 없는 메소드
    // 리턴 없음
    void method();
}
