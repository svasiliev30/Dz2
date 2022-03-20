package sbp.exceptions;

public class CustomException extends Exception{

    /**
     * Сюда отправлят
     * @param message
     * @param cause
     */
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
