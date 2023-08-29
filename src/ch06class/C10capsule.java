package ch06class;

public class C10capsule {
    public static void main(String[] args) {

    }
}

class MyClass10 {
    // 특별한 이유가 없다면 private 로 생성 후 getter, setter 생성

    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
