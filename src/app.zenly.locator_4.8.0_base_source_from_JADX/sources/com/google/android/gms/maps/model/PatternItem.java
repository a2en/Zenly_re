package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class PatternItem extends AbstractSafeParcelable {
    public static final Creator<PatternItem> CREATOR = new C10657s();

    /* renamed from: e */
    private final int f27667e;

    /* renamed from: f */
    private final Float f27668f;

    static {
        Class<PatternItem> cls = PatternItem.class;
    }

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        C10123l.m25513a(z, (Object) sb.toString());
        this.f27667e = i;
        this.f27668f = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f27667e == patternItem.f27667e && C10120k.m25501a(this.f27668f, patternItem.f27668f);
    }

    public int hashCode() {
        return C10120k.m25499a(Integer.valueOf(this.f27667e), this.f27668f);
    }

    public String toString() {
        int i = this.f27667e;
        String valueOf = String.valueOf(this.f27668f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 2, this.f27667e);
        C10134a.m25581a(parcel, 3, this.f27668f, false);
        C10134a.m25571a(parcel, a);
    }
}
