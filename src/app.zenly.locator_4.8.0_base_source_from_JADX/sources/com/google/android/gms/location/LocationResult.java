package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationResult> CREATOR = new C10581k();

    /* renamed from: f */
    static final List<Location> f27512f = Collections.emptyList();

    /* renamed from: e */
    private final List<Location> f27513e;

    LocationResult(List<Location> list) {
        this.f27513e = list;
    }

    /* renamed from: a */
    public static LocationResult m26982a(Intent intent) {
        if (!m26983b(intent)) {
            return null;
        }
        return (LocationResult) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    /* renamed from: b */
    public static boolean m26983b(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    /* renamed from: a */
    public final Location mo28661a() {
        int size = this.f27513e.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f27513e.get(size - 1);
    }

    /* renamed from: b */
    public final List<Location> mo28662b() {
        return this.f27513e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f27513e.size() != this.f27513e.size()) {
            return false;
        }
        Iterator it = this.f27513e.iterator();
        for (Location time : locationResult.f27513e) {
            if (((Location) it.next()).getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.f27513e) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27513e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25597c(parcel, 1, mo28662b(), false);
        C10134a.m25571a(parcel, a);
    }
}
