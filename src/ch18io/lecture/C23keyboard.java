package ch18io.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23keyboard {
    public static void main(String[] args) {
        try {
            InputStream keyboard = System.in;
            InputStreamReader isr = new InputStreamReader(keyboard);
            BufferedReader br = new BufferedReader(isr);

//        BufferedReader br = new BufferedReader(System.in); 위 3줄 코드 1줄로 작성 가능

            try (br;) {
                String line = br.readLine();

                System.out.println("line = " + line);

                String line2 = br.readLine();
                System.out.println("line2 = " + line2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
