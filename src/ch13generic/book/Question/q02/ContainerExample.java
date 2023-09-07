package ch13generic.book.Question.q02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.setField("홍길동");
        String str = container1.getField();
        System.out.println(str);

        Container<Integer> container2 = new Container<>();
        container2.setField(6);
        int value = container2.getField();
        System.out.println(value);
    }
}
