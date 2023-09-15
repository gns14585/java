package ch18io.book.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test_copy.jpg";

        try(InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName)) {

            byte[] data = new byte[1024];
            int num = 0;
            while ((num = is.read(data)) != -1) {
                os.write(data, 0, num);
            }
            os.flush();
            System.out.println("복사가 잘 되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
