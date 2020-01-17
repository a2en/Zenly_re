package android.support.p001v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.c */
class C0045c {

    /* renamed from: android.support.v4.media.c$a */
    static class C0046a {
        /* renamed from: a */
        public static Object m107a() {
            return new Builder();
        }

        /* renamed from: b */
        public static void m114b(Object obj, CharSequence charSequence) {
            ((Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m115c(Object obj, CharSequence charSequence) {
            ((Builder) obj).setTitle(charSequence);
        }

        /* renamed from: a */
        public static void m113a(Object obj, String str) {
            ((Builder) obj).setMediaId(str);
        }

        /* renamed from: a */
        public static void m112a(Object obj, CharSequence charSequence) {
            ((Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m109a(Object obj, Bitmap bitmap) {
            ((Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m110a(Object obj, Uri uri) {
            ((Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m111a(Object obj, Bundle bundle) {
            ((Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static Object m108a(Object obj) {
            return ((Builder) obj).build();
        }
    }

    /* renamed from: a */
    public static CharSequence m98a(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: b */
    public static Bundle m101b(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: c */
    public static Bitmap m102c(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: d */
    public static Uri m103d(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: e */
    public static String m104e(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: f */
    public static CharSequence m105f(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: g */
    public static CharSequence m106g(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: a */
    public static void m100a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public static Object m99a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }
}
