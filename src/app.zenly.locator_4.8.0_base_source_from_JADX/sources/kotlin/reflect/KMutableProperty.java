package kotlin.reflect;

import kotlin.C12956q;
import kotlin.reflect.KProperty.Accessor;

public interface KMutableProperty<R> extends KProperty<R> {

    public interface Setter<R> extends Accessor<R>, KFunction<C12956q> {
    }

    Setter<R> getSetter();
}
