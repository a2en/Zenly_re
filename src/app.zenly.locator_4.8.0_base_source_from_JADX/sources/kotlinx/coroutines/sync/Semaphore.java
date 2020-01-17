package kotlinx.coroutines.sync;

import kotlin.C12956q;
import kotlin.coroutines.Continuation;

public interface Semaphore {
    Object acquire(Continuation<? super C12956q> continuation);

    int getAvailablePermits();

    void release();

    boolean tryAcquire();
}
