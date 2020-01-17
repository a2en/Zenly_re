package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView.C1075m;
import androidx.recyclerview.widget.RecyclerView.C1076n;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.C1062a;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;

/* renamed from: androidx.recyclerview.widget.t */
public abstract class C1145t extends C1075m {

    /* renamed from: a */
    RecyclerView f4356a;

    /* renamed from: b */
    private Scroller f4357b;

    /* renamed from: c */
    private final C1076n f4358c = new C1146a();

    /* renamed from: androidx.recyclerview.widget.t$a */
    class C1146a extends C1076n {

        /* renamed from: a */
        boolean f4359a = false;

        C1146a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f4359a) {
                this.f4359a = false;
                C1145t.this.mo5786a();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f4359a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$b */
    class C1147b extends C1131l {
        C1147b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        public void onTargetFound(View view, C1082s sVar, C1062a aVar) {
            C1145t tVar = C1145t.this;
            RecyclerView recyclerView = tVar.f4356a;
            if (recyclerView != null) {
                int[] a = tVar.mo5762a(recyclerView.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    aVar.mo5354a(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }
        }
    }

    /* renamed from: b */
    private void m5606b() {
        this.f4356a.mo5066b(this.f4358c);
        this.f4356a.setOnFlingListener(null);
    }

    /* renamed from: c */
    private void m5608c() throws IllegalStateException {
        if (this.f4356a.getOnFlingListener() == null) {
            this.f4356a.mo5047a(this.f4358c);
            this.f4356a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: a */
    public abstract int mo5761a(LayoutManager layoutManager, int i, int i2);

    /* renamed from: a */
    public boolean mo5432a(int i, int i2) {
        LayoutManager layoutManager = this.f4356a.getLayoutManager();
        boolean z = false;
        if (layoutManager == null || this.f4356a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4356a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m5607b(layoutManager, i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public abstract int[] mo5762a(LayoutManager layoutManager, View view);

    /* renamed from: c */
    public abstract View mo5764c(LayoutManager layoutManager);

    /* renamed from: b */
    public int[] mo5788b(int i, int i2) {
        this.f4357b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f4357b.getFinalX(), this.f4357b.getFinalY()};
    }

    /* renamed from: b */
    private boolean m5607b(LayoutManager layoutManager, int i, int i2) {
        if (!(layoutManager instanceof ScrollVectorProvider)) {
            return false;
        }
        SmoothScroller a = mo5785a(layoutManager);
        if (a == null) {
            return false;
        }
        int a2 = mo5761a(layoutManager, i, i2);
        if (a2 == -1) {
            return false;
        }
        a.setTargetPosition(a2);
        layoutManager.mo5260b(a);
        return true;
    }

    /* renamed from: a */
    public void mo5787a(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f4356a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m5606b();
            }
            this.f4356a = recyclerView;
            if (this.f4356a != null) {
                m5608c();
                this.f4357b = new Scroller(this.f4356a.getContext(), new DecelerateInterpolator());
                mo5786a();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public C1131l mo5763b(LayoutManager layoutManager) {
        if (!(layoutManager instanceof ScrollVectorProvider)) {
            return null;
        }
        return new C1147b(this.f4356a.getContext());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5786a() {
        RecyclerView recyclerView = this.f4356a;
        if (recyclerView != null) {
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                View c = mo5764c(layoutManager);
                if (c != null) {
                    int[] a = mo5762a(layoutManager, c);
                    if (!(a[0] == 0 && a[1] == 0)) {
                        this.f4356a.mo5123i(a[0], a[1]);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SmoothScroller mo5785a(LayoutManager layoutManager) {
        return mo5763b(layoutManager);
    }
}
