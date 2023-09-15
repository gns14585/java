package ch18io.lecture;

import java.io.*;

public class C21copy {
    public static void main(String[] args) {
        // BufferedInputStream
        // BufferedOutputStream
        // 그림 파일 복사하는 코드 작성

        String src = "C:/Temp/test2.jpg";
        String dec = "C:/Temp/test2_copy.jpg";

        try(BufferedInputStream is = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(dec))) {

            byte[] data = new byte[1024];
            int num = 0;
            while ((num = is.read(data)) != -1) {
                os.write(data, 0, num);
            }
            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
