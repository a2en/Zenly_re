package app.zenly.locator.p017a0.p024p.p029h;

import app.zenly.locator.p017a0.p024p.C1561c;
import app.zenly.locator.p017a0.p024p.p026e.C1583q;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C12844m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.p.h.e */
public final class C1610e extends C11722a {

    /* renamed from: f */
    private final int f5583f;

    /* renamed from: g */
    private final List<C1608d> f5584g;

    /* renamed from: h */
    private final Function2<Integer, Integer, C1583q> f5585h;

    public C1610e(long j, int i, List<C1608d> list, Function2<? super Integer, ? super Integer, ? extends C1583q> function2) {
        C12932j.m33818b(list, "bars");
        C12932j.m33818b(function2, "actionCreator");
        super(C1561c.SEGMENTED_BAR, j);
        this.f5583f = i;
        this.f5584g = list;
        this.f5585h = function2;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C1610e eVar = (C1610e) aVar;
            if (this.f5583f != eVar.f5583f || this.f5584g.size() != eVar.f5584g.size()) {
                return false;
            }
            int i = 0;
            for (Object next : this.f5584g) {
                int i2 = i + 1;
                if (i < 0) {
                    C12844m.m33616c();
                    throw null;
                } else if (!C12932j.m33817a((Object) (C1608d) next, (Object) (C1608d) eVar.f5584g.get(i))) {
                    return false;
                } else {
                    i = i2;
                }
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.settings.general.viewmodel.SegmentedBarViewModel");
    }

    /* renamed from: f */
    public final Function2<Integer, Integer, C1583q> mo7181f() {
        return this.f5585h;
    }

    /* renamed from: g */
    public final List<C1608d> mo7182g() {
        return this.f5584g;
    }

    /* renamed from: h */
    public final int mo7183h() {
        return this.f5583f;
    }

    public C1610e(long j, int i, C1608d dVar, Function2<? super Integer, ? super Integer, ? extends C1583q> function2) {
        C12932j.m33818b(dVar, "bar");
        C12932j.m33818b(function2, "actionCreator");
        this(j, i, C12846n.m33635a(dVar), function2);
    }
}
