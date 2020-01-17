package app.zenly.locator.recommendation.p142p;

import app.zenly.locator.recommendation.C5288l;
import app.zenly.locator.recommendation.model.PotentialMatch;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.recommendation.p.a */
public final class C5300a extends C11722a {

    /* renamed from: f */
    private final PotentialMatch f13624f;

    /* renamed from: g */
    private boolean f13625g;

    /* renamed from: h */
    private boolean f13626h;

    public C5300a(long j, PotentialMatch potentialMatch, boolean z, boolean z2) {
        C12932j.m33818b(potentialMatch, "potentialMatch");
        super(C5288l.POTENTIAL_MATCH_OTHER, j);
        this.f13624f = potentialMatch;
        this.f13625g = z;
        this.f13626h = z2;
    }

    /* renamed from: a */
    public final void mo12670a(boolean z) {
        this.f13625g = z;
    }

    /* renamed from: f */
    public final boolean mo12671f() {
        return this.f13626h;
    }

    /* renamed from: g */
    public final PotentialMatch mo12672g() {
        return this.f13624f;
    }

    /* renamed from: h */
    public final boolean mo12673h() {
        return this.f13625g;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C5300a aVar2 = (C5300a) aVar;
            return C12932j.m33817a((Object) this.f13624f.getId(), (Object) aVar2.f13624f.getId()) && this.f13625g == aVar2.f13625g && this.f13626h == aVar2.f13626h;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.recommendation.viewmodel.PotentialMatchOtherViewModel");
    }
}
