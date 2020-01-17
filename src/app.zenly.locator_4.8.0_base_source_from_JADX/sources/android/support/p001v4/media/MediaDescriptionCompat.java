package android.support.p001v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new C0032a();

    /* renamed from: e */
    private final String f56e;

    /* renamed from: f */
    private final CharSequence f57f;

    /* renamed from: g */
    private final CharSequence f58g;

    /* renamed from: h */
    private final CharSequence f59h;

    /* renamed from: i */
    private final Bitmap f60i;

    /* renamed from: j */
    private final Uri f61j;

    /* renamed from: k */
    private final Bundle f62k;

    /* renamed from: l */
    private final Uri f63l;

    /* renamed from: m */
    private Object f64m;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0032a implements Creator<MediaDescriptionCompat> {
        C0032a() {
        }

        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m69a(C0045c.m99a(parcel));
        }

        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0033b {

        /* renamed from: a */
        private String f65a;

        /* renamed from: b */
        private CharSequence f66b;

        /* renamed from: c */
        private CharSequence f67c;

        /* renamed from: d */
        private CharSequence f68d;

        /* renamed from: e */
        private Bitmap f69e;

        /* renamed from: f */
        private Uri f70f;

        /* renamed from: g */
        private Bundle f71g;

        /* renamed from: h */
        private Uri f72h;

        /* renamed from: a */
        public C0033b mo102a(String str) {
            this.f65a = str;
            return this;
        }

        /* renamed from: b */
        public C0033b mo105b(CharSequence charSequence) {
            this.f67c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0033b mo106c(CharSequence charSequence) {
            this.f66b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0033b mo101a(CharSequence charSequence) {
            this.f68d = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0033b mo104b(Uri uri) {
            this.f72h = uri;
            return this;
        }

        /* renamed from: a */
        public C0033b mo98a(Bitmap bitmap) {
            this.f69e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0033b mo99a(Uri uri) {
            this.f70f = uri;
            return this;
        }

        /* renamed from: a */
        public C0033b mo100a(Bundle bundle) {
            this.f71g = bundle;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo103a() {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(this.f65a, this.f66b, this.f67c, this.f68d, this.f69e, this.f70f, this.f71g, this.f72h);
            return mediaDescriptionCompat;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f56e = str;
        this.f57f = charSequence;
        this.f58g = charSequence2;
        this.f59h = charSequence3;
        this.f60i = bitmap;
        this.f61j = uri;
        this.f62k = bundle;
        this.f63l = uri2;
    }

    /* renamed from: a */
    public Object mo91a() {
        if (this.f64m != null || VERSION.SDK_INT < 21) {
            return this.f64m;
        }
        Object a = C0046a.m107a();
        C0046a.m113a(a, this.f56e);
        C0046a.m115c(a, this.f57f);
        C0046a.m114b(a, this.f58g);
        C0046a.m112a(a, this.f59h);
        C0046a.m109a(a, this.f60i);
        C0046a.m110a(a, this.f61j);
        Bundle bundle = this.f62k;
        if (VERSION.SDK_INT < 23 && this.f63l != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f63l);
        }
        C0046a.m111a(a, bundle);
        if (VERSION.SDK_INT >= 23) {
            C0048a.m117a(a, this.f63l);
        }
        this.f64m = C0046a.m108a(a);
        return this.f64m;
    }

    /* renamed from: b */
    public String mo92b() {
        return this.f56e;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57f);
        String str = ", ";
        sb.append(str);
        sb.append(this.f58g);
        sb.append(str);
        sb.append(this.f59h);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f56e);
            TextUtils.writeToParcel(this.f57f, parcel, i);
            TextUtils.writeToParcel(this.f58g, parcel, i);
            TextUtils.writeToParcel(this.f59h, parcel, i);
            parcel.writeParcelable(this.f60i, i);
            parcel.writeParcelable(this.f61j, i);
            parcel.writeBundle(this.f62k);
            parcel.writeParcelable(this.f63l, i);
            return;
        }
        C0045c.m100a(mo91a(), parcel, i);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f56e = parcel.readString();
        this.f57f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f58g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f59h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f60i = (Bitmap) parcel.readParcelable(classLoader);
        this.f61j = (Uri) parcel.readParcelable(classLoader);
        this.f62k = parcel.readBundle(classLoader);
        this.f63l = (Uri) parcel.readParcelable(classLoader);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p001v4.media.MediaDescriptionCompat m69a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.p001v4.media.C0045c.m104e(r8)
            r1.mo102a(r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.C0045c.m106g(r8)
            r1.mo106c(r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.C0045c.m105f(r8)
            r1.mo105b(r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.C0045c.m98a(r8)
            r1.mo101a(r2)
            android.graphics.Bitmap r2 = android.support.p001v4.media.C0045c.m102c(r8)
            r1.mo98a(r2)
            android.net.Uri r2 = android.support.p001v4.media.C0045c.m103d(r8)
            r1.mo99a(r2)
            android.os.Bundle r2 = android.support.p001v4.media.C0045c.m101b(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004a
            android.support.p001v4.media.session.MediaSessionCompat.m143a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0063:
            r0 = r2
        L_0x0064:
            r1.mo100a(r0)
            if (r4 == 0) goto L_0x006d
            r1.mo104b(r4)
            goto L_0x007a
        L_0x006d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007a
            android.net.Uri r0 = android.support.p001v4.media.C0047d.m116a(r8)
            r1.mo104b(r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo103a()
            r0.f64m = r8
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.MediaDescriptionCompat.m69a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }
}
