package kotlinx.coroutines.channels;

public interface ReceiveOrClosed<E> {
    void completeResumeReceive(Object obj);

    Object getOfferResult();

    Object tryResumeReceive(E e, Object obj);
}
