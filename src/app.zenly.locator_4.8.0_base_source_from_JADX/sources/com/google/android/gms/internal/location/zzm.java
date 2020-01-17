package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

public final class zzm extends AbstractSafeParcelable {
    public static final Creator<zzm> CREATOR = new C10503j0();

    /* renamed from: h */
    static final List<ClientIdentity> f27461h = Collections.emptyList();

    /* renamed from: i */
    static final zzj f27462i = new zzj();

    /* renamed from: e */
    private zzj f27463e;

    /* renamed from: f */
    private List<ClientIdentity> f27464f;

    /* renamed from: g */
    private String f27465g;

    zzm(zzj zzj, List<ClientIdentity> list, String str) {
        this.f27463e = zzj;
        this.f27464f = list;
        this.f27465g = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return C10120k.m25501a(this.f27463e, zzm.f27463e) && C10120k.m25501a(this.f27464f, zzm.f27464f) && C10120k.m25501a(this.f27465g, zzm.f27465g);
    }

    public final int hashCode() {
        return this.f27463e.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 1, (Parcelable) this.f27463e, i, false);
        C10134a.m25597c(parcel, 2, this.f27464f, false);
        C10134a.m25583a(parcel, 3, this.f27465g, false);
        C10134a.m25571a(parcel, a);
    }
}
