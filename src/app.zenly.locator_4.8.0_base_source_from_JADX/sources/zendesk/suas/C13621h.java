package zendesk.suas;

/* renamed from: zendesk.suas.h */
public abstract class C13621h<E> {
    public abstract E getInitialState();

    public String getStateKey() {
        return C13622i.m35938b(getInitialState().getClass());
    }

    public abstract E reduce(E e, C13600a<?> aVar);
}
