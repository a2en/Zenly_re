package app.zenly.locator.support.p171t0.p173g.p189l;

import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.support.C5724n0.C5738f;
import app.zenly.locator.support.p171t0.p173g.C5827a;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.support.t0.g.l.a */
public final class C5889a extends C11722a {

    /* renamed from: f */
    private final long f14876f;

    /* renamed from: g */
    private final C2918b f14877g;

    /* renamed from: h */
    private final String f14878h;

    /* renamed from: i */
    private final C5738f f14879i;

    public C5889a(long j, C2918b bVar, String str, C5738f fVar) {
        C12932j.m33818b(bVar, "placeTag");
        C12932j.m33818b(str, "placeAddress");
        C12932j.m33818b(fVar, "reason");
        super(C5827a.PLACE_ISSUE, j);
        this.f14876f = j;
        this.f14877g = bVar;
        this.f14878h = str;
        this.f14879i = fVar;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C5889a aVar2 = (C5889a) aVar;
        return this.f14877g == aVar2.f14877g && C12932j.m33817a((Object) this.f14878h, (Object) aVar2.f14878h) && this.f14879i == aVar2.f14879i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5889a) {
                C5889a aVar = (C5889a) obj;
                if (!(this.f14876f == aVar.f14876f) || !C12932j.m33817a((Object) this.f14877g, (Object) aVar.f14877g) || !C12932j.m33817a((Object) this.f14878h, (Object) aVar.f14878h) || !C12932j.m33817a((Object) this.f14879i, (Object) aVar.f14879i)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo13580f() {
        return this.f14878h;
    }

    /* renamed from: g */
    public final C2918b mo13581g() {
        return this.f14877g;
    }

    /* renamed from: h */
    public final C5738f mo13582h() {
        return this.f14879i;
    }

    public int hashCode() {
        int a = Long.valueOf(this.f14876f).hashCode() * 31;
        C2918b bVar = this.f14877g;
        int i = 0;
        int hashCode = (a + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f14878h;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C5738f fVar = this.f14879i;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaceIssueViewModel(stableId=");
        sb.append(this.f14876f);
        sb.append(", placeTag=");
        sb.append(this.f14877g);
        sb.append(", placeAddress=");
        sb.append(this.f14878h);
        sb.append(", reason=");
        sb.append(this.f14879i);
        sb.append(")");
        return sb.toString();
    }
}
