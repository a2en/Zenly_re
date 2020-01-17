package app.zenly.android.feature.base.scheduling;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p263b.p264a.p266e.C7701a;
import p389io.reactivex.C12286f;

/* renamed from: app.zenly.android.feature.base.scheduling.d */
public final class C1345d implements ZenlySchedulers {

    /* renamed from: g */
    static final /* synthetic */ KProperty[] f4967g;

    /* renamed from: a */
    private final Lazy f4968a = C12896f.m33751a(new C1350e(this));

    /* renamed from: b */
    private final Lazy f4969b = C12896f.m33751a(new C1346a(this));

    /* renamed from: c */
    private final Lazy f4970c = C12896f.m33751a(new C1349d(this));

    /* renamed from: d */
    private final Lazy f4971d = C12896f.m33751a(new C1347b(this));

    /* renamed from: e */
    private final Lazy f4972e = C12896f.m33751a(new C1348c(this));
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7701a f4973f;

    /* renamed from: app.zenly.android.feature.base.scheduling.d$a */
    static final class C1346a extends C12933k implements Function0<C1342b> {

        /* renamed from: f */
        final /* synthetic */ C1345d f4974f;

        C1346a(C1345d dVar) {
            this.f4974f = dVar;
            super(0);
        }

        public final C1342b invoke() {
            return this.f4974f.m6370a(C1352f.f4986h.mo6582b(), this.f4974f.f4973f, "computation");
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.d$b */
    static final class C1347b extends C12933k implements Function0<C1342b> {

        /* renamed from: f */
        final /* synthetic */ C1345d f4975f;

        C1347b(C1345d dVar) {
            this.f4975f = dVar;
            super(0);
        }

        public final C1342b invoke() {
            return this.f4975f.m6370a(C1352f.f4986h.mo6583c(), this.f4975f.f4973f, "disk");
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.d$c */
    static final class C1348c extends C12933k implements Function0<C1342b> {

        /* renamed from: f */
        final /* synthetic */ C1345d f4976f;

        C1348c(C1345d dVar) {
            this.f4976f = dVar;
            super(0);
        }

        public final C1342b invoke() {
            return this.f4976f.m6370a(C1352f.f4986h.mo6584d(), this.f4976f.f4973f, "main_thread");
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.d$d */
    static final class C1349d extends C12933k implements Function0<C1342b> {

        /* renamed from: f */
        final /* synthetic */ C1345d f4977f;

        C1349d(C1345d dVar) {
            this.f4977f = dVar;
            super(0);
        }

        public final C1342b invoke() {
            return this.f4977f.m6370a(C1352f.f4986h.mo6585e(), this.f4977f.f4973f, "single");
        }
    }

    /* renamed from: app.zenly.android.feature.base.scheduling.d$e */
    static final class C1350e extends C12933k implements Function0<C1342b> {

        /* renamed from: f */
        final /* synthetic */ C1345d f4978f;

        C1350e(C1345d dVar) {
            this.f4978f = dVar;
            super(0);
        }

        public final C1342b invoke() {
            return this.f4978f.m6370a(C1352f.f4986h.mo6586f(), this.f4978f.f4973f, "user_interactive");
        }
    }

    static {
        Class<C1345d> cls = C1345d.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "userInteractive", "getUserInteractive()Lapp/zenly/android/feature/base/scheduling/AttributedScheduler;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "computation", "getComputation()Lapp/zenly/android/feature/base/scheduling/AttributedScheduler;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a((Class) cls), "single", "getSingle()Lapp/zenly/android/feature/base/scheduling/AttributedScheduler;");
        C12946x.m33839a((C12940r) sVar3);
        C12941s sVar4 = new C12941s(C12946x.m33834a((Class) cls), "disk", "getDisk()Lapp/zenly/android/feature/base/scheduling/AttributedScheduler;");
        C12946x.m33839a((C12940r) sVar4);
        C12941s sVar5 = new C12941s(C12946x.m33834a((Class) cls), "mainThread", "getMainThread()Lapp/zenly/android/feature/base/scheduling/AttributedScheduler;");
        C12946x.m33839a((C12940r) sVar5);
        f4967g = new KProperty[]{sVar, sVar2, sVar3, sVar4, sVar5};
    }

    public C1345d(C7701a aVar) {
        C12932j.m33818b(aVar, "callsite");
        this.f4973f = aVar;
    }

    public C1342b getComputation() {
        Lazy lazy = this.f4969b;
        KProperty kProperty = f4967g[1];
        return (C1342b) lazy.getValue();
    }

    public C1342b getDisk() {
        Lazy lazy = this.f4971d;
        KProperty kProperty = f4967g[3];
        return (C1342b) lazy.getValue();
    }

    public C1342b getInflations() {
        return getUserInteractive();
    }

    public C1342b getMainThread() {
        Lazy lazy = this.f4972e;
        KProperty kProperty = f4967g[4];
        return (C1342b) lazy.getValue();
    }

    public C1342b getSingle() {
        Lazy lazy = this.f4970c;
        KProperty kProperty = f4967g[2];
        return (C1342b) lazy.getValue();
    }

    public C1342b getUserInteractive() {
        Lazy lazy = this.f4968a;
        KProperty kProperty = f4967g[0];
        return (C1342b) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C1342b m6370a(C12286f fVar, C7701a aVar, String str) {
        return new C1342b(aVar, str, fVar);
    }
}
