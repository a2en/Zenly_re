package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final Creator<DetectedActivity> CREATOR = new C10599z();

    /* renamed from: g */
    private static final int[] f27489g = {0, 1, 2, 3, 7, 8, 16, 17};

    /* renamed from: e */
    private int f27490e;

    /* renamed from: f */
    private int f27491f;

    static {
        new C10598y();
    }

    public DetectedActivity(int i, int i2) {
        this.f27490e = i;
        this.f27491f = i2;
    }

    /* renamed from: a */
    public static void m26966a(int i) {
        boolean z = false;
        for (int i2 : f27489g) {
            if (i2 == i) {
                z = true;
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(81);
            sb.append(i);
            sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
            Log.w("DetectedActivity", sb.toString());
        }
    }

    /* renamed from: a */
    public int mo28615a() {
        return this.f27491f;
    }

    /* renamed from: b */
    public int mo28616b() {
        int i = this.f27490e;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DetectedActivity.class == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            return this.f27490e == detectedActivity.f27490e && this.f27491f == detectedActivity.f27491f;
        }
    }

    public int hashCode() {
        return C10120k.m25499a(Integer.valueOf(this.f27490e), Integer.valueOf(this.f27491f));
    }

    public String toString() {
        String str;
        int b = mo28616b();
        if (b == 0) {
            str = "IN_VEHICLE";
        } else if (b == 1) {
            str = "ON_BICYCLE";
        } else if (b == 2) {
            str = "ON_FOOT";
        } else if (b == 3) {
            str = "STILL";
        } else if (b == 4) {
            str = "UNKNOWN";
        } else if (b == 5) {
            str = "TILTING";
        } else if (b == 7) {
            str = "WALKING";
        } else if (b != 8) {
            switch (b) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(b);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        int i = this.f27491f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f27490e);
        C10134a.m25575a(parcel, 2, this.f27491f);
        C10134a.m25571a(parcel, a);
    }
}
