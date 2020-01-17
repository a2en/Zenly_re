package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class ActivityTransition extends AbstractSafeParcelable {
    public static final Creator<ActivityTransition> CREATOR = new C10593t();

    /* renamed from: e */
    private final int f27479e;

    /* renamed from: f */
    private final int f27480f;

    ActivityTransition(int i, int i2) {
        this.f27479e = i;
        this.f27480f = i2;
    }

    public static void zza(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        C10123l.m25513a(z, (Object) sb.toString());
    }

    /* renamed from: a */
    public int mo28594a() {
        return this.f27479e;
    }

    /* renamed from: b */
    public int mo28595b() {
        return this.f27480f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f27479e == activityTransition.f27479e && this.f27480f == activityTransition.f27480f;
    }

    public int hashCode() {
        return C10120k.m25499a(Integer.valueOf(this.f27479e), Integer.valueOf(this.f27480f));
    }

    public String toString() {
        int i = this.f27479e;
        int i2 = this.f27480f;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, mo28594a());
        C10134a.m25575a(parcel, 2, mo28595b());
        C10134a.m25571a(parcel, a);
    }
}
