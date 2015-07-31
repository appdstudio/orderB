package exception;

public abstract class BaseException extends Exception {

	private static final long serialVersionUID = 1L;

	public BaseException() {
        super();
    }

   
  /*  public BaseException(final Throwable originalException, final Message message, final Object... params) {
        super(LGTMessageSource.getMessage(message, params), originalException);
    }

  
    public BaseException(final Message message, final Object... params) {
        super(LGTMessageSource.getMessage(message, params));
    }

   
    public BaseException(final Throwable originalException, final String message) {
        super(message, originalException);
    }

   
    public BaseException(final Throwable originalException) {
        super(originalException);
    }*/
    
}
