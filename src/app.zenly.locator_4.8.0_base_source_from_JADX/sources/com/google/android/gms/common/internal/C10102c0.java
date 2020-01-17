package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.common.internal.c0 */
final class C10102c0 implements Creator<BinderWrapper> {
    C10102c0() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
