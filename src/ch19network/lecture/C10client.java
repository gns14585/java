package ch19network.lecture;

import java.io.*;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class C10client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.30.1.81", 7000);

//            InputStream is = socket.getInputStream();
//            InputStreamReader isr = new InputStreamReader(is);
//            BufferedReader br = new BufferedReader(isr);

            // 위 3줄 한줄로 가능
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner sc = new Scanner(System.in);

            while (true) {
                try (socket; br; bw;) {
                    System.out.print("메세지를 입력 해주세요 > ");
                    String line = sc.next();
                    bw.write(line);
                    bw.flush();
                    if (line.equals("bye")) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
