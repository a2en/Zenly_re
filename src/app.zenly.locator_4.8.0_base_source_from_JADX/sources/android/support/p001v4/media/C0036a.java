package android.support.p001v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.a */
class C0036a {

    /* renamed from: android.support.v4.media.a$a */
    interface C0037a {
        /* renamed from: a */
        void mo48a();

        /* renamed from: b */
        void mo49b();

        /* renamed from: c */
        void mo50c();
    }

    /* renamed from: android.support.v4.media.a$b */
    static class C0038b<T extends C0037a> extends ConnectionCallback {

        /* renamed from: a */
        protected final T f78a;

        public C0038b(T t) {
            this.f78a = t;
        }

        public void onConnected() {
            this.f78a.mo48a();
        }

        public void onConnectionFailed() {
            this.f78a.mo49b();
        }

        public void onConnectionSuspended() {
            this.f78a.mo50c();
        }
    }

    /* renamed from: android.support.v4.media.a$c */
    static class C0039c {
        /* renamed from: a */
        public static Object m92a(Object obj) {
            return ((MediaItem) obj).getDescription();
        }

        /* renamed from: b */
        public static int m93b(Object obj) {
            return ((MediaItem) obj).getFlags();
        }
    }

    /* renamed from: android.support.v4.media.a$d */
    interface C0040d {
        /* renamed from: a */
        void mo87a(String str, List<?> list);

        void onError(String str);
    }

    /* renamed from: android.support.v4.media.a$e */
    static class C0041e<T extends C0040d> extends SubscriptionCallback {

        /* renamed from: a */
        protected final T f79a;

        public C0041e(T t) {
            this.f79a = t;
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
            this.f79a.mo87a(str, list);
        }

        public void onError(String str) {
            this.f79a.onError(str);
        }
    }

    /* renamed from: a */
    public static Object m83a(C0037a aVar) {
        return new C0038b(aVar);
    }

    /* renamed from: b */
    public static void m86b(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: c */
    public static Bundle m87c(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: d */
    public static Object m88d(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: a */
    public static Object m82a(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (ConnectionCallback) obj, bundle);
    }

    /* renamed from: a */
    public static void m85a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: a */
    public static Object m84a(C0040d dVar) {
        return new C0041e(dVar);
    }
}
