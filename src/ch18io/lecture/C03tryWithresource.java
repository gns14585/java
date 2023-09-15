package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03tryWithresource {
    public static void main(String[] args) {

    }

    // stream 을 열면 close를 꼭 작성해줘야 하는데
    // close 추가 시 다른 추가되어야 하는 코드 들이 많아져서 리소스닫기가 생김
    public void method1() {
        OutputStream os = null;
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close(); // io stream을 꼭 닫아야 함
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 위 코드와 동일하지만 훨씬 간결해짐
    // 이런식으로 하면 close를 따로 기입하지 않고 자동으로 설정 가능
    // try - with - resource 문법
    // 변수 타입은 AutoCloseable 이어야 함 (API 확인하면됨)
    public void method2() {
        try (OutputStream os = new FileOutputStream("");) {
            os.write(33);
            os.write(67);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 위 코드와 동일하지만 객체가 1개 이상일 경우
    public void method3() {
        try (
                FileOutputStream fos = new FileOutputStream("");
                FileInputStream fis = new FileInputStream("");

        ) {
            fis.read();
            fos.write(234);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 값을 하나만 넣을경우 이렇게 하는게 가독성이 더 좋음
    public void method4() {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            sc.hasNext();
            sc.nextInt();
        }
    }

    public void method5() {
        try {
            FileInputStream fio = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            try(fio; fos;) {
                fio.read();
                fos.write(33);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
