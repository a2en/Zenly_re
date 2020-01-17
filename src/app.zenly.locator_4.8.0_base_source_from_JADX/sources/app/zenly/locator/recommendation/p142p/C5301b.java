package app.zenly.locator.recommendation.p142p;

import app.zenly.locator.recommendation.C5288l;
import app.zenly.locator.recommendation.model.PotentialMatch;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.recommendation.p.b */
public final class C5301b extends C11722a {

    /* renamed from: f */
    private final PotentialMatch f13627f;

    public C5301b(long j, PotentialMatch potentialMatch) {
        C12932j.m33818b(potentialMatch, "potentialMatch");
        super(C5288l.POTENTIAL_MATCH, j);
        this.f13627f = potentialMatch;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        return C12932j.m33817a((Object) this.f13627f.getId(), (Object) ((C5301b) aVar).f13627f.getId());
    }

    /* renamed from: f */
    public final PotentialMatch mo12674f() {
        return this.f13627f;
    }
}
