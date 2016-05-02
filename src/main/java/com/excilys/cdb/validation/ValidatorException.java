package com.excilys.cdb.validation;

public class ValidatorException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * default constructor.
     */
    public ValidatorException() {
        super();
    }

    /**
     * constructor taking only a message.
     *
     * @param message
     *            message for the exception
     */
    public ValidatorException(final String message) {
        super(message);
    }

    /**
     * constructor taking a string message and un throwable.
     *
     * @param message
     *            message
     * @param cause
     *            throwable
     */
    public ValidatorException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * constructor taking a throwable.
     *
     * @param cause
     *            throwable
     */
    public ValidatorException(final Throwable cause) {
        super(cause);
    }
}
