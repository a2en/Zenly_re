package app.zenly.locator.contactpicker.sticky_header_recycler_view.caching;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.StickyRecyclerHeadersAdapter;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.util.OrientationProvider;
import p214e.p228e.C7576d;

/* renamed from: app.zenly.locator.contactpicker.sticky_header_recycler_view.caching.a */
public class C2422a implements HeaderProvider {

    /* renamed from: a */
    private final StickyRecyclerHeadersAdapter f7287a;

    /* renamed from: b */
    private final C7576d<View> f7288b = new C7576d<>();

    /* renamed from: c */
    private final OrientationProvider f7289c;

    public C2422a(StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter, OrientationProvider orientationProvider) {
        this.f7287a = stickyRecyclerHeadersAdapter;
        this.f7289c = orientationProvider;
    }

    public View getHeader(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        long headerId = this.f7287a.getHeaderId(i);
        View view = (View) this.f7288b.mo19513c(headerId);
        if (view == null) {
            C1085v onCreateHeaderViewHolder = this.f7287a.onCreateHeaderViewHolder(recyclerView);
            this.f7287a.onBindHeaderViewHolder(onCreateHeaderViewHolder, i);
            view = onCreateHeaderViewHolder.itemView;
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            if (this.f7289c.getOrientation(recyclerView) == 1) {
                i2 = MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
                i3 = MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0);
            } else {
                i2 = MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0);
                i3 = MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824);
            }
            view.measure(ViewGroup.getChildMeasureSpec(i2, recyclerView.getPaddingStart() + recyclerView.getPaddingEnd(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i3, recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), view.getLayoutParams().height));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            this.f7288b.mo19514c(headerId, view);
        }
        return view;
    }

    public void invalidate() {
        this.f7288b.clear();
    }
}
