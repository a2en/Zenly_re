package kotlin.reflect;

import kotlin.jvm.functions.Function2;

public interface KProperty2<D, E, R> extends KProperty<R>, Function2<D, E, R> {

    public interface Getter<D, E, R> extends kotlin.reflect.KProperty.Getter<R>, Function2<D, E, R> {
    }

    R get(D d, E e);

    Object getDelegate(D d, E e);

    Getter<D, E, R> getGetter();
}
