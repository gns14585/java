package c12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        // regular expression : 정교표현식(정규식, 정규식표현)
        // 문자열의 패턴을 나타내는 기호들

        // 문자
        System.out.println("x".matches("x")); // true
        System.out.println("a".matches("a")); // true
        System.out.println("a".matches("x")); // false

        // 문자들
        System.out.println("xyz".matches("xyz")); // true
        System.out.println("xxx".matches("xxx")); // true
        System.out.println("xxx".matches("x"));   // false

        // 수량자(quantifiers)
        System.out.println("xxx".matches("x{3}")); // true
        System.out.println("aaa".matches("a{3}")); // true
        System.out.println("aa".matches("a{3}"));  // false
        System.out.println("aaa".matches("a{1,3}")); // true
        System.out.println("aa".matches("a{1,3}")); // true
        System.out.println("a".matches("a{1,3}")); // true

        // 일정 수 반복 인데, 마지막 글 추가 할 경우 "문자{숫자}문자"
        // 문자{숫자}문자 중 앞에 문자에서 마지막 문자만 반복됨
        System.out.println("dog".matches("do{1,3}g"));   // true
        System.out.println("dooog".matches("do{1,3}g")); // true
        System.out.println("doog".matches("do{1,3}g"));  // true

        System.out.println("dodog".matches("do{1,3}g")); // false

        // 그룹 : ()
        // 괄호로 묶을경우 해당 문자열 반복
        System.out.println("dodog".matches("(do){1,3}g"));   // true
        System.out.println("dododog".matches("(do){1,3}g")); // true
        System.out.println("dog".matches("(do){1,3}g"));     // true

        // 수량 : 반복횟수가 1개 이상 일 경우 "문자{숫자, }문자"
        System.out.println("dog".matches("do{1,}g"));       // true
        System.out.println("doog".matches("do{1,}g"));      // true
        System.out.println("dooog".matches("do{1,}g"));     // true
        System.out.println("doooog".matches("do{1,}g"));    // true

        // ? : 없거나 한번
        System.out.println("dg".matches("do?g"));           // true
        System.out.println("dog".matches("do?g"));          // true
        System.out.println("doog".matches("do?g"));         // false

        // * : 0번 이상
        System.out.println("dg".matches("do*g"));           // true
        System.out.println("dog".matches("do*g"));          // true
        System.out.println("doog".matches("do*g"));         // true
        System.out.println("dooog".matches("do*g"));        // true
        System.out.println("doooog".matches("do*g"));       // true

        // + : 1번 이상
        System.out.println("dg".matches("do+g"));           // false
        System.out.println("dog".matches("do+g"));          // true
        System.out.println("doog".matches("do+g"));         // true
        System.out.println("dooog".matches("do+g"));        // true
        System.out.println("doooog".matches("do+g"));       // true

        // 문자 분류 (Character classes)
        System.out.println("dog".matches("d[oi]g"));   // true
        System.out.println("dig".matches("d[oi]g"));   // true
        System.out.println("dag".matches("d[io]g"));   // false

        // ^는 아닌것 이라는 의미 ( not , ! )
        System.out.println("dog".matches("d[^oi]g")); // false
        System.out.println("dig".matches("d[^oi]g")); // false
        System.out.println("dag".matches("d[^oi]g")); // true

        System.out.println("dag".matches("d[a-cx-z]g")); // true

        // 문자 분류 기호
        System.out.println("0".matches("[0-9]"));   // true
        System.out.println("7".matches("[0-9]"));   // true
        System.out.println("0".matches("\\d"));     // true
        System.out.println("7".matches("\\d"));     // true

        System.out.println("a".matches("[a-z-Z_0-9]"));
        System.out.println("_".matches("\\w"));
        System.out.println("8".matches("\\w"));

        // 예제 : 숫자로 시작하면 안되고, 영문대소문자, _, $
        System.out.println("".matches("[^\\d]\\w*"));

        String pattern = "[a-zA-z_&][a-zA-z_$0-9]*";
        System.out.println("pattern_1".matches(pattern));
        System.out.println("_".matches(pattern));
        System.out.println("$".matches(pattern));

        // 전화번호 패턴
        // 010-9999-9999
        // 02-9999-9999
        // 02-999-9999

        System.out.println("- - - - -테스트- - - - -");
        String p1 = "[\\d{2,3}]*-?[\\d{3,4}]*-?[\\d{4}]*";
        System.out.println("01036138304".matches(p1));
        System.out.println("02-305-8183".matches(p1));
        System.out.println("010-3613-8304".matches(p1));
        System.out.println("023058183".matches(p1));



        System.out.println("- - - - -테스트 끝 - - - - -");

        String pattern2 = "\\d{2,3}-?\\d{3,4}-?\\d{4}";
        System.out.println("010-3613-8304".matches(pattern2));
        System.out.println("02-361-8304".matches(pattern2));
        System.out.println("01036138304".matches(pattern2));

        // 모든 문자 : .
        System.out.println(" ".matches("."));       // true
        System.out.println("a".matches("."));       // true
        System.out.println("3".matches("."));       // true
        System.out.println("+".matches("."));       // true
        System.out.println(".".matches("."));       // true

        // .만 표현하고 싶을때 : \.
        System.out.println(" ".matches("\\."));     // false
        System.out.println("a".matches("\\."));     // false
        System.out.println("3".matches("\\."));     // false
        System.out.println("+".matches("\\."));     // false
        System.out.println(".".matches("\\."));     // true

        // 이메일 패턴 예제
        // 영문소문자, 숫자가 여러개  @ 영문소문자,숫자 여러개 . 영문소문자,숫자 여러개
        System.out.println("- - - - - - - - - 테스트 시작 - - - - - - - -");
        String p2 = "^[^\\d][a-zA-Z0-9]*@[^\\d][a-zA-Z0-9]*\\.[^\\d][a-zA-Z0-9]*";
        System.out.println("gns14585@naver.com".matches(p2));
        System.out.println("- - - - - - - - - 테스트 끝 - - - - - - - - -");




        String pattern3 = "[a-z\\d]+@[a-z\\d]+\\.[a-z\\d]+";
        System.out.println("gns14585@naver.com".matches(pattern3));

        // or : | (또는)
        System.out.println("auefhdogdif".matches(".*dog.*"));
        System.out.println("3493catkdie".matches(".*cat.*"));
        System.out.println("auefhdogdif".matches(".*(dog|cat).*"));
        System.out.println("3493catkdie".matches(".*(dog|cat).*"));



    }
}
