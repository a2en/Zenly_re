package app.zenly.locator.userprofile.p198me.p204l;

import app.zenly.locator.userprofile.p198me.C6080f;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.userprofile.me.l.e */
public final class C6138e extends C11722a {

    /* renamed from: f */
    private final List<C11722a> f15411f;

    /* renamed from: g */
    private final C11727c f15412g;

    /* renamed from: h */
    private final EventDispatcher f15413h;

    public C6138e(List<? extends C11722a> list, C11727c cVar, EventDispatcher eventDispatcher) {
        C12932j.m33818b(list, "children");
        C12932j.m33818b(cVar, "childViewFactory");
        C12932j.m33818b(eventDispatcher, "childEventDispatcher");
        super(C6080f.BEST_FRIENDS, 1);
        this.f15411f = list;
        this.f15412g = cVar;
        this.f15413h = eventDispatcher;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        return false;
    }

    /* renamed from: f */
    public final EventDispatcher mo13974f() {
        return this.f15413h;
    }

    /* renamed from: g */
    public final C11727c mo13975g() {
        return this.f15412g;
    }

    /* renamed from: h */
    public final List<C11722a> mo13976h() {
        return this.f15411f;
    }
}
