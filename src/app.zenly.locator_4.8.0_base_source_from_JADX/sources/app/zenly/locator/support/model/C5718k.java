package app.zenly.locator.support.model;

import java.util.Date;
import kotlin.jvm.internal.C12932j;
import zendesk.support.Request;

/* renamed from: app.zenly.locator.support.model.k */
public final class C5718k implements Comparable<C5718k> {

    /* renamed from: e */
    public final Request f14520e;

    /* renamed from: f */
    public final boolean f14521f;

    public C5718k(Request request, boolean z) {
        C12932j.m33818b(request, "request");
        this.f14520e = request;
        this.f14521f = z;
    }

    /* renamed from: a */
    public int compareTo(C5718k kVar) {
        C12932j.m33818b(kVar, "other");
        boolean z = this.f14521f;
        int i = -1;
        if (z != kVar.f14521f) {
            if (!z) {
                i = 1;
            }
            return i;
        }
        Date publicUpdatedAt = this.f14520e.getPublicUpdatedAt();
        if (publicUpdatedAt == null) {
            i = 1;
        } else {
            Date publicUpdatedAt2 = kVar.f14520e.getPublicUpdatedAt();
            if (publicUpdatedAt2 != null) {
                i = publicUpdatedAt2.compareTo(publicUpdatedAt);
            }
        }
        return i;
    }
}
