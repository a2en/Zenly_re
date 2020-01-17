package app.zenly.locator.support.model;

import android.view.View;
import app.zenly.locator.core.util.C3242w;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;
import zendesk.support.Article;

/* renamed from: app.zenly.locator.support.model.d */
public final class C5706d implements HelpCenterModel {

    /* renamed from: a */
    private final Article f14511a;

    /* renamed from: app.zenly.locator.support.model.d$a */
    public static final class C5707a extends C5702b<C5706d> {
        public C5707a(View view, Consumer<C5706d> consumer) {
            C12932j.m33818b(view, "view");
            C12932j.m33818b(consumer, "action");
            super(view, consumer);
        }

        /* renamed from: a */
        public void mo13374a(C5706d dVar) {
            C12932j.m33818b(dVar, "model");
            super.mo13369a(dVar);
            this.f14503a.setText(C3242w.m10277a(dVar.mo13373a().getTitle()));
            this.f14504b.setVisibility(8);
        }
    }

    public C5706d(Article article) {
        C12932j.m33818b(article, "article");
        this.f14511a = article;
    }

    /* renamed from: a */
    public final Article mo13373a() {
        return this.f14511a;
    }
}
