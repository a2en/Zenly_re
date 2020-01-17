package app.zenly.locator.support;

import kotlin.jvm.internal.C12932j;
import zendesk.support.Article;

/* renamed from: app.zenly.locator.support.q */
public final class C5787q extends C5931y {

    /* renamed from: a */
    private final Article f14658a;

    public C5787q(Article article) {
        C12932j.m33818b(article, "article");
        super(null);
        this.f14658a = article;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("article/");
        sb.append(this.f14658a.getId());
        return sb.toString();
    }
}
