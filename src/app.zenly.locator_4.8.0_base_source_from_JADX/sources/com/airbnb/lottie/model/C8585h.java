package com.airbnb.lottie.model;

import androidx.core.util.C0603e;

/* renamed from: com.airbnb.lottie.model.h */
public class C8585h<T> {

    /* renamed from: a */
    T f22018a;

    /* renamed from: b */
    T f22019b;

    /* renamed from: b */
    private static boolean m19917b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public void mo23175a(T t, T t2) {
        this.f22018a = t;
        this.f22019b = t2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0603e)) {
            return false;
        }
        C0603e eVar = (C0603e) obj;
        if (m19917b(eVar.f2729a, this.f22018a) && m19917b(eVar.f2730b, this.f22019b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        T t = this.f22018a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f22019b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.f22018a));
        sb.append(" ");
        sb.append(String.valueOf(this.f22019b));
        sb.append("}");
        return sb.toString();
    }
}
