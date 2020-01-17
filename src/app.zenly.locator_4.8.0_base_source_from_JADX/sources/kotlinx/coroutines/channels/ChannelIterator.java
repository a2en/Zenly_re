package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;

public interface ChannelIterator<E> {
    Object hasNext(Continuation<? super Boolean> continuation);

    E next();

    /* synthetic */ Object next(Continuation<? super E> continuation);
}
