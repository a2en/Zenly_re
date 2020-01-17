package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback.C0001a;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.browser.customtabs.b */
public class C0296b {

    /* renamed from: a */
    private final ICustomTabsService f1324a;

    /* renamed from: b */
    private final ComponentName f1325b;

    /* renamed from: androidx.browser.customtabs.b$a */
    class C0297a extends C0001a {

        /* renamed from: a */
        private Handler f1326a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        final /* synthetic */ C0295a f1327b;

        /* renamed from: androidx.browser.customtabs.b$a$a */
        class C0298a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ int f1328e;

            /* renamed from: f */
            final /* synthetic */ Bundle f1329f;

            C0298a(int i, Bundle bundle) {
                this.f1328e = i;
                this.f1329f = bundle;
            }

            public void run() {
                C0297a.this.f1327b.mo2133a(this.f1328e, this.f1329f);
            }
        }

        /* renamed from: androidx.browser.customtabs.b$a$b */
        class C0299b implements Runnable {

            /* renamed from: e */
            final /* synthetic */ String f1331e;

            /* renamed from: f */
            final /* synthetic */ Bundle f1332f;

            C0299b(String str, Bundle bundle) {
                this.f1331e = str;
                this.f1332f = bundle;
            }

            public void run() {
                C0297a.this.f1327b.mo2135a(this.f1331e, this.f1332f);
            }
        }

        /* renamed from: androidx.browser.customtabs.b$a$c */
        class C0300c implements Runnable {

            /* renamed from: e */
            final /* synthetic */ Bundle f1334e;

            C0300c(Bundle bundle) {
                this.f1334e = bundle;
            }

            public void run() {
                C0297a.this.f1327b.mo2134a(this.f1334e);
            }
        }

        /* renamed from: androidx.browser.customtabs.b$a$d */
        class C0301d implements Runnable {

            /* renamed from: e */
            final /* synthetic */ String f1336e;

            /* renamed from: f */
            final /* synthetic */ Bundle f1337f;

            C0301d(String str, Bundle bundle) {
                this.f1336e = str;
                this.f1337f = bundle;
            }

            public void run() {
                C0297a.this.f1327b.mo2136b(this.f1336e, this.f1337f);
            }
        }

        /* renamed from: androidx.browser.customtabs.b$a$e */
        class C0302e implements Runnable {

            /* renamed from: e */
            final /* synthetic */ int f1339e;

            /* renamed from: f */
            final /* synthetic */ Uri f1340f;

            /* renamed from: g */
            final /* synthetic */ boolean f1341g;

            /* renamed from: h */
            final /* synthetic */ Bundle f1342h;

            C0302e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f1339e = i;
                this.f1340f = uri;
                this.f1341g = z;
                this.f1342h = bundle;
            }

            public void run() {
                C0297a.this.f1327b.mo2132a(this.f1339e, this.f1340f, this.f1341g, this.f1342h);
            }
        }

        C0297a(C0296b bVar, C0295a aVar) {
            this.f1327b = aVar;
        }

        public void extraCallback(String str, Bundle bundle) throws RemoteException {
            if (this.f1327b != null) {
                this.f1326a.post(new C0299b(str, bundle));
            }
        }

        public void onMessageChannelReady(Bundle bundle) throws RemoteException {
            if (this.f1327b != null) {
                this.f1326a.post(new C0300c(bundle));
            }
        }

        public void onNavigationEvent(int i, Bundle bundle) {
            if (this.f1327b != null) {
                this.f1326a.post(new C0298a(i, bundle));
            }
        }

        public void onPostMessage(String str, Bundle bundle) throws RemoteException {
            if (this.f1327b != null) {
                this.f1326a.post(new C0301d(str, bundle));
            }
        }

        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.f1327b != null) {
                Handler handler = this.f1326a;
                C0302e eVar = new C0302e(i, uri, z, bundle);
                handler.post(eVar);
            }
        }
    }

    C0296b(ICustomTabsService iCustomTabsService, ComponentName componentName) {
        this.f1324a = iCustomTabsService;
        this.f1325b = componentName;
    }

    /* renamed from: a */
    public static boolean m1232a(Context context, String str, C0305d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    /* renamed from: a */
    public static String m1230a(Context context, List<String> list) {
        return m1231a(context, list, false);
    }

    /* renamed from: a */
    public static String m1231a(Context context, List<String> list, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(str);
                if (list != null) {
                    arrayList2.addAll(list);
                }
                arrayList = arrayList2;
            }
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0307e mo2137a(C0295a aVar) {
        C0297a aVar2 = new C0297a(this, aVar);
        C0307e eVar = null;
        try {
            if (!this.f1324a.newSession(aVar2)) {
                return null;
            }
            eVar = new C0307e(this.f1324a, aVar2, this.f1325b);
            return eVar;
        } catch (RemoteException unused) {
        }
    }
}
