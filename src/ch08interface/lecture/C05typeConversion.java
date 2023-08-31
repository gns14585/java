package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i = 3;

        Serializable s = i;
        Comparable<Integer> cp = i;
        Constable co = i;
        ConstantDesc cd = i;

    }

}
