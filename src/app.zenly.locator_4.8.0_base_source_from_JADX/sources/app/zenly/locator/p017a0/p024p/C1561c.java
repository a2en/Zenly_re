package app.zenly.locator.p017a0.p024p;

import app.zenly.locator.R;
import app.zenly.locator.p017a0.p024p.p028g.C1596a;
import app.zenly.locator.p017a0.p024p.p028g.C1597b;
import app.zenly.locator.p017a0.p024p.p028g.C1598c;
import app.zenly.locator.p017a0.p024p.p028g.C1599d;
import app.zenly.locator.p017a0.p024p.p028g.C1603f;
import app.zenly.locator.p017a0.p024p.p028g.C1604g;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.locator.a0.p.c */
public enum C1561c implements BindingAdapterViewType {
    AVATAR(R.layout.list_item_settings_avatar, C1596a.class),
    FOOTER(R.layout.list_item_settings_footer, C1597b.class),
    SECTION(R.layout.list_item_section, C1598c.class),
    SEGMENTED_BAR(R.layout.list_item_settings_segmented_bar, C1599d.class),
    SWITCH(R.layout.list_item_settings_switch, C1603f.class),
    TEXT(R.layout.list_item_settings_text, C1604g.class);
    

    /* renamed from: e */
    private final int f5489e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f5490f;

    private C1561c(int i, Class<? extends C11721c<?>> cls) {
        this.f5489e = i;
        this.f5490f = cls;
    }

    public int getLayoutId() {
        return this.f5489e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f5490f;
    }
}
