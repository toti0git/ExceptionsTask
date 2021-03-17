package exeption;

public class NullFacultyNotFoundExeption extends Exception{
    public NullFacultyNotFoundExeption() {
    }

    public NullFacultyNotFoundExeption(String message) {
        super(message);
    }

    public NullFacultyNotFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NullFacultyNotFoundExeption(Throwable cause) {
        super(cause);
    }

    public NullFacultyNotFoundExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
