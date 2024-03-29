package app.models.exceptions;

/**
 * Exception class for the models package
 */
public class ModelException extends RuntimeException
{
    public ModelException ()
    {
        super();
    }

    public ModelException (String message)
    {
        super(message);
    }

    public ModelException (String message, Throwable cause)
    {
        super(message, cause);
    }

    public ModelException (Throwable cause)
    {
        super(cause);
    }

    protected ModelException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
