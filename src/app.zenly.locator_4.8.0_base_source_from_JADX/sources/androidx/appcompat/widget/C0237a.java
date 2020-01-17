package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.core.view.C0661n;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import p214e.p215a.C7521a;
import p214e.p215a.C7530j;

/* renamed from: androidx.appcompat.widget.a */
abstract class C0237a extends ViewGroup {

    /* renamed from: e */
    protected final C0238a f1079e;

    /* renamed from: f */
    protected final Context f1080f;

    /* renamed from: g */
    protected ActionMenuView f1081g;

    /* renamed from: h */
    protected ActionMenuPresenter f1082h;

    /* renamed from: i */
    protected int f1083i;

    /* renamed from: j */
    protected C0661n f1084j;

    /* renamed from: k */
    private boolean f1085k;

    /* renamed from: l */
    private boolean f1086l;

    /* renamed from: androidx.appcompat.widget.a$a */
    protected class C0238a implements ViewPropertyAnimatorListener {

        /* renamed from: a */
        private boolean f1087a = false;

        /* renamed from: b */
        int f1088b;

        protected C0238a() {
        }

        /* renamed from: a */
        public C0238a mo1858a(C0661n nVar, int i) {
            C0237a.this.f1084j = nVar;
            this.f1088b = i;
            return this;
        }

        public void onAnimationCancel(View view) {
            this.f1087a = true;
        }

        public void onAnimationEnd(View view) {
            if (!this.f1087a) {
                C0237a aVar = C0237a.this;
                aVar.f1084j = null;
                C0237a.super.setVisibility(this.f1088b);
            }
        }

        public void onAnimationStart(View view) {
            C0237a.super.setVisibility(0);
            this.f1087a = false;
        }
    }

    C0237a(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    protected static int m920a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getAnimatedVisibility() {
        if (this.f1084j != null) {
            return this.f1079e.f1088b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1083i;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C7530j.ActionBar, C7521a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C7530j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1082h;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1199a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1086l = false;
        }
        if (!this.f1086l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1086l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1086l = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1085k = false;
        }
        if (!this.f1085k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1085k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1085k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0661n nVar = this.f1084j;
            if (nVar != null) {
                nVar.mo3432a();
            }
            super.setVisibility(i);
        }
    }

    C0237a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public C0661n mo1854a(int i, long j) {
        C0661n nVar = this.f1084j;
        if (nVar != null) {
            nVar.mo3432a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0661n a = ViewCompat.m2813a(this);
            a.mo3427a(1.0f);
            a.mo3428a(j);
            C0238a aVar = this.f1079e;
            aVar.mo1858a(a, i);
            a.mo3430a((ViewPropertyAnimatorListener) aVar);
            return a;
        }
        C0661n a2 = ViewCompat.m2813a(this);
        a2.mo3427a(0.0f);
        a2.mo3428a(j);
        C0238a aVar2 = this.f1079e;
        aVar2.mo1858a(a2, i);
        a2.mo3430a((ViewPropertyAnimatorListener) aVar2);
        return a2;
    }

    C0237a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1079e = new C0238a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C7521a.actionBarPopupTheme, typedValue, true)) {
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f1080f = new ContextThemeWrapper(context, i2);
                return;
            }
        }
        this.f1080f = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1852a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1853a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
