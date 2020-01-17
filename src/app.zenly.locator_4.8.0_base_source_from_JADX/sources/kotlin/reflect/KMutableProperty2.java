package kotlin.reflect;

import kotlin.C12956q;
import kotlin.jvm.functions.Function3;

public interface KMutableProperty2<D, E, R> extends KProperty2<D, E, R>, KMutableProperty<R> {

    public interface Setter<D, E, R> extends kotlin.reflect.KMutableProperty.Setter<R>, Function3<D, E, R, C12956q> {
    }

    Setter<D, E, R> getSetter();

    void set(D d, E e, R r);
}
