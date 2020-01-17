package app.zenly.locator.support.p171t0.p173g.p175i;

import app.zenly.locator.R;
import app.zenly.locator.support.p171t0.p173g.p175i.p185g.C5882b;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.support.t0.g.i.b */
public enum C5851b implements BindingAdapterViewType {
    MISSING_PLACE(R.layout.item_support_option_clickable, C5882b.class);
    

    /* renamed from: e */
    private final int f14801e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f14802f;

    private C5851b(int i, Class<? extends C11721c<?>> cls) {
        this.f14801e = i;
        this.f14802f = cls;
    }

    public int getLayoutId() {
        return this.f14801e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f14802f;
    }
}
