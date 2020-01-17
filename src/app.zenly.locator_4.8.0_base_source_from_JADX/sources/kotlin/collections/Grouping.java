package kotlin.collections;

import java.util.Iterator;

public interface Grouping<T, K> {
    K keyOf(T t);

    Iterator<T> sourceIterator();
}
