package kotlinx.coroutines.channels;

import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.selects.SelectClause2;

public interface SendChannel<E> {
    boolean close(Throwable th);

    SelectClause2<E, SendChannel<E>> getOnSend();

    void invokeOnClose(Function1<? super Throwable, C12956q> function1);

    boolean isClosedForSend();

    boolean isFull();

    boolean offer(E e);

    Object send(E e, Continuation<? super C12956q> continuation);
}
