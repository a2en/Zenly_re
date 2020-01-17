package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.android.volley.toolbox.C8733j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

public final class zzbh extends AbstractSafeParcelable implements Geofence {
    public static final Creator<zzbh> CREATOR = new C10489c0();

    /* renamed from: e */
    private final String f27452e;

    /* renamed from: f */
    private final long f27453f;

    /* renamed from: g */
    private final short f27454g;

    /* renamed from: h */
    private final double f27455h;

    /* renamed from: i */
    private final double f27456i;

    /* renamed from: j */
    private final float f27457j;

    /* renamed from: k */
    private final int f27458k;

    /* renamed from: l */
    private final int f27459l;

    /* renamed from: m */
    private final int f27460m;

    public zzbh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            String str2 = "requestId is null or too long: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f27454g = s;
                this.f27452e = str;
                this.f27455h = d;
                this.f27456i = d2;
                this.f27457j = f;
                this.f27453f = j;
                this.f27458k = i4;
                this.f27459l = i2;
                this.f27460m = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: a */
    public static zzbh m26934a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        zzbh zzbh = (zzbh) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return zzbh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.f27457j == zzbh.f27457j && this.f27455h == zzbh.f27455h && this.f27456i == zzbh.f27456i && this.f27454g == zzbh.f27454g;
    }

    public final String getRequestId() {
        return this.f27452e;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f27455h);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f27456i);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f27457j)) * 31) + this.f27454g) * 31) + this.f27458k;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f27454g != 1 ? null : "CIRCLE";
        objArr[1] = this.f27452e.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f27458k);
        objArr[3] = Double.valueOf(this.f27455h);
        objArr[4] = Double.valueOf(this.f27456i);
        objArr[5] = Float.valueOf(this.f27457j);
        objArr[6] = Integer.valueOf(this.f27459l / C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
        objArr[7] = Integer.valueOf(this.f27460m);
        objArr[8] = Long.valueOf(this.f27453f);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25583a(parcel, 1, getRequestId(), false);
        C10134a.m25576a(parcel, 2, this.f27453f);
        C10134a.m25585a(parcel, 3, this.f27454g);
        C10134a.m25573a(parcel, 4, this.f27455h);
        C10134a.m25573a(parcel, 5, this.f27456i);
        C10134a.m25574a(parcel, 6, this.f27457j);
        C10134a.m25575a(parcel, 7, this.f27458k);
        C10134a.m25575a(parcel, 8, this.f27459l);
        C10134a.m25575a(parcel, 9, this.f27460m);
        C10134a.m25571a(parcel, a);
    }
}
