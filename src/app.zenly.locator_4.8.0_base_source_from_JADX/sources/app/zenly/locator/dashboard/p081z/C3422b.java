package app.zenly.locator.dashboard.p081z;

import app.zenly.locator.dashboard.C3324u;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.dashboard.z.b */
public final class C3422b extends C11722a {

    /* renamed from: f */
    private final int f9417f;

    /* renamed from: g */
    private final List<C3421a> f9418g;

    /* renamed from: app.zenly.locator.dashboard.z.b$a */
    public static final class C3423a {
        private C3423a() {
        }

        public /* synthetic */ C3423a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3423a(null);
    }

    public C3422b(int i, List<C3421a> list) {
        C12932j.m33818b(list, "tops");
        super(C3324u.BEST_FRIEND_CONTENT, 1);
        this.f9417f = i;
        this.f9418g = list;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C3422b bVar = (C3422b) aVar;
        return this.f9417f == bVar.f9417f && C12932j.m33817a((Object) this.f9418g, (Object) bVar.f9418g);
    }

    /* renamed from: f */
    public final List<C3421a> mo9928f() {
        return this.f9418g;
    }
}
