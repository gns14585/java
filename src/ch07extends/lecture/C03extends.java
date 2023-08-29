package ch07extends.lecture;

public class C03extends {
    public static void main(String[] args) {
        MySubClass031 o1 = new MySubClass031();
        o1.printName();
    }
}

class MyClass03 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void printName() {
        System.out.println("name = " + name);
    }
}

class MySubClass031 extends MyClass03 {
    // private field 는 자식 클래스에서 사용 불가
}
