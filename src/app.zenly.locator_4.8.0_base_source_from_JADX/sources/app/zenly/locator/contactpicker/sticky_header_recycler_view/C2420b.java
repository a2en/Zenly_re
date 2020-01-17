package app.zenly.locator.contactpicker.sticky_header_recycler_view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.caching.C2422a;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.caching.HeaderProvider;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.p062c.C2421a;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.p063d.C2423a;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.util.C2424a;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.util.OrientationProvider;

/* renamed from: app.zenly.locator.contactpicker.sticky_header_recycler_view.b */
public class C2420b extends C1074l {

    /* renamed from: a */
    private final StickyRecyclerHeadersAdapter f7279a;

    /* renamed from: b */
    private final SparseArray<Rect> f7280b;

    /* renamed from: c */
    private final HeaderProvider f7281c;

    /* renamed from: d */
    private final OrientationProvider f7282d;

    /* renamed from: e */
    private final C2419a f7283e;

    /* renamed from: f */
    private final C2423a f7284f;

    /* renamed from: g */
    private final C2421a f7285g;

    /* renamed from: h */
    private final Rect f7286h;

    public C2420b(StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter) {
        this(stickyRecyclerHeadersAdapter, new C2424a(), new C2421a(), null);
    }

    /* renamed from: a */
    private void m8496a(Rect rect, View view, int i) {
        this.f7285g.mo8383a(this.f7286h, view);
        if (i == 1) {
            int height = view.getHeight();
            Rect rect2 = this.f7286h;
            rect.top = height + rect2.top + rect2.bottom;
            return;
        }
        int width = view.getWidth();
        Rect rect3 = this.f7286h;
        rect.left = width + rect3.left + rect3.right;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1082s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        int e = recyclerView.mo5085e(view);
        if (e != -1 && this.f7283e.mo8380a(e, this.f7282d.isReverseLayout(recyclerView))) {
            m8496a(rect, mo8382a(recyclerView, e), this.f7282d.getOrientation(recyclerView));
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1082s sVar) {
        boolean z;
        Rect rect;
        RecyclerView recyclerView2 = recyclerView;
        super.onDrawOver(canvas, recyclerView, sVar);
        int childCount = recyclerView.getChildCount();
        if (childCount > 0 && this.f7279a.getItemCount() > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView2.getChildAt(i);
                int e = recyclerView2.mo5085e(childAt);
                if (e != -1) {
                    boolean a = this.f7283e.mo8381a(childAt, this.f7282d.getOrientation(recyclerView2), e);
                    if (a || this.f7283e.mo8380a(e, this.f7282d.isReverseLayout(recyclerView2))) {
                        View header = this.f7281c.getHeader(recyclerView2, e);
                        Rect rect2 = (Rect) this.f7280b.get(e);
                        if (rect2 == null) {
                            rect2 = new Rect();
                            this.f7280b.put(e, rect2);
                        } else if (rect2.top <= 0) {
                            rect = rect2;
                            z = true;
                            View view = header;
                            this.f7283e.mo8379a(rect, recyclerView, view, childAt, a);
                            this.f7284f.mo8386a(recyclerView, canvas, view, rect, z);
                        }
                        rect = rect2;
                        z = false;
                        View view2 = header;
                        this.f7283e.mo8379a(rect, recyclerView, view2, childAt, a);
                        this.f7284f.mo8386a(recyclerView, canvas, view2, rect, z);
                    }
                }
            }
        }
    }

    private C2420b(StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter, OrientationProvider orientationProvider, C2421a aVar, ItemVisibilityAdapter itemVisibilityAdapter) {
        this(stickyRecyclerHeadersAdapter, orientationProvider, aVar, new C2423a(orientationProvider), new C2422a(stickyRecyclerHeadersAdapter, orientationProvider), itemVisibilityAdapter);
    }

    private C2420b(StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter, OrientationProvider orientationProvider, C2421a aVar, C2423a aVar2, HeaderProvider headerProvider, ItemVisibilityAdapter itemVisibilityAdapter) {
        this(stickyRecyclerHeadersAdapter, aVar2, orientationProvider, aVar, headerProvider, new C2419a(stickyRecyclerHeadersAdapter, headerProvider, orientationProvider, aVar), itemVisibilityAdapter);
    }

    private C2420b(StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter, C2423a aVar, OrientationProvider orientationProvider, C2421a aVar2, HeaderProvider headerProvider, C2419a aVar3, ItemVisibilityAdapter itemVisibilityAdapter) {
        this.f7280b = new SparseArray<>();
        this.f7286h = new Rect();
        this.f7279a = stickyRecyclerHeadersAdapter;
        this.f7281c = headerProvider;
        this.f7282d = orientationProvider;
        this.f7284f = aVar;
        this.f7285g = aVar2;
        this.f7283e = aVar3;
    }

    /* renamed from: a */
    public View mo8382a(RecyclerView recyclerView, int i) {
        return this.f7281c.getHeader(recyclerView, i);
    }
}
