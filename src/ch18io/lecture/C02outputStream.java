package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02outputStream {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("out.txt");
            os.write(70);
            os.write(71);
            os.write(73);

            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
