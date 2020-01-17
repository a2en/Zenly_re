package com.facebook.common.references;

import java.lang.ref.SoftReference;

/* renamed from: com.facebook.common.references.a */
public class C9553a<T> {

    /* renamed from: a */
    SoftReference<T> f24750a = null;

    /* renamed from: b */
    SoftReference<T> f24751b = null;

    /* renamed from: c */
    SoftReference<T> f24752c = null;

    /* renamed from: a */
    public void mo25738a(T t) {
        this.f24750a = new SoftReference<>(t);
        this.f24751b = new SoftReference<>(t);
        this.f24752c = new SoftReference<>(t);
    }

    /* renamed from: b */
    public T mo25739b() {
        SoftReference<T> softReference = this.f24750a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* renamed from: a */
    public void mo25737a() {
        SoftReference<T> softReference = this.f24750a;
        if (softReference != null) {
            softReference.clear();
            this.f24750a = null;
        }
        SoftReference<T> softReference2 = this.f24751b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f24751b = null;
        }
        SoftReference<T> softReference3 = this.f24752c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f24752c = null;
        }
    }
}
