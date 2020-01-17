package p250f.p251a.p252a.p263b.p275c.p276l;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p275c.p277m.C7763a;

/* renamed from: f.a.a.b.c.l.c */
public final class C7762c {

    /* renamed from: a */
    private final List<C7763a> f19430a = new ArrayList();

    /* renamed from: a */
    public final int mo19965a(C7763a aVar) {
        C12932j.m33818b(aVar, "mediaId");
        return this.f19430a.indexOf(aVar);
    }

    /* renamed from: b */
    public final List<C7763a> mo19968b() {
        return C12857w.m33689j(this.f19430a);
    }

    /* renamed from: c */
    public final int mo19970c() {
        return this.f19430a.size();
    }

    /* renamed from: d */
    public final boolean mo19971d() {
        return this.f19430a.isEmpty();
    }

    /* renamed from: a */
    public final void mo19966a() {
        this.f19430a.clear();
    }

    /* renamed from: b */
    public final void mo19969b(C7763a aVar) {
        C12932j.m33818b(aVar, "mediaId");
        if (this.f19430a.contains(aVar)) {
            this.f19430a.remove(aVar);
        } else {
            this.f19430a.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo19967a(List<C7763a> list) {
        C12932j.m33818b(list, "state");
        this.f19430a.clear();
        this.f19430a.addAll(list);
    }
}
