package app.zenly.locator.core.widget;

import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.core.widget.ShowMoreAdapter.ShowMoreCallbacks;

/* renamed from: app.zenly.locator.core.widget.f */
/* compiled from: lambda */
public final /* synthetic */ class C3268f implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ ShowMoreCallbacks f9119e;

    public /* synthetic */ C3268f(ShowMoreCallbacks showMoreCallbacks) {
        this.f9119e = showMoreCallbacks;
    }

    public final void onClick(View view) {
        this.f9119e.onShowMoreClick();
    }
}
