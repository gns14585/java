package ch16lambda.lecture;

public class C01lambda {
    public static void main(String[] args) {
        // 람다식
        MyInterface01 o1 = (x, y) -> {
            System.out.println(x + y);
        };

        // 익명함수
        MyInterface01 o2 = new MyInterface01() {
            @Override
            public void method1(int x, int y) {
                System.out.println(x + y);
            }
        };
    }
}

// 추상 메소드가 하나인 인터페이스의 객체를 만들 때 사용 가능
interface MyInterface01 {
    void method1(int x, int y);
}
