package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.android.volley.toolbox.C8733j;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C10003h();

    /* renamed from: i */
    public static final Status f26273i = new Status(0);

    /* renamed from: j */
    public static final Status f26274j = new Status(14);

    /* renamed from: k */
    public static final Status f26275k = new Status(15);

    /* renamed from: l */
    public static final Status f26276l = new Status(16);

    /* renamed from: e */
    private final int f26277e;

    /* renamed from: f */
    private final int f26278f;

    /* renamed from: g */
    private final String f26279g;

    /* renamed from: h */
    private final PendingIntent f26280h;

    static {
        new Status(8);
        new Status(17);
        new Status(18);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f26277e = i;
        this.f26278f = i2;
        this.f26279g = str;
        this.f26280h = pendingIntent;
    }

    /* renamed from: a */
    public final int mo27059a() {
        return this.f26278f;
    }

    /* renamed from: b */
    public final String mo27060b() {
        return this.f26279g;
    }

    /* renamed from: c */
    public final String mo27061c() {
        String str = this.f26279g;
        if (str != null) {
            return str;
        }
        return C9994a.getStatusCodeString(this.f26278f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f26277e != status.f26277e || this.f26278f != status.f26278f || !C10120k.m25501a(this.f26279g, status.f26279g) || !C10120k.m25501a(this.f26280h, status.f26280h)) {
            return false;
        }
        return true;
    }

    public final Status getStatus() {
        return this;
    }

    public final boolean hasResolution() {
        return this.f26280h != null;
    }

    public final int hashCode() {
        return C10120k.m25499a(Integer.valueOf(this.f26277e), Integer.valueOf(this.f26278f), this.f26279g, this.f26280h);
    }

    public final boolean isSuccess() {
        return this.f26278f <= 0;
    }

    public final void startResolutionForResult(Activity activity, int i) throws SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.f26280h.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("statusCode", mo27061c());
        a.mo27499a("resolution", this.f26280h);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, mo27059a());
        C10134a.m25583a(parcel, 2, mo27060b(), false);
        C10134a.m25580a(parcel, 3, (Parcelable) this.f26280h, i, false);
        C10134a.m25575a(parcel, (int) C8733j.DEFAULT_IMAGE_TIMEOUT_MS, this.f26277e);
        C10134a.m25571a(parcel, a);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }
}
