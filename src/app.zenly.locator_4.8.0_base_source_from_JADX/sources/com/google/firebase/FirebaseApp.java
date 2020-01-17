package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.content.C0540a;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.util.C10174k;
import com.google.android.gms.common.util.C10175l;
import com.google.firebase.components.C11025d;
import com.google.firebase.components.C11028e;
import com.google.firebase.components.C11035i;
import com.google.firebase.events.Publisher;
import com.google.firebase.internal.C11100a;
import com.google.firebase.internal.C11101b;
import com.google.firebase.platforminfo.C11112c;
import com.google.firebase.platforminfo.C11115f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p214e.p228e.C7571a;

public class FirebaseApp {

    /* renamed from: j */
    private static final List<String> f28584j = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});

    /* renamed from: k */
    private static final List<String> f28585k = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: l */
    private static final List<String> f28586l = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});

    /* renamed from: m */
    private static final List<String> f28587m = Arrays.asList(new String[0]);

    /* renamed from: n */
    private static final Set<String> f28588n = Collections.emptySet();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final Object f28589o = new Object();

    /* renamed from: p */
    private static final Executor f28590p = new C11017c();

    /* renamed from: q */
    static final Map<String, FirebaseApp> f28591q = new C7571a();

    /* renamed from: a */
    private final Context f28592a;

    /* renamed from: b */
    private final String f28593b;

    /* renamed from: c */
    private final C11021b f28594c;

    /* renamed from: d */
    private final C11035i f28595d;

    /* renamed from: e */
    private final SharedPreferences f28596e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicBoolean f28597f = new AtomicBoolean(false);

    /* renamed from: g */
    private final AtomicBoolean f28598g = new AtomicBoolean();

    /* renamed from: h */
    private final AtomicBoolean f28599h;

    /* renamed from: i */
    private final List<BackgroundStateChangeListener> f28600i;

    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
    }

    @Deprecated
    public interface IdTokenListener {
        void onIdTokenChanged(C11101b bVar);
    }

    @Deprecated
    public interface IdTokenListenersCountChangedListener {
        void onListenerCountChanged(int i);
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.FirebaseApp$b */
    private static class C11016b implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        private static AtomicReference<C11016b> f28601a = new AtomicReference<>();

        private C11016b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m28383b(Context context) {
            if (C10174k.m25678a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f28601a.get() == null) {
                    C11016b bVar = new C11016b();
                    if (f28601a.compareAndSet(null, bVar)) {
                        BackgroundDetector.m25075a(application);
                        BackgroundDetector.m25076b().mo27091a((com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener) bVar);
                    }
                }
            }
        }

        public void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.f28589o) {
                Iterator it = new ArrayList(FirebaseApp.f28591q.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.f28597f.get()) {
                        firebaseApp.m28370a(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.FirebaseApp$c */
    private static class C11017c implements Executor {

        /* renamed from: a */
        private static final Handler f28602a = new Handler(Looper.getMainLooper());

        private C11017c() {
        }

        public void execute(Runnable runnable) {
            f28602a.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.FirebaseApp$d */
    private static class C11018d extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C11018d> f28603b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f28604a;

        public C11018d(Context context) {
            this.f28604a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m28385b(Context context) {
            if (f28603b.get() == null) {
                C11018d dVar = new C11018d(context);
                if (f28603b.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f28589o) {
                for (FirebaseApp a : FirebaseApp.f28591q.values()) {
                    a.m28375g();
                }
            }
            mo32148a();
        }

        /* renamed from: a */
        public void mo32148a() {
            this.f28604a.unregisterReceiver(this);
        }
    }

    protected FirebaseApp(Context context, String str, C11021b bVar) {
        new CopyOnWriteArrayList();
        this.f28600i = new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        C10123l.m25505a(context);
        this.f28592a = context;
        C10123l.m25515b(str);
        this.f28593b = str;
        C10123l.m25505a(bVar);
        this.f28594c = bVar;
        new C11100a();
        this.f28596e = context.getSharedPreferences(m28366a(str), 0);
        this.f28599h = new AtomicBoolean(m28376h());
        List a = C11028e.m28414a(context).mo32187a();
        this.f28595d = new C11035i(f28590p, a, C11025d.m28395a(context, Context.class, new Class[0]), C11025d.m28395a(this, FirebaseApp.class, new Class[0]), C11025d.m28395a(bVar, C11021b.class, new Class[0]), C11115f.m28624a("fire-android", ""), C11115f.m28624a("fire-core", "16.1.0"), C11112c.m28616a());
        Publisher publisher = (Publisher) this.f28595d.get(Publisher.class);
    }

    /* renamed from: f */
    private void m28374f() {
        C10123l.m25517b(!this.f28598g.get(), "FirebaseApp was deleted");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m28375g() {
        Class<FirebaseApp> cls = FirebaseApp.class;
        boolean c = C0540a.m2547c(this.f28592a);
        if (c) {
            C11018d.m28385b(this.f28592a);
        } else {
            this.f28595d.mo32191a(mo32139d());
        }
        m28369a(cls, this, f28584j, c);
        if (mo32139d()) {
            m28369a(cls, this, f28585k, c);
            m28369a(Context.class, this.f28592a, f28586l, c);
        }
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (f28589o) {
            firebaseApp = (FirebaseApp) f28591q.get("[DEFAULT]");
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(C10175l.m25688a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return firebaseApp;
    }

    /* renamed from: h */
    private boolean m28376h() {
        String str = "firebase_data_collection_default_enabled";
        if (this.f28596e.contains(str)) {
            return this.f28596e.getBoolean(str, true);
        }
        try {
            PackageManager packageManager = this.f28592a.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f28592a.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                    return applicationInfo.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: c */
    public C11021b mo32138c() {
        m28374f();
        return this.f28594c;
    }

    /* renamed from: d */
    public boolean mo32139d() {
        return "[DEFAULT]".equals(mo32137b());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.f28593b.equals(((FirebaseApp) obj).mo32137b());
    }

    public int hashCode() {
        return this.f28593b.hashCode();
    }

    public boolean isDataCollectionDefaultEnabled() {
        m28374f();
        return this.f28599h.get();
    }

    public String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("name", this.f28593b);
        a.mo27499a("options", this.f28594c);
        return a.toString();
    }

    /* renamed from: b */
    public String mo32137b() {
        m28374f();
        return this.f28593b;
    }

    /* renamed from: a */
    public Context mo32135a() {
        m28374f();
        return this.f28592a;
    }

    /* renamed from: b */
    private static String m28371b(String str) {
        return str.trim();
    }

    /* renamed from: a */
    public static FirebaseApp m28363a(Context context) {
        synchronized (f28589o) {
            if (f28591q.containsKey("[DEFAULT]")) {
                FirebaseApp instance = getInstance();
                return instance;
            }
            C11021b a = C11021b.m28387a(context);
            if (a == null) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            FirebaseApp a2 = m28364a(context, a);
            return a2;
        }
    }

    /* renamed from: a */
    public static FirebaseApp m28364a(Context context, C11021b bVar) {
        return m28365a(context, bVar, "[DEFAULT]");
    }

    /* renamed from: a */
    public static FirebaseApp m28365a(Context context, C11021b bVar, String str) {
        FirebaseApp firebaseApp;
        C11016b.m28383b(context);
        String b = m28371b(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f28589o) {
            boolean z = !f28591q.containsKey(b);
            StringBuilder sb = new StringBuilder();
            sb.append("FirebaseApp name ");
            sb.append(b);
            sb.append(" already exists!");
            C10123l.m25517b(z, sb.toString());
            C10123l.m25506a(context, (Object) "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, b, bVar);
            f28591q.put(b, firebaseApp);
        }
        firebaseApp.m28375g();
        return firebaseApp;
    }

    /* renamed from: a */
    public <T> T mo32136a(Class<T> cls) {
        m28374f();
        return this.f28595d.get(cls);
    }

    /* renamed from: a */
    private static String m28366a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28370a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (BackgroundStateChangeListener onBackgroundStateChanged : this.f28600i) {
            onBackgroundStateChanged.onBackgroundStateChanged(z);
        }
    }

    /* renamed from: a */
    private <T> void m28369a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            String str2 = "FirebaseApp";
            if (z) {
                try {
                    if (!f28587m.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (!f28588n.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" is not linked. Skipping initialization.");
                        Log.d(str2, sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" is missing, but is required. Check if it has been removed by Proguard.");
                        throw new IllegalStateException(sb2.toString());
                    }
                } catch (NoSuchMethodException unused2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                    throw new IllegalStateException(sb3.toString());
                } catch (InvocationTargetException e) {
                    Log.wtf(str2, "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to initialize ");
                    sb4.append(str);
                    Log.wtf(str2, sb4.toString(), e2);
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }
}
