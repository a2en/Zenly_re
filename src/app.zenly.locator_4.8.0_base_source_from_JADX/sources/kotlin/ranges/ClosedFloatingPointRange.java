package kotlin.ranges;

import java.lang.Comparable;

public interface ClosedFloatingPointRange<T extends Comparable<? super T>> extends ClosedRange<T> {
    boolean contains(T t);

    boolean isEmpty();

    boolean lessThanOrEquals(T t, T t2);
}
