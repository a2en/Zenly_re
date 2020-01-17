package app.zenly.locator.support.model;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.core.helper.C2509b;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.model.i */
public abstract class C5714i<T> extends C1085v {

    /* renamed from: a */
    private final Consumer<T> f14516a;

    /* renamed from: app.zenly.locator.support.model.i$a */
    public static final class C5715a extends C2509b {

        /* renamed from: g */
        final /* synthetic */ C5714i f14517g;

        /* renamed from: h */
        final /* synthetic */ Object f14518h;

        C5715a(C5714i iVar, Object obj) {
            this.f14517g = iVar;
            this.f14518h = obj;
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            this.f14517g.mo13379a().accept(this.f14518h);
        }
    }

    public C5714i(View view, Consumer<T> consumer) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(consumer, "action");
        super(view);
        this.f14516a = consumer;
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        C12932j.m33815a((Object) context.getResources(), "itemView.context.resources");
    }

    /* renamed from: a */
    public final Consumer<T> mo13379a() {
        return this.f14516a;
    }

    /* renamed from: a */
    public void mo13380a(T t) {
        this.itemView.setOnClickListener(new C5715a(this, t));
    }
}
