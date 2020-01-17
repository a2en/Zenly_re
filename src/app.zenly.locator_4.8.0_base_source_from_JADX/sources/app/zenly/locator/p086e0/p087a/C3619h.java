package app.zenly.locator.p086e0.p087a;

import app.zenly.locator.R;
import app.zenly.locator.p086e0.p087a.p090k.C3644b;
import app.zenly.locator.p086e0.p087a.p090k.C3645c;
import app.zenly.locator.p086e0.p087a.p090k.C3649d;
import app.zenly.locator.p086e0.p087a.p090k.C3651e;
import app.zenly.locator.p086e0.p087a.p090k.C3652f;
import app.zenly.locator.p086e0.p087a.p090k.C3653g;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.e0.a.h */
public enum C3619h implements BindingAdapterViewType {
    PROFILE_OTHER_SECTION(R.layout.list_item_section, C3652f.class),
    PROFILE_OTHER_VANITY_METRICS(R.layout.list_item_profile_other_vanity_metrics, C3653g.class),
    PROFILE_OTHER_SECTION_FRIENDS(R.layout.list_item_subheader_with_title, C3651e.class),
    PROFILE_OTHER_RECOMMEND_FRIENDS(R.layout.list_item_recommend_friends, C3649d.class),
    PROFILE_OTHER_FRIEND(R.layout.list_item_user_profile, C3645c.class),
    PROFILE_OTHER_DISABLED(R.layout.list_item_profile_other_disabled, C3644b.class);
    

    /* renamed from: e */
    private final int f9733e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f9734f;

    private C3619h(int i, Class<? extends C11721c<?>> cls) {
        this.f9733e = i;
        this.f9734f = cls;
    }

    public int getLayoutId() {
        return this.f9733e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f9734f;
    }
}
