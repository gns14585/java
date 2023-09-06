package c12api.lecture;

public class C19hangul {
    public static void main(String[] args) {
        // 자바 문자 : unicode
        char a = '\u0d05';
        System.out.println(a);
        System.out.println('\u0041');

        // 한글 표현식
        System.out.println("손흥민".matches("[\uac00-\ud7a3]{3}"));        // true
        System.out.println("손흥민".matches("[\uac00-\ud7a3]{3}"));        // true
        System.out.println("허리케인".matches("[\uac00-\ud7a3]{3}"));       // false

        System.out.println("손흥민".matches("[가-힣]{3}"));      // true
        System.out.println("손흥민".matches("[가-힣]{3}"));      // true
        System.out.println("허리케인".matches("[가-힣]{3}"));    // true

        // {IsHangul} 사용시 기존보다 조금 간결해짐
        System.out.println("손흥민".matches("\\p{IsHangul}{3}"));      // true
        System.out.println("손흥민".matches("\\p{IsHangul}{3}"));      // true
        System.out.println("허리케인".matches("\\p{IsHangul}{3}"));      // true
    }
}
