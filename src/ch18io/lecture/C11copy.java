package ch18io.lecture;

import java.io.*;

public class C11copy {
    public static void main(String[] args) {
        String src = "C./Temp/test3.png";
        String des = "C./Temp/test3_copy.png";

        try(InputStream is = new FileInputStream(src);
            OutputStream os = new FileOutputStream(des)) {
            byte[] arr = new byte[1024];

            int len = 0;
            while ((len = is.read(arr)) != -1) {
                os.write(arr, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
