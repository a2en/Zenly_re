package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.C1062a;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;

/* renamed from: androidx.recyclerview.widget.p */
public class C1139p extends C1145t {

    /* renamed from: d */
    private C1136o f4350d;

    /* renamed from: e */
    private C1136o f4351e;

    /* renamed from: androidx.recyclerview.widget.p$a */
    class C1140a extends C1131l {
        C1140a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        /* access modifiers changed from: protected */
        public void onTargetFound(View view, C1082s sVar, C1062a aVar) {
            C1139p pVar = C1139p.this;
            int[] a = pVar.mo5762a(pVar.f4356a.getLayoutManager(), view);
            int i = a[0];
            int i2 = a[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                aVar.mo5354a(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* renamed from: b */
    private boolean m5587b(LayoutManager layoutManager, int i, int i2) {
        boolean z = true;
        if (layoutManager.mo4994a()) {
            if (i <= 0) {
                z = false;
            }
            return z;
        }
        if (i2 <= 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    private C1136o m5588d(LayoutManager layoutManager) {
        C1136o oVar = this.f4351e;
        if (oVar == null || oVar.f4347a != layoutManager) {
            this.f4351e = C1136o.m5538a(layoutManager);
        }
        return this.f4351e;
    }

    /* renamed from: e */
    private C1136o m5589e(LayoutManager layoutManager) {
        if (layoutManager.mo4999b()) {
            return m5590f(layoutManager);
        }
        if (layoutManager.mo4994a()) {
            return m5588d(layoutManager);
        }
        return null;
    }

    /* renamed from: f */
    private C1136o m5590f(LayoutManager layoutManager) {
        C1136o oVar = this.f4350d;
        if (oVar == null || oVar.f4347a != layoutManager) {
            this.f4350d = C1136o.m5540b(layoutManager);
        }
        return this.f4350d;
    }

    /* renamed from: g */
    private boolean m5591g(LayoutManager layoutManager) {
        int j = layoutManager.mo5293j();
        if (layoutManager instanceof ScrollVectorProvider) {
            boolean z = true;
            PointF computeScrollVectorForPosition = ((ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(j - 1);
            if (computeScrollVectorForPosition != null) {
                if (computeScrollVectorForPosition.x >= 0.0f && computeScrollVectorForPosition.y >= 0.0f) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int[] mo5762a(LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.mo4994a()) {
            iArr[0] = m5585a(layoutManager, view, m5588d(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.mo4999b()) {
            iArr[1] = m5585a(layoutManager, view, m5590f(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: c */
    public View mo5764c(LayoutManager layoutManager) {
        if (layoutManager.mo4999b()) {
            return m5586a(layoutManager, m5590f(layoutManager));
        }
        if (layoutManager.mo4994a()) {
            return m5586a(layoutManager, m5588d(layoutManager));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1131l mo5763b(LayoutManager layoutManager) {
        if (!(layoutManager instanceof ScrollVectorProvider)) {
            return null;
        }
        return new C1140a(this.f4356a.getContext());
    }

    /* renamed from: a */
    public int mo5761a(LayoutManager layoutManager, int i, int i2) {
        int j = layoutManager.mo5293j();
        if (j == 0) {
            return -1;
        }
        C1136o e = m5589e(layoutManager);
        if (e == null) {
            return -1;
        }
        int e2 = layoutManager.mo5278e();
        View view = null;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < e2; i5++) {
            View c = layoutManager.mo5265c(i5);
            if (c != null) {
                int a = m5585a(layoutManager, c, e);
                if (a <= 0 && a > i3) {
                    view2 = c;
                    i3 = a;
                }
                if (a >= 0 && a < i4) {
                    view = c;
                    i4 = a;
                }
            }
        }
        boolean b = m5587b(layoutManager, i, i2);
        if (b && view != null) {
            return layoutManager.mo5298l(view);
        }
        if (!b && view2 != null) {
            return layoutManager.mo5298l(view2);
        }
        if (!b) {
            view2 = view;
        }
        if (view2 == null) {
            return -1;
        }
        int l = layoutManager.mo5298l(view2) + (m5591g(layoutManager) == b ? -1 : 1);
        if (l < 0 || l >= j) {
            return -1;
        }
        return l;
    }

    /* renamed from: a */
    private int m5585a(LayoutManager layoutManager, View view, C1136o oVar) {
        int i;
        int d = oVar.mo5753d(view) + (oVar.mo5749b(view) / 2);
        if (layoutManager.mo5285f()) {
            i = oVar.mo5756f() + (oVar.mo5758g() / 2);
        } else {
            i = oVar.mo5745a() / 2;
        }
        return d - i;
    }

    /* renamed from: a */
    private View m5586a(LayoutManager layoutManager, C1136o oVar) {
        int i;
        int e = layoutManager.mo5278e();
        View view = null;
        if (e == 0) {
            return null;
        }
        if (layoutManager.mo5285f()) {
            i = oVar.mo5756f() + (oVar.mo5758g() / 2);
        } else {
            i = oVar.mo5745a() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            View c = layoutManager.mo5265c(i3);
            int abs = Math.abs((oVar.mo5753d(c) + (oVar.mo5749b(c) / 2)) - i);
            if (abs < i2) {
                view = c;
                i2 = abs;
            }
        }
        return view;
    }
}
