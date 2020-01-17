package com.mapbox.mapboxsdk.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public class LocationComponentOptions implements Parcelable {
    public static final Creator<LocationComponentOptions> CREATOR = new C11471a();

    /* renamed from: A */
    private int[] f29652A;

    /* renamed from: B */
    private float f29653B;

    /* renamed from: C */
    private float f29654C;

    /* renamed from: D */
    private boolean f29655D;

    /* renamed from: E */
    private float f29656E;

    /* renamed from: F */
    private float f29657F;

    /* renamed from: G */
    private String f29658G;

    /* renamed from: H */
    private float f29659H;

    /* renamed from: I */
    private boolean f29660I;

    /* renamed from: J */
    private boolean f29661J;

    /* renamed from: e */
    private float f29662e;

    /* renamed from: f */
    private int f29663f;

    /* renamed from: g */
    private int f29664g;

    /* renamed from: h */
    private String f29665h;

    /* renamed from: i */
    private int f29666i;

    /* renamed from: j */
    private String f29667j;

    /* renamed from: k */
    private int f29668k;

    /* renamed from: l */
    private String f29669l;

    /* renamed from: m */
    private int f29670m;

    /* renamed from: n */
    private String f29671n;

    /* renamed from: o */
    private int f29672o;

    /* renamed from: p */
    private String f29673p;

    /* renamed from: q */
    private int f29674q;

    /* renamed from: r */
    private String f29675r;

    /* renamed from: s */
    private Integer f29676s;

    /* renamed from: t */
    private Integer f29677t;

    /* renamed from: u */
    private Integer f29678u;

    /* renamed from: v */
    private Integer f29679v;

    /* renamed from: w */
    private Integer f29680w;

    /* renamed from: x */
    private float f29681x;

    /* renamed from: y */
    private boolean f29682y;

    /* renamed from: z */
    private long f29683z;

    /* renamed from: com.mapbox.mapboxsdk.location.LocationComponentOptions$a */
    static class C11471a implements Creator<LocationComponentOptions> {
        C11471a() {
        }

        public LocationComponentOptions createFromParcel(Parcel parcel) {
            LocationComponentOptions locationComponentOptions = new LocationComponentOptions(parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readFloat(), parcel.readInt() == 1, parcel.readLong(), parcel.createIntArray(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 1, parcel.readFloat(), parcel.readFloat(), parcel.readString(), parcel.readFloat(), parcel.readInt() == 1, parcel.readInt() == 1);
            return locationComponentOptions;
        }

        public LocationComponentOptions[] newArray(int i) {
            return new LocationComponentOptions[i];
        }
    }

    public LocationComponentOptions(float f, int i, int i2, String str, int i3, String str2, int i4, String str3, int i5, String str4, int i6, String str5, int i7, String str6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, float f2, boolean z, long j, int[] iArr, float f3, float f4, boolean z2, float f5, float f6, String str7, float f7, boolean z3, boolean z4) {
        int[] iArr2 = iArr;
        this.f29662e = f;
        this.f29663f = i;
        this.f29664g = i2;
        this.f29665h = str;
        this.f29666i = i3;
        this.f29667j = str2;
        this.f29668k = i4;
        this.f29669l = str3;
        this.f29670m = i5;
        this.f29671n = str4;
        this.f29672o = i6;
        this.f29673p = str5;
        this.f29674q = i7;
        this.f29675r = str6;
        this.f29676s = num;
        this.f29677t = num2;
        this.f29678u = num3;
        this.f29679v = num4;
        this.f29680w = num5;
        this.f29681x = f2;
        this.f29682y = z;
        this.f29683z = j;
        if (iArr2 != null) {
            this.f29652A = iArr2;
            this.f29653B = f3;
            this.f29654C = f4;
            this.f29655D = z2;
            this.f29656E = f5;
            this.f29657F = f6;
            this.f29658G = str7;
            this.f29659H = f7;
            this.f29660I = z3;
            this.f29661J = z4;
            return;
        }
        throw new NullPointerException("Null padding");
    }

    /* renamed from: A */
    public int[] mo33402A() {
        return this.f29652A;
    }

    /* renamed from: B */
    public long mo33403B() {
        return this.f29683z;
    }

    /* renamed from: C */
    public float mo33404C() {
        return this.f29659H;
    }

    /* renamed from: D */
    public boolean mo33405D() {
        return this.f29655D;
    }

    /* renamed from: E */
    public float mo33406E() {
        return this.f29656E;
    }

    /* renamed from: F */
    public float mo33407F() {
        return this.f29657F;
    }

    /* renamed from: a */
    public float mo33408a() {
        return this.f29662e;
    }

    /* renamed from: b */
    public boolean mo33409b() {
        return this.f29661J;
    }

    /* renamed from: c */
    public int mo33410c() {
        return this.f29663f;
    }

    /* renamed from: d */
    public int mo33411d() {
        return this.f29672o;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo33413e() {
        return this.f29664g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c8, code lost:
        if (java.lang.Float.floatToIntBits(r7.f29659H) == java.lang.Float.floatToIntBits(r8.mo33404C())) goto L_0x01cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.mapbox.mapboxsdk.location.LocationComponentOptions
            r2 = 0
            if (r1 == 0) goto L_0x01cd
            com.mapbox.mapboxsdk.location.LocationComponentOptions r8 = (com.mapbox.mapboxsdk.location.LocationComponentOptions) r8
            float r1 = r7.f29662e
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r8.mo33408a()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x01cb
            int r1 = r7.f29663f
            int r3 = r8.mo33410c()
            if (r1 != r3) goto L_0x01cb
            int r1 = r7.f29664g
            int r3 = r8.mo33413e()
            if (r1 != r3) goto L_0x01cb
            java.lang.String r1 = r7.f29665h
            if (r1 != 0) goto L_0x0036
            java.lang.String r1 = r8.mo33416g()
            if (r1 != 0) goto L_0x01cb
            goto L_0x0040
        L_0x0036:
            java.lang.String r3 = r8.mo33416g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x0040:
            int r1 = r7.f29666i
            int r3 = r8.mo33427q()
            if (r1 != r3) goto L_0x01cb
            java.lang.String r1 = r7.f29667j
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = r8.mo33429s()
            if (r1 != 0) goto L_0x01cb
            goto L_0x005d
        L_0x0053:
            java.lang.String r3 = r8.mo33429s()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x005d:
            int r1 = r7.f29668k
            int r3 = r8.mo33433v()
            if (r1 != r3) goto L_0x01cb
            java.lang.String r1 = r7.f29669l
            if (r1 != 0) goto L_0x0070
            java.lang.String r1 = r8.mo33434w()
            if (r1 != 0) goto L_0x01cb
            goto L_0x007a
        L_0x0070:
            java.lang.String r3 = r8.mo33434w()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x007a:
            int r1 = r7.f29670m
            int r3 = r8.mo33426p()
            if (r1 != r3) goto L_0x01cb
            java.lang.String r1 = r7.f29671n
            if (r1 != 0) goto L_0x008d
            java.lang.String r1 = r8.mo33428r()
            if (r1 != 0) goto L_0x01cb
            goto L_0x0097
        L_0x008d:
            java.lang.String r3 = r8.mo33428r()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x0097:
            int r1 = r7.f29672o
            int r3 = r8.mo33411d()
            if (r1 != r3) goto L_0x01cb
            java.lang.String r1 = r7.f29673p
            if (r1 != 0) goto L_0x00aa
            java.lang.String r1 = r8.mo33415f()
            if (r1 != 0) goto L_0x01cb
            goto L_0x00b4
        L_0x00aa:
            java.lang.String r3 = r8.mo33415f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x00b4:
            int r1 = r7.f29674q
            int r3 = r8.mo33420j()
            if (r1 != r3) goto L_0x01cb
            java.lang.String r1 = r7.f29675r
            if (r1 != 0) goto L_0x00c7
            java.lang.String r1 = r8.mo33421k()
            if (r1 != 0) goto L_0x01cb
            goto L_0x00d1
        L_0x00c7:
            java.lang.String r3 = r8.mo33421k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x00d1:
            java.lang.Integer r1 = r7.f29676s
            if (r1 != 0) goto L_0x00dc
            java.lang.Integer r1 = r8.mo33422l()
            if (r1 != 0) goto L_0x01cb
            goto L_0x00e6
        L_0x00dc:
            java.lang.Integer r3 = r8.mo33422l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x00e6:
            java.lang.Integer r1 = r7.f29677t
            if (r1 != 0) goto L_0x00f1
            java.lang.Integer r1 = r8.mo33432u()
            if (r1 != 0) goto L_0x01cb
            goto L_0x00fb
        L_0x00f1:
            java.lang.Integer r3 = r8.mo33432u()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x00fb:
            java.lang.Integer r1 = r7.f29678u
            if (r1 != 0) goto L_0x0106
            java.lang.Integer r1 = r8.mo33419i()
            if (r1 != 0) goto L_0x01cb
            goto L_0x0110
        L_0x0106:
            java.lang.Integer r3 = r8.mo33419i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x0110:
            java.lang.Integer r1 = r7.f29679v
            if (r1 != 0) goto L_0x011b
            java.lang.Integer r1 = r8.mo33430t()
            if (r1 != 0) goto L_0x01cb
            goto L_0x0125
        L_0x011b:
            java.lang.Integer r3 = r8.mo33430t()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x0125:
            java.lang.Integer r1 = r7.f29680w
            if (r1 != 0) goto L_0x0130
            java.lang.Integer r1 = r8.mo33417h()
            if (r1 != 0) goto L_0x01cb
            goto L_0x013a
        L_0x0130:
            java.lang.Integer r3 = r8.mo33417h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
        L_0x013a:
            float r1 = r7.f29681x
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r8.mo33424n()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x01cb
            boolean r1 = r7.f29682y
            boolean r3 = r8.mo33425o()
            if (r1 != r3) goto L_0x01cb
            long r3 = r7.f29683z
            long r5 = r8.mo33403B()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x01cb
            int[] r1 = r7.f29652A
            int[] r3 = r8.mo33402A()
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L_0x01cb
            float r1 = r7.f29653B
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r8.mo33437y()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x01cb
            float r1 = r7.f29654C
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r8.mo33438z()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x01cb
            boolean r1 = r7.f29655D
            boolean r3 = r8.mo33405D()
            if (r1 != r3) goto L_0x01cb
            float r1 = r7.f29656E
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r8.mo33406E()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x01cb
            float r1 = r7.f29657F
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r8.mo33407F()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x01cb
            java.lang.String r1 = r7.f29658G
            java.lang.String r3 = r8.f29658G
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01cb
            float r1 = r7.f29659H
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r8 = r8.mo33404C()
            int r8 = java.lang.Float.floatToIntBits(r8)
            if (r1 != r8) goto L_0x01cb
            goto L_0x01cc
        L_0x01cb:
            r0 = 0
        L_0x01cc:
            return r0
        L_0x01cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.location.LocationComponentOptions.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo33415f() {
        return this.f29673p;
    }

    /* renamed from: g */
    public String mo33416g() {
        return this.f29665h;
    }

    /* renamed from: h */
    public Integer mo33417h() {
        return this.f29680w;
    }

    public int hashCode() {
        int floatToIntBits = (((((Float.floatToIntBits(this.f29662e) ^ 1000003) * 1000003) ^ this.f29663f) * 1000003) ^ this.f29664g) * 1000003;
        String str = this.f29665h;
        int i = 0;
        int hashCode = (((floatToIntBits ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f29666i) * 1000003;
        String str2 = this.f29667j;
        int hashCode2 = (((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f29668k) * 1000003;
        String str3 = this.f29669l;
        int hashCode3 = (((hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f29670m) * 1000003;
        String str4 = this.f29671n;
        int hashCode4 = (((hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ this.f29672o) * 1000003;
        String str5 = this.f29673p;
        int hashCode5 = (((hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.f29674q) * 1000003;
        String str6 = this.f29675r;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        Integer num = this.f29676s;
        int hashCode7 = (hashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.f29677t;
        int hashCode8 = (hashCode7 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.f29678u;
        int hashCode9 = (hashCode8 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.f29679v;
        int hashCode10 = (hashCode9 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        Integer num5 = this.f29680w;
        if (num5 != null) {
            i = num5.hashCode();
        }
        int floatToIntBits2 = (((hashCode10 ^ i) * 1000003) ^ Float.floatToIntBits(this.f29681x)) * 1000003;
        int i2 = 1231;
        int i3 = (floatToIntBits2 ^ (this.f29682y ? 1231 : 1237)) * 1000003;
        long j = this.f29683z;
        int hashCode11 = (((((((((((((((((i3 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f29652A)) * 1000003) ^ Float.floatToIntBits(this.f29653B)) * 1000003) ^ Float.floatToIntBits(this.f29654C)) * 1000003) ^ (this.f29655D ? 1231 : 1237)) * 1000003) ^ Float.floatToIntBits(this.f29656E)) * 1000003) ^ Float.floatToIntBits(this.f29657F)) * 1000003) ^ Float.floatToIntBits(this.f29659H)) * 1000003) ^ (this.f29660I ? 1231 : 1237)) * 1000003;
        if (!this.f29661J) {
            i2 = 1237;
        }
        return hashCode11 ^ i2;
    }

    /* renamed from: i */
    public Integer mo33419i() {
        return this.f29678u;
    }

    /* renamed from: j */
    public int mo33420j() {
        return this.f29674q;
    }

    /* renamed from: k */
    public String mo33421k() {
        return this.f29675r;
    }

    /* renamed from: l */
    public Integer mo33422l() {
        return this.f29676s;
    }

    /* renamed from: m */
    public boolean mo33423m() {
        return this.f29660I;
    }

    /* renamed from: n */
    public float mo33424n() {
        return this.f29681x;
    }

    /* renamed from: o */
    public boolean mo33425o() {
        return this.f29682y;
    }

    /* renamed from: p */
    public int mo33426p() {
        return this.f29670m;
    }

    /* renamed from: q */
    public int mo33427q() {
        return this.f29666i;
    }

    /* renamed from: r */
    public String mo33428r() {
        return this.f29671n;
    }

    /* renamed from: s */
    public String mo33429s() {
        return this.f29667j;
    }

    /* renamed from: t */
    public Integer mo33430t() {
        return this.f29679v;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationComponentOptions{accuracyAlpha=");
        sb.append(this.f29662e);
        sb.append(", accuracyColor=");
        sb.append(this.f29663f);
        sb.append(", backgroundDrawableStale=");
        sb.append(this.f29664g);
        sb.append(", backgroundStaleName=");
        sb.append(this.f29665h);
        sb.append(", foregroundDrawableStale=");
        sb.append(this.f29666i);
        sb.append(", foregroundStaleName=");
        sb.append(this.f29667j);
        sb.append(", gpsDrawable=");
        sb.append(this.f29668k);
        sb.append(", gpsName=");
        sb.append(this.f29669l);
        sb.append(", foregroundDrawable=");
        sb.append(this.f29670m);
        sb.append(", foregroundName=");
        sb.append(this.f29671n);
        sb.append(", backgroundDrawable=");
        sb.append(this.f29672o);
        sb.append(", backgroundName=");
        sb.append(this.f29673p);
        sb.append(", bearingDrawable=");
        sb.append(this.f29674q);
        sb.append(", bearingName=");
        sb.append(this.f29675r);
        sb.append(", bearingTintColor=");
        sb.append(this.f29676s);
        sb.append(", foregroundTintColor=");
        sb.append(this.f29677t);
        sb.append(", backgroundTintColor=");
        sb.append(this.f29678u);
        sb.append(", foregroundStaleTintColor=");
        sb.append(this.f29679v);
        sb.append(", backgroundStaleTintColor=");
        sb.append(this.f29680w);
        sb.append(", elevation=");
        sb.append(this.f29681x);
        sb.append(", enableStaleState=");
        sb.append(this.f29682y);
        sb.append(", staleStateTimeout=");
        sb.append(this.f29683z);
        sb.append(", padding=");
        sb.append(Arrays.toString(this.f29652A));
        sb.append(", maxZoomIconScale=");
        sb.append(this.f29653B);
        sb.append(", minZoomIconScale=");
        sb.append(this.f29654C);
        sb.append(", trackingGesturesManagement=");
        sb.append(this.f29655D);
        sb.append(", trackingInitialMoveThreshold=");
        sb.append(this.f29656E);
        sb.append(", trackingMultiFingerMoveThreshold=");
        sb.append(this.f29657F);
        sb.append(", layerBelow=");
        sb.append(this.f29658G);
        sb.append("trackingAnimationDurationMultiplier=");
        sb.append(this.f29659H);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public Integer mo33432u() {
        return this.f29677t;
    }

    /* renamed from: v */
    public int mo33433v() {
        return this.f29668k;
    }

    /* renamed from: w */
    public String mo33434w() {
        return this.f29669l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(mo33408a());
        parcel.writeInt(mo33410c());
        parcel.writeInt(mo33413e());
        if (mo33416g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mo33416g());
        }
        parcel.writeInt(mo33427q());
        if (mo33429s() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mo33429s());
        }
        parcel.writeInt(mo33433v());
        if (mo33434w() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mo33434w());
        }
        parcel.writeInt(mo33426p());
        if (mo33428r() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mo33428r());
        }
        parcel.writeInt(mo33411d());
        if (mo33415f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mo33415f());
        }
        parcel.writeInt(mo33420j());
        if (mo33421k() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mo33421k());
        }
        if (mo33422l() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mo33422l().intValue());
        }
        if (mo33432u() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mo33432u().intValue());
        }
        if (mo33419i() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mo33419i().intValue());
        }
        if (mo33430t() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mo33430t().intValue());
        }
        if (mo33417h() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mo33417h().intValue());
        }
        parcel.writeFloat(mo33424n());
        parcel.writeInt(mo33425o() ? 1 : 0);
        parcel.writeLong(mo33403B());
        parcel.writeIntArray(mo33402A());
        parcel.writeFloat(mo33437y());
        parcel.writeFloat(mo33438z());
        parcel.writeInt(mo33405D() ? 1 : 0);
        parcel.writeFloat(mo33406E());
        parcel.writeFloat(mo33407F());
        parcel.writeString(mo33436x());
        parcel.writeFloat(this.f29659H);
        parcel.writeInt(mo33423m() ? 1 : 0);
        parcel.writeInt(mo33409b() ? 1 : 0);
    }

    /* renamed from: x */
    public String mo33436x() {
        return this.f29658G;
    }

    /* renamed from: y */
    public float mo33437y() {
        return this.f29653B;
    }

    /* renamed from: z */
    public float mo33438z() {
        return this.f29654C;
    }
}
