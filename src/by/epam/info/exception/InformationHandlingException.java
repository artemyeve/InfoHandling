package by.epam.info.exception;


public class InformationHandlingException extends  Exception {

    public InformationHandlingException() {
        super();
    }

    public InformationHandlingException(String message) {
        super(message);
    }

    public InformationHandlingException(Throwable cause) {
        super(cause);
    }

    public InformationHandlingException(String message, Throwable cause) {
        super(message, cause);
    }
}
