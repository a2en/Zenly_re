package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.C13085b;

public interface SelectInstance<R> {
    void disposeOnSelect(DisposableHandle disposableHandle);

    Continuation<R> getCompletion();

    boolean isSelected();

    Object performAtomicTrySelect(C13085b bVar);

    void resumeSelectCancellableWithException(Throwable th);

    boolean trySelect(Object obj);
}
