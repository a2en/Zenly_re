package com.mapbox.android.telemetry;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11258c;
import com.mapbox.android.telemetry.Event.C11300a;

public class AppUserTurnstile extends Event implements Parcelable {
    public static final Creator<AppUserTurnstile> CREATOR = new C11298a();

    /* renamed from: o */
    private static final String f29198o;
    @C11258c("event")

    /* renamed from: f */
    private final String f29199f;
    @C11258c("created")

    /* renamed from: g */
    private final String f29200g;
    @C11258c("userId")

    /* renamed from: h */
    private final String f29201h;
    @C11258c("enabled.telemetry")

    /* renamed from: i */
    private final boolean f29202i;
    @C11258c("device")

    /* renamed from: j */
    private final String f29203j;
    @C11258c("sdkIdentifier")

    /* renamed from: k */
    private final String f29204k;
    @C11258c("sdkVersion")

    /* renamed from: l */
    private final String f29205l;
    @C11258c("model")

    /* renamed from: m */
    private String f29206m;
    @C11258c("operatingSystem")

    /* renamed from: n */
    private String f29207n;

    /* renamed from: com.mapbox.android.telemetry.AppUserTurnstile$a */
    static class C11298a implements Creator<AppUserTurnstile> {
        C11298a() {
        }

        public AppUserTurnstile createFromParcel(Parcel parcel) {
            return new AppUserTurnstile(parcel, (C11298a) null);
        }

        public AppUserTurnstile[] newArray(int i) {
            return new AppUserTurnstile[i];
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("Android - ");
        sb.append(VERSION.RELEASE);
        f29198o = sb.toString();
    }

    /* synthetic */ AppUserTurnstile(Parcel parcel, C11298a aVar) {
        this(parcel);
    }

    /* renamed from: b */
    private void m29097b() {
        if (C11354i0.f29434n == null) {
            throw new IllegalStateException("Create a MapboxTelemetry instance before calling this method.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.TURNSTILE;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29199f);
        parcel.writeString(this.f29200g);
        parcel.writeString(this.f29201h);
        parcel.writeByte(this.f29202i ? (byte) 1 : 0);
        parcel.writeString(this.f29203j);
        parcel.writeString(this.f29204k);
        parcel.writeString(this.f29205l);
        parcel.writeString(this.f29206m);
        parcel.writeString(this.f29207n);
    }

    public AppUserTurnstile(String str, String str2) {
        this.f29206m = null;
        this.f29207n = null;
        m29097b();
        this.f29199f = "appUserTurnstile";
        this.f29200g = C11330b1.m29167a();
        this.f29201h = C11330b1.m29174c();
        this.f29202i = ((Boolean) C11324a1.f29405c.get(new C11324a1(true).mo32969a())).booleanValue();
        this.f29203j = Build.DEVICE;
        this.f29204k = str;
        this.f29205l = str2;
        this.f29206m = Build.MODEL;
        this.f29207n = f29198o;
    }

    private AppUserTurnstile(Parcel parcel) {
        this.f29206m = null;
        this.f29207n = null;
        this.f29199f = parcel.readString();
        this.f29200g = parcel.readString();
        this.f29201h = parcel.readString();
        this.f29202i = parcel.readByte() != 0;
        this.f29203j = parcel.readString();
        this.f29204k = parcel.readString();
        this.f29205l = parcel.readString();
        this.f29206m = parcel.readString();
        this.f29207n = parcel.readString();
    }
}
