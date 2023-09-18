package ch14thread.lecture;

import java.awt.*;

public class C06runnable {
    public static void main(String[] args) {
        // 익명클래스로 가능
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // thread가 해야 할 일
                for (int i = 0; i < 3; i++) {
                    System.out.println("소리");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 3; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread2.start();
    }
}
