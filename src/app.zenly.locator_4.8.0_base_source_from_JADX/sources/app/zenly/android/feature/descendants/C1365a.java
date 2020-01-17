package app.zenly.android.feature.descendants;

import android.view.View;
import app.zenly.android.feature.polenta.widget.EmptyView;
import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.a */
public final class C1365a {

    /* renamed from: a */
    private C1366a f5002a = C1366a.LOADING;

    /* renamed from: b */
    private final View f5003b;

    /* renamed from: c */
    private final EmptyView f5004c;

    /* renamed from: d */
    private final List<View> f5005d;

    /* renamed from: app.zenly.android.feature.descendants.a$a */
    public enum C1366a {
        LOADING,
        ERROR,
        DATA
    }

    public C1365a(View view, EmptyView emptyView, List<? extends View> list) {
        C12932j.m33818b(view, "progressView");
        C12932j.m33818b(emptyView, "errorView");
        C12932j.m33818b(list, "dataViews");
        this.f5003b = view;
        this.f5004c = emptyView;
        this.f5005d = list;
        this.f5003b.setVisibility(0);
        this.f5004c.setVisibility(8);
        for (View visibility : this.f5005d) {
            visibility.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final C1366a mo6608a() {
        return this.f5002a;
    }

    /* renamed from: a */
    public final void mo6609a(C1366a aVar) {
        C12932j.m33818b(aVar, "value");
        if (this.f5002a != aVar) {
            int i = 0;
            this.f5003b.setVisibility(aVar == C1366a.LOADING ? 0 : 8);
            this.f5004c.setVisibility(aVar == C1366a.ERROR ? 0 : 8);
            if (aVar != C1366a.DATA) {
                i = 8;
            }
            for (View visibility : this.f5005d) {
                visibility.setVisibility(i);
            }
            this.f5002a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo6610a(Function0<C12956q> function0) {
        C12932j.m33818b(function0, "errorAction");
        this.f5004c.mo6794a(function0);
    }
}
