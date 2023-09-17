package ch18io.lecture;

import javax.xml.crypto.Data;
import java.io.File;

public class C28file {
    public static void main(String[] args) {
        // java.io.File

        String path = "C:\\Users\\사용자\\IdeaProjects\\java\\src\\ch18io\\lecture\\C28file.java";
        File file = new File(path);

        // 크기
        System.out.println("file.length() = " + file.length());

        // 있는지?
        System.out.println("file.exists() = " + file.exists());

        // 경로
        System.out.println("file.getPath() = " + file.getPath());

        // 마지막 수정일시
        System.out.println("file.lastModified() = " + file.lastModified());
        
        // 디렉토리인지?
        System.out.println("file.isDirectory() = " + file.isDirectory());
    }
}
