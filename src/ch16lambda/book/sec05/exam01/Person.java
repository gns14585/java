package ch16lambda.book.sec05.exam01;

import ch16lambda.book.sec04.Calcuable;

public class Person {
    public void action(Calcuable calcuable) {
        double result = calcuable.calc(10, 4);
        System.out.println("결과 : " + result);
    }
}