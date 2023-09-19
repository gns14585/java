package ch19network.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class C05client {
    public static void main(String[] args) {
        // client 가 서버에게 파일보내기

        try {
            Socket socket = new Socket("172.30.1.95", 3000);

            String path = "C:/Temp/test.png";
            FileInputStream fi = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fi);

            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            try (socket; fi; bis; os; bos;) {
                byte[] b = new byte[1024];
                int length = 0;
                while ((length = bis.read(b)) != -1) {
                    bos.write(b, 0, length);
                }
                bos.flush();
                System.out.println("파일 다 받았습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
