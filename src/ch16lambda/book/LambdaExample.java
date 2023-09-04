package ch16lambda.book;

import ch07extends.book.sec08.exam03.C;

public class LambdaExample {
    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }

    public static void main(String[] args) {
        action((x, y) -> {
            int result = x + y;
            System.out.println("result = " + result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        });

        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int result = x * y;
                System.out.println("result = " + result);
            }
        });

        action((x, y) -> {
            int result = x / y;
            System.out.println("result = " + result);
        });
    }
}
