package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C10002g();

    /* renamed from: e */
    private final int f26271e;

    /* renamed from: f */
    private final String f26272f;

    Scope(int i, String str) {
        C10123l.m25507a(str, (Object) "scopeUri must not be null or empty");
        this.f26271e = i;
        this.f26272f = str;
    }

    /* renamed from: a */
    public final String mo27054a() {
        return this.f26272f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f26272f.equals(((Scope) obj).f26272f);
    }

    public final int hashCode() {
        return this.f26272f.hashCode();
    }

    public final String toString() {
        return this.f26272f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26271e);
        C10134a.m25583a(parcel, 2, mo27054a(), false);
        C10134a.m25571a(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
