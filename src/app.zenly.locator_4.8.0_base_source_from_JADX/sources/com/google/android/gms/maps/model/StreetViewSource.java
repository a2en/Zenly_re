package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Creator<StreetViewSource> CREATOR = new C10634a0();

    /* renamed from: f */
    public static final StreetViewSource f27706f = new StreetViewSource(0);

    /* renamed from: e */
    private final int f27707e;

    static {
        Class<StreetViewSource> cls = StreetViewSource.class;
        new StreetViewSource(1);
    }

    public StreetViewSource(int i) {
        this.f27707e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewSource)) {
            return false;
        }
        return this.f27707e == ((StreetViewSource) obj).f27707e;
    }

    public final int hashCode() {
        return C10120k.m25499a(Integer.valueOf(this.f27707e));
    }

    public final String toString() {
        String str;
        int i = this.f27707e;
        if (i == 0) {
            str = "DEFAULT";
        } else if (i != 1) {
            str = String.format("UNKNOWN(%s)", new Object[]{Integer.valueOf(i)});
        } else {
            str = "OUTDOOR";
        }
        return String.format("StreetViewSource:%s", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 2, this.f27707e);
        C10134a.m25571a(parcel, a);
    }
}
