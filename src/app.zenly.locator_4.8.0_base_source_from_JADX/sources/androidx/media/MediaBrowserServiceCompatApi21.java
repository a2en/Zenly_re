package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.p001v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserServiceCompatApi21 {

    public interface ServiceCompatProxy {
        C0927a onGetRoot(String str, int i, Bundle bundle);

        void onLoadChildren(String str, C0929c<List<Parcel>> cVar);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi21$a */
    static class C0927a {

        /* renamed from: a */
        final String f3605a;

        /* renamed from: b */
        final Bundle f3606b;
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi21$b */
    static class C0928b extends MediaBrowserService {

        /* renamed from: e */
        final ServiceCompatProxy f3607e;

        C0928b(Context context, ServiceCompatProxy serviceCompatProxy) {
            attachBaseContext(context);
            this.f3607e = serviceCompatProxy;
        }

        public BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            MediaSessionCompat.m143a(bundle);
            C0927a onGetRoot = this.f3607e.onGetRoot(str, i, bundle == null ? null : new Bundle(bundle));
            if (onGetRoot == null) {
                return null;
            }
            return new BrowserRoot(onGetRoot.f3605a, onGetRoot.f3606b);
        }

        public void onLoadChildren(String str, Result<List<MediaItem>> result) {
            this.f3607e.onLoadChildren(str, new C0929c(result));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi21$c */
    static class C0929c<T> {

        /* renamed from: a */
        Result f3608a;

        C0929c(Result result) {
            this.f3608a = result;
        }

        /* renamed from: a */
        public void mo4596a(T t) {
            if (t instanceof List) {
                this.f3608a.sendResult(mo4595a((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f3608a.sendResult(MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f3608a.sendResult(null);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public List<MediaItem> mo4595a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static Object m4185a(Context context, ServiceCompatProxy serviceCompatProxy) {
        return new C0928b(context, serviceCompatProxy);
    }

    /* renamed from: a */
    public static void m4186a(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    /* renamed from: a */
    public static IBinder m4184a(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }
}
