package app.zenly.locator.support.model;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import app.zenly.locator.support.C5724n0.C5733d;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.model.m */
public final class C5721m {

    /* renamed from: a */
    private final C5733d f14524a;

    /* renamed from: app.zenly.locator.support.model.m$a */
    public static final class C5722a extends C5702b<C5721m> {
        public C5722a(View view, Consumer<C5721m> consumer) {
            C12932j.m33818b(view, "view");
            C12932j.m33818b(consumer, "action");
            super(view, consumer);
        }

        /* renamed from: a */
        public void mo13388a(C5721m mVar) {
            C12932j.m33818b(mVar, "model");
            super.mo13369a(mVar);
            TextView textView = this.f14503a;
            View view = this.itemView;
            C12932j.m33815a((Object) view, "itemView");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "itemView.context");
            textView.setText(C7709b.m18762a(context, mVar.mo13387a().mo13425a()));
            this.f14504b.setVisibility(8);
        }
    }

    public C5721m(C5733d dVar) {
        C12932j.m33818b(dVar, "subject");
        this.f14524a = dVar;
    }

    /* renamed from: a */
    public final C5733d mo13387a() {
        return this.f14524a;
    }
}
