package ch16lambda.book.sec02;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(() -> {
            System.out.println("출근 합니다.");
            System.out.println("프로그래밍 합니다.");
        });

        person.action(() -> System.out.println("퇴근합니다."));
    }
}
