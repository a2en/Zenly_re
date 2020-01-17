package com.wonderkiln.camerakit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p214e.p228e.C7585h;

public class AspectRatio implements Comparable<AspectRatio>, Parcelable {
    public static final Creator<AspectRatio> CREATOR = new C11947a();

    /* renamed from: g */
    private static final C7585h<C7585h<AspectRatio>> f31125g = new C7585h<>(16);

    /* renamed from: e */
    private final int f31126e;

    /* renamed from: f */
    private final int f31127f;

    /* renamed from: com.wonderkiln.camerakit.AspectRatio$a */
    static class C11947a implements Creator<AspectRatio> {
        C11947a() {
        }

        public AspectRatio createFromParcel(Parcel parcel) {
            return AspectRatio.m31428b(parcel.readInt(), parcel.readInt());
        }

        public AspectRatio[] newArray(int i) {
            return new AspectRatio[i];
        }
    }

    private AspectRatio(int i, int i2) {
        this.f31126e = i;
        this.f31127f = i2;
    }

    /* renamed from: a */
    public boolean mo35453a(C11991r rVar) {
        int a = m31427a(rVar.mo35600b(), rVar.mo35598a());
        return this.f31126e == rVar.mo35600b() / a && this.f31127f == rVar.mo35598a() / a;
    }

    /* renamed from: b */
    public float mo35454b() {
        return ((float) this.f31126e) / ((float) this.f31127f);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatio) {
            AspectRatio aspectRatio = (AspectRatio) obj;
            if (this.f31126e == aspectRatio.f31126e && this.f31127f == aspectRatio.f31127f) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = this.f31127f;
        int i2 = this.f31126e;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31126e);
        sb.append(":");
        sb.append(this.f31127f);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31126e);
        parcel.writeInt(this.f31127f);
    }

    /* renamed from: b */
    public static AspectRatio m31428b(int i, int i2) {
        int a = m31427a(i, i2);
        int i3 = i / a;
        int i4 = i2 / a;
        C7585h hVar = (C7585h) f31125g.mo19617a(i3);
        if (hVar == null) {
            AspectRatio aspectRatio = new AspectRatio(i3, i4);
            C7585h hVar2 = new C7585h();
            hVar2.mo19622c(i4, aspectRatio);
            f31125g.mo19622c(i3, hVar2);
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = (AspectRatio) hVar.mo19617a(i4);
        if (aspectRatio2 == null) {
            aspectRatio2 = new AspectRatio(i3, i4);
            hVar.mo19622c(i4, aspectRatio2);
        }
        return aspectRatio2;
    }

    /* renamed from: a */
    public int compareTo(AspectRatio aspectRatio) {
        if (equals(aspectRatio)) {
            return 0;
        }
        return mo35454b() - aspectRatio.mo35454b() > 0.0f ? 1 : -1;
    }

    /* renamed from: a */
    public AspectRatio mo35452a() {
        return m31428b(this.f31127f, this.f31126e);
    }

    /* renamed from: a */
    private static int m31427a(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = i4 % i;
        }
    }
}
