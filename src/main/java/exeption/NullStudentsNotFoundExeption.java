package exeption;

public class NullStudentsNotFoundExeption extends Exception{
    public NullStudentsNotFoundExeption() {
    }

    public NullStudentsNotFoundExeption(String message) {
        super(message);
    }

    public NullStudentsNotFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NullStudentsNotFoundExeption(Throwable cause) {
        super(cause);
    }

    public NullStudentsNotFoundExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
