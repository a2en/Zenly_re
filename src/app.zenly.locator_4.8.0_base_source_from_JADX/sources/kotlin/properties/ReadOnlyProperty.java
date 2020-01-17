package kotlin.properties;

import kotlin.reflect.KProperty;

public interface ReadOnlyProperty<R, T> {
    T getValue(R r, KProperty<?> kProperty);
}
