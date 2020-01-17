package app.zenly.locator.p017a0.p030q;

import app.zenly.locator.R;
import app.zenly.locator.p017a0.p030q.p033e.C1637a;
import app.zenly.locator.p017a0.p030q.p033e.C1638b;
import app.zenly.locator.p017a0.p030q.p033e.C1640c;
import app.zenly.locator.p017a0.p030q.p033e.C1642d;
import app.zenly.locator.p017a0.p030q.p033e.C1644e;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.a0.q.b */
public enum C1617b implements BindingAdapterViewType {
    EMPTY_FRIEND(R.layout.list_item_manage_friends_empty_with_button, C1638b.class),
    EMPTY_INVITED(R.layout.list_item_manage_friends_empty, C1637a.class),
    FRIEND(R.layout.list_item_manage_friends_friend, C1640c.class),
    INVITED(R.layout.list_item_manage_friends_invited, C1642d.class),
    SECTION(R.layout.list_item_section, C1644e.class);
    

    /* renamed from: e */
    private final int f5612e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f5613f;

    private C1617b(int i, Class<? extends C11721c<?>> cls) {
        this.f5612e = i;
        this.f5613f = cls;
    }

    public int getLayoutId() {
        return this.f5612e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f5613f;
    }
}
