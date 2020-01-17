package zendesk.suas;

public interface Filter<E> {
    boolean filter(E e, E e2);
}
