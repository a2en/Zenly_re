package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C13149u;

public final class AbortFlowException extends CancellationException {
    public AbortFlowException() {
        super("Flow was aborted, no more elements needed");
    }

    public Throwable fillInStackTrace() {
        if (C13149u.m34326b()) {
            super.fillInStackTrace();
        }
        return this;
    }
}
