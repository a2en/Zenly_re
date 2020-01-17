package app.zenly.locator.contactpicker.sticky_header_recycler_view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.caching.HeaderProvider;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.p062c.C2421a;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.util.OrientationProvider;

/* renamed from: app.zenly.locator.contactpicker.sticky_header_recycler_view.a */
public class C2419a {

    /* renamed from: a */
    private final StickyRecyclerHeadersAdapter f7273a;

    /* renamed from: b */
    private final OrientationProvider f7274b;

    /* renamed from: c */
    private final HeaderProvider f7275c;

    /* renamed from: d */
    private final C2421a f7276d;

    /* renamed from: e */
    private final Rect f7277e = new Rect();

    /* renamed from: f */
    private final Rect f7278f = new Rect();

    public C2419a(StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter, HeaderProvider headerProvider, OrientationProvider orientationProvider, C2421a aVar) {
        this.f7273a = stickyRecyclerHeadersAdapter;
        this.f7275c = headerProvider;
        this.f7274b = orientationProvider;
        this.f7276d = aVar;
    }

    /* renamed from: b */
    private boolean m8492b(RecyclerView recyclerView, View view) {
        View a = m8486a(recyclerView, view);
        int e = recyclerView.mo5085e(a);
        if (e == -1) {
            return false;
        }
        boolean isReverseLayout = this.f7274b.isReverseLayout(recyclerView);
        if (e > 0 && mo8380a(e, isReverseLayout)) {
            View header = this.f7275c.getHeader(recyclerView, e);
            this.f7276d.mo8383a(this.f7277e, header);
            this.f7276d.mo8383a(this.f7278f, view);
            if (this.f7274b.getOrientation(recyclerView) == 1) {
                int top = ((a.getTop() - this.f7277e.bottom) - header.getHeight()) - this.f7277e.top;
                int paddingTop = recyclerView.getPaddingTop() + view.getBottom();
                Rect rect = this.f7278f;
                if (top < paddingTop + rect.top + rect.bottom) {
                    return true;
                }
            } else {
                int left = ((a.getLeft() - this.f7277e.right) - header.getWidth()) - this.f7277e.left;
                int paddingLeft = recyclerView.getPaddingLeft() + view.getRight();
                Rect rect2 = this.f7278f;
                if (left < paddingLeft + rect2.left + rect2.right) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo8381a(View view, int i, int i2) {
        int i3;
        int i4;
        this.f7276d.mo8383a(this.f7277e, view);
        if (i == 1) {
            i4 = view.getTop();
            i3 = this.f7277e.top;
        } else {
            i4 = view.getLeft();
            i3 = this.f7277e.left;
        }
        if (i4 > i3 || this.f7273a.getHeaderId(i2) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo8380a(int i, boolean z) {
        if (m8489a(i)) {
            return false;
        }
        long headerId = this.f7273a.getHeaderId(i);
        if (headerId < 0) {
            return false;
        }
        long j = -1;
        boolean z2 = true;
        int i2 = (z ? 1 : -1) + i;
        if (!m8489a(i2)) {
            j = this.f7273a.getHeaderId(i2);
        }
        if (i != (z ? this.f7273a.getItemCount() - 1 : 0) && headerId == j) {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m8489a(int i) {
        return i < 0 || i >= this.f7273a.getItemCount();
    }

    /* renamed from: b */
    private int m8491b(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager().mo5285f()) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo8379a(Rect rect, RecyclerView recyclerView, View view, View view2, boolean z) {
        m8487a(rect, recyclerView, view, view2, this.f7274b.getOrientation(recyclerView));
        if (z && m8492b(recyclerView, view)) {
            View a = m8486a(recyclerView, view);
            RecyclerView recyclerView2 = recyclerView;
            m8488a(recyclerView2, this.f7274b.getOrientation(recyclerView), rect, view, a, this.f7275c.getHeader(recyclerView, recyclerView.mo5085e(a)));
        }
    }

    /* renamed from: a */
    private void m8487a(Rect rect, RecyclerView recyclerView, View view, View view2, int i) {
        int i2;
        int i3;
        int i4;
        this.f7276d.mo8383a(this.f7277e, view);
        LayoutParams layoutParams = view2.getLayoutParams();
        int i5 = 0;
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            i5 = marginLayoutParams.leftMargin;
            i2 = marginLayoutParams.topMargin;
        } else {
            i2 = 0;
        }
        if (i == 1) {
            int left = (view2.getLeft() - i5) + this.f7277e.left;
            i3 = Math.max(((view2.getTop() - i2) - view.getHeight()) - this.f7277e.bottom, m8491b(recyclerView) + this.f7277e.top);
            i4 = left;
        } else {
            i3 = (view2.getTop() - i2) + this.f7277e.top;
            i4 = Math.max(((view2.getLeft() - i5) - view.getWidth()) - this.f7277e.right, m8485a(recyclerView) + this.f7277e.left);
        }
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    /* renamed from: a */
    private void m8488a(RecyclerView recyclerView, int i, Rect rect, View view, View view2, View view3) {
        this.f7276d.mo8383a(this.f7277e, view3);
        this.f7276d.mo8383a(this.f7278f, view);
        if (i == 1) {
            int b = m8491b(recyclerView);
            Rect rect2 = this.f7278f;
            int i2 = b + rect2.top + rect2.bottom;
            int top = view2.getTop() - view3.getHeight();
            Rect rect3 = this.f7277e;
            int height = (((top - rect3.bottom) - rect3.top) - view.getHeight()) - i2;
            if (height < i2) {
                rect.top += height;
                return;
            }
            return;
        }
        int a = m8485a(recyclerView);
        Rect rect4 = this.f7278f;
        int i3 = a + rect4.left + rect4.right;
        int left = view2.getLeft() - view3.getWidth();
        Rect rect5 = this.f7277e;
        int width = (((left - rect5.right) - rect5.left) - view.getWidth()) - i3;
        if (width < i3) {
            rect.left += width;
        }
    }

    /* renamed from: a */
    private View m8486a(RecyclerView recyclerView, View view) {
        boolean isReverseLayout = this.f7274b.isReverseLayout(recyclerView);
        int i = isReverseLayout ? -1 : 1;
        int childCount = isReverseLayout ? recyclerView.getChildCount() - 1 : 0;
        while (childCount >= 0 && childCount <= recyclerView.getChildCount() - 1) {
            View childAt = recyclerView.getChildAt(childCount);
            if (!m8490a(recyclerView, childAt, view, this.f7274b.getOrientation(recyclerView))) {
                return childAt;
            }
            childCount += i;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m8490a(RecyclerView recyclerView, View view, View view2, int i) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f7276d.mo8383a(this.f7277e, view2);
        int e = recyclerView.mo5085e(view);
        if (e == -1 || this.f7275c.getHeader(recyclerView, e) != view2) {
            return false;
        }
        if (i == 1) {
            int top = view.getTop() - layoutParams.topMargin;
            int b = m8491b(recyclerView) + view2.getBottom();
            Rect rect = this.f7277e;
            if (top >= b + rect.bottom + rect.top) {
                return false;
            }
        } else {
            int left = view.getLeft() - layoutParams.leftMargin;
            int a = m8485a(recyclerView) + view2.getRight();
            Rect rect2 = this.f7277e;
            if (left >= a + rect2.right + rect2.left) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private int m8485a(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager().mo5285f()) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }
}
