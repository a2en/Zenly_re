package app.zenly.locator.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager.LayoutParams;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager.PageTransformer;

public class ViewPager extends androidx.viewpager.widget.ViewPager {

    /* renamed from: p0 */
    private static final IViewPagerChildDrawingOrderHandler f9107p0 = new C3278k();

    /* renamed from: n0 */
    private C3261a f9108n0 = C3261a.ENABLED;

    /* renamed from: o0 */
    private PageTransformer f9109o0;

    /* renamed from: app.zenly.locator.core.widget.ViewPager$a */
    public enum C3261a {
        DISABLED,
        FORWARDED_ONLY,
        ENABLED
    }

    /* renamed from: app.zenly.locator.core.widget.ViewPager$b */
    public static class C3262b implements OnPageChangeListener {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    public ViewPager(Context context) {
        super(context);
    }

    /* renamed from: b */
    private boolean m10370b(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            motionEvent.setAction(3);
            return super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: f */
    private void m10371f() {
        if (this.f9109o0 != null) {
            int measuredWidth = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
            int scrollX = getScrollX();
            int childCount = getChildCount();
            int paddingStart = getPaddingStart();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!((LayoutParams) childAt.getLayoutParams()).f4845a) {
                    this.f9109o0.transformPage(childAt, ((float) ((childAt.getLeft() - paddingStart) - scrollX)) / ((float) measuredWidth));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo9720a(MotionEvent motionEvent) {
        return this.f9108n0 == C3261a.FORWARDED_ONLY && m10370b(motionEvent);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        try {
            return f9107p0.getChildDrawingOrderSucceed(this, i, i2, super.getChildDrawingOrder(i, i2));
        } catch (Throwable th) {
            return f9107p0.getChildDrawingOrderFailed(this, i, i2, th);
        }
    }

    public PageTransformer getPageTransformer() {
        return this.f9109o0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f9108n0 != C3261a.DISABLED) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f9108n0 == C3261a.ENABLED && m10370b(motionEvent);
    }

    public void setMode(C3261a aVar) {
        this.f9108n0 = aVar;
    }

    /* renamed from: a */
    public void mo6332a(boolean z, PageTransformer pageTransformer) {
        super.mo6332a(z, pageTransformer);
        this.f9109o0 = pageTransformer;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo6333a(boolean z, PageTransformer pageTransformer, int i) {
        super.mo6333a(z, pageTransformer, i);
        this.f9109o0 = pageTransformer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6326a(int i, float f, int i2) {
        super.mo6326a(i, f, i2);
        m10371f();
    }
}
