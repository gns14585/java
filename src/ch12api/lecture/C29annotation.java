package ch12api.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation28
public class C29annotation {
    @MyAnnotation28
    int field;
    @MyAnnotation28
    public static void main(@MyAnnotation28 String[] args) {
        @MyAnnotation28
        int local;
    }
}

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.TYPE})
@interface MyAnnotation29 {

}
