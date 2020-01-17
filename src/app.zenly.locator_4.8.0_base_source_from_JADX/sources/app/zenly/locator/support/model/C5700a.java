package app.zenly.locator.support.model;

import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.core.helper.C2509b;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.model.a */
public abstract class C5700a<T> extends C1085v {

    /* renamed from: a */
    public final CheckBox f14499a;

    /* renamed from: b */
    private final Consumer<T> f14500b;

    /* renamed from: app.zenly.locator.support.model.a$a */
    public static final class C5701a extends C2509b {

        /* renamed from: g */
        final /* synthetic */ C5700a f14501g;

        /* renamed from: h */
        final /* synthetic */ Object f14502h;

        C5701a(C5700a aVar, Object obj) {
            this.f14501g = aVar;
            this.f14502h = obj;
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            this.f14501g.mo13366a().accept(this.f14502h);
        }
    }

    public C5700a(View view, Consumer<T> consumer) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(consumer, "action");
        super(view);
        this.f14500b = consumer;
        this.f14499a = (CheckBox) view;
    }

    /* renamed from: a */
    public final Consumer<T> mo13366a() {
        return this.f14500b;
    }

    /* renamed from: a */
    public void mo13367a(T t) {
        this.itemView.setOnClickListener(new C5701a(this, t));
    }
}
