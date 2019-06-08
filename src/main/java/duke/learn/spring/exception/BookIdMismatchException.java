/**
 * 
 */
package duke.learn.spring.exception;

/**
 * @author Kazi
 *
 */
public class BookIdMismatchException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -3166560189628134834L;

    /**
     * 
     */
    public BookIdMismatchException() {
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public BookIdMismatchException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public BookIdMismatchException(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public BookIdMismatchException(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public BookIdMismatchException(String message, Throwable cause, boolean enableSuppression,
	    boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	// TODO Auto-generated constructor stub
    }

}
