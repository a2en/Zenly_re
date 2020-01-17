package com.segment.analytics;

import com.segment.analytics.Middleware.Chain;
import com.segment.analytics.integrations.C11650b;
import java.util.List;

/* renamed from: com.segment.analytics.n */
class C11673n implements Chain {

    /* renamed from: a */
    private int f30262a;

    /* renamed from: b */
    private final C11650b f30263b;

    /* renamed from: c */
    private final List<Middleware> f30264c;

    /* renamed from: d */
    private final Analytics f30265d;

    C11673n(int i, C11650b bVar, List<Middleware> list, Analytics analytics) {
        this.f30262a = i;
        this.f30263b = bVar;
        this.f30264c = list;
        this.f30265d = analytics;
    }

    public C11650b payload() {
        return this.f30263b;
    }

    public void proceed(C11650b bVar) {
        if (this.f30262a < this.f30264c.size()) {
            ((Middleware) this.f30264c.get(this.f30262a)).intercept(new C11673n(this.f30262a + 1, bVar, this.f30264c, this.f30265d));
            return;
        }
        this.f30265d.mo34228b(bVar);
    }
}
