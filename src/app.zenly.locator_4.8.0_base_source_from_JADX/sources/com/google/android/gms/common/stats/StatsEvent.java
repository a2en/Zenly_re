package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    public interface Types {
    }

    /* renamed from: a */
    public abstract int mo27581a();

    /* renamed from: b */
    public abstract long mo27582b();

    /* renamed from: c */
    public abstract long mo27583c();

    /* renamed from: d */
    public abstract String mo27584d();

    public String toString() {
        long b = mo27582b();
        int a = mo27581a();
        long c = mo27583c();
        String d = mo27584d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 53);
        sb.append(b);
        String str = "\t";
        sb.append(str);
        sb.append(a);
        sb.append(str);
        sb.append(c);
        sb.append(d);
        return sb.toString();
    }
}
