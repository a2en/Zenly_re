package com.google.android.gms.internal.gcm;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.gcm.b */
public class C10469b {
    static {
        C10469b.class.getClassLoader();
    }

    private C10469b() {
    }

    /* renamed from: a */
    public static void m26855a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
