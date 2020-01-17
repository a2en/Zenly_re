package app.zenly.locator.map;

import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.contracts.MapControllerContract.C2464g;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5460e;
import app.zenly.locator.p143s.p162w.C5562a;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.map.a1 */
public final class C3896a1 {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static C3896a1 f10316m;

    /* renamed from: n */
    public static final C3897a f10317n = new C3897a(null);

    /* renamed from: a */
    private C4407y0 f10318a;

    /* renamed from: b */
    private final C12785a<Boolean> f10319b;

    /* renamed from: c */
    private boolean f10320c;

    /* renamed from: d */
    private final C12785a<Boolean> f10321d;

    /* renamed from: e */
    private final C12785a<Boolean> f10322e;

    /* renamed from: f */
    private boolean f10323f;

    /* renamed from: g */
    private final C12785a<Boolean> f10324g;

    /* renamed from: h */
    private final C12785a<C2464g> f10325h;

    /* renamed from: i */
    private final C5562a f10326i;

    /* renamed from: j */
    private final C12785a<C2458b> f10327j;

    /* renamed from: k */
    private final C12785a<Boolean> f10328k;

    /* renamed from: l */
    private final C12785a<Boolean> f10329l;

    /* renamed from: app.zenly.locator.map.a1$a */
    public static final class C3897a {
        private C3897a() {
        }

        /* renamed from: a */
        public final C3896a1 mo10527a() {
            if (C3896a1.f10316m == null) {
                C3896a1.f10316m = new C3896a1(null);
            }
            C3896a1 q = C3896a1.f10316m;
            if (q != null) {
                return q;
            }
            C12932j.m33814a();
            throw null;
        }

        public /* synthetic */ C3897a(C12928f fVar) {
            this();
        }
    }

    private C3896a1() {
        C12785a<Boolean> u = C12785a.m33447u();
        String str = "BehaviorSubject.create<Boolean>()";
        C12932j.m33815a((Object) u, str);
        this.f10319b = u;
        C12785a<Boolean> u2 = C12785a.m33447u();
        C12932j.m33815a((Object) u2, str);
        this.f10321d = u2;
        Boolean valueOf = Boolean.valueOf(true);
        C12785a<Boolean> h = C12785a.m33446h(valueOf);
        String str2 = "BehaviorSubject.createDefault(true)";
        C12932j.m33815a((Object) h, str2);
        this.f10322e = h;
        this.f10323f = true;
        C12785a<Boolean> h2 = C12785a.m33446h(valueOf);
        C12932j.m33815a((Object) h2, str2);
        this.f10324g = h2;
        C12785a<C2464g> h3 = C12785a.m33446h(C2464g.AUTO);
        C12932j.m33815a((Object) h3, "BehaviorSubject.createDe…t.HeadingFollowMode.AUTO)");
        this.f10325h = h3;
        this.f10326i = new C5562a();
        C12785a<C2458b> h4 = C12785a.m33446h(C2458b.NORMAL);
        C12932j.m33815a((Object) h4, "BehaviorSubject.createDe…ontract.FocusMode.NORMAL)");
        this.f10327j = h4;
        Boolean valueOf2 = Boolean.valueOf(false);
        C12785a<Boolean> h5 = C12785a.m33446h(valueOf2);
        String str3 = "BehaviorSubject.createDefault(false)";
        C12932j.m33815a((Object) h5, str3);
        this.f10328k = h5;
        C12785a<Boolean> h6 = C12785a.m33446h(valueOf2);
        C12932j.m33815a((Object) h6, str3);
        this.f10329l = h6;
    }

    /* renamed from: r */
    public static final C3896a1 m11470r() {
        return f10317n.mo10527a();
    }

    /* renamed from: a */
    public final boolean mo10506a(String str, boolean z) {
        return m11468a(this, str, z, 0, 4, null);
    }

    /* renamed from: b */
    public final C12785a<C2458b> mo10508b() {
        return this.f10327j;
    }

    /* renamed from: c */
    public final C5562a mo10511c() {
        return this.f10326i;
    }

    /* renamed from: d */
    public final C12785a<C2464g> mo10513d() {
        return this.f10325h;
    }

    /* renamed from: e */
    public final C12785a<Boolean> mo10515e() {
        return this.f10321d;
    }

    /* renamed from: f */
    public final C12785a<Boolean> mo10516f() {
        return this.f10319b;
    }

    /* renamed from: g */
    public final String mo10517g() {
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            return y0Var.mo11335C();
        }
        return null;
    }

    /* renamed from: h */
    public final C12785a<Boolean> mo10518h() {
        return this.f10322e;
    }

    /* renamed from: i */
    public final C12785a<Boolean> mo10519i() {
        return this.f10329l;
    }

    /* renamed from: j */
    public final boolean mo10520j() {
        return this.f10320c;
    }

    /* renamed from: k */
    public final boolean mo10521k() {
        return this.f10323f;
    }

    /* renamed from: l */
    public final void mo10522l() {
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            y0Var.mo11372h(true);
        }
    }

    /* renamed from: m */
    public final void mo10523m() {
        this.f10329l.onNext(Boolean.valueOf(true));
    }

    /* renamed from: n */
    public final void mo10524n() {
        this.f10321d.onNext(Boolean.valueOf(true));
    }

    /* renamed from: o */
    public final void mo10525o() {
        this.f10319b.onNext(Boolean.valueOf(true));
        this.f10320c = true;
    }

    /* renamed from: p */
    public final void mo10526p() {
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            mo10509b(y0Var);
        }
    }

    /* renamed from: a */
    public final C12785a<Boolean> mo10496a() {
        return this.f10328k;
    }

    /* renamed from: b */
    public final void mo10509b(C4407y0 y0Var) {
        C12932j.m33818b(y0Var, "mapController");
        if (!(!C12932j.m33817a((Object) y0Var, (Object) this.f10318a))) {
            this.f10318a = null;
            this.f10320c = false;
            this.f10321d.onNext(Boolean.valueOf(false));
            this.f10319b.onNext(Boolean.valueOf(false));
            this.f10329l.onNext(Boolean.valueOf(false));
        }
    }

    /* renamed from: c */
    public final void mo10512c(boolean z) {
        this.f10322e.onNext(Boolean.valueOf(z));
        this.f10323f = z;
    }

    /* renamed from: d */
    public final void mo10514d(boolean z) {
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            y0Var.mo11368f(z);
        }
    }

    /* renamed from: a */
    public final void mo10501a(C5459d dVar, float f, int i) {
        C12932j.m33818b(dVar, "position");
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            y0Var.mo11341a(dVar, f, i);
        }
    }

    /* renamed from: a */
    public final void mo10503a(List<String> list, boolean z) {
        C12932j.m33818b(list, "userUuids");
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            y0Var.mo11357a(list, z);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m11468a(C3896a1 a1Var, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        return a1Var.mo10507a(str, z, i);
    }

    /* renamed from: a */
    public final boolean mo10507a(String str, boolean z, int i) {
        C12932j.m33818b(str, "userUuid");
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            return y0Var.mo11360a(str, z, i);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo10505a(int i, boolean z) {
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            return y0Var.mo11359a(i, z);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10504a(boolean z) {
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            y0Var.mo11343a(0, 0, 0, 0);
        }
        C4407y0 y0Var2 = this.f10318a;
        if (y0Var2 != null) {
            y0Var2.mo11358a(z, false);
        }
    }

    /* renamed from: b */
    public final void mo10510b(boolean z) {
        this.f10324g.onNext(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo10498a(C2458b bVar) {
        C12932j.m33818b(bVar, "focusMode");
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            y0Var.mo11345a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo10502a(C5460e eVar, long j) {
        C12932j.m33818b(eVar, "viewport");
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            y0Var.mo11356a(eVar, j, true);
        }
    }

    public /* synthetic */ C3896a1(C12928f fVar) {
        this();
    }

    /* renamed from: a */
    public final void mo10497a(int i) {
        C4407y0 y0Var = this.f10318a;
        if (y0Var != null) {
            y0Var.mo11362b(i);
        }
    }

    /* renamed from: a */
    public final void mo10499a(C2464g gVar) {
        C12932j.m33818b(gVar, "mode");
        this.f10325h.onNext(gVar);
    }

    /* renamed from: a */
    public final void mo10500a(C4407y0 y0Var) {
        C12932j.m33818b(y0Var, "mapController");
        mo10526p();
        this.f10318a = y0Var;
    }
}
