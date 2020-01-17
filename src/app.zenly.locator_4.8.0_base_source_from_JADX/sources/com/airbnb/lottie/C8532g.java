package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.g */
public final class C8532g<V> {

    /* renamed from: a */
    private final V f21837a;

    /* renamed from: b */
    private final Throwable f21838b;

    public C8532g(V v) {
        this.f21837a = v;
        this.f21838b = null;
    }

    /* renamed from: a */
    public Throwable mo23027a() {
        return this.f21838b;
    }

    /* renamed from: b */
    public V mo23028b() {
        return this.f21837a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8532g)) {
            return false;
        }
        C8532g gVar = (C8532g) obj;
        if (mo23028b() != null && mo23028b().equals(gVar.mo23028b())) {
            return true;
        }
        if (mo23027a() == null || gVar.mo23027a() == null) {
            return false;
        }
        return mo23027a().toString().equals(mo23027a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo23028b(), mo23027a()});
    }

    public C8532g(Throwable th) {
        this.f21838b = th;
        this.f21837a = null;
    }
}
