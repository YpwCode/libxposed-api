package org.mliboot.libxp.api.errors;

/**
 * Thrown to indicate that the Xposed framework function is broken.
 */
public class XpFrameworkError extends Error {

    public XpFrameworkError(String message) {
        super(message);
    }

    public XpFrameworkError(String message, Throwable cause) {
        super(message, cause);
    }

    public XpFrameworkError(Throwable cause) {
        super(cause);
    }
}
