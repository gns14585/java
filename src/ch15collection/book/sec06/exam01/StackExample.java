package ch15collection.book.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(10));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(100));

//        // 읽기만 출력
//        System.out.println("향상된 for문 사용");
//        for (Coin coin : coinBox) {
//            System.out.println("꺼내온 동전 = " + coin.getValue() + "원");
//        }

        System.out.println();

        // 저장되어있던 객체를 꺼내기 pop 사용 ( pop 사용시 꺼내고 읽기 때문에 이후 객체 사라짐 )
        System.out.println("while문 사용");
        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}
