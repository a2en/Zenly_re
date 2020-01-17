package com.mapbox.android.telemetry;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NavigationMetadata implements Parcelable {
    public static final Creator<NavigationMetadata> CREATOR = new C11314a();

    /* renamed from: A */
    private String f29307A;

    /* renamed from: B */
    private String f29308B;

    /* renamed from: C */
    private Integer f29309C;

    /* renamed from: D */
    private Integer f29310D;

    /* renamed from: E */
    private String f29311E;

    /* renamed from: F */
    private int f29312F;

    /* renamed from: G */
    private Integer f29313G;

    /* renamed from: H */
    private String f29314H;

    /* renamed from: I */
    private String f29315I;

    /* renamed from: J */
    private int f29316J;

    /* renamed from: K */
    private int f29317K;

    /* renamed from: L */
    private String f29318L;

    /* renamed from: M */
    private Boolean f29319M;

    /* renamed from: N */
    private int f29320N;

    /* renamed from: O */
    private String f29321O;

    /* renamed from: P */
    private String f29322P;

    /* renamed from: Q */
    private int f29323Q;

    /* renamed from: R */
    private int f29324R;

    /* renamed from: S */
    private int f29325S;

    /* renamed from: T */
    private Integer f29326T;

    /* renamed from: U */
    private Integer f29327U;

    /* renamed from: V */
    private int f29328V;

    /* renamed from: e */
    private int f29329e;

    /* renamed from: f */
    private Integer f29330f;

    /* renamed from: g */
    private Integer f29331g;

    /* renamed from: h */
    private String f29332h;

    /* renamed from: i */
    private int f29333i;

    /* renamed from: j */
    private int f29334j;

    /* renamed from: k */
    private int f29335k;

    /* renamed from: l */
    private String f29336l;

    /* renamed from: m */
    private int f29337m;

    /* renamed from: n */
    private String f29338n;

    /* renamed from: o */
    private String f29339o;

    /* renamed from: p */
    private String f29340p;

    /* renamed from: q */
    private double f29341q;

    /* renamed from: r */
    private double f29342r;

    /* renamed from: s */
    private String f29343s;

    /* renamed from: t */
    private String f29344t;

    /* renamed from: u */
    private String f29345u;

    /* renamed from: v */
    private Integer f29346v;

    /* renamed from: w */
    private Integer f29347w;

    /* renamed from: x */
    private Integer f29348x;

    /* renamed from: y */
    private boolean f29349y;

    /* renamed from: z */
    private String f29350z;

    /* renamed from: com.mapbox.android.telemetry.NavigationMetadata$a */
    static class C11314a implements Creator<NavigationMetadata> {
        C11314a() {
        }

        public NavigationMetadata createFromParcel(Parcel parcel) {
            return new NavigationMetadata(parcel, null);
        }

        public NavigationMetadata[] newArray(int i) {
            return new NavigationMetadata[i];
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("Android - ");
        sb.append(VERSION.RELEASE);
        sb.toString();
    }

    /* synthetic */ NavigationMetadata(Parcel parcel, C11314a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29329e);
        if (this.f29330f == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29330f.intValue());
        }
        if (this.f29331g == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29331g.intValue());
        }
        parcel.writeString(this.f29332h);
        parcel.writeInt(this.f29333i);
        parcel.writeInt(this.f29334j);
        parcel.writeInt(this.f29335k);
        parcel.writeString(this.f29336l);
        parcel.writeInt(this.f29337m);
        parcel.writeString(this.f29338n);
        parcel.writeString(this.f29339o);
        parcel.writeString(this.f29340p);
        parcel.writeDouble(this.f29341q);
        parcel.writeDouble(this.f29342r);
        parcel.writeString(this.f29343s);
        parcel.writeString(this.f29344t);
        parcel.writeString(this.f29345u);
        if (this.f29346v == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29346v.intValue());
        }
        if (this.f29347w == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29347w.intValue());
        }
        if (this.f29348x == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29348x.intValue());
        }
        parcel.writeByte(this.f29349y ? (byte) 1 : 0);
        parcel.writeString(this.f29350z);
        parcel.writeString(this.f29307A);
        parcel.writeString(this.f29308B);
        if (this.f29309C == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29309C.intValue());
        }
        if (this.f29310D == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29310D.intValue());
        }
        parcel.writeString(this.f29311E);
        if (this.f29313G == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29313G.intValue());
        }
        parcel.writeString(this.f29314H);
        parcel.writeString(this.f29315I);
        parcel.writeInt(this.f29316J);
        parcel.writeInt(this.f29317K);
        parcel.writeString(this.f29318L);
        parcel.writeByte(this.f29319M.booleanValue() ? (byte) 1 : 0);
        parcel.writeInt(this.f29320N);
        parcel.writeString(this.f29321O);
        parcel.writeString(this.f29322P);
        parcel.writeInt(this.f29323Q);
        parcel.writeInt(this.f29324R);
        parcel.writeInt(this.f29325S);
        parcel.writeInt(this.f29312F);
        if (this.f29326T == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29326T.intValue());
        }
        if (this.f29327U == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29327U.intValue());
        }
        parcel.writeInt(this.f29328V);
    }

    private NavigationMetadata(Parcel parcel) {
        Integer num = null;
        this.f29330f = null;
        this.f29331g = null;
        this.f29346v = null;
        this.f29347w = null;
        this.f29348x = null;
        this.f29350z = null;
        this.f29307A = null;
        this.f29308B = null;
        this.f29309C = null;
        this.f29310D = null;
        this.f29313G = null;
        this.f29326T = null;
        this.f29327U = null;
        this.f29329e = parcel.readInt();
        this.f29330f = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.f29331g = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.f29332h = parcel.readString();
        this.f29333i = parcel.readInt();
        this.f29334j = parcel.readInt();
        this.f29335k = parcel.readInt();
        this.f29336l = parcel.readString();
        this.f29337m = parcel.readInt();
        this.f29338n = parcel.readString();
        this.f29339o = parcel.readString();
        this.f29340p = parcel.readString();
        this.f29341q = parcel.readDouble();
        this.f29342r = parcel.readDouble();
        this.f29343s = parcel.readString();
        this.f29344t = parcel.readString();
        this.f29345u = parcel.readString();
        this.f29346v = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.f29347w = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.f29348x = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        boolean z = true;
        this.f29349y = parcel.readByte() != 0;
        this.f29350z = parcel.readString();
        this.f29307A = parcel.readString();
        this.f29308B = parcel.readString();
        this.f29309C = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.f29310D = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.f29311E = parcel.readString();
        this.f29313G = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.f29314H = parcel.readString();
        this.f29315I = parcel.readString();
        this.f29316J = parcel.readInt();
        this.f29317K = parcel.readInt();
        this.f29318L = parcel.readString();
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f29319M = Boolean.valueOf(z);
        this.f29320N = parcel.readInt();
        this.f29321O = parcel.readString();
        this.f29322P = parcel.readString();
        this.f29323Q = parcel.readInt();
        this.f29324R = parcel.readInt();
        this.f29325S = parcel.readInt();
        this.f29312F = parcel.readInt();
        this.f29326T = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        if (parcel.readByte() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        this.f29327U = num;
        this.f29328V = parcel.readInt();
    }
}
