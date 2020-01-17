package app.zenly.locator.support;

import android.content.Context;
import app.zenly.locator.support.C5724n0.C5730c;
import app.zenly.locator.support.C5724n0.C5733d;
import app.zenly.locator.support.C5724n0.C5736e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.services.C8363x;
import p213co.znly.models.services.C8393z;
import zendesk.support.Article;
import zendesk.support.Section;

/* renamed from: app.zenly.locator.support.j0 */
public final class C5688j0 {

    /* renamed from: a */
    private C5733d f14467a;

    /* renamed from: b */
    private String f14468b;

    /* renamed from: c */
    private C8363x f14469c;

    /* renamed from: d */
    private C8363x f14470d;

    /* renamed from: e */
    private final Map<Integer, C5736e> f14471e = new LinkedHashMap();

    /* renamed from: f */
    private final List<C5931y> f14472f = new ArrayList();

    /* renamed from: g */
    private final List<C5931y> f14473g = new ArrayList();

    /* renamed from: h */
    private boolean f14474h;

    /* renamed from: a */
    public final void mo13349a(C5733d dVar) {
        this.f14467a = dVar;
        mo13350a((C8363x) null);
        this.f14470d = null;
        this.f14468b = null;
        this.f14471e.clear();
        this.f14472f.clear();
        this.f14473g.clear();
        this.f14474h = false;
    }

    /* renamed from: b */
    public final C8363x mo13354b() {
        return this.f14470d;
    }

    /* renamed from: c */
    public final C5733d mo13356c() {
        return this.f14467a;
    }

    /* renamed from: d */
    public final Map<Integer, C5736e> mo13357d() {
        return this.f14471e;
    }

    /* renamed from: b */
    public final void mo13355b(C8363x xVar) {
        this.f14470d = xVar;
    }

    /* renamed from: a */
    public final void mo13351a(String str) {
        this.f14468b = str;
    }

    /* renamed from: a */
    public final C8363x mo13346a() {
        return this.f14469c;
    }

    /* renamed from: a */
    public final void mo13350a(C8363x xVar) {
        this.f14469c = xVar;
        C8363x xVar2 = this.f14469c;
        List subcategoriesList = xVar2 != null ? xVar2.getSubcategoriesList() : null;
        this.f14470d = (subcategoriesList == null || !(subcategoriesList.isEmpty() ^ true)) ? null : (C8363x) subcategoriesList.get(0);
        this.f14468b = null;
    }

    /* renamed from: a */
    public final void mo13348a(C5730c cVar) {
        C12932j.m33818b(cVar, "category");
        C5802s sVar = new C5802s(cVar);
        if (this.f14474h) {
            return;
        }
        if (this.f14472f.isEmpty()) {
            this.f14472f.add(sVar);
        } else {
            this.f14474h = true;
        }
    }

    /* renamed from: a */
    public final void mo13353a(Section section) {
        C12932j.m33818b(section, "section");
        C5651c0 c0Var = new C5651c0(section);
        if (!this.f14474h) {
            if (C12857w.m33686h((List) this.f14472f) instanceof C5802s) {
                this.f14472f.add(c0Var);
            } else {
                this.f14474h = true;
            }
        }
        this.f14473g.clear();
        this.f14473g.add(c0Var);
    }

    /* renamed from: a */
    public final void mo13352a(Article article) {
        C12932j.m33818b(article, "article");
        C5787q qVar = new C5787q(article);
        if (!this.f14474h) {
            if (C12857w.m33686h((List) this.f14472f) instanceof C5651c0) {
                this.f14472f.add(qVar);
            }
            this.f14474h = true;
        }
        this.f14473g.clear();
        this.f14473g.add(qVar);
    }

    /* renamed from: a */
    public final C8393z mo13347a(Context context, C5724n0 n0Var) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(n0Var, "zendeskSdk");
        C5733d dVar = this.f14467a;
        if (dVar != null) {
            int i = C5686i0.f14465a[dVar.ordinal()];
            if (i == 1 || i == 2) {
                return n0Var.mo13392a(dVar, this.f14472f, this.f14473g, this.f14468b);
            }
            if (i == 3) {
                return n0Var.mo13389a(context, dVar, this.f14471e);
            }
            if (i == 4) {
                return n0Var.mo13391a(dVar, this.f14468b);
            }
            if (i == 5) {
                return n0Var.mo13390a(dVar, this.f14469c, this.f14470d, this.f14468b);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cannot create ticket with the subject ");
        sb.append(dVar);
        throw new IllegalArgumentException(sb.toString());
    }
}
