package com.facebook.imagepipeline.common;

import com.facebook.common.internal.C9536j;
import com.facebook.common.util.C9555a;

/* renamed from: com.facebook.imagepipeline.common.a */
public class C9697a {

    /* renamed from: a */
    public final int f25330a;

    /* renamed from: b */
    public final int f25331b;

    public C9697a(int i, int i2) {
        this.f25330a = i;
        this.f25331b = i2;
    }

    /* renamed from: b */
    public static C9697a m23838b(int i) {
        C9536j.m23275a(i > 0);
        return new C9697a(0, i);
    }

    /* renamed from: c */
    private static String m23839c(int i) {
        return i == Integer.MAX_VALUE ? "" : Integer.toString(i);
    }

    /* renamed from: a */
    public boolean mo26253a(C9697a aVar) {
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (this.f25330a <= aVar.f25330a && this.f25331b >= aVar.f25331b) {
            z = true;
        }
        return z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9697a)) {
            return false;
        }
        C9697a aVar = (C9697a) obj;
        if (!(this.f25330a == aVar.f25330a && this.f25331b == aVar.f25331b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C9555a.m23376a(this.f25330a, this.f25331b);
    }

    public String toString() {
        return String.format(null, "%s-%s", new Object[]{m23839c(this.f25330a), m23839c(this.f25331b)});
    }

    /* renamed from: a */
    public static C9697a m23837a(int i) {
        C9536j.m23275a(i >= 0);
        return new C9697a(i, Integer.MAX_VALUE);
    }
}
