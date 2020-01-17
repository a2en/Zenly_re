package app.zenly.locator.support.model;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import app.zenly.locator.p143s.C5343a.C5345b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.model.c */
public final class C5704c {

    /* renamed from: a */
    private final C5345b f14508a;

    /* renamed from: b */
    private final int f14509b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function0<C5345b> f14510c;

    /* renamed from: app.zenly.locator.support.model.c$a */
    public static final class C5705a extends C5700a<C5704c> {
        public C5705a(View view, Consumer<C5704c> consumer) {
            C12932j.m33818b(view, "view");
            C12932j.m33818b(consumer, "action");
            super(view, consumer);
        }

        /* renamed from: a */
        public void mo13372a(C5704c cVar) {
            C12932j.m33818b(cVar, "model");
            super.mo13367a(cVar);
            C5345b bVar = (C5345b) cVar.f14510c.invoke();
            CheckBox checkBox = this.f14499a;
            View view = this.itemView;
            C12932j.m33815a((Object) view, "itemView");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "itemView.context");
            checkBox.setText(C7709b.m18762a(context, cVar.mo13370a()));
            this.f14499a.setChecked(cVar.mo13371b() == bVar);
        }
    }

    public C5704c(C5345b bVar, int i, Function0<? extends C5345b> function0) {
        C12932j.m33818b(bVar, "reason");
        C12932j.m33818b(function0, "currentSelectionDelegate");
        this.f14508a = bVar;
        this.f14509b = i;
        this.f14510c = function0;
    }

    /* renamed from: b */
    public final C5345b mo13371b() {
        return this.f14508a;
    }

    /* renamed from: a */
    public final int mo13370a() {
        return this.f14509b;
    }
}
