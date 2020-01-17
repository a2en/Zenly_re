package app.zenly.android.feature.spam.prevention;

import app.zenly.android.feature.spam.prevention.p014k.C1464a;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.C11721c;

/* renamed from: app.zenly.android.feature.spam.prevention.j */
public enum C1463j implements BindingAdapterViewType {
    SPAMMED_USER(C1451c.list_item_spammed_user, C1464a.class),
    SPAM_INFO(C1451c.list_item_spam_info, null);
    

    /* renamed from: e */
    private final int f5276e;

    /* renamed from: f */
    private final Class<? extends C11721c<?>> f5277f;

    private C1463j(int i, Class<? extends C11721c<?>> cls) {
        this.f5276e = i;
        this.f5277f = cls;
    }

    public int getLayoutId() {
        return this.f5276e;
    }

    public Class<? extends C11721c<?>> getViewBindingClass() {
        return this.f5277f;
    }
}
