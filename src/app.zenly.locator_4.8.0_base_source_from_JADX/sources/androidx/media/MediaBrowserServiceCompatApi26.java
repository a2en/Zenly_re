package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService.Result;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserServiceCompatApi26 {

    /* renamed from: a */
    static Field f3609a;

    public interface ServiceCompatProxy extends androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        void onLoadChildren(String str, C0932b bVar, Bundle bundle);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi26$a */
    static class C0931a extends C0930a {
        C0931a(Context context, ServiceCompatProxy serviceCompatProxy) {
            super(context, serviceCompatProxy);
        }

        public void onLoadChildren(String str, Result<List<MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.m143a(bundle);
            ((ServiceCompatProxy) this.f3607e).onLoadChildren(str, new C0932b(result), bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi26$b */
    static class C0932b {

        /* renamed from: a */
        Result f3610a;

        C0932b(Result result) {
            this.f3610a = result;
        }

        /* renamed from: a */
        public void mo4600a(List<Parcel> list, int i) {
            try {
                MediaBrowserServiceCompatApi26.f3609a.setInt(this.f3610a, i);
            } catch (IllegalAccessException e) {
                Log.w("MBSCompatApi26", e);
            }
            this.f3610a.sendResult(mo4599a(list));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public List<MediaItem> mo4599a(List<Parcel> list) {
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

    static {
        try {
            f3609a = Result.class.getDeclaredField("mFlags");
            f3609a.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.w("MBSCompatApi26", e);
        }
    }

    /* renamed from: a */
    public static Object m4190a(Context context, ServiceCompatProxy serviceCompatProxy) {
        return new C0931a(context, serviceCompatProxy);
    }
}
