package com.google.common.collect;

import com.google.common.collect.Multiset.Entry;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

public interface SortedMultiset<E> extends C10893j0<E>, C10891i0<E> {
    Comparator<? super E> comparator();

    SortedMultiset<E> descendingMultiset();

    NavigableSet<E> elementSet();

    Set<Entry<E>> entrySet();

    Entry<E> firstEntry();

    SortedMultiset<E> headMultiset(E e, C10874d dVar);

    Iterator<E> iterator();

    Entry<E> lastEntry();

    Entry<E> pollFirstEntry();

    Entry<E> pollLastEntry();

    SortedMultiset<E> subMultiset(E e, C10874d dVar, E e2, C10874d dVar2);

    SortedMultiset<E> tailMultiset(E e, C10874d dVar);
}
