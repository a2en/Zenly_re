package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineScope;

public interface ProducerScope<E> extends CoroutineScope, SendChannel<E> {
    SendChannel<E> getChannel();
}
