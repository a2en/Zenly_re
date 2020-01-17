package p250f.p251a.p252a.p263b.p264a.p272j;

import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.b.a.j.e */
public final class C7712e {

    /* renamed from: a */
    public static final C7712e f19340a = new C7712e();

    private C7712e() {
    }

    /* renamed from: a */
    public final Seekable<C11722a> mo19921a(C11722a aVar, List<? extends C11722a> list) {
        C12932j.m33818b(aVar, "header");
        C12932j.m33818b(list, "content");
        if (!list.isEmpty()) {
            return C11751f.m30860a(C11751f.m30861a(aVar), C11751f.m30863b(list));
        }
        return C11751f.m30859a();
    }

    /* renamed from: a */
    public final Seekable<C11722a> mo19920a(C11722a aVar, C11722a aVar2, List<? extends C11722a> list) {
        Seekable seekable;
        C12932j.m33818b(aVar, "header");
        C12932j.m33818b(aVar2, "empty");
        C12932j.m33818b(list, "content");
        Seekable a = C11751f.m30861a(aVar);
        if (!list.isEmpty()) {
            seekable = C11751f.m30863b(list);
        } else {
            seekable = C11751f.m30861a(aVar2);
        }
        return C11751f.m30860a(a, seekable);
    }

    /* renamed from: a */
    public final Seekable<C11722a> mo19922a(List<? extends C11722a> list, C11722a aVar) {
        C12932j.m33818b(list, "content");
        C12932j.m33818b(aVar, "footer");
        if (!list.isEmpty()) {
            return C11751f.m30860a(C11751f.m30863b(list), C11751f.m30861a(aVar));
        }
        return C11751f.m30859a();
    }
}
