package ch18io.book.Question.p10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws Exception {
        String pa = "C:/Temp/dir3";
        String src = "C:/Temp/Test2.jpg";
        String dec = "C:/Temp/dir2/123.jpg";

        File file = new File(pa);

        if (!file.mkdir()) {
            try (InputStream is = new FileInputStream(src);
                 OutputStream os = new FileOutputStream(dec)) {
                byte[] arr = new byte[1024];

                int len = 0;
                while ((len = is.read(arr)) != -1) {
                    os.write(arr, 0, len);
                }
                System.out.println("원본파일 복사 경로 : " + src);
                System.out.println("복사파일 복사 경로 : " + dec);
                System.out.println("복사가 성공되었습니다.");
                os.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("원본 파일 복사 경로 : " + src);
            System.out.println("복사 파일 복사 경로 : " + dec);
            System.out.println("원본 파일이 존재하지 않습니다.");
        }
    }
}
