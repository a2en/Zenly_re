package app.zenly.locator.friendshipfacts;

import app.zenly.locator.R;
import app.zenly.locator.friendshipfacts.p096i.C3787a;
import app.zenly.locator.friendshipfacts.p096i.C3788b;
import app.zenly.locator.friendshipfacts.p096i.C3789c;
import app.zenly.locator.friendshipfacts.p096i.C3790d;
import app.zenly.locator.friendshipfacts.p096i.C3792e;
import app.zenly.locator.friendshipfacts.p096i.C3793f;
import app.zenly.locator.friendshipfacts.p096i.C3795g;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.friendshipfacts.e */
public enum C3781e implements BindingAdapterViewType {
    HEADER(R.layout.list_item_section, C3788b.class),
    TST_HEADER(R.layout.list_item_subheader_with_title, C3793f.class),
    RECORD_STREAK_USER(R.layout.list_item_record_streak_user, C3789c.class),
    STREAK_USERS(R.layout.list_item_friendship_facts_horizontal_recycler, C3792e.class),
    STREAK_USERS_ITEM(R.layout.list_item_streak_user, C3790d.class),
    TST_USER(R.layout.list_item_friendship_facts_time_spent_user, C3795g.class),
    EMPTY_SECTION(R.layout.list_item_empty_section, C3787a.class);
    

    /* renamed from: e */
    private final int f10106e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f10107f;

    private C3781e(int i, Class<? extends C11721c<?>> cls) {
        this.f10106e = i;
        this.f10107f = cls;
    }

    public int getLayoutId() {
        return this.f10106e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f10107f;
    }
}
