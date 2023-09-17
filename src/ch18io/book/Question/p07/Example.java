package ch18io.book.Question.p07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        String filePath = "src/ch18io/book/Question/p07/Example.java";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath));) {
            int rowNumber = 0;
            String rowData;
            while (true) {
                try {
                    String str = br.readLine();
                    if (str == null) {
                        break;
                    }
                    System.out.println(rowNumber + "\t" + str);
                    rowNumber++;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
