package app.zenly.locator.experimental.inbox.p095l;

import app.zenly.locator.experimental.inbox.C3707h;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.experimental.inbox.l.c */
public final class C3722c extends C11722a {

    /* renamed from: f */
    private final String f9973f;

    public C3722c(long j, String str) {
        C12932j.m33818b(str, "title");
        super(C3707h.SECTION, j);
        this.f9973f = str;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        return C12932j.m33817a((Object) this.f9973f, (Object) ((C3722c) aVar).f9973f);
    }

    /* renamed from: f */
    public final String mo10256f() {
        return this.f9973f;
    }
}
