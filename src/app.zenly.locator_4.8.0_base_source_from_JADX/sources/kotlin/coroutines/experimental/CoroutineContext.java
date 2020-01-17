package kotlin.coroutines.experimental;

import kotlin.jvm.functions.Function2;

public interface CoroutineContext {

    public interface Element extends CoroutineContext {
        <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2);

        <E extends Element> E get(Key<E> key);

        Key<?> getKey();

        CoroutineContext minusKey(Key<?> key);
    }

    public interface Key<E extends Element> {
    }

    <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2);

    <E extends Element> E get(Key<E> key);

    CoroutineContext minusKey(Key<?> key);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
