package kotlin.reflect;

import kotlin.C12956q;
import kotlin.jvm.functions.Function1;

public interface KMutableProperty0<R> extends KProperty0<R>, KMutableProperty<R> {

    public interface Setter<R> extends kotlin.reflect.KMutableProperty.Setter<R>, Function1<R, C12956q> {
    }

    Setter<R> getSetter();

    void set(R r);
}
