package ch11exception.book.Question.p07;

public class NotExistIDException extends Exception{
    public NotExistIDException() {}
    public NotExistIDException(String message) {
        super(message);
    }
}
