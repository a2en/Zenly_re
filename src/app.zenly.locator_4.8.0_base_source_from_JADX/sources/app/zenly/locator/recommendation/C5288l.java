package app.zenly.locator.recommendation;

import app.zenly.locator.R;
import app.zenly.locator.recommendation.p141o.C5293a;
import app.zenly.locator.recommendation.p141o.C5295b;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.recommendation.l */
public enum C5288l implements BindingAdapterViewType {
    POTENTIAL_MATCH(R.layout.item_potential_match, C5295b.class),
    POTENTIAL_MATCH_OTHER(R.layout.list_item_recommend_friend, C5293a.class);
    

    /* renamed from: e */
    private final int f13601e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f13602f;

    private C5288l(int i, Class<? extends C11721c<?>> cls) {
        this.f13601e = i;
        this.f13602f = cls;
    }

    public int getLayoutId() {
        return this.f13601e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f13602f;
    }
}
