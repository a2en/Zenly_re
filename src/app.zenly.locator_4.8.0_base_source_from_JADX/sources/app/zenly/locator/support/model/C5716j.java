package app.zenly.locator.support.model;

import android.view.View;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.services.C8363x;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.model.j */
public final class C5716j {

    /* renamed from: a */
    private final C8363x f14519a;

    /* renamed from: app.zenly.locator.support.model.j$a */
    public static final class C5717a extends C5702b<C5716j> {
        public C5717a(View view, Consumer<C5716j> consumer) {
            C12932j.m33818b(view, "view");
            C12932j.m33818b(consumer, "action");
            super(view, consumer);
        }

        /* renamed from: a */
        public void mo13382a(C5716j jVar) {
            C12932j.m33818b(jVar, "model");
            super.mo13369a(jVar);
            this.f14503a.setText(jVar.mo13381a().getTitle());
            this.f14504b.setText(jVar.mo13381a().getSubtitle());
        }
    }

    public C5716j(C8363x xVar) {
        C12932j.m33818b(xVar, "category");
        this.f14519a = xVar;
    }

    /* renamed from: a */
    public final C8363x mo13381a() {
        return this.f14519a;
    }
}
