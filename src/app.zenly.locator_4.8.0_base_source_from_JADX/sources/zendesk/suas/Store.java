package zendesk.suas;

public interface Store extends GetState, Dispatcher {
    Subscription addActionListener(Listener<C13600a<?>> listener);

    <E> Subscription addListener(Class<E> cls, Filter<E> filter, Listener<E> listener);

    <E> Subscription addListener(Class<E> cls, Listener<E> listener);

    <E> Subscription addListener(String str, Class<E> cls, Filter<E> filter, Listener<E> listener);

    <E> Subscription addListener(String str, Class<E> cls, Listener<E> listener);

    <E> Subscription addListener(String str, Filter<E> filter, Listener<E> listener);

    <E> Subscription addListener(String str, Listener<E> listener);

    Subscription addListener(Filter<C13622i> filter, Listener<C13622i> listener);

    <E> Subscription addListener(Filter<C13622i> filter, StateSelector<E> stateSelector, Listener<E> listener);

    Subscription addListener(Listener<C13622i> listener);

    <E> Subscription addListener(StateSelector<E> stateSelector, Listener<E> listener);

    void removeListener(Listener<?> listener);

    void reset(C13622i iVar);
}
