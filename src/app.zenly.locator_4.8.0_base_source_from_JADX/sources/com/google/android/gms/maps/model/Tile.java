package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class Tile extends AbstractSafeParcelable {
    public static final Creator<Tile> CREATOR = new C10636b0();

    /* renamed from: e */
    public final int f27708e;

    /* renamed from: f */
    public final int f27709f;

    /* renamed from: g */
    public final byte[] f27710g;

    public Tile(int i, int i2, byte[] bArr) {
        this.f27708e = i;
        this.f27709f = i2;
        this.f27710g = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 2, this.f27708e);
        C10134a.m25575a(parcel, 3, this.f27709f);
        C10134a.m25587a(parcel, 4, this.f27710g, false);
        C10134a.m25571a(parcel, a);
    }
}
