package kotlin.reflect;

import kotlin.jvm.functions.Function0;

public interface KProperty0<R> extends KProperty<R>, Function0<R> {

    public interface Getter<R> extends kotlin.reflect.KProperty.Getter<R>, Function0<R> {
    }

    R get();

    Object getDelegate();

    Getter<R> getGetter();
}
