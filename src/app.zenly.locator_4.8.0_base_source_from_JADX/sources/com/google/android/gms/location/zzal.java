package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.Collections;
import java.util.List;

public final class zzal extends AbstractSafeParcelable {
    public static final Creator<zzal> CREATOR = new C10591r();

    /* renamed from: e */
    private final List<String> f27554e;

    /* renamed from: f */
    private final PendingIntent f27555f;

    /* renamed from: g */
    private final String f27556g;

    zzal(List<String> list, PendingIntent pendingIntent, String str) {
        this.f27554e = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f27555f = pendingIntent;
        this.f27556g = str;
    }

    /* renamed from: a */
    public static zzal m27032a(PendingIntent pendingIntent) {
        C10123l.m25506a(pendingIntent, (Object) "PendingIntent can not be null.");
        return new zzal(null, pendingIntent, "");
    }

    /* renamed from: a */
    public static zzal m27033a(List<String> list) {
        C10123l.m25506a(list, (Object) "geofence can't be null.");
        C10123l.m25513a(!list.isEmpty(), (Object) "Geofences must contains at least one id.");
        return new zzal(list, null, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25595b(parcel, 1, this.f27554e, false);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f27555f, i, false);
        C10134a.m25583a(parcel, 3, this.f27556g, false);
        C10134a.m25571a(parcel, a);
    }
}
