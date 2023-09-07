package ch13generic.book.Question.q03;

public class Container<T, U> {
    private T key;
    private U Value;

    public T getKey() {
        return key;
    }

    public void set(T key, U Value) {
        this.key = key;
        this.Value = Value;
    }

    public U getValue() {
        return Value;
    }

    public void setValue(U value) {
        Value = value;
    }
}
