package p250f.p251a.p252a.p263b.p264a.p266e;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.b.a.e.a */
public final class C7701a {

    /* renamed from: a */
    private final C7702b f19327a;

    /* renamed from: b */
    private final List<String> f19328b;

    private C7701a(C7702b bVar, List<String> list) {
        this.f19327a = bVar;
        this.f19328b = list;
    }

    /* renamed from: a */
    public final C7701a mo19914a(String str) {
        C12932j.m33818b(str, "subBreadcrumb");
        return new C7701a(this.f19327a, C12857w.m33666a((Collection) this.f19328b, (Object) str));
    }

    public String toString() {
        List<String> list = this.f19328b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19327a.mo19917a());
        sb.append('/');
        return C12857w.m33662a(list, ".", sb.toString(), null, 0, null, null, 60, null);
    }

    public C7701a(C7702b bVar, String str) {
        C12932j.m33818b(bVar, "feature");
        C12932j.m33818b(str, "breadcrumb");
        this(bVar, C12846n.m33635a(str));
    }
}
