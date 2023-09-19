package ch19network.lecture;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C03client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.30.1.81", 7000);

            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            // 위 3줄 한줄로 가능
//            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            try (socket; is; isr; br;) {
                String line = br.readLine();
                System.out.println("서버가 보낸 내용 = " + line);
            }
        } catch (Exception e) {

        }
    }
}
