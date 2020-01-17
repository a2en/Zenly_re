package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NavigationStepMetadata implements Parcelable {
    public static final Creator<NavigationStepMetadata> CREATOR = new C11317a();

    /* renamed from: e */
    private String f29360e;

    /* renamed from: f */
    private String f29361f;

    /* renamed from: g */
    private String f29362g;

    /* renamed from: h */
    private String f29363h;

    /* renamed from: i */
    private String f29364i;

    /* renamed from: j */
    private String f29365j;

    /* renamed from: k */
    private String f29366k;

    /* renamed from: l */
    private String f29367l;

    /* renamed from: m */
    private Integer f29368m;

    /* renamed from: n */
    private Integer f29369n;

    /* renamed from: o */
    private Integer f29370o;

    /* renamed from: p */
    private Integer f29371p;

    /* renamed from: com.mapbox.android.telemetry.NavigationStepMetadata$a */
    static class C11317a implements Creator<NavigationStepMetadata> {
        C11317a() {
        }

        public NavigationStepMetadata createFromParcel(Parcel parcel) {
            return new NavigationStepMetadata(parcel, null);
        }

        public NavigationStepMetadata[] newArray(int i) {
            return new NavigationStepMetadata[i];
        }
    }

    /* synthetic */ NavigationStepMetadata(Parcel parcel, C11317a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29360e);
        parcel.writeString(this.f29361f);
        parcel.writeString(this.f29362g);
        parcel.writeString(this.f29363h);
        parcel.writeString(this.f29364i);
        parcel.writeString(this.f29365j);
        parcel.writeString(this.f29366k);
        parcel.writeString(this.f29367l);
        if (this.f29368m == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29368m.intValue());
        }
        if (this.f29369n == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29369n.intValue());
        }
        if (this.f29370o == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29370o.intValue());
        }
        if (this.f29371p == null) {
            parcel.writeByte(0);
            return;
        }
        parcel.writeByte(1);
        parcel.writeInt(this.f29371p.intValue());
    }

    public NavigationStepMetadata() {
        this.f29360e = null;
        this.f29361f = null;
        this.f29362g = null;
        this.f29363h = null;
        this.f29364i = null;
        this.f29365j = null;
        this.f29366k = null;
        this.f29367l = null;
        this.f29368m = null;
        this.f29369n = null;
        this.f29370o = null;
        this.f29371p = null;
    }

    private NavigationStepMetadata(Parcel parcel) {
        Integer num = null;
        this.f29360e = null;
        this.f29361f = null;
        this.f29362g = null;
        this.f29363h = null;
        this.f29364i = null;
        this.f29365j = null;
        this.f29366k = null;
        this.f29367l = null;
        this.f29368m = null;
        this.f29369n = null;
        this.f29370o = null;
        this.f29371p = null;
        this.f29360e = parcel.readString();
        this.f29361f = parcel.readString();
        this.f29362g = parcel.readString();
        this.f29363h = parcel.readString();
        this.f29364i = parcel.readString();
        this.f29365j = parcel.readString();
        this.f29366k = parcel.readString();
        this.f29367l = parcel.readString();
        this.f29368m = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.f29369n = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.f29370o = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        if (parcel.readByte() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        this.f29371p = num;
    }
}
