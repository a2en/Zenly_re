package app.zenly.locator.support.model;

import android.view.View;
import app.zenly.locator.support.C5688j0;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.services.C8363x;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.model.l */
public final class C5719l {

    /* renamed from: a */
    private final C8363x f14522a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5688j0 f14523b;

    /* renamed from: app.zenly.locator.support.model.l$a */
    public static final class C5720a extends C5700a<C5719l> {
        public C5720a(View view, Consumer<C5719l> consumer) {
            C12932j.m33818b(view, "view");
            C12932j.m33818b(consumer, "action");
            super(view, consumer);
        }

        /* renamed from: a */
        public void mo13386a(C5719l lVar) {
            C12932j.m33818b(lVar, "model");
            super.mo13367a(lVar);
            C8363x b = lVar.f14523b.mo13354b();
            this.f14499a.setText(lVar.mo13385a().getTitle());
            this.f14499a.setChecked(b == null ? false : C12932j.m33817a((Object) lVar.mo13385a().getId(), (Object) b.getId()));
        }
    }

    public C5719l(C8363x xVar, C5688j0 j0Var) {
        C12932j.m33818b(xVar, "category");
        C12932j.m33818b(j0Var, "ticketCreator");
        this.f14522a = xVar;
        this.f14523b = j0Var;
    }

    /* renamed from: a */
    public final C8363x mo13385a() {
        return this.f14522a;
    }
}
