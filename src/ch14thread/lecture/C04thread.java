package ch14thread.lecture;

import javax.tools.Tool;
import java.awt.*;

public class C04thread {
    public static void main(String[] args) {
        // thread 만들기
        Thread thread = new Thread();

        // thread 시작
        thread.start();

        YourTherad thread1 = new YourTherad();
        thread1.start();

    }
}

class YourTherad extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread extends Thread {
    // thread 해야 할 일을 run메소드에 작성해야함
    @Override
    public void run() {
        // thread가 해야할 일 작성
        for (int i = 0; i < 5; i++) {
            System.out.println("소리");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

