package app.zenly.locator.userprofile.p198me;

import app.zenly.locator.R;
import app.zenly.locator.userprofile.p198me.p203k.C6111a;
import app.zenly.locator.userprofile.p198me.p203k.C6116b;
import app.zenly.locator.userprofile.p198me.p203k.C6118c;
import app.zenly.locator.userprofile.p198me.p203k.C6120d;
import app.zenly.locator.userprofile.p198me.p203k.C6122e;
import app.zenly.locator.userprofile.p198me.p203k.C6124f;
import app.zenly.locator.userprofile.p198me.p203k.C6127g;
import app.zenly.locator.userprofile.p198me.p203k.C6129h;
import app.zenly.locator.userprofile.p198me.p203k.C6130i;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.userprofile.me.f */
public enum C6080f implements BindingAdapterViewType {
    SECTION(R.layout.list_item_section, C6129h.class),
    BEST_FRIENDS(R.layout.list_item_my_profile_best_friends, C6120d.class),
    BEST_FRIENDS_ITEM(R.layout.list_item_my_profile_best_friends__item, C6118c.class),
    BEST_FRIENDS_ITEM_EMPTY(R.layout.list_item_my_profile_best_friends__item_empty, C6116b.class),
    FRIENDSHIP_FACTS(R.layout.list_item_my_profile_friendship_facts, C6127g.class),
    FRIENDSHIP_FACTS_UNLOCKABLE(R.layout.list_item_my_profile_friendship_facts_unlockable, C6124f.class),
    VANITY_METRICS(R.layout.list_item_my_profile_vanity_metrics, C6130i.class),
    APP_ICONS(R.layout.list_item_my_profile_app_icons, C6111a.class),
    FOOTER(R.layout.list_item_my_profile_footer, C6122e.class);
    

    /* renamed from: e */
    private final int f15310e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f15311f;

    private C6080f(int i, Class<? extends C11721c<?>> cls) {
        this.f15310e = i;
        this.f15311f = cls;
    }

    public int getLayoutId() {
        return this.f15310e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f15311f;
    }
}
