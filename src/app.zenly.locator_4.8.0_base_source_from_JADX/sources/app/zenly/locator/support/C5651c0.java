package app.zenly.locator.support;

import kotlin.jvm.internal.C12932j;
import zendesk.support.Section;

/* renamed from: app.zenly.locator.support.c0 */
public final class C5651c0 extends C5931y {

    /* renamed from: a */
    private final Section f14407a;

    public C5651c0(Section section) {
        C12932j.m33818b(section, "section");
        super(null);
        this.f14407a = section;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("section/");
        sb.append(this.f14407a.getId());
        return sb.toString();
    }
}
