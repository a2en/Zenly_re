package app.zenly.locator.support.model;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2509b;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.model.b */
public abstract class C5702b<T> extends C1085v {

    /* renamed from: a */
    public final TextView f14503a;

    /* renamed from: b */
    public final TextView f14504b;

    /* renamed from: c */
    private final Consumer<T> f14505c;

    /* renamed from: app.zenly.locator.support.model.b$a */
    public static final class C5703a extends C2509b {

        /* renamed from: g */
        final /* synthetic */ C5702b f14506g;

        /* renamed from: h */
        final /* synthetic */ Object f14507h;

        C5703a(C5702b bVar, Object obj) {
            this.f14506g = bVar;
            this.f14507h = obj;
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            this.f14506g.mo13368a().accept(this.f14507h);
        }
    }

    public C5702b(View view, Consumer<T> consumer) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(consumer, "action");
        super(view);
        this.f14505c = consumer;
        View findViewById = view.findViewById(R.id.option_name);
        C12932j.m33815a((Object) findViewById, "itemView.findViewById(R.id.option_name)");
        this.f14503a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.option_description);
        C12932j.m33815a((Object) findViewById2, "itemView.findViewById(R.id.option_description)");
        this.f14504b = (TextView) findViewById2;
    }

    /* renamed from: a */
    public final Consumer<T> mo13368a() {
        return this.f14505c;
    }

    /* renamed from: a */
    public void mo13369a(T t) {
        this.itemView.setOnClickListener(new C5703a(this, t));
    }
}
