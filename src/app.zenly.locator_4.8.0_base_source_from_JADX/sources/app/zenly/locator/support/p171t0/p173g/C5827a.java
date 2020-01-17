package app.zenly.locator.support.p171t0.p173g;

import app.zenly.locator.R;
import app.zenly.locator.support.p171t0.p173g.p188k.C5887a;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.support.t0.g.a */
public enum C5827a implements BindingAdapterViewType {
    PLACE_ISSUE(R.layout.item_support_option_clickable, C5887a.class);
    

    /* renamed from: e */
    private final int f14734e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f14735f;

    private C5827a(int i, Class<? extends C11721c<?>> cls) {
        this.f14734e = i;
        this.f14735f = cls;
    }

    public int getLayoutId() {
        return this.f14734e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f14735f;
    }
}
