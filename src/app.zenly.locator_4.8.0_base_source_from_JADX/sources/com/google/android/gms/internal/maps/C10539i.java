package com.google.android.gms.internal.maps;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.maps.i */
public class C10539i {

    /* renamed from: a */
    private static final ClassLoader f27472a = C10539i.class.getClassLoader();

    private C10539i() {
    }

    /* renamed from: a */
    public static boolean m26947a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: b */
    public static void m26949b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    /* renamed from: a */
    public static void m26946a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m26943a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static ArrayList m26948b(Parcel parcel) {
        return parcel.readArrayList(f27472a);
    }

    /* renamed from: a */
    public static void m26945a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m26944a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
