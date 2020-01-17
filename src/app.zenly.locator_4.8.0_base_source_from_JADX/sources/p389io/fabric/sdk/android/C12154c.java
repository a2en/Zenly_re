package p389io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import p389io.fabric.sdk.android.C12149a.C12152b;
import p389io.fabric.sdk.android.services.common.C12186j;
import p389io.fabric.sdk.android.services.common.C12195p;
import p389io.fabric.sdk.android.services.concurrency.C12214c;
import p389io.fabric.sdk.android.services.concurrency.C12222i;
import p389io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

/* renamed from: io.fabric.sdk.android.c */
public class C12154c {

    /* renamed from: l */
    static volatile C12154c f31576l;

    /* renamed from: m */
    static final Logger f31577m = new C12153b();

    /* renamed from: a */
    private final Context f31578a;

    /* renamed from: b */
    private final Map<Class<? extends C12161g>, C12161g> f31579b;

    /* renamed from: c */
    private final ExecutorService f31580c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final InitializationCallback<C12154c> f31581d;

    /* renamed from: e */
    private final InitializationCallback<?> f31582e;

    /* renamed from: f */
    private final C12195p f31583f;

    /* renamed from: g */
    private C12149a f31584g;

    /* renamed from: h */
    private WeakReference<Activity> f31585h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AtomicBoolean f31586i = new AtomicBoolean(false);

    /* renamed from: j */
    final Logger f31587j;

    /* renamed from: k */
    final boolean f31588k;

    /* renamed from: io.fabric.sdk.android.c$a */
    class C12155a extends C12152b {
        C12155a() {
        }

        /* renamed from: a */
        public void mo25000a(Activity activity, Bundle bundle) {
            C12154c.this.mo35980a(activity);
        }

        /* renamed from: c */
        public void mo25003c(Activity activity) {
            C12154c.this.mo35980a(activity);
        }

        /* renamed from: d */
        public void mo25004d(Activity activity) {
            C12154c.this.mo35980a(activity);
        }
    }

    /* renamed from: io.fabric.sdk.android.c$b */
    class C12156b implements InitializationCallback {

        /* renamed from: b */
        final CountDownLatch f31590b = new CountDownLatch(this.f31591c);

        /* renamed from: c */
        final /* synthetic */ int f31591c;

        C12156b(int i) {
            this.f31591c = i;
        }

        public void failure(Exception exc) {
            C12154c.this.f31581d.failure(exc);
        }

        public void success(Object obj) {
            this.f31590b.countDown();
            if (this.f31590b.getCount() == 0) {
                C12154c.this.f31586i.set(true);
                C12154c.this.f31581d.success(C12154c.this);
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.c$c */
    public static class C12157c {

        /* renamed from: a */
        private final Context f31593a;

        /* renamed from: b */
        private C12161g[] f31594b;

        /* renamed from: c */
        private C12222i f31595c;

        /* renamed from: d */
        private Handler f31596d;

        /* renamed from: e */
        private Logger f31597e;

        /* renamed from: f */
        private boolean f31598f;

        /* renamed from: g */
        private String f31599g;

        /* renamed from: h */
        private String f31600h;

        /* renamed from: i */
        private InitializationCallback<C12154c> f31601i;

        public C12157c(Context context) {
            if (context != null) {
                this.f31593a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C12157c mo35988a(C12161g... gVarArr) {
            if (this.f31594b == null) {
                if (!C12186j.m32286a(this.f31593a).mo36071a()) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (C12161g gVar : gVarArr) {
                        String f = gVar.mo24943f();
                        char c = 65535;
                        int hashCode = f.hashCode();
                        if (hashCode != 607220212) {
                            if (hashCode == 1830452504 && f.equals("com.crashlytics.sdk.android:crashlytics")) {
                                c = 0;
                            }
                        } else if (f.equals("com.crashlytics.sdk.android:answers")) {
                            c = 1;
                        }
                        if (c == 0 || c == 1) {
                            arrayList.add(gVar);
                        } else if (!z) {
                            C12154c.m32113f().mo35967w("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                            z = true;
                        }
                    }
                    gVarArr = (C12161g[]) arrayList.toArray(new C12161g[0]);
                }
                this.f31594b = gVarArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        /* renamed from: a */
        public C12154c mo35989a() {
            Map map;
            if (this.f31595c == null) {
                this.f31595c = C12222i.m32362a();
            }
            if (this.f31596d == null) {
                this.f31596d = new Handler(Looper.getMainLooper());
            }
            if (this.f31597e == null) {
                if (this.f31598f) {
                    this.f31597e = new C12153b(3);
                } else {
                    this.f31597e = new C12153b();
                }
            }
            if (this.f31600h == null) {
                this.f31600h = this.f31593a.getPackageName();
            }
            if (this.f31601i == null) {
                this.f31601i = InitializationCallback.f31569a;
            }
            C12161g[] gVarArr = this.f31594b;
            if (gVarArr == null) {
                map = new HashMap();
            } else {
                map = C12154c.m32109b((Collection<? extends C12161g>) Arrays.asList(gVarArr));
            }
            Map map2 = map;
            Context applicationContext = this.f31593a.getApplicationContext();
            C12154c cVar = new C12154c(applicationContext, map2, this.f31595c, this.f31596d, this.f31597e, this.f31598f, this.f31601i, new C12195p(applicationContext, this.f31600h, this.f31599g, map2.values()), C12154c.m32112d(this.f31593a));
            return cVar;
        }
    }

    C12154c(Context context, Map<Class<? extends C12161g>, C12161g> map, C12222i iVar, Handler handler, Logger logger, boolean z, InitializationCallback initializationCallback, C12195p pVar, Activity activity) {
        this.f31578a = context;
        this.f31579b = map;
        this.f31580c = iVar;
        this.f31587j = logger;
        this.f31588k = z;
        this.f31581d = initializationCallback;
        this.f31582e = mo35979a(map.size());
        this.f31583f = pVar;
        mo35980a(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Activity m32112d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* renamed from: f */
    public static Logger m32113f() {
        if (f31576l == null) {
            return f31577m;
        }
        return f31576l.f31587j;
    }

    /* renamed from: g */
    private void m32114g() {
        this.f31584g = new C12149a(this.f31578a);
        this.f31584g.mo35970a(new C12155a());
        mo35984b(this.f31578a);
    }

    /* renamed from: h */
    public static boolean m32115h() {
        if (f31576l == null) {
            return false;
        }
        return f31576l.f31588k;
    }

    /* renamed from: i */
    static C12154c m32116i() {
        if (f31576l != null) {
            return f31576l;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    /* renamed from: c */
    public String mo35985c() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: e */
    public String mo35987e() {
        return "1.4.8.32";
    }

    /* renamed from: c */
    private static void m32111c(C12154c cVar) {
        f31576l = cVar;
        cVar.m32114g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35984b(Context context) {
        StringBuilder sb;
        Future a = mo35981a(context);
        Collection d = mo35986d();
        C12163i iVar = new C12163i(a, d);
        ArrayList<C12161g> arrayList = new ArrayList<>(d);
        Collections.sort(arrayList);
        iVar.mo36006a(context, this, InitializationCallback.f31569a, this.f31583f);
        for (C12161g a2 : arrayList) {
            a2.mo36006a(context, this, this.f31582e, this.f31583f);
        }
        iVar.mo36017j();
        String str = "Fabric";
        String str2 = " [Version: ";
        if (m32113f().isLoggable(str, 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append(mo35985c());
            sb.append(str2);
            sb.append(mo35987e());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (C12161g gVar : arrayList) {
            gVar.f31607f.addDependency(iVar.f31607f);
            mo35982a(this.f31579b, gVar);
            gVar.mo36017j();
            if (sb != null) {
                sb.append(gVar.mo24943f());
                sb.append(str2);
                sb.append(gVar.mo24945h());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            m32113f().mo35954d(str, sb.toString());
        }
    }

    /* renamed from: a */
    public static C12154c m32103a(Context context, C12161g... gVarArr) {
        if (f31576l == null) {
            synchronized (C12154c.class) {
                if (f31576l == null) {
                    C12157c cVar = new C12157c(context);
                    cVar.mo35988a(gVarArr);
                    m32111c(cVar.mo35989a());
                }
            }
        }
        return f31576l;
    }

    /* renamed from: d */
    public Collection<C12161g> mo35986d() {
        return this.f31579b.values();
    }

    /* renamed from: a */
    public C12154c mo35980a(Activity activity) {
        this.f31585h = new WeakReference<>(activity);
        return this;
    }

    /* renamed from: a */
    public Activity mo35978a() {
        WeakReference<Activity> weakReference = this.f31585h;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35982a(Map<Class<? extends C12161g>, C12161g> map, C12161g gVar) {
        Class[] value;
        C12214c cVar = gVar.f31611j;
        if (cVar != null) {
            for (Class cls : cVar.value()) {
                if (cls.isInterface()) {
                    for (C12161g gVar2 : map.values()) {
                        if (cls.isAssignableFrom(gVar2.getClass())) {
                            gVar.f31607f.addDependency(gVar2.f31607f);
                        }
                    }
                } else if (((C12161g) map.get(cls)) != null) {
                    gVar.f31607f.addDependency(((C12161g) map.get(cls)).f31607f);
                } else {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    /* renamed from: a */
    public static <T extends C12161g> T m32104a(Class<T> cls) {
        return (C12161g) m32116i().f31579b.get(cls);
    }

    /* renamed from: a */
    private static void m32107a(Map<Class<? extends C12161g>, C12161g> map, Collection<? extends C12161g> collection) {
        for (C12161g gVar : collection) {
            map.put(gVar.getClass(), gVar);
            if (gVar instanceof KitGroup) {
                m32107a(map, ((KitGroup) gVar).getKits());
            }
        }
    }

    /* renamed from: b */
    public ExecutorService mo35983b() {
        return this.f31580c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Class<? extends C12161g>, C12161g> m32109b(Collection<? extends C12161g> collection) {
        HashMap hashMap = new HashMap(collection.size());
        m32107a((Map<Class<? extends C12161g>, C12161g>) hashMap, collection);
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public InitializationCallback<?> mo35979a(int i) {
        return new C12156b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Future<Map<String, C12162h>> mo35981a(Context context) {
        return mo35983b().submit(new C12159e(context.getPackageCodePath()));
    }
}
