package ch16lambda.book.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action(Computer::staticMethod);
        person.action(Computer::instanceMethod);
    }
}
