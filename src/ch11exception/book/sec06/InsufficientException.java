package ch11exception.book.sec06;

public class InsufficientException extends Exception{
    public InsufficientException() {

    }

    public InsufficientException(String message) {
        super(message);
    }

}
