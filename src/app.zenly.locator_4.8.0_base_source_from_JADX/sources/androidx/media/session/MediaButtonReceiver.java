package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.support.p001v4.media.MediaBrowserCompat;
import android.support.p001v4.media.MediaBrowserCompat.C0010b;
import android.support.p001v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    private static class C0941a extends C0010b {

        /* renamed from: c */
        private final Context f3622c;

        /* renamed from: d */
        private final Intent f3623d;

        /* renamed from: e */
        private final PendingResult f3624e;

        /* renamed from: f */
        private MediaBrowserCompat f3625f;

        C0941a(Context context, Intent intent, PendingResult pendingResult) {
            this.f3622c = context;
            this.f3623d = intent;
            this.f3624e = pendingResult;
        }

        /* renamed from: d */
        private void m4200d() {
            this.f3625f.mo31b();
            this.f3624e.finish();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4620a(MediaBrowserCompat mediaBrowserCompat) {
            this.f3625f = mediaBrowserCompat;
        }

        /* renamed from: b */
        public void mo43b() {
            m4200d();
        }

        /* renamed from: c */
        public void mo44c() {
            m4200d();
        }

        /* renamed from: a */
        public void mo41a() {
            try {
                new MediaControllerCompat(this.f3622c, this.f3625f.mo32c()).mo188a((KeyEvent) this.f3623d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
            m4200d();
        }
    }

    /* renamed from: a */
    private static void m4199a(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String str = "android.intent.action.MEDIA_BUTTON";
            if (str.equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                ComponentName a = m4198a(context, str);
                if (a != null) {
                    intent.setComponent(a);
                    m4199a(context, intent);
                    return;
                }
                ComponentName a2 = m4198a(context, "android.media.browse.MediaBrowserService");
                if (a2 != null) {
                    PendingResult goAsync = goAsync();
                    Context applicationContext = context.getApplicationContext();
                    C0941a aVar = new C0941a(applicationContext, intent, goAsync);
                    MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a2, aVar, null);
                    aVar.mo4620a(mediaBrowserCompat);
                    mediaBrowserCompat.mo30a();
                    return;
                }
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignore unsupported intent: ");
        sb.append(intent);
        Log.d("MediaButtonReceiver", sb.toString());
    }

    /* renamed from: a */
    private static ComponentName m4198a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected 1 service that handles ");
            sb.append(str);
            sb.append(", found ");
            sb.append(queryIntentServices.size());
            throw new IllegalStateException(sb.toString());
        }
    }
}
