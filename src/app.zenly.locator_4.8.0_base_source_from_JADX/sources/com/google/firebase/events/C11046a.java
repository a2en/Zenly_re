package com.google.firebase.events;

/* renamed from: com.google.firebase.events.a */
public class C11046a<T> {

    /* renamed from: a */
    private final Class<T> f28661a;

    /* renamed from: b */
    private final T f28662b;

    /* renamed from: a */
    public Class<T> mo32215a() {
        return this.f28661a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f28661a, this.f28662b});
    }
}
