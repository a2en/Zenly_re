package app.zenly.locator.recommendation.util;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import androidx.activity.C0088b;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.feature.polenta.widget.SearchBar;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.recommendation.util.a */
public final class C5327a extends C0088b {

    /* renamed from: c */
    private final OnFocusChangeListener f13726c = new C5328a(this);

    /* renamed from: d */
    private SearchBar f13727d;

    /* renamed from: app.zenly.locator.recommendation.util.a$a */
    static final class C5328a implements OnFocusChangeListener {

        /* renamed from: e */
        final /* synthetic */ C5327a f13728e;

        C5328a(C5327a aVar) {
            this.f13728e = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f13728e.mo287a(z);
        }
    }

    public C5327a(SearchBar searchBar) {
        C12932j.m33818b(searchBar, "searchBar");
        super(false);
        this.f13727d = searchBar;
        this.f13727d.mo6899a(this.f13726c);
    }

    /* renamed from: a */
    public void mo285a() {
        this.f13727d.clearFocus();
        C1297b.m6240a(this.f13727d, false, 2, null);
    }

    /* renamed from: d */
    public final void mo12754d() {
        this.f13727d.mo6901b(this.f13726c);
    }
}
