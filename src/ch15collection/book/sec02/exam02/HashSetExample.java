package ch15collection.book.sec02.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        System.out.println("총 객체 수 : " + set.size());

        for (Member me : set) {
            System.out.println(me.getName() + " : " + me.getAge());
        }
    }
}
