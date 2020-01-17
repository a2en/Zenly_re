package android.support.p001v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.support.p001v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.b */
class C0042b {

    /* renamed from: android.support.v4.media.b$a */
    interface C0043a extends C0040d {
        /* renamed from: a */
        void mo89a(String str, Bundle bundle);

        /* renamed from: a */
        void mo90a(String str, List<?> list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.b$b */
    static class C0044b<T extends C0043a> extends C0041e<T> {
        C0044b(T t) {
            super(t);
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
            MediaSessionCompat.m143a(bundle);
            ((C0043a) this.f79a).mo90a(str, list, bundle);
        }

        public void onError(String str, Bundle bundle) {
            MediaSessionCompat.m143a(bundle);
            ((C0043a) this.f79a).mo89a(str, bundle);
        }
    }

    /* renamed from: a */
    static Object m95a(C0043a aVar) {
        return new C0044b(aVar);
    }
}
