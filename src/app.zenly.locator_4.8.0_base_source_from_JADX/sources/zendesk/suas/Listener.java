package zendesk.suas;

public interface Listener<E> {
    void update(E e);
}
