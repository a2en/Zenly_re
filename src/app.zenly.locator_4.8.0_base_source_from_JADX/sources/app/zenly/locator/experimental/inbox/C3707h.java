package app.zenly.locator.experimental.inbox;

import app.zenly.locator.R;
import app.zenly.locator.experimental.inbox.p094k.C3713b;
import app.zenly.locator.experimental.inbox.p094k.C3717c;
import app.zenly.locator.experimental.inbox.p094k.C3719d;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.experimental.inbox.h */
public enum C3707h implements BindingAdapterViewType {
    SECTION(R.layout.list_item_section, C3719d.class),
    SUGGESTED(R.layout.z_track4exp3_list_item_suggested_friends, C3717c.class),
    SUGGESTED_ITEM(R.layout.z_track4exp3_list_item_suggested_friend, C3713b.class);
    

    /* renamed from: e */
    private final int f9944e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f9945f;

    private C3707h(int i, Class<? extends C11721c<?>> cls) {
        this.f9944e = i;
        this.f9945f = cls;
    }

    public int getLayoutId() {
        return this.f9944e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f9945f;
    }
}
