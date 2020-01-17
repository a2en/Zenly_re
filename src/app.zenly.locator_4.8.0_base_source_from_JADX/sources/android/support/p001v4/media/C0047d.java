package android.support.p001v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;

/* renamed from: android.support.v4.media.d */
class C0047d {

    /* renamed from: android.support.v4.media.d$a */
    static class C0048a {
        /* renamed from: a */
        public static void m117a(Object obj, Uri uri) {
            ((Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m116a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
