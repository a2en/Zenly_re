package app.zenly.locator.controllers.country;

import app.zenly.locator.R;
import app.zenly.locator.controllers.country.p065f.C2437a;
import app.zenly.locator.controllers.country.p065f.C2439b;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.controllers.country.d */
public enum C2431d implements BindingAdapterViewType {
    HEADER(R.layout.list_item_section, C2439b.class),
    COUNTRY(R.layout.list_item_country, C2437a.class);
    

    /* renamed from: e */
    private final int f7312e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f7313f;

    private C2431d(int i, Class<? extends C11721c<?>> cls) {
        this.f7312e = i;
        this.f7313f = cls;
    }

    public int getLayoutId() {
        return this.f7312e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f7313f;
    }
}
