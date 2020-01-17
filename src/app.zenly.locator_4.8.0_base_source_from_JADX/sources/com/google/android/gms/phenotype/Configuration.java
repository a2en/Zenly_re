package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Configuration extends AbstractSafeParcelable implements Comparable<Configuration> {
    public static final Creator<Configuration> CREATOR = new C10667b();

    /* renamed from: e */
    private final int f27732e;

    /* renamed from: f */
    private final zzi[] f27733f;

    /* renamed from: g */
    private final String[] f27734g;

    /* renamed from: h */
    private final Map<String, zzi> f27735h = new TreeMap();

    public Configuration(int i, zzi[] zziArr, String[] strArr) {
        this.f27732e = i;
        this.f27733f = zziArr;
        for (zzi zzi : zziArr) {
            this.f27735h.put(zzi.f27747e, zzi);
        }
        this.f27734g = strArr;
        String[] strArr2 = this.f27734g;
        if (strArr2 != null) {
            Arrays.sort(strArr2);
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return this.f27732e - ((Configuration) obj).f27732e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            if (this.f27732e == configuration.f27732e && C10676k.m27184a(this.f27735h, configuration.f27735h) && Arrays.equals(this.f27734g, configuration.f27734g)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f27732e);
        String str = ", ";
        sb.append(str);
        String str2 = "(";
        sb.append(str2);
        for (zzi append : this.f27735h.values()) {
            sb.append(append);
            sb.append(str);
        }
        String str3 = ")";
        sb.append(str3);
        sb.append(str);
        sb.append(str2);
        String[] strArr = this.f27734g;
        if (strArr != null) {
            for (String append2 : strArr) {
                sb.append(append2);
                sb.append(str);
            }
        } else {
            sb.append("null");
        }
        sb.append(str3);
        sb.append(str3);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 2, this.f27732e);
        C10134a.m25589a(parcel, 3, (T[]) this.f27733f, i, false);
        C10134a.m25590a(parcel, 4, this.f27734g, false);
        C10134a.m25571a(parcel, a);
    }
}
