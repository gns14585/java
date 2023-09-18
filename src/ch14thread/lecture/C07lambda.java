package ch14thread.lecture;

import java.awt.*;

public class C07lambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 3; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();


    }
}
