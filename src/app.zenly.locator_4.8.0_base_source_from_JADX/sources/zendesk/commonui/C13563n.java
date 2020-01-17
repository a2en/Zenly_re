package zendesk.commonui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: zendesk.commonui.n */
class C13563n {

    /* renamed from: zendesk.commonui.n$a */
    static class C13564a implements AnimatorUpdateListener {

        /* renamed from: a */
        final int f35118a = this.f35121d.getPaddingLeft();

        /* renamed from: b */
        final int f35119b = this.f35121d.getPaddingRight();

        /* renamed from: c */
        final int f35120c = this.f35121d.getPaddingBottom();

        /* renamed from: d */
        final /* synthetic */ View f35121d;

        /* renamed from: e */
        final /* synthetic */ ValueAnimator f35122e;

        C13564a(View view, ValueAnimator valueAnimator) {
            this.f35121d = view;
            this.f35122e = valueAnimator;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f35121d.setPadding(this.f35118a, ((Integer) this.f35122e.getAnimatedValue()).intValue(), this.f35119b, this.f35120c);
        }
    }

    /* renamed from: zendesk.commonui.n$b */
    static class C13565b implements AnimatorUpdateListener {

        /* renamed from: a */
        final int f35123a = this.f35126d.getPaddingLeft();

        /* renamed from: b */
        final int f35124b = this.f35126d.getPaddingRight();

        /* renamed from: c */
        final int f35125c = this.f35126d.getPaddingTop();

        /* renamed from: d */
        final /* synthetic */ View f35126d;

        /* renamed from: e */
        final /* synthetic */ ValueAnimator f35127e;

        C13565b(View view, ValueAnimator valueAnimator) {
            this.f35126d = view;
            this.f35127e = valueAnimator;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f35126d.setPadding(this.f35123a, this.f35125c, this.f35124b, ((Integer) this.f35127e.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: zendesk.commonui.n$c */
    static class C13566c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LayoutParams f35128a;

        /* renamed from: b */
        final /* synthetic */ View f35129b;

        C13566c(LayoutParams layoutParams, View view) {
            this.f35128a = layoutParams;
            this.f35129b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f35128a.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f35128a.rightMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f35129b.requestLayout();
        }
    }

    /* renamed from: zendesk.commonui.n$d */
    static class C13567d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f35130a;

        C13567d(View view) {
            this.f35130a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f35130a.setMinimumHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: a */
    static ValueAnimator m35901a(View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C13565b(view, ofInt));
        ofInt.setDuration((long) i3);
        return ofInt;
    }

    /* renamed from: b */
    static ValueAnimator m35902b(View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C13567d(view));
        ofInt.setDuration((long) i3);
        return ofInt;
    }

    /* renamed from: c */
    static ValueAnimator m35903c(View view, int i, int i2, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C13566c(layoutParams, view));
        ofInt.setDuration((long) i3);
        return ofInt;
    }

    /* renamed from: d */
    static ValueAnimator m35904d(View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C13564a(view, ofInt));
        ofInt.setDuration((long) i3);
        return ofInt;
    }
}
