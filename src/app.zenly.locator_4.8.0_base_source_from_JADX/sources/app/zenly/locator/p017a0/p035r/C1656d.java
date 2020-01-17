package app.zenly.locator.p017a0.p035r;

import app.zenly.locator.R;
import app.zenly.locator.p017a0.p035r.p038h.C1666a;
import app.zenly.locator.p017a0.p035r.p038h.C1667b;
import app.zenly.locator.p017a0.p035r.p038h.C1669c;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.a0.r.d */
public enum C1656d implements BindingAdapterViewType {
    GLOBAL_NOTIFICATION_LIST_ITEM(R.layout.list_item_notifications_global, C1667b.class),
    PER_USER_NOTIFICATION_LIST_ITEM(R.layout.list_item_friend_abroad, C1669c.class),
    EMPTY(R.layout.list_item_friends_abroad_empty, C1666a.class);
    

    /* renamed from: e */
    private final int f5685e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f5686f;

    private C1656d(int i, Class<? extends C11721c<?>> cls) {
        this.f5685e = i;
        this.f5686f = cls;
    }

    public int getLayoutId() {
        return this.f5685e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f5686f;
    }
}
