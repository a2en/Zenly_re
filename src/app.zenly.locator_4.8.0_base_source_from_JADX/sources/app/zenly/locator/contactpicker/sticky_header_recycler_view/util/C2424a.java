package app.zenly.locator.contactpicker.sticky_header_recycler_view.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

/* renamed from: app.zenly.locator.contactpicker.sticky_header_recycler_view.util.a */
public class C2424a implements OrientationProvider {
    /* renamed from: a */
    private void m8502a(LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalStateException("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
        }
    }

    public int getOrientation(RecyclerView recyclerView) {
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        m8502a(layoutManager);
        return ((LinearLayoutManager) layoutManager).mo4978L();
    }

    public boolean isReverseLayout(RecyclerView recyclerView) {
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        m8502a(layoutManager);
        return ((LinearLayoutManager) layoutManager).mo4979M();
    }
}
