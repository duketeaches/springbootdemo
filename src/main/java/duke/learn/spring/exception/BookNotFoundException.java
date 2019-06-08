/**
 * 
 */
package duke.learn.spring.exception;

/**
 * @author Kazi
 *
 */
public class BookNotFoundException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 92407689557670062L;

    /**
     * 
     */
    public BookNotFoundException() {
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public BookNotFoundException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public BookNotFoundException(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public BookNotFoundException(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public BookNotFoundException(String message, Throwable cause, boolean enableSuppression,
	    boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	// TODO Auto-generated constructor stub
    }

}
