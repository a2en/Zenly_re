package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C13149u;

public final class ChildCancelledException extends CancellationException {
    public ChildCancelledException() {
        super("Child of the scoped flow was cancelled");
    }

    public Throwable fillInStackTrace() {
        if (C13149u.m34326b()) {
            super.fillInStackTrace();
        }
        return this;
    }
}
