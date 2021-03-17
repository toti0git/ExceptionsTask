package exeption;

public class NullGroupNotFoundExeption extends Exception{
    public NullGroupNotFoundExeption() {
    }

    public NullGroupNotFoundExeption(String message) {
        super(message);
    }

    public NullGroupNotFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NullGroupNotFoundExeption(Throwable cause) {
        super(cause);
    }

    public NullGroupNotFoundExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
