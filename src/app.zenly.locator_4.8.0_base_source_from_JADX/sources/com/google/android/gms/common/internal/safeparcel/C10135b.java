package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public final class C10135b {
    /* renamed from: a */
    public static <T extends SafeParcelable> T m25599a(byte[] bArr, Creator<T> creator) {
        C10123l.m25505a(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> T m25598a(Intent intent, String str, Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m25599a(byteArrayExtra, creator);
    }
}
