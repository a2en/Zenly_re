package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.Locale;

public final class WebImage extends AbstractSafeParcelable {
    public static final Creator<WebImage> CREATOR = new C10085c();

    /* renamed from: e */
    private final int f26503e;

    /* renamed from: f */
    private final Uri f26504f;

    /* renamed from: g */
    private final int f26505g;

    /* renamed from: h */
    private final int f26506h;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f26503e = i;
        this.f26504f = uri;
        this.f26505g = i2;
        this.f26506h = i3;
    }

    /* renamed from: a */
    public final int mo27339a() {
        return this.f26506h;
    }

    /* renamed from: b */
    public final Uri mo27340b() {
        return this.f26504f;
    }

    /* renamed from: c */
    public final int mo27341c() {
        return this.f26505g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return C10120k.m25501a(this.f26504f, webImage.f26504f) && this.f26505g == webImage.f26505g && this.f26506h == webImage.f26506h;
        }
    }

    public final int hashCode() {
        return C10120k.m25499a(this.f26504f, Integer.valueOf(this.f26505g), Integer.valueOf(this.f26506h));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f26505g), Integer.valueOf(this.f26506h), this.f26504f.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26503e);
        C10134a.m25580a(parcel, 2, (Parcelable) mo27340b(), i, false);
        C10134a.m25575a(parcel, 3, mo27341c());
        C10134a.m25575a(parcel, 4, mo27339a());
        C10134a.m25571a(parcel, a);
    }
}
