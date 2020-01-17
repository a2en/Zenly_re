package com.snap.p327ui.seeking;

import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: com.snap.ui.seeking.Seekable */
public interface Seekable<T> extends Iterable<T>, KMappedMarker {
    T get(int i);

    int size();
}
