package app.zenly.locator.support.p171t0.p173g.p175i.p178e;

import app.zenly.locator.R;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p182g.C5872a;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p182g.C5873b;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p182g.C5874c;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.support.t0.g.i.e.c */
public enum C5865c implements BindingAdapterViewType {
    EMPTY(R.layout.list_item_place_picker_empty, C5872a.class),
    SECTION(R.layout.list_item_section, C5873b.class),
    SUGGESTED_PLACE(R.layout.list_item_settings_text, C5874c.class);
    

    /* renamed from: e */
    private final int f14840e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f14841f;

    private C5865c(int i, Class<? extends C11721c<?>> cls) {
        this.f14840e = i;
        this.f14841f = cls;
    }

    public int getLayoutId() {
        return this.f14840e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f14841f;
    }
}
