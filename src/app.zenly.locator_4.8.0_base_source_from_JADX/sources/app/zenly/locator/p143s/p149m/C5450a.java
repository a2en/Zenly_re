package app.zenly.locator.p143s.p149m;

import android.content.Context;
import androidx.core.p004os.C0569g;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.AppLifecycleObserver;
import java.util.concurrent.Callable;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p333g.p339c.p346c.p347b.p348a.C12037c;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;

/* renamed from: app.zenly.locator.s.m.a */
public final class C5450a implements AppLifecycleObserver {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f14021c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ZenlySchedulers f14022a = C1351e.m6372a(C5453b.f14027b.mo19916a("lifecycleObserver"));

    /* renamed from: b */
    private final Lazy f14023b;

    /* renamed from: app.zenly.locator.s.m.a$a */
    static final class C5451a extends C12933k implements Function0<C12271b> {

        /* renamed from: f */
        final /* synthetic */ C5450a f14024f;

        /* renamed from: g */
        final /* synthetic */ Context f14025g;

        /* renamed from: app.zenly.locator.s.m.a$a$a */
        static final class C5452a<V> implements Callable<Object> {

            /* renamed from: e */
            final /* synthetic */ C5451a f14026e;

            C5452a(C5451a aVar) {
                this.f14026e = aVar;
            }

            public final void call() {
                C0569g.m2680a("fresco:init");
                try {
                    C12037c.m31713a(this.f14026e.f14025g);
                    C12956q qVar = C12956q.f33541a;
                } finally {
                    C0569g.m2679a();
                }
            }
        }

        C5451a(C5450a aVar, Context context) {
            this.f14024f = aVar;
            this.f14025g = context;
            super(0);
        }

        public final C12271b invoke() {
            return C12271b.m32507b((Callable<?>) new C5452a<Object>(this)).mo36350b((C12286f) this.f14024f.f14022a.getComputation());
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C5450a.class), "sdkInit", "getSdkInit()Lio/reactivex/Completable;");
        C12946x.m33839a((C12940r) sVar);
        f14021c = new KProperty[]{sVar};
    }

    public C5450a(Context context) {
        C12932j.m33818b(context, "context");
        this.f14023b = C12896f.m33751a(new C5451a(this, context));
    }

    /* renamed from: a */
    private final C12271b m15481a() {
        Lazy lazy = this.f14023b;
        KProperty kProperty = f14021c[0];
        return (C12271b) lazy.getValue();
    }

    public Disposable onForeground() {
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }

    public Disposable onInitialize() {
        return m15481a().mo36351b();
    }
}
