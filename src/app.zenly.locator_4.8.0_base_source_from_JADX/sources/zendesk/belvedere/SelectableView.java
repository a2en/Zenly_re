package zendesk.belvedere;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import androidx.core.content.C0540a;
import androidx.core.view.ViewCompat;
import zendesk.belvedere.p428s.C13534b;
import zendesk.belvedere.p428s.C13537e;
import zendesk.belvedere.p428s.C13538f;

public class SelectableView extends FrameLayout implements OnClickListener {

    /* renamed from: e */
    private C13488c f34983e;

    /* renamed from: f */
    private View f34984f;

    /* renamed from: g */
    private View f34985g;

    /* renamed from: h */
    private String f34986h;

    /* renamed from: i */
    private String f34987i;

    /* renamed from: zendesk.belvedere.SelectableView$a */
    class C13486a implements AnimatorUpdateListener {
        C13486a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SelectableView.this.m35730b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: zendesk.belvedere.SelectableView$b */
    class C13487b implements AnimatorUpdateListener {
        C13487b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SelectableView.this.m35727a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: zendesk.belvedere.SelectableView$c */
    interface C13488c {
        /* renamed from: a */
        boolean mo38861a(boolean z);
    }

    public SelectableView(Context context) {
        super(context);
        m35726a();
    }

    private View getChild() {
        View view = this.f34984f;
        if (view != null) {
            return view;
        }
        if (getChildCount() == 2) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt.getId() != C13538f.belvedere_selectable_view_checkbox) {
                    this.f34984f = childAt;
                    break;
                }
                i++;
            }
            return this.f34984f;
        }
        throw new RuntimeException("More then one child added to SelectableView");
    }

    private void setContentDesc(boolean z) {
        if (z) {
            setContentDescription(this.f34986h);
        } else {
            setContentDescription(this.f34987i);
        }
    }

    public void onClick(View view) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z = true;
        boolean z2 = !isSelected();
        C13488c cVar = this.f34983e;
        if (cVar != null) {
            z = cVar.mo38861a(z2);
        }
        if (z) {
            setSelected(z2);
            if (z2) {
                valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.9f});
                valueAnimator2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f});
            } else {
                valueAnimator = ValueAnimator.ofFloat(new float[]{0.9f, 1.0f});
                valueAnimator2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
            }
            valueAnimator.addUpdateListener(new C13486a());
            valueAnimator2.addUpdateListener(new C13487b());
            valueAnimator2.setDuration(75);
            valueAnimator.setDuration(75);
            valueAnimator.start();
            valueAnimator2.start();
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            m35730b(0.9f);
            m35727a(0.8f);
            m35729a(true);
            setContentDesc(true);
            return;
        }
        m35730b(1.0f);
        m35727a(1.0f);
        m35729a(false);
        setContentDesc(false);
    }

    public void setSelectionListener(C13488c cVar) {
        this.f34983e = cVar;
    }

    /* renamed from: a */
    private void m35726a() {
        setClickable(true);
        setFocusable(true);
        setOnClickListener(this);
        this.f34985g = m35725a(C13531r.m35852a(getContext(), C13534b.colorPrimary));
        addView(this.f34985g);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m35730b(float f) {
        getChild().setScaleX(f);
        getChild().setScaleY(f);
    }

    public SelectableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m35726a();
    }

    public SelectableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m35726a();
    }

    /* renamed from: a */
    public void mo38855a(String str, String str2) {
        this.f34986h = str;
        this.f34987i = str2;
        setContentDesc(isSelected());
    }

    /* renamed from: a */
    private ImageView m35725a(int i) {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ImageView imageView = new ImageView(getContext());
        imageView.setId(C13538f.belvedere_selectable_view_checkbox);
        imageView.setImageDrawable(C0540a.m2546c(getContext(), C13537e.belvedere_ic_check_circle));
        ViewCompat.m2822a((View) imageView, C0540a.m2546c(getContext(), C13537e.belvedere_ic_check_bg));
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(8);
        C13531r.m35854a(imageView, i);
        return imageView;
    }

    /* renamed from: a */
    private void m35729a(boolean z) {
        if (z) {
            this.f34985g.setVisibility(0);
            this.f34985g.bringToFront();
            ViewCompat.m2835b(this.f34985g, ViewCompat.m2858k(this.f34984f) + 1.0f);
            return;
        }
        this.f34985g.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m35727a(float f) {
        getChild().setAlpha(f);
    }
}
