package c12api.book.Question.Q3;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Ange1004";
        String regExp = "[^\\d][\\w]{8,12}";
        boolean isMatch = id.matches(regExp);
        if (isMatch) {
            System.out.println("ID로 사용 할 수 있습니다.");
        } else {
            System.out.println("ID로 사용 할 수 없습니다.");
        }
    }
}
