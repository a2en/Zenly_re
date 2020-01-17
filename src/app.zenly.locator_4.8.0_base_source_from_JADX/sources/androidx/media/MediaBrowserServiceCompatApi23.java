package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import android.service.media.MediaBrowserService.Result;

class MediaBrowserServiceCompatApi23 {

    public interface ServiceCompatProxy extends androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy {
        void onLoadItem(String str, C0929c<Parcel> cVar);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi23$a */
    static class C0930a extends C0928b {
        C0930a(Context context, ServiceCompatProxy serviceCompatProxy) {
            super(context, serviceCompatProxy);
        }

        public void onLoadItem(String str, Result<MediaItem> result) {
            ((ServiceCompatProxy) this.f3607e).onLoadItem(str, new C0929c(result));
        }
    }

    /* renamed from: a */
    public static Object m4189a(Context context, ServiceCompatProxy serviceCompatProxy) {
        return new C0930a(context, serviceCompatProxy);
    }
}
