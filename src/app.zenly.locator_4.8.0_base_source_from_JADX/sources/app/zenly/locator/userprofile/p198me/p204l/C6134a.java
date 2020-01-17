package app.zenly.locator.userprofile.p198me.p204l;

import com.snap.p327ui.recycling.AdapterViewType;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.userprofile.me.l.a */
public final class C6134a<T extends C11722a> extends C11722a {

    /* renamed from: f */
    private T f15407f;

    public C6134a(AdapterViewType adapterViewType, long j) {
        C12932j.m33818b(adapterViewType, "viewType");
        super(adapterViewType, j);
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C6134a aVar2 = (C6134a) aVar;
            T t = this.f15407f;
            if (t != null) {
                T t2 = aVar2.f15407f;
                if (t2 != null) {
                    return t.mo7088a(t2);
                }
            }
            return C12932j.m33817a((Object) t, (Object) aVar2.f15407f);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.me.viewmodels.DataViewModel<*>");
    }

    /* renamed from: f */
    public final T mo13970f() {
        T t = this.f15407f;
        if (t != null) {
            return t;
        }
        throw new IllegalAccessException("data is null");
    }

    public C6134a(T t) {
        C12932j.m33818b(t, "data");
        AdapterViewType d = t.mo10146d();
        C12932j.m33815a((Object) d, "data.type");
        this(d, t.mo34500c());
        this.f15407f = t;
    }
}
