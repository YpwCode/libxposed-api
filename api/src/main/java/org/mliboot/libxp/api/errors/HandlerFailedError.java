package org.mliboot.libxp.api.errors;

/**
 * Thrown to indicate that a hook failed due to framework internal error.
 */
@SuppressWarnings("unused")
public class HandlerFailedError extends XpFrameworkError {

    public HandlerFailedError(String message) {
        super(message);
    }

    public HandlerFailedError(String message, Throwable cause) {
        super(message, cause);
    }

    public HandlerFailedError(Throwable cause) {
        super(cause);
    }
}
