package com.mapbox.mapboxsdk;

/* renamed from: com.mapbox.mapboxsdk.c */
class C11446c extends RuntimeException {
    C11446c(String str) {
        super(String.format("Map detected an error that would fail silently otherwise: %s", new Object[]{str}));
    }
}
