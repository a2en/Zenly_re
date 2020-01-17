package app.zenly.locator.experimental.inbox;

import app.zenly.locator.experimental.inbox.p093j.C3710a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.experimental.inbox.d */
public final class C3697d {

    /* renamed from: a */
    private final C3698a f9921a = new C3698a();

    /* renamed from: b */
    private final C12785a<C3698a> f9922b;

    /* renamed from: app.zenly.locator.experimental.inbox.d$a */
    public static final class C3698a {

        /* renamed from: a */
        private final Map<String, C3710a> f9923a = new LinkedHashMap();

        /* renamed from: a */
        public final C3710a mo10228a(String str) {
            C12932j.m33818b(str, "id");
            C3710a aVar = (C3710a) this.f9923a.get(str);
            return aVar != null ? aVar : C3710a.NOT_INVITED;
        }

        /* renamed from: a */
        public final void mo10229a(String str, C3710a aVar) {
            C12932j.m33818b(str, "id");
            C12932j.m33818b(aVar, "invitedStatus");
            this.f9923a.put(str, aVar);
        }
    }

    public C3697d() {
        C12785a<C3698a> h = C12785a.m33446h(this.f9921a);
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(table)");
        this.f9922b = h;
    }

    /* renamed from: a */
    public final void mo10227a(String str, C3710a aVar) {
        C12932j.m33818b(str, "id");
        C12932j.m33818b(aVar, "invitedStatus");
        this.f9921a.mo10229a(str, aVar);
        this.f9922b.onNext(this.f9921a);
    }

    /* renamed from: a */
    public final C12279e<C3698a> mo10226a() {
        C12279e<C3698a> g = this.f9922b.mo36496g();
        C12932j.m33815a((Object) g, "subject.hide()");
        return g;
    }
}
