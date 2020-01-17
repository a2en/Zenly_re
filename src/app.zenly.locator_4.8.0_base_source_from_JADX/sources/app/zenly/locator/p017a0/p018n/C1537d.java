package app.zenly.locator.p017a0.p018n;

import app.zenly.locator.R;
import app.zenly.locator.p017a0.p018n.p021h.C1548a;
import app.zenly.locator.p017a0.p018n.p021h.C1549b;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.a0.n.d */
public enum C1537d implements BindingAdapterViewType {
    BLOCKED(R.layout.list_item_blocked_users, C1549b.class),
    BLOCKED_COUNT(R.layout.list_item_blocked_users_count, C1548a.class);
    

    /* renamed from: e */
    private final int f5440e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f5441f;

    private C1537d(int i, Class<? extends C11721c<?>> cls) {
        this.f5440e = i;
        this.f5441f = cls;
    }

    public int getLayoutId() {
        return this.f5440e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f5441f;
    }
}
