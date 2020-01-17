package app.zenly.locator.support.p171t0;

import app.zenly.locator.R;
import app.zenly.locator.support.p171t0.p192j.C5894a;
import app.zenly.locator.support.p171t0.p192j.C5896b;
import app.zenly.locator.support.p171t0.p192j.C5899d;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.support.t0.e */
public enum C5822e implements BindingAdapterViewType {
    PLACE(R.layout.item_ticket_place, C5899d.class),
    MISSING_PLACE(R.layout.item_ticket_place, C5894a.class),
    MORE_PLACES(R.layout.list_item_places_more, C5896b.class);
    

    /* renamed from: e */
    private final int f14722e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f14723f;

    private C5822e(int i, Class<? extends C11721c<?>> cls) {
        this.f14722e = i;
        this.f14723f = cls;
    }

    public int getLayoutId() {
        return this.f14722e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f14723f;
    }
}
