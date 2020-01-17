package app.zenly.locator.core.p072ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.viewpager.widget.C1295a;
import app.zenly.locator.core.widget.ViewPager;

/* renamed from: app.zenly.locator.core.ui.view.ChildViewPager */
public class ChildViewPager extends ViewPager {

    /* renamed from: q0 */
    private C1295a f8614q0 = new C3119a();

    /* renamed from: app.zenly.locator.core.ui.view.ChildViewPager$a */
    class C3119a extends C1295a {
        C3119a() {
        }

        /* renamed from: a */
        public Object mo4281a(ViewGroup viewGroup, int i) {
            return ChildViewPager.this.getChildAt(i);
        }

        /* renamed from: a */
        public boolean mo4285a(View view, Object obj) {
            return view == obj;
        }

        public int getCount() {
            return ChildViewPager.this.getChildCount();
        }
    }

    public ChildViewPager(Context context) {
        super(context);
        m9792f();
    }

    /* renamed from: f */
    private void m9792f() {
        setAdapter(this.f8614q0);
        setOffscreenPageLimit(Integer.MAX_VALUE);
    }

    public void addView(View view) {
        super.addView(view);
        this.f8614q0.mo6403a();
    }

    public void removeAllViews() {
        super.removeAllViews();
        this.f8614q0.mo6403a();
    }

    public void removeView(View view) {
        super.removeView(view);
        this.f8614q0.mo6403a();
    }

    public void removeViewAt(int i) {
        super.removeViewAt(i);
        this.f8614q0.mo6403a();
    }

    public void removeViews(int i, int i2) {
        super.removeViews(i, i2);
        this.f8614q0.mo6403a();
    }

    public void addView(View view, int i) {
        super.addView(view, i);
        this.f8614q0.mo6403a();
    }

    public ChildViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9792f();
    }

    public void addView(View view, LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        this.f8614q0.mo6403a();
    }

    public void addView(View view, int i, int i2) {
        super.addView(view, i, i2);
        this.f8614q0.mo6403a();
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        this.f8614q0.mo6403a();
    }
}
