package kotlinx.coroutines.sync;

import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectClause2;

public interface Mutex {
    SelectClause2<Object, Mutex> getOnLock();

    boolean holdsLock(Object obj);

    boolean isLocked();

    Object lock(Object obj, Continuation<? super C12956q> continuation);

    boolean tryLock(Object obj);

    void unlock(Object obj);
}
