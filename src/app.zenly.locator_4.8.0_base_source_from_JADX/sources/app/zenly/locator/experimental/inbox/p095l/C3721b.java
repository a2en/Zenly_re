package app.zenly.locator.experimental.inbox.p095l;

import app.zenly.locator.experimental.inbox.C3707h;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.experimental.inbox.l.b */
public final class C3721b extends C11722a {

    /* renamed from: f */
    private final List<C11722a> f9970f;

    /* renamed from: g */
    private final C11727c f9971g;

    /* renamed from: h */
    private final EventDispatcher f9972h;

    public C3721b(List<? extends C11722a> list, C11727c cVar, EventDispatcher eventDispatcher) {
        C12932j.m33818b(list, "children");
        C12932j.m33818b(cVar, "childViewFactory");
        C12932j.m33818b(eventDispatcher, "childEventDispatcher");
        super(C3707h.SUGGESTED, 1);
        this.f9970f = list;
        this.f9971g = cVar;
        this.f9972h = eventDispatcher;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        return false;
    }

    /* renamed from: f */
    public final EventDispatcher mo10253f() {
        return this.f9972h;
    }

    /* renamed from: g */
    public final C11727c mo10254g() {
        return this.f9971g;
    }

    /* renamed from: h */
    public final List<C11722a> mo10255h() {
        return this.f9970f;
    }
}
