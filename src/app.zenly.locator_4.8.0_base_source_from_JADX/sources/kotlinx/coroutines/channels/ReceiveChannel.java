package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectClause1;

public interface ReceiveChannel<E> {
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    SelectClause1<E> getOnReceive();

    SelectClause1<Object<E>> getOnReceiveOrClosed();

    SelectClause1<E> getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    ChannelIterator<E> iterator();

    E poll();

    Object receive(Continuation<? super E> continuation);

    Object receiveOrClosed(Continuation<? super Object<? extends E>> continuation);

    Object receiveOrNull(Continuation<? super E> continuation);
}
