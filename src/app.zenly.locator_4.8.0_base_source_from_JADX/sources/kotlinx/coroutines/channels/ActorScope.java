package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineScope;

public interface ActorScope<E> extends CoroutineScope, ReceiveChannel<E> {
    Channel<E> getChannel();
}
