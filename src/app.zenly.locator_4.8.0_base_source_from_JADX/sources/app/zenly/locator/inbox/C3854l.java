package app.zenly.locator.inbox;

import app.zenly.locator.R;
import app.zenly.locator.inbox.p102n.C3873b;
import app.zenly.locator.inbox.p102n.C3880c;
import app.zenly.locator.inbox.p102n.C3882d;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.inbox.l */
public enum C3854l implements BindingAdapterViewType {
    CONVERSATION(R.layout.list_item_inbox, C3873b.class),
    SEARCH_ENTITY(R.layout.list_item_inbox_search, C3882d.class),
    EMPTY_INBOX(R.layout.list_item_inbox_empty, C3880c.class),
    LOADING(R.layout.list_item_inbox_loading, null);
    

    /* renamed from: e */
    private final int f10243e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f10244f;

    private C3854l(int i, Class<? extends C11721c<?>> cls) {
        this.f10243e = i;
        this.f10244f = cls;
    }

    public int getLayoutId() {
        return this.f10243e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f10244f;
    }
}
