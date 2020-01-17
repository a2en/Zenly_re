package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectClause1;

public interface Deferred<T> extends Job {
    Object await(Continuation<? super T> continuation);

    T getCompleted();

    Throwable getCompletionExceptionOrNull();

    SelectClause1<T> getOnAwait();
}
