package app.zenly.locator.dashboard;

import app.zenly.locator.R;
import app.zenly.locator.dashboard.p080y.C3382a;
import app.zenly.locator.dashboard.p080y.C3386c;
import app.zenly.locator.dashboard.p080y.C3388d;
import app.zenly.locator.dashboard.p080y.C3392e;
import app.zenly.locator.dashboard.p080y.C3395g;
import app.zenly.locator.dashboard.p080y.C3403h;
import app.zenly.locator.dashboard.p080y.C3405i;
import app.zenly.locator.dashboard.p080y.C3407k;
import app.zenly.locator.dashboard.p080y.C3409l;
import app.zenly.locator.dashboard.p080y.C3411m;
import app.zenly.locator.dashboard.p080y.C3413n;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11719b;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.dashboard.u */
public enum C3324u implements BindingAdapterViewType {
    HEADER(R.layout.list_item_dashboard_section, C3407k.class),
    BROADCAST_INVITE_HEADER(R.layout.list_item_dashboard_section_broadcast_invite, C3386c.class),
    CONTACT(R.layout.list_item_dashboard_contact, C3395g.class),
    USER(R.layout.list_item_dashboard_user, C3413n.class),
    BEST_FRIEND_CONTENT(R.layout.list_item_dashboard_top_friends, C3382a.class),
    BROADCAST_INVITE(R.layout.list_item_broadcast_invite, C3392e.class),
    BROADCAST_INVITE_LIST(R.layout.list_item_broadcast_invite_list, C3388d.class),
    RECENTLY_VIEWED_CONTENT(R.layout.recycling_center_recycler_view, C11719b.class),
    MINI_USER(R.layout.list_item_dashboard_mini_user, C3411m.class),
    MINI_CONTACT(R.layout.list_item_dashboard_mini_user, C3409l.class),
    EMPTY(R.layout.list_item_dashboard_empty, C3405i.class),
    EMPTY_SUGGESTED_PANEL(R.layout.list_item_dashboard_empty_suggested, C3403h.class);
    

    /* renamed from: e */
    private final int f9251e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f9252f;

    private C3324u(int i, Class<? extends C11721c<?>> cls) {
        this.f9251e = i;
        this.f9252f = cls;
    }

    public int getLayoutId() {
        return this.f9251e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f9252f;
    }
}
