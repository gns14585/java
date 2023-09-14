package ch11exception.lecture;

public class C01exception {
    public static void main(String[] args) {
        System.out.println("실행 코드1");
        System.out.println("실행 코드2");

        try {
            int i = 0;
            int j = 3 / i;
        } catch (ArithmeticException e) {
            System.out.println("실행 코드3");
        }

        System.out.println("실행 코드4");

    }
}
