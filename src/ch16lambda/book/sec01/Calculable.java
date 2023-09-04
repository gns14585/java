package ch16lambda.book.sec01;

@FunctionalInterface // 추상메소드가 하나인지 컴파일러를 통해 검증
public interface Calculable {
    void calculate(int x, int y);
}
