package app.zenly.android.feature.base.scheduling;

import android.os.Looper;
import android.os.Process;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.jvm.internal.C12948z;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p263b.p264a.p266e.C7702b;
import p389io.reactivex.C12286f;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.p391b.C12294a;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: app.zenly.android.feature.base.scheduling.f */
public final class C1352f {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f4979a;

    /* renamed from: b */
    private static final ThreadLocal<C1344c> f4980b = new ThreadLocal<>();

    /* renamed from: c */
    private static final Lazy f4981c = C12896f.m33751a(C1353a.f4987f);

    /* renamed from: d */
    private static final Lazy f4982d = C12896f.m33751a(C1357e.f4991f);

    /* renamed from: e */
    private static final Lazy f4983e = C12896f.m33751a(C1354b.f4988f);

    /* renamed from: f */
    private static final Lazy f4984f = C12896f.m33751a(C1356d.f4990f);

    /* renamed from: g */
    private static final Lazy f4985g = C12896f.m33751a(C1355c.f4989f);

    /* renamed from: h */
    public static final C1352f f4986h = new C1352f();

    /* renamed from: app.zenly.android.feature.base.scheduling.f$a */
    static final class C1353a extends C12933k implements Function0<C12286f> {

        /* renamed from: f */
        public static final C1353a f4987f = new C1353a();

        C1353a() {
            super(0);
        }

        public final C12286f invoke() {
            return C12768a.m33400a(C1352f.f4986h.m6375a("computation", 10));
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.f$b */
    static final class C1354b extends C12933k implements Function0<C12286f> {

        /* renamed from: f */
        public static final C1354b f4988f = new C1354b();

        C1354b() {
            super(0);
        }

        public final C12286f invoke() {
            return C12768a.m33413b(C1352f.f4986h.m6375a("disk", 10));
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.f$c */
    static final class C1355c extends C12933k implements Function0<C12286f> {

        /* renamed from: f */
        public static final C1355c f4989f = new C1355c();

        C1355c() {
            super(0);
        }

        public final C12286f invoke() {
            return C12295a.m32804a(Looper.getMainLooper(), true);
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.f$d */
    static final class C1356d extends C12933k implements Function0<C12286f> {

        /* renamed from: f */
        public static final C1356d f4990f = new C1356d();

        C1356d() {
            super(0);
        }

        public final C12286f invoke() {
            return C12768a.m33413b(C1352f.f4986h.m6375a("single", 10));
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.f$e */
    static final class C1357e extends C12933k implements Function0<C12286f> {

        /* renamed from: f */
        public static final C1357e f4991f = new C1357e();

        C1357e() {
            super(0);
        }

        public final C12286f invoke() {
            return C12768a.m33400a(C1352f.f4986h.m6375a("user_interactive", -2));
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.f$f */
    static final class C1358f<T, R> implements Function<Callable<C12286f>, C12286f> {

        /* renamed from: e */
        final /* synthetic */ ZenlySchedulers f4992e;

        C1358f(ZenlySchedulers zenlySchedulers) {
            this.f4992e = zenlySchedulers;
        }

        /* renamed from: a */
        public final C1342b apply(Callable<C12286f> callable) {
            C12932j.m33818b(callable, "it");
            return this.f4992e.getComputation();
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.f$g */
    static final class C1359g<T, R> implements Function<Callable<C12286f>, C12286f> {

        /* renamed from: e */
        final /* synthetic */ ZenlySchedulers f4993e;

        C1359g(ZenlySchedulers zenlySchedulers) {
            this.f4993e = zenlySchedulers;
        }

        /* renamed from: a */
        public final C1342b apply(Callable<C12286f> callable) {
            C12932j.m33818b(callable, "it");
            return this.f4993e.getSingle();
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.f$h */
    static final class C1360h<T, R> implements Function<Callable<C12286f>, C12286f> {

        /* renamed from: e */
        final /* synthetic */ ZenlySchedulers f4994e;

        C1360h(ZenlySchedulers zenlySchedulers) {
            this.f4994e = zenlySchedulers;
        }

        /* renamed from: a */
        public final C1342b apply(Callable<C12286f> callable) {
            C12932j.m33818b(callable, "it");
            return this.f4994e.getMainThread();
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.f$i */
    public static final class C1361i implements ThreadFactory {

        /* renamed from: e */
        private final AtomicInteger f4995e = new AtomicInteger(0);

        /* renamed from: f */
        final /* synthetic */ int f4996f;

        /* renamed from: g */
        final /* synthetic */ String f4997g;

        /* renamed from: app.zenly.android.feature.base.scheduling.f$i$a */
        public static final class C1362a extends Thread {

            /* renamed from: e */
            final /* synthetic */ C1361i f4998e;

            /* renamed from: f */
            final /* synthetic */ Runnable f4999f;

            C1362a(C1361i iVar, Runnable runnable, String str) {
                this.f4998e = iVar;
                this.f4999f = runnable;
                super(str);
            }

            public void run() {
                Process.setThreadPriority(this.f4998e.f4996f);
                this.f4999f.run();
            }
        }

        C1361i(int i, String str) {
            this.f4996f = i;
            this.f4997g = str;
        }

        public Thread newThread(Runnable runnable) {
            C12932j.m33818b(runnable, "runnable");
            C12948z zVar = C12948z.f33530a;
            Locale locale = Locale.US;
            C12932j.m33815a((Object) locale, "Locale.US");
            Object[] objArr = {this.f4997g, Integer.valueOf(this.f4995e.getAndIncrement())};
            String format = String.format(locale, "%s-%d", Arrays.copyOf(objArr, objArr.length));
            C12932j.m33815a((Object) format, "java.lang.String.format(locale, format, *args)");
            return new C1362a(this, runnable, format);
        }
    }

    static {
        Class<C1352f> cls = C1352f.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "UNDERLYING_COMPUTATION_SCHEDULER", "getUNDERLYING_COMPUTATION_SCHEDULER$base_release()Lio/reactivex/Scheduler;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "UNDERLYING_USER_INTERACTIVE_SCHEDULER", "getUNDERLYING_USER_INTERACTIVE_SCHEDULER$base_release()Lio/reactivex/Scheduler;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a((Class) cls), "UNDERLYING_DISK_SCHEDULER", "getUNDERLYING_DISK_SCHEDULER$base_release()Lio/reactivex/Scheduler;");
        C12946x.m33839a((C12940r) sVar3);
        C12941s sVar4 = new C12941s(C12946x.m33834a((Class) cls), "UNDERLYING_SINGLE_SCHEDULER", "getUNDERLYING_SINGLE_SCHEDULER$base_release()Lio/reactivex/Scheduler;");
        C12946x.m33839a((C12940r) sVar4);
        C12941s sVar5 = new C12941s(C12946x.m33834a((Class) cls), "UNDERLYING_MAIN_THREAD_SCHEDULER", "getUNDERLYING_MAIN_THREAD_SCHEDULER$base_release()Lio/reactivex/Scheduler;");
        C12946x.m33839a((C12940r) sVar5);
        f4979a = new KProperty[]{sVar, sVar2, sVar3, sVar4, sVar5};
    }

    private C1352f() {
    }

    /* renamed from: g */
    public static final void m6376g() {
        Process.setThreadPriority(-4);
    }

    /* renamed from: h */
    public static final void m6377h() {
        ZenlySchedulers a = C1351e.m6372a(new C7702b("global").mo19916a("scheduling"));
        C12768a.m33408a((Function<? super Callable<C12286f>, ? extends C12286f>) new C1358f<Object,Object>(a));
        C12768a.m33414b((Function<? super Callable<C12286f>, ? extends C12286f>) new C1359g<Object,Object>(a));
        C12294a.m32800a((Function<Callable<C12286f>, C12286f>) new C1360h<Callable<C12286f>,C12286f>(a));
    }

    /* renamed from: b */
    public final C12286f mo6582b() {
        Lazy lazy = f4981c;
        KProperty kProperty = f4979a[0];
        return (C12286f) lazy.getValue();
    }

    /* renamed from: c */
    public final C12286f mo6583c() {
        Lazy lazy = f4983e;
        KProperty kProperty = f4979a[2];
        return (C12286f) lazy.getValue();
    }

    /* renamed from: d */
    public final C12286f mo6584d() {
        Lazy lazy = f4985g;
        KProperty kProperty = f4979a[4];
        return (C12286f) lazy.getValue();
    }

    /* renamed from: e */
    public final C12286f mo6585e() {
        Lazy lazy = f4984f;
        KProperty kProperty = f4979a[3];
        return (C12286f) lazy.getValue();
    }

    /* renamed from: f */
    public final C12286f mo6586f() {
        Lazy lazy = f4982d;
        KProperty kProperty = f4979a[1];
        return (C12286f) lazy.getValue();
    }

    /* renamed from: a */
    public final ThreadLocal<C1344c> mo6581a() {
        return f4980b;
    }

    /* renamed from: a */
    public static final Throwable m6373a(Throwable th) {
        C12932j.m33818b(th, "throwable");
        C1344c cVar = (C1344c) f4980b.get();
        if (cVar == null) {
            return th;
        }
        AttributedException attributedException = new AttributedException(cVar, th, null, 4, null);
        return attributedException;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final ThreadFactory m6375a(String str, int i) {
        return new C1361i(i, str);
    }
}
