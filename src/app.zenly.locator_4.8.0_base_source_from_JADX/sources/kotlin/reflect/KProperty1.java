package kotlin.reflect;

import kotlin.jvm.functions.Function1;

public interface KProperty1<T, R> extends KProperty<R>, Function1<T, R> {

    public interface Getter<T, R> extends kotlin.reflect.KProperty.Getter<R>, Function1<T, R> {
    }

    R get(T t);

    Object getDelegate(T t);

    Getter<T, R> getGetter();
}
