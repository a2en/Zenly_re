package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class Feature extends AbstractSafeParcelable {
    public static final Creator<Feature> CREATOR = new C10144k();

    /* renamed from: e */
    private final String f26259e;
    @Deprecated

    /* renamed from: f */
    private final int f26260f;

    /* renamed from: g */
    private final long f26261g;

    public Feature(String str, long j) {
        this.f26259e = str;
        this.f26261g = j;
        this.f26260f = -1;
    }

    /* renamed from: a */
    public String mo26998a() {
        return this.f26259e;
    }

    /* renamed from: b */
    public long mo26999b() {
        long j = this.f26261g;
        return j == -1 ? (long) this.f26260f : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo26998a() != null && mo26998a().equals(feature.mo26998a())) || (mo26998a() == null && feature.mo26998a() == null)) && mo26999b() == feature.mo26999b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C10120k.m25499a(mo26998a(), Long.valueOf(mo26999b()));
    }

    public String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("name", mo26998a());
        a.mo27499a("version", Long.valueOf(mo26999b()));
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25583a(parcel, 1, mo26998a(), false);
        C10134a.m25575a(parcel, 2, this.f26260f);
        C10134a.m25576a(parcel, 3, mo26999b());
        C10134a.m25571a(parcel, a);
    }

    public Feature(String str, int i, long j) {
        this.f26259e = str;
        this.f26260f = i;
        this.f26261g = j;
    }
}
