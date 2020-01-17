package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter;

public final class zab extends AbstractSafeParcelable {
    public static final Creator<zab> CREATOR = new C10154a();

    /* renamed from: e */
    private final int f26677e;

    /* renamed from: f */
    private final StringToIntConverter f26678f;

    zab(int i, StringToIntConverter stringToIntConverter) {
        this.f26677e = i;
        this.f26678f = stringToIntConverter;
    }

    /* renamed from: a */
    public static zab m25608a(FieldConverter<?, ?> fieldConverter) {
        if (fieldConverter instanceof StringToIntConverter) {
            return new zab((StringToIntConverter) fieldConverter);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26677e);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f26678f, i, false);
        C10134a.m25571a(parcel, a);
    }

    private zab(StringToIntConverter stringToIntConverter) {
        this.f26677e = 1;
        this.f26678f = stringToIntConverter;
    }

    /* renamed from: a */
    public final FieldConverter<?, ?> mo27545a() {
        StringToIntConverter stringToIntConverter = this.f26678f;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }
}
