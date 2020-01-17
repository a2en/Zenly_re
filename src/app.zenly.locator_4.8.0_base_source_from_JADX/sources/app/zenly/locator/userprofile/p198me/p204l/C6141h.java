package app.zenly.locator.userprofile.p198me.p204l;

import app.zenly.locator.userprofile.p198me.C6080f;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.userprofile.me.l.h */
public final class C6141h extends C11722a {

    /* renamed from: f */
    private final int f15415f;

    /* renamed from: g */
    private final long f15416g;

    /* renamed from: h */
    private final List<Long> f15417h;

    public C6141h(int i, long j, List<Long> list) {
        C12932j.m33818b(list, "timeSpentByWeeksMillis");
        super(C6080f.FRIENDSHIP_FACTS, 1);
        this.f15415f = i;
        this.f15416g = j;
        this.f15417h = list;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C6141h hVar = (C6141h) aVar;
            return this.f15415f == hVar.f15415f && this.f15416g == hVar.f15416g && C12932j.m33817a((Object) this.f15417h, (Object) hVar.f15417h);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.me.viewmodels.MyProfileFriendshipFactsViewModel");
    }

    /* renamed from: f */
    public final int mo13978f() {
        return this.f15415f;
    }

    /* renamed from: g */
    public final List<Long> mo13979g() {
        return this.f15417h;
    }

    /* renamed from: h */
    public final long mo13980h() {
        return this.f15416g;
    }
}
