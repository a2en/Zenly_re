package app.zenly.locator.view;

import android.view.View;
import androidx.recyclerview.widget.C1145t;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.view.a */
public final class C6176a extends C1145t {

    /* renamed from: d */
    private RecyclerView f15532d;

    /* renamed from: a */
    public void mo5787a(RecyclerView recyclerView) {
        this.f15532d = recyclerView;
        super.mo5787a(recyclerView);
    }

    /* renamed from: c */
    public View mo5764c(LayoutManager layoutManager) {
        C12932j.m33818b(layoutManager, "layoutManager");
        if (!(layoutManager instanceof HorizontalStackLayoutManager)) {
            return null;
        }
        return ((HorizontalStackLayoutManager) layoutManager).mo14008G();
    }

    /* renamed from: a */
    public int[] mo5762a(LayoutManager layoutManager, View view) {
        C12932j.m33818b(layoutManager, "layoutManager");
        C12932j.m33818b(view, "targetView");
        RecyclerView recyclerView = this.f15532d;
        if (!(layoutManager instanceof HorizontalStackLayoutManager) || recyclerView == null) {
            return new int[]{0, 0};
        }
        return new int[]{((HorizontalStackLayoutManager) layoutManager).mo14010i(recyclerView.mo5085e(view)), 0};
    }

    /* renamed from: a */
    public int mo5761a(LayoutManager layoutManager, int i, int i2) {
        C12932j.m33818b(layoutManager, "layoutManager");
        if (layoutManager instanceof HorizontalStackLayoutManager) {
            HorizontalStackLayoutManager horizontalStackLayoutManager = (HorizontalStackLayoutManager) layoutManager;
            if (horizontalStackLayoutManager.mo5293j() != 0) {
                return horizontalStackLayoutManager.mo14011j(horizontalStackLayoutManager.mo14009H() + mo5788b(i, i2)[0]);
            }
        }
        return -1;
    }
}
