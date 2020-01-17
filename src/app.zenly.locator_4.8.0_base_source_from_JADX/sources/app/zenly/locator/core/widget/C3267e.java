package app.zenly.locator.core.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.core.widget.ShowMoreAdapter.ShowMoreCallbacks;
import app.zenly.locator.core.widget.SingleAdapter.Creator;

/* renamed from: app.zenly.locator.core.widget.e */
/* compiled from: lambda */
public final /* synthetic */ class C3267e implements Creator {

    /* renamed from: a */
    private final /* synthetic */ ShowMoreCallbacks f9118a;

    public /* synthetic */ C3267e(ShowMoreCallbacks showMoreCallbacks) {
        this.f9118a = showMoreCallbacks;
    }

    public final C1085v createViewHolder(ViewGroup viewGroup) {
        return ShowMoreAdapter.m10361a(this.f9118a, viewGroup);
    }
}
