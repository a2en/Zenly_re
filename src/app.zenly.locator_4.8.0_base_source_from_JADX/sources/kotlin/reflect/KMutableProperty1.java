package kotlin.reflect;

import kotlin.C12956q;
import kotlin.jvm.functions.Function2;

public interface KMutableProperty1<T, R> extends KProperty1<T, R>, KMutableProperty<R> {

    public interface Setter<T, R> extends kotlin.reflect.KMutableProperty.Setter<R>, Function2<T, R, C12956q> {
    }

    Setter<T, R> getSetter();

    void set(T t, R r);
}
