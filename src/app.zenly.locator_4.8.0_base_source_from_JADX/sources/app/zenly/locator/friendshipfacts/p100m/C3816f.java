package app.zenly.locator.friendshipfacts.p100m;

import app.zenly.locator.friendshipfacts.C3781e;
import app.zenly.locator.friendshipfacts.p099l.C3806a;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.friendshipfacts.m.f */
public final class C3816f extends C11722a {

    /* renamed from: k */
    static final /* synthetic */ KProperty[] f10160k;

    /* renamed from: f */
    private final long f10161f;

    /* renamed from: g */
    private final Lazy f10162g;

    /* renamed from: h */
    private final C3806a f10163h;

    /* renamed from: i */
    private final boolean f10164i;

    /* renamed from: j */
    private final int f10165j;

    /* renamed from: app.zenly.locator.friendshipfacts.m.f$a */
    static final class C3817a extends C12933k implements Function0<Long> {

        /* renamed from: f */
        final /* synthetic */ C3816f f10166f;

        C3817a(C3816f fVar) {
            this.f10166f = fVar;
            super(0);
        }

        public final long invoke() {
            return this.f10166f.mo10403i() + TimeUnit.HOURS.toMillis(this.f10166f.mo10400f().mo10378a());
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C3816f.class), "ongoingTimeSpentMillis", "getOngoingTimeSpentMillis()J");
        C12946x.m33839a((C12940r) sVar);
        f10160k = new KProperty[]{sVar};
    }

    public C3816f(long j, C3806a aVar, boolean z, int i) {
        C12932j.m33818b(aVar, "bestFriend");
        super(C3781e.TST_USER, j);
        this.f10163h = aVar;
        this.f10164i = z;
        this.f10165j = i;
        this.f10161f = this.f10164i ? this.f10163h.mo10381d() : this.f10163h.mo10380c();
        this.f10162g = C12896f.m33751a(new C3817a(this));
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C3816f fVar = (C3816f) aVar;
            return C12932j.m33817a((Object) fVar.f10163h.mo10382e().getUuid(), (Object) this.f10163h.mo10382e().getUuid()) && fVar.f10163h.mo10382e().getAvatarVersion() == this.f10163h.mo10382e().getAvatarVersion() && C12932j.m33817a((Object) fVar.f10163h.mo10382e().getName(), (Object) this.f10163h.mo10382e().getName()) && fVar.mo10401g() == fVar.mo10401g() && fVar.f10165j == this.f10165j && fVar.f10164i == this.f10164i;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.friendshipfacts.viewmodels.TstUserViewModel");
    }

    /* renamed from: f */
    public final C3806a mo10400f() {
        return this.f10163h;
    }

    /* renamed from: g */
    public final long mo10401g() {
        Lazy lazy = this.f10162g;
        KProperty kProperty = f10160k[0];
        return ((Number) lazy.getValue()).longValue();
    }

    /* renamed from: h */
    public final int mo10402h() {
        return this.f10165j;
    }

    /* renamed from: i */
    public final long mo10403i() {
        return this.f10161f;
    }

    /* renamed from: j */
    public final boolean mo10404j() {
        return this.f10164i;
    }
}
