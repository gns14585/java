package c12api.book.Question.Q2;

import java.util.Objects;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    /*
    @Override
    public int hashCode() {
        int hashCode = Integer.parseInt(studentNum);
        return hashCode;
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return studentNum != null ? studentNum.hashCode() : 0;
    }
}
