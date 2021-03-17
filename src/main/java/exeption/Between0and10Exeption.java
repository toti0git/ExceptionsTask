package exeption;

public class Between0and10Exeption extends Exception{
    public Between0and10Exeption() {
    }

    public Between0and10Exeption(String message) {
        super(message);
    }

    public Between0and10Exeption(String message, Throwable cause) {
        super(message, cause);
    }

    public Between0and10Exeption(Throwable cause) {
        super(cause);
    }

    public Between0and10Exeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
