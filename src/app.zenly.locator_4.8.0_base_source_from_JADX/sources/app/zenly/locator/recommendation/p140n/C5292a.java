package app.zenly.locator.recommendation.p140n;

import app.zenly.locator.recommendation.C5266k;
import app.zenly.locator.recommendation.C5266k.C5267a;
import app.zenly.locator.recommendation.p139m.C5289a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.recommendation.n.a */
public final class C5292a {

    /* renamed from: a */
    private final Set<String> f13607a = new LinkedHashSet();

    /* renamed from: b */
    private final String f13608b;

    /* renamed from: c */
    private final C5266k f13609c;

    public C5292a(String str, C5266k kVar) {
        C12932j.m33818b(str, "newComerUuid");
        C12932j.m33818b(kVar, "recommendationRepository");
        this.f13608b = str;
        this.f13609c = kVar;
    }

    /* renamed from: a */
    public final String mo12657a() {
        return this.f13608b;
    }

    /* renamed from: b */
    public final void mo12660b() {
        this.f13609c.mo12622a(this.f13608b, this.f13607a, C5267a.PICKED_FROM_LIST);
        this.f13609c.mo12621a(this.f13608b, (Collection<String>) this.f13607a);
    }

    /* renamed from: c */
    public final int mo12661c() {
        return this.f13607a.size();
    }

    /* renamed from: d */
    public final boolean mo12662d() {
        return !this.f13607a.isEmpty();
    }

    /* renamed from: a */
    public final void mo12658a(C5289a aVar) {
        C12932j.m33818b(aVar, "event");
        if (aVar.mo12651a()) {
            this.f13607a.add(aVar.mo12652b());
        } else {
            this.f13607a.remove(aVar.mo12652b());
        }
    }

    /* renamed from: a */
    public final boolean mo12659a(String str) {
        C12932j.m33818b(str, "userUuid");
        return this.f13607a.contains(str);
    }
}
