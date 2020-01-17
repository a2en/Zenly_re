package com.google.firebase.components;

import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.firebase.components.k */
public final class C11040k {

    /* renamed from: a */
    private final Class<?> f28642a;

    /* renamed from: b */
    private final int f28643b;

    /* renamed from: c */
    private final int f28644c;

    private C11040k(Class<?> cls, int i, int i2) {
        C10123l.m25506a(cls, (Object) "Null dependency anInterface.");
        this.f28642a = cls;
        this.f28643b = i;
        this.f28644c = i2;
    }

    /* renamed from: a */
    public static C11040k m28441a(Class<?> cls) {
        return new C11040k(cls, 1, 0);
    }

    /* renamed from: b */
    public static C11040k m28442b(Class<?> cls) {
        return new C11040k(cls, 2, 0);
    }

    /* renamed from: c */
    public boolean mo32203c() {
        return this.f28643b == 1;
    }

    /* renamed from: d */
    public boolean mo32204d() {
        return this.f28643b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11040k)) {
            return false;
        }
        C11040k kVar = (C11040k) obj;
        if (this.f28642a == kVar.f28642a && this.f28643b == kVar.f28643b && this.f28644c == kVar.f28644c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f28642a.hashCode() ^ 1000003) * 1000003) ^ this.f28643b) * 1000003) ^ this.f28644c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f28642a);
        sb.append(", type=");
        int i = this.f28643b;
        boolean z = true;
        String str = i == 1 ? "required" : i == 0 ? "optional" : "set";
        sb.append(str);
        sb.append(", direct=");
        if (this.f28644c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public Class<?> mo32201a() {
        return this.f28642a;
    }

    /* renamed from: b */
    public boolean mo32202b() {
        return this.f28644c == 0;
    }
}
