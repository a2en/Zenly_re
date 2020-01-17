package app.zenly.locator.support.p171t0.p190h;

import app.zenly.locator.core.models.C2916z;
import app.zenly.locator.core.util.C3245z;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.reversegeocoder.C7911b;
import p389io.reactivex.C12279e;

/* renamed from: app.zenly.locator.support.t0.h.a */
public final class C5890a {

    /* renamed from: a */
    private final C2916z f14880a;

    /* renamed from: b */
    private final long f14881b;

    /* renamed from: c */
    private final C12279e<C7911b> f14882c;

    /* renamed from: app.zenly.locator.support.t0.h.a$a */
    public static final class C5891a {
        private C5891a() {
        }

        public /* synthetic */ C5891a(C12928f fVar) {
            this();
        }
    }

    static {
        new C5891a(null);
    }

    public C5890a(C2916z zVar, long j, C12279e<C7911b> eVar) {
        C12932j.m33818b(zVar, "place");
        C12932j.m33818b(eVar, "address");
        this.f14880a = zVar;
        this.f14881b = j;
        this.f14882c = eVar;
    }

    /* renamed from: a */
    public final C12279e<C7911b> mo13585a() {
        return this.f14882c;
    }

    /* renamed from: b */
    public final long mo13586b() {
        return this.f14881b;
    }

    /* renamed from: c */
    public final C2916z mo13587c() {
        return this.f14880a;
    }

    /* renamed from: d */
    public final boolean mo13588d() {
        return C3245z.m10280a(C3245z.m10282a(this.f14881b)) < 30;
    }
}
