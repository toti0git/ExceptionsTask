package exeption;

public class NullSubjectExeption extends Exception{
    public NullSubjectExeption() {
    }

    public NullSubjectExeption(String message) {
        super(message);
    }

    public NullSubjectExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NullSubjectExeption(Throwable cause) {
        super(cause);
    }

    public NullSubjectExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
