package com.google.common.collect;

import java.util.Map.Entry;

/* renamed from: com.google.common.collect.c */
abstract class C10872c<K, V> implements Entry<K, V> {
    C10872c() {
    }

    public abstract K getKey();

    public abstract V getValue();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }
}
